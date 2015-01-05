package br.com.pdg.parseXml;

import java.util.List;

import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_Compradores;
import br.com.pdg.modelo.compradoresAZ.Compradores;
import br.com.pdg.modelo.compradoresAZ.Envelope;

public class XMLeSalvar_CompradoresAZ {

	static CaminhoXmlBean_Compradores path = new CaminhoXmlBean_Compradores();
	static String diretorio = path.buscaPorId();
	
	public static void main(String[] args) throws JAXBException {
				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			List<Compradores> list = envelope.getBody().getCompradoresResponse().getCompradoresResult().
					getListCompradores();
			
			for (Compradores compradores : list){
				
				Compradores comp = new Compradores();
					
				 comp.setCentroLucro(compradores.getCentroLucro());
				 comp.setCodContrato(compradores.getCodContrato());
				 comp.setCompanyCode(compradores.getCompanyCode());
				 comp.setArea(compradores.getArea());
				 comp.setNomeBloco(compradores.getNomeBloco());
				 comp.setNumeroDormitorios(compradores.getNumeroDormitorios());
				 comp.setNumeroUnidade(compradores.getNumeroUnidade());
				 comp.setCodClienteSap(compradores.getCodClienteSap());
				 comp.setCodClienteAz(compradores.getCodClienteAz());
				 comp.setTipoCadastro(compradores.getTipoCadastro());
				 comp.setNumCpfCnpj(compradores.getNumCpfCnpj());
				 comp.setNumRg(compradores.getNumRg());
				 comp.setNomeCliente(compradores.getNomeCliente());
				 comp.setSexo(compradores.getSexo());
				 comp.setDataNascimento(compradores.getDataNascimento());
				 comp.setProfissao(compradores.getProfissao());
				 comp.setNacionalidade(compradores.getNacionalidade());
				 comp.setEstadoCivil(compradores.getEstadoCivil());
				 comp.setNomeConjugue(compradores.getNomeConjugue());
				 comp.setNumCpfConjugue(compradores.getNumCpfConjugue());
				 comp.setValorSalario(compradores.getValorSalario());
				 comp.setRua(compradores.getRua());
				 comp.setBairro(compradores.getBairro());
				 comp.setCidade(compradores.getCidade());
				 comp.setEstado(compradores.getEstado());
				 comp.setCep(compradores.getCep());
				 comp.setTelContato(compradores.getTelContato());
				 comp.setTelCelContato(compradores.getTelCelContato());
				 comp.setTelComContato(compradores.getTelComContato());
				 comp.setEmail(compradores.getEmail());
				 comp.setTipoContrato(compradores.getTipoContrato());
				 comp.setStatusContrato(compradores.getStatusContrato());
				 comp.setDataAssinaturaContrato(compradores.getDataAssinaturaContrato());
				 comp.setDataAprovacaoContrato(compradores.getDataAprovacaoContrato());
				 comp.setDataRegistro(compradores.getDataRegistro());
				 comp.setValorContrato(compradores.getValorContrato());
				 comp.setDataHabitese(compradores.getDataHabitese());
				 comp.setEmpresa(compradores.getEmpresa());
				 comp.setCodProjeto(compradores.getCodProjeto());
				 comp.setApelido(compradores.getApelido());
				 comp.setTipoLogradouro(compradores.getTipoLogradouro());
				 comp.setNumero(compradores.getNumero());
				 comp.setComplemeto(compradores.getComplemeto());
				 
				
			DAO<Compradores> dao = new DAO<Compradores>(Compradores.class);
			dao.adiciona(comp);

		}
		
	}

}
