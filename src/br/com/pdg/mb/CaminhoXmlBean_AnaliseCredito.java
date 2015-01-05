package br.com.pdg.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.com.pdg.dao.DAO;
import br.com.pdg.util.CaminhoXml;
import br.com.pdg.util.JPAUtil;



@ManagedBean(name="camXmlBean_AnaCre")
@ViewScoped
public class CaminhoXmlBean_AnaliseCredito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EntityManager em = new JPAUtil().getEntityManager();

	private CaminhoXml cXml = new CaminhoXml();
	private List<CaminhoXml> cXmls;
	
	
		public String grava(){
		
			DAO<CaminhoXml> dao = new DAO<CaminhoXml>(CaminhoXml.class);
			if(cXml.getId() == null){
				dao.adiciona(cXml);
			} else {
				dao.atualiza(cXml);
			}
			cXmls = dao.listatudo();
			this.cXml = new CaminhoXml();
			
		return "caminhoXml?faces-redirect=true";
		}
		
		//para o caminho xml do getAnaliseCredito o id deve ser sempre 4
		public String buscaPorId(){
			DAO<CaminhoXml> dao = new DAO<CaminhoXml>(CaminhoXml.class);
			CaminhoXml cx = dao.buscaPorId((long) 4);
			String chave = cx.getPathXml();
			
			return chave;
		}

		public CaminhoXml getcXml() {
			return cXml;
		}

		public void setcXml(CaminhoXml cXml) {
			this.cXml = cXml;
		}

		public List<CaminhoXml> getcXmls() {
			if(cXmls == null){
				cXmls = new DAO<CaminhoXml>(CaminhoXml.class).listatudo();
			}
			return cXmls;
		}


}
