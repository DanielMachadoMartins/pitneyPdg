package br.com.pdg.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CaminhoXml {
	
	@Id
	@GeneratedValue
	private Long id;
	private String pathXml;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPathXml() {
		return pathXml;
	}
	public void setPathXml(String pathXml) {
		this.pathXml = pathXml;
	}
	
	

}
