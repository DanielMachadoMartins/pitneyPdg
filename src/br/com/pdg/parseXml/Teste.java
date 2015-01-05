package br.com.pdg.parseXml;


import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import br.com.pdg.mb.VisitasBean;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.util.GerenciaSemanas;
import br.com.pdg.ws.ChamaWS_Visitas;

public class Teste {
	
	private static final Logger LOGGER = Logger.getLogger(Teste.class);

	public static void main(String[] args) throws ParseException, JAXBException {
		//retorna a data atual no tipo Date
		GerenciaSemanas gs = new GerenciaSemanas();
		Date dataAtual = gs.getDataAtual();
		
		LerXMLeSalvar_Visitas lerXml = new LerXMLeSalvar_Visitas();
				
		//busca a lista de empreendimentos no banco
		VisitasBean vb = new VisitasBean();
		List<Empreendimento> lista = vb.listaEmp();
			
		for (Empreendimento emp : lista){
			//codigo pra iterar a lista
										
				try {
					
					String id_emp = emp.getEMP_ID();//id do empreendimento
					String data = emp.getEMP_PRIMEIRAVISITA();//data da primeira visita
					//Date dataInicial;//variavel pra guardar a data da primeira visita numa variavel do tipo Date
					Date dataInicial = GerenciaSemanas.stringToDate(data);
					
					LOGGER.info("Id Emp= " +id_emp + "  Data primeira requisição "+ dataInicial + " Data ultima Requisição "+ dataAtual);
					
					while(dataInicial.getTime() <= gs.getDataAtual().getTime()){
															
						ChamaWS_Visitas ws = new ChamaWS_Visitas();
											
						System.out.println("Id Emp= "+id_emp + "  Data pra requisição "+ dataInicial);
						LOGGER.info("Id Emp= "+id_emp + "  Data pra requisição "+ dataInicial);
						//busca o xml
						ws.main(id_emp, gs.dateToString(dataInicial));
												
						lerXml.main(args);
						vb.apagarXml();
						dataInicial.setDate(dataInicial.getDate()+7);//incrementa a data de condicao do while
																
						
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
								
					
			}
		
	  }

}
