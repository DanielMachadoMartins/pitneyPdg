package br.com.pdg.modelo.visitas;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Envelope")
public class Visitas {
	
	
	List<Visita> visitas;
	
	
	@XmlElement(name="VISITA")
	@XmlElementWrapper(name="VISITAS")
	public List<Visita> getVisitas() {
		return visitas;
	}


	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}


}
