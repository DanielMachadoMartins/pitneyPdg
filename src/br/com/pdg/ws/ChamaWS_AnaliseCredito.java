package br.com.pdg.ws;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import br.com.pdg.mb.CaminhoXmlBean_AnaliseCredito;
import br.com.pdg.mb.TokenBean;

public class ChamaWS_AnaliseCredito {

	//Busca o diretorio a ser criado o arquivo .xml
			static CaminhoXmlBean_AnaliseCredito path = new CaminhoXmlBean_AnaliseCredito();
			static String diretorio = path.buscaPorId();
					
	public static void main(String[] args) {
	
		//Busca o token no banco, o token da AZ Tronics  é o de ID = 2
		TokenBean token = new TokenBean();
		String chave = token.buscaPorIdAnaliseCredito();
		
		
				
		 try{
			 	//variavel que recebe o xml retornado pelo web service
	            String msgRetorno = "";
	 
	            //URL Do Serviço 
	            URL url = new URL("http://aztronic.pdg.com.br/WEBSERVICES/WSBI/WSBI.asmx");
	            URLConnection conn = url.openConnection();
	 
	            // Define que a Conexão terá uma saída/retorno                        
	            conn.setDoOutput(true);
	 	         	 
	            // Propriedades da Mensagem SOAP
	            conn.setRequestProperty("Type","Request-Response");
	            conn.setRequestProperty("Content-Type", "application/soap+xml; charset=utf-8");
	            conn.setRequestProperty("Accept-Encoding","gzip,deflate");        
	            conn.setRequestProperty("User-Agent","Jakarta Commons-HttpClient/3.1");
	 
	            // Canal de Saida da Requisicao
	            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
	           
	            // Mensagem no Formato SOAP
	            String xml = 
	            		"<soap12:Envelope xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns:xsd='http://www.w3.org/2001/XMLSchema' xmlns:soap12='http://www.w3.org/2003/05/soap-envelope'>" +
			            "<soap12:Body>" +
			              "<getAnaliseCredito xmlns='http://tempuri.org/'>" +
			                "<token>"+ chave +"</token>" +
			              "</getAnaliseCredito>" +
			            "</soap12:Body>"+
			          "</soap12:Envelope>";
	            		
	            	
	            		
	 
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
