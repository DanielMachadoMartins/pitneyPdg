package br.com.pdg.modelo.visitas;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


public class RESULT {
	
	private List<Visita> visitas;

	@XmlElementWrapper(name="VISITAS")
	@XmlElement(name="VISITA")
	public List<Visita> getVisitas() {
		return visitas;
	}

	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	
	
	

}
