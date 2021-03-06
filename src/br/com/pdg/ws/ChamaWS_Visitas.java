package br.com.pdg.ws;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import br.com.pdg.mb.CaminhoXmlBean_Visitas;
import br.com.pdg.mb.TokenBean;
import br.com.pdg.mb.VisitasBean;

public class ChamaWS_Visitas {

	//Busca o diretorio a ser criado o arquivo .xml
			static CaminhoXmlBean_Visitas path = new CaminhoXmlBean_Visitas();
			static String diretorio = path.buscaPorId();
			
			static VisitasBean vBean = new VisitasBean();
//			static String id_emp = vBean.getID_EMP();
//			static String data = vBean.getDATA();
			
			
	public static void main(String id_emp, String data_visita) {
	
		//Busca o token no banco, deve ter apenas um tokem cadastrado e com ID = 1
		TokenBean token = new TokenBean();
		String chave = token.buscaPorId();
		
		
				
		 try{
			 	//variavel que recebe o xml retornado pelo web service
	            String msgRetorno = "";
	 
	            //URL Do Serviço 
	            URL url = new URL("http://www.easysis.com.br/webservice/Easysis.asmx?wsdl");
	            URLConnection conn = url.openConnection();
	 
	            // Define que a Conexão terá uma saída/retorno                        
	            conn.setDoOutput(true);
	 	         	 
	            // Propriedades da Mensagem SOAP
	            conn.setRequestProperty("Type","Request-Response");
	            conn.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
	            conn.setRequestProperty("Accept-Encoding","gzip,deflate");        
	            conn.setRequestProperty("User-Agent","Jakarta Commons-HttpClient/3.1");
	 
	            // Canal de Sa�da da Requisi��o
	            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
	           
	            // Mensagem no Formato SOAP
	            String xml = "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:web='http://easysis.com.br/webservice/'>"+
	            		"<soapenv:Header>"+
	            		"<web:ValidationSoapHeader>"+
	            		"<web:DevToken>"+ chave +"</web:DevToken>"+
	            		"</web:ValidationSoapHeader>"+
	            		"</soapenv:Header>"+
	            		"<soapenv:Body>"+
	            		"<web:getVisitas>" +
	            			"<web:EMP_ID>"+ id_emp +"</web:EMP_ID>"+
	            			"<web:DATA>"+ data_visita +"</web:DATA>"+
	            		"</web:getVisitas>"+
	            		"</soapenv:Body>"+
	            		"</soapenv:Envelope>";
	 
	            wr.write(xml); 
	            wr.flush(); 
	 
	            //escreve a messsagen de requisição
	            System.out.println("Requisição >>  "+conn.getOutputStream());
	 
	            // Leitura da Resposta do Serviço
	            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            //Cria e salva o arquivo xml
	            BufferedWriter fr = new BufferedWriter(new FileWriter(diretorio ,true));//Abre arquivo para escrita
	            
	            // Leituras das Linhas da Resposta
	            while (rd.ready()){
	                msgRetorno += rd.readLine();	               
	            }	              
	              
	             fr.write(msgRetorno);//escreve xml no arquivo  
	             	                           
	                 fr.flush();//salva o arquivo  
	                 fr.close();//fecha o arquivo
	            	            	 
	            wr.close();  
	            rd.close(); 
	            conn.getInputStream().close();
	            
	            //Escreve o xml de resposta no console
	            System.out.println("Resposta >>  "+ msgRetorno);            
	        } catch (IOException e) {            
	            e.printStackTrace();            
	        } finally {
	            System.out.println(" Fim ");
	        }
		}

}
