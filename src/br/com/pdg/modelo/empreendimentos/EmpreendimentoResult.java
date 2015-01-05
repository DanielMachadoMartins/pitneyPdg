package br.com.pdg.modelo.empreendimentos;

import javax.xml.bind.annotation.XmlElement;

public class EmpreendimentoResult {
	
	private RESULT result;

	@XmlElement(name="RESULT")
	public RESULT getResult() {
		return result;
	}

	public void setResult(RESULT result) {
		this.result = result;
	}
	
	

}
