package br.com.pdg.modelo.analiseCredito;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class AnaliseCreditoResult {
	
	private List<AnaliseCredito> listAnaliseCreditos;

	@XmlElementWrapper(name="analisecredito", namespace ="http://tempuri.org/")
	@XmlElement(name="Empreendimento", namespace ="http://tempuri.org/")
	public List<AnaliseCredito> getListAnaliseCreditos() {
		return listAnaliseCreditos;
	}

	public void setListAnaliseCreditos(List<AnaliseCredito> listAnaliseCreditos) {
		this.listAnaliseCreditos = listAnaliseCreditos;
	}

}
