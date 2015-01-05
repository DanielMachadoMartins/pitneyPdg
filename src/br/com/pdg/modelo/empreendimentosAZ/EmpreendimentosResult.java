package br.com.pdg.modelo.empreendimentosAZ;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class EmpreendimentosResult {
	
	private List<Empreendimento> listEmpreendimento;

	@XmlElementWrapper(name="empreendimentos", namespace ="http://tempuri.org/")
	@XmlElement(name="Empreendimentos", namespace ="http://tempuri.org/")
	public List<Empreendimento> getListEmpreendimento() {
		return listEmpreendimento;
	}

	public void setListEmpreendimento(List<Empreendimento> listEmpreendimento) {
		this.listEmpreendimento = listEmpreendimento;
	}

	
}
