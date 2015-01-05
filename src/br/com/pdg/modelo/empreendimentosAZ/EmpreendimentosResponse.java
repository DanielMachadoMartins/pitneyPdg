package br.com.pdg.modelo.empreendimentosAZ;

import javax.xml.bind.annotation.XmlElement;

public class EmpreendimentosResponse {
	
	private EmpreendimentosResult empreendimentoResult;

	@XmlElement(name="getEmpreendimentosResult", namespace="http://tempuri.org/")
	public EmpreendimentosResult getEmpreendimentoResult() {
		return empreendimentoResult;
	}

	public void setEmpreendimentoResult(EmpreendimentosResult empreendimentoResult) {
		this.empreendimentoResult = empreendimentoResult;
	}
	

}
