package br.com.pdg.modelo.empreendimentos;

import javax.xml.bind.annotation.XmlElement;




public class Body {
	
	private EmpreendimentoResponse empreendimentoResponse;

	@XmlElement(name="getEmpreendimentosResponse", namespace ="http://easysis.com.br/webservice/")
	public EmpreendimentoResponse getEmpreendimentoResponse() {
		return empreendimentoResponse;
	}

	public void setEmpreendimentoResponse(
			EmpreendimentoResponse empreendimentoResponse) {
		this.empreendimentoResponse = empreendimentoResponse;
	}
	
	

}
