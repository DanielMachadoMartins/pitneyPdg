package br.com.pdg.ws;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import br.com.pdg.mb.CaminhoXmlBean_ComercialVendas;
import br.com.pdg.mb.TokenBean;

public class ChamaWS_ComercialVendas {

	//Busca o diretorio a ser criado o arquivo .xml
			static CaminhoXmlBean_ComercialVendas path = new CaminhoXmlBean_ComercialVendas();
			static String diretorio = path.buscaPorId();
			
	public static void main(String[] args) {
	
		//Busca o token no banco, o token da AZ Tronics é o de ID = 2
		TokenBean token = new TokenBean();
		String chave = token.buscaPorIdComercialVendas();
		
		
				
		 try{
			 	//variavel que recebe o xml retornado pelo webservice
	            String msgRetorno = "";
	 
	            //URL Do Serviço 
	            URL url = new URL("http://aztronic.pdg.com.br/WEBSERVICES/WSBI/WSBI.asmx");
	            URLConnection conn = url.openConnection();
	 
	            // Define que a Conexão terá uma saída/retorno                        
	            conn.setDoOutput(true);
	 	         	 
	            // Propriedades da Mensagem SOAP
	            conn.setRequestProperty("Type","Request-Response");
	            conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
	            conn.setRequestProperty("Accept-Encoding","gzip,deflate");        
	            conn.setRequestProperty("User-Agent","Jakarta Commons-HttpClient/3.1");
	 
	            // Canal de Saida da Requisicao
	            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
	           
	            // Mensagem no Formato SOAP
	            String xml = 
	            		"<soap:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'"
	            				+ " xmlns:xsd='http://www.w3.org/2001/XMLSchema' "
	            				+ "xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>"
			           +"<soap:Body>"
			             +"<getComercialVendas xmlns='http://tempuri.org/'>"
			                +"<token>"+ chave +"</token>"
			              +"</getComercialVendas>"
			            +"</soap:Body>"
			          +"</soap:Envelope>";
        			 
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
