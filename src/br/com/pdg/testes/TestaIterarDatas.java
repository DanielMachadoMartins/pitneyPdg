package br.com.pdg.testes;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;

import br.com.pdg.mb.VisitasBean;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.parseXml.LerXMLeSalvar_Visitas;
import br.com.pdg.util.GerenciaSemanas;
import br.com.pdg.ws.ChamaWS_Visitas;

public class TestaIterarDatas {
	
	private static final Logger LOGGER = Logger.getLogger(TestaIterarDatas.class);

	public static void main(String[] args) throws ParseException, JAXBException {
		
		GerenciaSemanas gs = new GerenciaSemanas();
		Date dataAtual = gs.getDataAtual();
		ChamaWS_Visitas ws = new ChamaWS_Visitas();
		LerXMLeSalvar_Visitas lerXml = new LerXMLeSalvar_Visitas();
				
		//busca a lista de empreendimentos no banco
		VisitasBean vb = new VisitasBean();
		List<Empreendimento> lista = vb.listaEmp();
			
		for (Empreendimento emp : lista){
			//codigo pra iterar a lista
										
				try {
					
					String id_emp = emp.getEMP_ID();//id do empreendimento
					String data = emp.getEMP_PRIMEIRAVISITA();//data da primeira visita
					//variavel pra guardar a data da primeira visita numa variavel do tipo Date
					Date dataInicial = GerenciaSemanas.stringToDate(data);
					
					Date dataReq = dataInicial;
					
					LOGGER.info("Id Emp= " +id_emp + "  Data primeira requisição "+ dataInicial + " Data ultima Requisição "+ dataAtual);
					
					int dias = gs.calcDiasEntreDatas(dataInicial, dataAtual);
					LOGGER.info("o intervalo de dias é: " + dias);
					//calcula quantidade de requisições
					int qtdReq = dias / 7 ;
					LOGGER.info("Quantidade de requisições = " + qtdReq );
					
					int count = 0;
					
					while(count <= dias){
						
						LOGGER.info("Empreendimento: " + id_emp + " Data pra requisicão é: " + gs.dateToString(dataReq));
						ws.main(id_emp, gs.dateToString(dataReq));
						lerXml.main(args);
						vb.apagarXml();
						
						dataReq.setDate(dataReq.getDate()+7);//incrementa 7 dias a data de requisicao 
						count = count + 7;
					
					LOGGER.info(" ");
					
					};
					
					
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					
					e.printStackTrace();
				}
								
					
			}
		


	}

}
