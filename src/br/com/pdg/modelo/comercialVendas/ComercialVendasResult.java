package br.com.pdg.modelo.comercialVendas;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


public class ComercialVendasResult {
			
	private List<ComercialVenda> listVendas;

	public ComercialVendasResult(){
		listVendas = new ArrayList<ComercialVenda>();
	}
	
	@XmlElementWrapper(name="comercialVendas", namespace ="http://tempuri.org/")
	@XmlElement(name="ComercialVendas", namespace ="http://tempuri.org/")
	public List<ComercialVenda> getListVendas() {
		return listVendas;
	}

	public void setListVendas(List<ComercialVenda> listVendas) {
		this.listVendas = listVendas;
	}

	

	
	
	
	
	

}
