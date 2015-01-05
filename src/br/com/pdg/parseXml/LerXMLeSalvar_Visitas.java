package br.com.pdg.parseXml;

import java.util.List;
import java.util.logging.Logger;

import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_Visitas;
import br.com.pdg.mb.VisitasBean;
import br.com.pdg.modelo.visitas.Envelope;
import br.com.pdg.modelo.visitas.Visita;

public class LerXMLeSalvar_Visitas {

	private static final Logger LOGGER = Logger.getLogger(LerXMLeSalvar_Visitas.class.getName());
	
	static CaminhoXmlBean_Visitas path = new CaminhoXmlBean_Visitas();
	static String diretorio = path.buscaPorId();
	static VisitasBean vb = new VisitasBean();
	
	public static void main(String[] args) throws JAXBException {				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			
			List<Visita> list = envelope.getBody().getVisitasResponse().getVisitasResult().
					getResult().getVisitas();
			
			if(list == null){
				vb.apagarXml();
				LOGGER.info("XML apagado");
			}else{
			
			for (Visita visita : list){
				
				Visita vis = new Visita();			
				vis.setVIS_ID(visita.getVIS_ID());
				vis.setVIS_TIPO(visita.getVIS_TIPO());
				vis.setVIS_DATA(visita.getVIS_DATA());
				vis.setVIS_NOME(visita.getVIS_NOME());
				vis.setVIS_SEXO(visita.getVIS_SEXO());
				vis.setVIS_EMAIL(visita.getVIS_EMAIL());
				vis.setVIS_TELEFONE(visita.getVIS_TELEFONE());
				vis.setVIS_CELULAR(visita.getVIS_CELULAR());
				vis.setVIS_LOGRADOURO(visita.getVIS_LOGRADOURO());
				vis.setVIS_NUMERO(visita.getVIS_NUMERO());
				vis.setVIS_BAIRRO(visita.getVIS_BAIRRO());
				vis.setVIS_CIDADE(visita.getVIS_CIDADE());
				vis.setVIS_UF(visita.getVIS_UF());
				vis.setVIS_CEP(visita.getVIS_CEP());
				vis.setVIS_COMPLEMENTO(visita.getVIS_COMPLEMENTO());
				vis.setVIS_LATLNG(visita.getVIS_LATLNG());
				vis.setVIS_EMPRESA(visita.getVIS_EMPRESA());
				vis.setVIS_GERENTE(visita.getVIS_GERENTE());
				vis.setVIS_CORRETOR(visita.getVIS_CORRETOR());
				vis.setVIS_MIDIA(visita.getVIS_MIDIA());
				vis.setVIS_VEICULO(visita.getVIS_VEICULO());
				vis.setVIS_PROGRAMA(visita.getVIS_PROGRAMA());
				vis.setVIS_RESERVOU(visita.getVIS_RESERVOU());
				vis.setVIS_OBSERVACOES(visita.getVIS_OBSERVACOES());
				vis.setVIS_PROFISSAO(visita.getVIS_PROFISSAO());
								
			DAO<Visita> dao = new DAO<Visita>(Visita.class);
			dao.adiciona(vis);
			LOGGER.info("Visita " + vis.getVIS_ID() + " Adicionada com sucesso");
		}
			
			}
		
	}

}
