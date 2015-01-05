package br.com.pdg.modelo.empreendimentos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="PDG_ES_empreendimento")
public class Empreendimento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	private String EMP_ID;
	private String EMP_REGIONAL;
	private String EMP_NOME;
	private String EMP_LOGRADOURO;
	private String EMP_NUMERO;
	private String EMP_BAIRRO;
	private String EMP_CIDADE;
	private String EMP_UF;
	private String EMP_CEP;
	private String EMP_COMPLEMENTO;
	private String EMP_LATLNG;
	private String EMP_PRIMEIRAVISITA;
	private String EMP_STATUS;
	private Date EMP_ULTIMA_REQ;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(String eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_REGIONAL() {
		return EMP_REGIONAL;
	}
	public void setEMP_REGIONAL(String eMP_REGIONAL) {
		EMP_REGIONAL = eMP_REGIONAL;
	}
	public String getEMP_NOME() {
		return EMP_NOME;
	}
	public void setEMP_NOME(String eMP_NOME) {
		EMP_NOME = eMP_NOME;
	}
	public String getEMP_LOGRADOURO() {
		return EMP_LOGRADOURO;
	}
	public void setEMP_LOGRADOURO(String eMP_LOGRADOURO) {
		EMP_LOGRADOURO = eMP_LOGRADOURO;
	}
	public String getEMP_NUMERO() {
		return EMP_NUMERO;
	}
	public void setEMP_NUMERO(String eMP_NUMERO) {
		EMP_NUMERO = eMP_NUMERO;
	}
	public String getEMP_BAIRRO() {
		return EMP_BAIRRO;
	}
	public void setEMP_BAIRRO(String eMP_BAIRRO) {
		EMP_BAIRRO = eMP_BAIRRO;
	}
	public String getEMP_CIDADE() {
		return EMP_CIDADE;
	}
	public void setEMP_CIDADE(String eMP_CIDADE) {
		EMP_CIDADE = eMP_CIDADE;
	}
	public String getEMP_UF() {
		return EMP_UF;
	}
	public void setEMP_UF(String eMP_UF) {
		EMP_UF = eMP_UF;
	}
	public String getEMP_CEP() {
		return EMP_CEP;
	}
	public void setEMP_CEP(String eMP_CEP) {
		EMP_CEP = eMP_CEP;
	}
	public String getEMP_COMPLEMENTO() {
		return EMP_COMPLEMENTO;
	}
	public void setEMP_COMPLEMENTO(String eMP_COMPLEMENTO) {
		EMP_COMPLEMENTO = eMP_COMPLEMENTO;
	}
	public String getEMP_LATLNG() {
		return EMP_LATLNG;
	}
	public void setEMP_LATLNG(String eMP_LATLNG) {
		EMP_LATLNG = eMP_LATLNG;
	}
	public String getEMP_PRIMEIRAVISITA() {
		return EMP_PRIMEIRAVISITA;
	}
	public void setEMP_PRIMEIRAVISITA(String eMP_PRIMEIRAVISITA) {
		EMP_PRIMEIRAVISITA = eMP_PRIMEIRAVISITA;
	}
	public String getEMP_STATUS() {
		return EMP_STATUS;
	}
	public void setEMP_STATUS(String eMP_STATUS) {
		EMP_STATUS = eMP_STATUS;
	}
	public Date getEMP_ULTIMA_REQ() {
		return EMP_ULTIMA_REQ;
	}
	public void setEMP_ULTIMA_REQ(Date eMP_ULTIMA_REQ) {
		EMP_ULTIMA_REQ = eMP_ULTIMA_REQ;
	}
	
	
	
}
