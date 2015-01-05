package br.com.pdg.modelo.empreendimentos;

import javax.xml.bind.annotation.XmlElement;

public class EmpreendimentoResponse {
	
	private EmpreendimentoResult empreendimentoResult;
	
	
	@XmlElement(name="getEmpreendimentosResult", namespace="http://easysis.com.br/webservice/")
	public EmpreendimentoResult getEmpreendimentoResult() {
		return empreendimentoResult;
	}

	public void setEmpreendimentoResult(EmpreendimentoResult empreendimentoResult) {
		this.empreendimentoResult = empreendimentoResult;
	}
	
	

}
