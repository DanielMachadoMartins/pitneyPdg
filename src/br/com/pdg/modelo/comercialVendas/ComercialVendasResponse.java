package br.com.pdg.modelo.comercialVendas;

import javax.xml.bind.annotation.XmlElement;

public class ComercialVendasResponse {
	
	private ComercialVendasResult comercialVendasResult;

	@XmlElement(name="getComercialVendasResult", namespace="http://tempuri.org/")
	public ComercialVendasResult getComercialVendasResult() {
		return comercialVendasResult;
	}

	public void setComercialVendasResult(ComercialVendasResult comercialVendasResult) {
		this.comercialVendasResult = comercialVendasResult;
	}
	
}
