package br.com.pdg.parseXml;

import java.util.List;





import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_EmpreendimentosAZ;
import br.com.pdg.modelo.empreendimentosAZ.Empreendimento;
import br.com.pdg.modelo.empreendimentosAZ.Envelope;

public class LerXMLeSalvar_EmpreendimentosAZ {

	static CaminhoXmlBean_EmpreendimentosAZ path = new CaminhoXmlBean_EmpreendimentosAZ();
	static String diretorio = path.buscaPorId();
	
	public static void main(String[] args) throws JAXBException {
				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			List<Empreendimento> list = envelope.getBody().getEmpreendimentoResponse().getEmpreendimentoResult().
					getListEmpreendimento();
			
			for (Empreendimento empreendimento : list){
				
				Empreendimento emp = new Empreendimento();
					
				 emp.setCodProjeto(empreendimento.getCodProjeto());
				 emp.setNomeEmpresa(empreendimento.getNomeEmpresa());
				 emp.setNomeEmpreendimento(empreendimento.getNomeEmpreendimento());
				 emp.setApelido(empreendimento.getApelido());
				 emp.setEndereco(empreendimento.getEndereco());
				 emp.setCidade(empreendimento.getCidade());
				 emp.setEstado(empreendimento.getEstado());
				 emp.setBairro(empreendimento.getBairro());
				 emp.setComplemento(empreendimento.getComplemento());
				 emp.setCep(empreendimento.getCep());
				 emp.setCentroLucro(empreendimento.getCentroLucro());
				 				
			DAO<Empreendimento> dao = new DAO<Empreendimento>(Empreendimento.class);
			dao.adiciona(emp);

		}
		
	}

}
