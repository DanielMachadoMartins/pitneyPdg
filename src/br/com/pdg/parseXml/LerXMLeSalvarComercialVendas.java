package br.com.pdg.parseXml;

import java.util.List;

import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_ComercialVendas;
import br.com.pdg.modelo.comercialVendas.ComercialVenda;
import br.com.pdg.modelo.comercialVendas.Envelope;


public class LerXMLeSalvarComercialVendas {
	
	static CaminhoXmlBean_ComercialVendas path = new CaminhoXmlBean_ComercialVendas();
	static String diretorio = path.buscaPorId();
	
	public static void main(String[] args) throws JAXBException {
				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			List<ComercialVenda> list = envelope.getBody().getComercialVendasResponse().getComercialVendasResult().
					getListVendas();
			
			//System.out.println(list.size());
			for (ComercialVenda comercialVenda : list){
				
				ComercialVenda cv = new ComercialVenda();
								
				cv.setCentroLucro(comercialVenda.getCentroLucro());
				cv.setCodigoProjeto(comercialVenda.getCodigoProjeto());
				cv.setNomeEmpresa(comercialVenda.getNomeEmpresa());
				cv.setEmpreendimento(comercialVenda.getEmpreendimento());
				cv.setApelido(comercialVenda.getApelido());
				cv.setCompanyCode(comercialVenda.getCompanyCode());
				cv.setEndereco(comercialVenda.getEndereco());
				cv.setComplemeto(comercialVenda.getComplemeto());
				cv.setBairro(comercialVenda.getBairro());
				cv.setCidade(comercialVenda.getCidade());
				cv.setEstado(comercialVenda.getEstado());
				cv.setCep(comercialVenda.getCep());
				cv.setArea(comercialVenda.getArea());
				cv.setNumeroDormitorios(comercialVenda.getNumeroDormitorios());
				cv.setQtdUnidades(comercialVenda.getQtdUnidades());
				cv.setDataLancamento(comercialVenda.getDataLancamento());
				cv.setQtdUnidadeMesLamcamento(comercialVenda.getQtdUnidadeMesLamcamento());
				cv.setPrecoMedioUnidadeMesLancamento(comercialVenda.getPrecoMedioUnidadeMesLancamento());
				cv.setQtdUnidade1mesLancamento(comercialVenda.getQtdUnidade1mesLancamento());
				cv.setPrecoMedioUnidade1mesLancamento(comercialVenda.getPrecoMedioUnidade1mesLancamento());
				cv.setQtdUnidade2mesLancamento(comercialVenda.getQtdUnidade2mesLancamento());
				cv.setPrecoMedioUnidade2mesLancamento(comercialVenda.getPrecoMedioUnidade2mesLancamento());
				cv.setQtdUnidade3mesLancamento(comercialVenda.getQtdUnidade3mesLancamento());
				cv.setPrecoMedioUnidade3mesLancamento(comercialVenda.getPrecoMedioUnidade3mesLancamento());
				cv.setQtdUnidade6mesLancamento(comercialVenda.getQtdUnidade6mesLancamento());
				cv.setPrecoMedioUnidade6mesLancamento(comercialVenda.getPrecoMedioUnidade6mesLancamento());
				cv.setQtdUnidade1anoLancamento(comercialVenda.getQtdUnidade1anoLancamento());
				cv.setPrecoMedioUnidade1anoLancamento(comercialVenda.getPrecoMedioUnidade1anoLancamento());
				cv.setQtdUnidadeAtual(comercialVenda.getQtdUnidadeAtual());
				cv.setPrecoMedioUnidadeAtual(comercialVenda.getPrecoMedioUnidadeAtual());
								
			DAO<ComercialVenda> dao = new DAO<ComercialVenda>(ComercialVenda.class);
			dao.adiciona(cv);

		}
		
	}


}
