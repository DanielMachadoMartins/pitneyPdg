package br.com.pdg.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.bind.JAXBException;

import br.com.pdg.parseXml.LerXMLeSalvar_Empreendimentos;
import br.com.pdg.parseXml.LerXMLeSalvar_Visitas;
import br.com.pdg.ws.ChamaWS_Empreendimentos;
import br.com.pdg.ws.ChamaWS_Visitas;

@ManagedBean(name="principalBean")
@ViewScoped
public class PrincipalBean {
	
	ChamaWS_Empreendimentos chamaWS_Empreendimento = new ChamaWS_Empreendimentos();
	ChamaWS_Visitas chamaWS_Visitas = new ChamaWS_Visitas();
	
	LerXMLeSalvar_Empreendimentos lerXMLeSalvar_Empreendimentos = new LerXMLeSalvar_Empreendimentos();
	LerXMLeSalvar_Visitas lerXMLeSalvar_Visitas = new LerXMLeSalvar_Visitas();
	
	EmpreendimentosBean eb = new EmpreendimentosBean();
	VisitasBean vb = new VisitasBean();
	
	
	public void executaWS_Empreendimentos() throws JAXBException{
		chamaWS_Empreendimento.main(null);
		lerXMLeSalvar_Empreendimentos.main(null);
		eb.apagarXml();
		
	}
	

}
