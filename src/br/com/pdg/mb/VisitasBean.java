package br.com.pdg.mb;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.com.pdg.dao.DAO;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.modelo.visitas.Visita;
import br.com.pdg.util.JPAUtil;

@ManagedBean(name ="visBean")
@ViewScoped
public class VisitasBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	EntityManager em = new JPAUtil().getEntityManager();

	private Visita visita = new Visita();
	private List<Visita> visitas;
	static CaminhoXmlBean_Visitas path = new CaminhoXmlBean_Visitas();
	static String diretorio = path.buscaPorId();

		public String grava(){
		
			DAO<Visita> dao = new DAO<Visita>(Visita.class);
			if(visita.getId() == null){
				dao.adiciona(visita);
			} else {
				dao.atualiza(visita);
			}
			visitas = dao.listatudo();
			this.visita = new Visita();
			
		return "visitas?faces-redirect=true";
		}
		
		//metodo pra apagar o xml depois de salva-lo no banco
		public void apagarXml(){
			
			File f = new File(diretorio); 
			f.delete();
		}
		
		public List<Empreendimento> listaEmp(){
			
			DAO<Empreendimento> dao = new DAO<Empreendimento>(Empreendimento.class);
			List<Empreendimento> list = dao.listatudo();
		
			return list;
		}
//		

		
		public Visita getVisita() {
			return visita;
		}

		public void setVisita(Visita visita) {
			this.visita = visita;
		}

		public List<Visita> getVisitas() {
			if(visitas == null){
				visitas = new DAO<Visita>(Visita.class).listatudo();
			}
			return visitas;
		}

}
