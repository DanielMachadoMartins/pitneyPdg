package br.com.pdg.parseXml;

import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_Empreendimentos;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.modelo.empreendimentos.Envelope;

public class LerXMLeSalvar_Empreendimentos {

	private static final Logger LOGGER = Logger.getLogger(LerXMLeSalvar_Empreendimentos.class.getName());
	
	static CaminhoXmlBean_Empreendimentos path = new CaminhoXmlBean_Empreendimentos();
	static String diretorio = path.buscaPorId();
	
	public static void main(String[] args) throws JAXBException {
				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			List<Empreendimento> list = envelope.getBody().getEmpreendimentoResponse().getEmpreendimentoResult().
					getResult().getEmpreendimentos();
			
			for (Empreendimento empreendimento : list){
				
				Empreendimento emp = new Empreendimento();			
				emp.setEMP_ID(empreendimento.getEMP_ID());
				emp.setEMP_REGIONAL(empreendimento.getEMP_REGIONAL());
				emp.setEMP_NOME(empreendimento.getEMP_NOME());
				emp.setEMP_LOGRADOURO(empreendimento.getEMP_LOGRADOURO());
				emp.setEMP_NUMERO(empreendimento.getEMP_NUMERO());
				emp.setEMP_BAIRRO(empreendimento.getEMP_BAIRRO());
				emp.setEMP_CIDADE(empreendimento.getEMP_CIDADE());
				emp.setEMP_UF(empreendimento.getEMP_UF());
				emp.setEMP_CEP(empreendimento.getEMP_CEP());
				emp.setEMP_COMPLEMENTO(empreendimento.getEMP_COMPLEMENTO());
				emp.setEMP_LATLNG(empreendimento.getEMP_LATLNG());
				emp.setEMP_PRIMEIRAVISITA(empreendimento.getEMP_PRIMEIRAVISITA());
				emp.setEMP_STATUS(empreendimento.getEMP_STATUS());			
				
			DAO<Empreendimento> dao = new DAO<Empreendimento>(Empreendimento.class);
			dao.adiciona(emp);
				LOGGER.info(empreendimento.getEMP_NOME());
		}
		
	}

}
