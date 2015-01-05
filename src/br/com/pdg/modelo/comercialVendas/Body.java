package br.com.pdg.modelo.comercialVendas;

import javax.xml.bind.annotation.XmlElement;


public class Body {
	
	private ComercialVendasResponse comercialVendasResponse;


	@XmlElement(name="getComercialVendasResponse", namespace ="http://tempuri.org/")
	public ComercialVendasResponse getComercialVendasResponse() {
		return comercialVendasResponse;
	}

	public void setComercialVendasResponse(
			ComercialVendasResponse comercialVendasResponse) {
		this.comercialVendasResponse = comercialVendasResponse;
	}
	
	
	

}
