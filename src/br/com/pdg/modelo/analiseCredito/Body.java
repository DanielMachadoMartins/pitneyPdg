package br.com.pdg.modelo.analiseCredito;

import javax.xml.bind.annotation.XmlElement;


public class Body {
	
	private AnaliseCreditoResponse analiseCreditoResponse;

	@XmlElement(name="getAnaliseCreditoResponse", namespace ="http://tempuri.org/")
	public AnaliseCreditoResponse getAnaliseCreditoResponse() {
		return analiseCreditoResponse;
	}

	public void setAnaliseCreditoResponse(
			AnaliseCreditoResponse analiseCreditoResponse) {
		this.analiseCreditoResponse = analiseCreditoResponse;
	}


	
	

}
