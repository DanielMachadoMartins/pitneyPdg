package br.com.pdg.modelo.visitas;

import javax.xml.bind.annotation.XmlElement;

public class VisitasResult {
	
	private RESULT result;

	@XmlElement(name="RESULT")
	public RESULT getResult() {
		return result;
	}

	public void setResult(RESULT result) {
		this.result = result;
	}
	
	

}
