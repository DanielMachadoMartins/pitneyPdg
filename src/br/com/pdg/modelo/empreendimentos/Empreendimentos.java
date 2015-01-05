package br.com.pdg.modelo.empreendimentos;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Envelope")
public class Empreendimentos {
	
	
	List<Empreendimento> empreendimentos;
	
	
	@XmlElement(name="EMPREENDIMENTO")
	@XmlElementWrapper(name="EMPREENDIMENTOS")
	public List<Empreendimento> getEmpreendimentos() {
		return empreendimentos;
	}

	public void setEmpreendimentos(List<Empreendimento> empreendimentos) {
		this.empreendimentos = empreendimentos;
	}
	
	

}
