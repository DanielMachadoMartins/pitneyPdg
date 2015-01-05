package br.com.pdg.util;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import br.com.pdg.mb.VisitasBean;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.ws.ChamaWS_Visitas;

public class GerenciaRequisicoes {

	private static final Logger LOGGER = Logger.getLogger(GerenciaRequisicoes.class.getName());
	
	VisitasBean vb = new VisitasBean();
	
	public void iterarLista() throws ParseException{
		
		GerenciaSemanas gs = new GerenciaSemanas();//intancia a classe
		Date dataAtual = gs.getDataAtual();//pega a data atual no tipo Date
		List<Empreendimento> lista = vb.listaEmp();
	 
	 //int sizeList = lista.size();
	 
		for (Empreendimento emp : lista){
		//codigo pra iterar a lista
			
			String id_emp = emp.getEMP_ID();
			String data = emp.getEMP_PRIMEIRAVISITA();
			Date dataInicial;
			try {
				dataInicial = GerenciaSemanas.stringToDate(data);//converte a data da primeira visita de String pra Date
								
				while(dataInicial.getTime() <= dataAtual.getTime()){
				
					//Date id_emp = gs.obtemSegunda(dataInicial);//data a ser passada na requisicao
									
					ChamaWS_Visitas ws = new ChamaWS_Visitas();
					
					System.out.println("Data pra requisição "+ dataInicial);
					
					ws.main(id_emp, gs.dateToString(dataInicial));
					
					dataInicial.setDate(dataInicial.getDate()+7);//incrementa a data de condicao do while
					LOGGER.info("Data da próxima requisição: " + dataInicial);				
					
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			count ++;
				
			}
			
			
//			System.out.println("ID: "+ emp.getEMP_ID() +" Data Visita: "+ emp.getEMP_PRIMEIRAVISITA());
		
		
	 
	}
}
