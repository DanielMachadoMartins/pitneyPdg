package br.com.pdg.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import br.com.pdg.dao.DAO;
import br.com.pdg.token.Token;
import br.com.pdg.util.JPAUtil;

@ManagedBean(name ="tokenBean")
@ViewScoped
public class TokenBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	EntityManager em = new JPAUtil().getEntityManager();

	private Token token = new Token();
	private List<Token> tokens;
	
	
		public String grava(){
		
			DAO<Token> dao = new DAO<Token>(Token.class);
			if(token.getId() == null){
				dao.adiciona(token);
			} else {
				dao.atualiza(token);
			}
			tokens = dao.listatudo();
			this.token = new Token();
			
		return "token?faces-redirect=true";
		}
		
		public String buscaPorId(){
			DAO<Token> dao = new DAO<Token>(Token.class);
			Token tk = dao.buscaPorId((long) 1);
			String chave = tk.getChave();
			
			return chave;
			
		}
		
		public String buscaPorIdComercialVendas(){
			DAO<Token> dao = new DAO<Token>(Token.class);
			Token tk = dao.buscaPorId((long) 2);
			String chave = tk.getChave();
			
			return chave;
			
		}
		
		public String buscaPorIdAnaliseCredito(){
			DAO<Token> dao = new DAO<Token>(Token.class);
			Token tk = dao.buscaPorId((long) 2);
			String chave = tk.getChave();
			
			return chave;
			
		}
		
		public String buscaPorIdCompradores(){
			DAO<Token> dao = new DAO<Token>(Token.class);
			Token tk = dao.buscaPorId((long) 2);
			String chave = tk.getChave();
			
			return chave;
			
		}
		
		public String buscaPorIdEmpreendimentosAZ(){
			DAO<Token> dao = new DAO<Token>(Token.class);
			Token tk = dao.buscaPorId((long) 2);
			String chave = tk.getChave();
			
			return chave;
			
		}


		public Token getToken() {
			return token;
		}


		public void setToken(Token token) {
			this.token = token;
		}


		public List<Token> getTokens() {
			if(tokens == null){
				tokens = new DAO<Token>(Token.class).listatudo();
			}
			return tokens;
		}




}
