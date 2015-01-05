package br.com.pdg.modelo.empreendimentos;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


public class RESULT {
	
	private List<Empreendimento> empreendimentos;

	@XmlElementWrapper(name="EMPREENDIMENTOS")
	@XmlElement(name="EMPREENDIMENTO")
	public List<Empreendimento> getEmpreendimentos() {
		return empreendimentos;
	}

	public void setEmpreendimentos(List<Empreendimento> empreendimentos) {
		this.empreendimentos = empreendimentos;
	}
	
	
	

}
