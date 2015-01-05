package br.com.pdg.modelo.compradoresAZ;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class CompradoresResult {
	
	private List<Compradores> listCompradores;

	@XmlElementWrapper(name="compradores", namespace ="http://tempuri.org/")
	@XmlElement(name="Compradores", namespace ="http://tempuri.org/")
	public List<Compradores> getListCompradores() {
		return listCompradores;
	}

	public void setListCompradores(List<Compradores> listCompradores) {
		this.listCompradores = listCompradores;
	}
	
	
}
