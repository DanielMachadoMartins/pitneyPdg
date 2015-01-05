package br.com.pdg.modelo.compradoresAZ;

import javax.xml.bind.annotation.XmlElement;


public class Body {
	
	private CompradoresResponse compradoresResponse;

	@XmlElement(name="getCompradoresResponse", namespace ="http://tempuri.org/")
	public CompradoresResponse getCompradoresResponse() {
		return compradoresResponse;
	}

	public void setCompradoresResponse(CompradoresResponse compradoresResponse) {
		this.compradoresResponse = compradoresResponse;
	}

}
