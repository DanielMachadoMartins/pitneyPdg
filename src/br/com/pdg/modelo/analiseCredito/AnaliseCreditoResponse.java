package br.com.pdg.modelo.analiseCredito;

import javax.xml.bind.annotation.XmlElement;

public class AnaliseCreditoResponse {
	
	private AnaliseCreditoResult analiseCreditoResult;

	@XmlElement(name="getAnaliseCreditoResult", namespace="http://tempuri.org/")
	public AnaliseCreditoResult getAnaliseCreditoResult() {
		return analiseCreditoResult;
	}

	public void setAnaliseCreditoResult(AnaliseCreditoResult analiseCreditoResult) {
		this.analiseCreditoResult = analiseCreditoResult;
	}
	
	

}
