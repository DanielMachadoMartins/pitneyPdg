package br.com.pdg.modelo.compradoresAZ;

import javax.xml.bind.annotation.XmlElement;

public class CompradoresResponse {
	
	private CompradoresResult compradoresResult;

	@XmlElement(name="getCompradoresResult", namespace="http://tempuri.org/")
	public CompradoresResult getCompradoresResult() {
		return compradoresResult;
	}

	public void setCompradoresResult(CompradoresResult compradoresResult) {
		this.compradoresResult = compradoresResult;
	}
	

}
