package br.com.pdg.modelo.visitas;

import javax.xml.bind.annotation.XmlElement;




public class Body {
	
	private VisitasResponse visitasResponse;

	@XmlElement(name="getVisitasResponse", namespace ="http://easysis.com.br/webservice/")
	public VisitasResponse getVisitasResponse() {
		return visitasResponse;
	}

	public void setVisitasResponse(
			VisitasResponse visitasResponse) {
		this.visitasResponse = visitasResponse;
	}
	
	

}
