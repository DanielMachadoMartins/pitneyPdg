package br.com.pdg.mb;

import java.io.File;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.com.pdg.dao.DAO;
import br.com.pdg.modelo.empreendimentos.Empreendimento;
import br.com.pdg.util.JPAUtil;

@ManagedBean(name ="empBean")
@ViewScoped
public class EmpreendimentosBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EntityManager em = new JPAUtil().getEntityManager();

	private Empreendimento empreendimento = new Empreendimento();
	private List<Empreendimento> empreendimentos;
	static CaminhoXmlBean_Empreendimentos path = new CaminhoXmlBean_Empreendimentos();
	static String diretorio = path.buscaPorId();
	
		public String grava(){
		
			DAO<Empreendimento> dao = new DAO<Empreendimento>(Empreendimento.class);
			if(empreendimento.getEMP_ID() == null){
				dao.adiciona(empreendimento);
			} else {
				dao.atualiza(empreendimento);
			}
			empreendimentos = dao.listatudo();
			this.empreendimento = new Empreendimento();
			
		return "empreendimento?faces-redirect=true";
		}
		
		//metodo pra apagar o xml depois de salva-lo no banco
		public void apagarXml(){
			
			File f = new File(diretorio); 
			f.delete();
		}
		
		
		
		public Empreendimento getEmpreendimento() {
			return empreendimento;
		}


		public void setEmpreendimento(Empreendimento empreendimento) {
			this.empreendimento = empreendimento;
		}




		public List<Empreendimento> getEmpreendimentos() {
			if(empreendimentos == null){
				empreendimentos = new DAO<Empreendimento>(Empreendimento.class).listatudo();
			}
			return empreendimentos;
		}

}
