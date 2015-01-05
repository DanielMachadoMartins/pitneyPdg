package br.com.pdg.parseXml;

import java.util.List;


import javax.xml.bind.JAXBException;

import br.com.pdg.dao.DAO;
import br.com.pdg.mb.CaminhoXmlBean_AnaliseCredito;
import br.com.pdg.modelo.analiseCredito.AnaliseCredito;
import br.com.pdg.modelo.analiseCredito.Envelope;

public class LerXMLeSalvar_AnaliseCredito {

	static CaminhoXmlBean_AnaliseCredito path = new CaminhoXmlBean_AnaliseCredito();
	static String diretorio = path.buscaPorId();
	
	public static void main(String[] args) throws JAXBException {
				
					
			Envelope envelope = JaxbUtils.unmashaller(diretorio, Envelope.class);
			
			List<AnaliseCredito> list = envelope.getBody().getAnaliseCreditoResponse().getAnaliseCreditoResult().
					getListAnaliseCreditos();
			
			
			for (AnaliseCredito analiseCredito : list){
				
				AnaliseCredito ac = new AnaliseCredito();
					
				 ac.setCentroLucro(analiseCredito.getCentroLucro());
				 ac.setIdContrato(analiseCredito.getIdContrato());
				 ac.setCiclo(analiseCredito.getCiclo());
				 ac.setTipoVenda(analiseCredito.getTipoVenda());
				 ac.setProtocolo(analiseCredito.getProtocolo());
				 ac.setProjeto(analiseCredito.getProjeto());
				 ac.setBloco(analiseCredito.getBloco());
				 ac.setIdUnidade(analiseCredito.getIdUnidade());
				 ac.setNome(analiseCredito.getNome());
				 ac.setCnpjCpf(analiseCredito.getCnpjCpf());
				 ac.setContribuicaoFgts(analiseCredito.getContribuicaoFgts());
				 ac.setValorContrato(analiseCredito.getValorContrato());
				 ac.setValorFinanciamento(analiseCredito.getValorFinanciamento());
				 ac.setChaves(analiseCredito.getChaves());
				 ac.setBancoFinanciador(analiseCredito.getBancoFinanciador());
				 ac.setAtrasoCessao(analiseCredito.getAtrasoCessao());
				 ac.setSaldoDevedor(analiseCredito.getSaldoDevedor());
				 ac.setCartaCredito(analiseCredito.getCartaCredito());
				 ac.setBanco(analiseCredito.getBanco());
				 ac.setAvaliacao(analiseCredito.getAvaliacao());
				 ac.setTabelaFinanciamento(analiseCredito.getTabelaFinanciamento());
				 ac.setPrazoFinanciamento(analiseCredito.getPrazoFinanciamento());
				 ac.setRendaComprador(analiseCredito.getRendaComprador());
				 ac.setTotalFgts(analiseCredito.getTotalFgts());
				 ac.setValorPatrimonio(analiseCredito.getValorPatrimonio());
				 ac.setValorAvaliacao(analiseCredito.getValorAvaliacao());
				 ac.setValorSubsidio(analiseCredito.getValorSubsidio());
				 ac.setValorFinanciamentoAprovado(analiseCredito.getValorFinanciamentoAprovado());
				 ac.setValorDiferenca(analiseCredito.getValorDiferenca());
		         ac.setSicaq(analiseCredito.getSicaq());
		         ac.setMotivoRecusa(analiseCredito.getMotivoRecusa());
		         ac.setMomentoSolicitacao(analiseCredito.getMomentoSolicitacao());
		         ac.setMomentoParecer(analiseCredito.getMomentoParecer());
				
			DAO<AnaliseCredito> dao = new DAO<AnaliseCredito>(AnaliseCredito.class);
			dao.adiciona(ac);

		}
		
	}

}
