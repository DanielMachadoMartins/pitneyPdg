package br.com.pdg.modelo.visitas;

import javax.xml.bind.annotation.XmlElement;

public class VisitasResponse {
	
	private VisitasResult visitasResult;
	
	
	@XmlElement(name="getVisitasResult", namespace="http://easysis.com.br/webservice/")
	public VisitasResult getVisitasResult() {
		return visitasResult;
	}

	public void setVisitasResult(VisitasResult visitasResult) {
		this.visitasResult = visitasResult;
	}
	
	

}
