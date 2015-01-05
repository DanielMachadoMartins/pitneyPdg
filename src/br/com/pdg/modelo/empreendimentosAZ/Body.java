package br.com.pdg.modelo.empreendimentosAZ;

import javax.xml.bind.annotation.XmlElement;


public class Body {
	
	private EmpreendimentosResponse empreendimentoResponse;

	@XmlElement(name="getEmpreendimentosResponse", namespace ="http://tempuri.org/")
	public EmpreendimentosResponse getEmpreendimentoResponse() {
		return empreendimentoResponse;
	}

	public void setEmpreendimentoResponse(
			EmpreendimentosResponse empreendimentoResponse) {
		this.empreendimentoResponse = empreendimentoResponse;
	}


}
