package br.com.pdg.modelo.visitas;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PDG_ES_visitas")
public class Visita implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String VIS_ID;
	private String VIS_TIPO;
	private String VIS_DATA;
	private String VIS_NOME;
	private String VIS_SEXO;
	private String VIS_EMAIL;
	private String VIS_TELEFONE;
	private String VIS_CELULAR;
	private String VIS_LOGRADOURO;
	private String VIS_NUMERO;
	private String VIS_BAIRRO;
	private String VIS_CIDADE;
	private String VIS_UF;
	private String VIS_CEP;
	private String VIS_COMPLEMENTO;
	private String VIS_LATLNG;
	private String VIS_EMPRESA;
	private String VIS_GERENTE;
	private String VIS_CORRETOR;
	private String VIS_MIDIA;
	private String VIS_VEICULO;
	private String VIS_PROGRAMA;
	private String VIS_RESERVOU;
	private String VIS_OBSERVACOES;
	private String VIS_PROFISSAO;
	private String VIS_PERGUNTA;
	private String VIS_RESPOSTA;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVIS_ID() {
		return VIS_ID;
	}
	public void setVIS_ID(String vIS_ID) {
		VIS_ID = vIS_ID;
	}
	public String getVIS_TIPO() {
		return VIS_TIPO;
	}
	public void setVIS_TIPO(String vIS_TIPO) {
		VIS_TIPO = vIS_TIPO;
	}
	public String getVIS_DATA() {
		return VIS_DATA;
	}
	public void setVIS_DATA(String vIS_DATA) {
		VIS_DATA = vIS_DATA;
	}
	public String getVIS_NOME() {
		return VIS_NOME;
	}
	public void setVIS_NOME(String vIS_NOME) {
		VIS_NOME = vIS_NOME;
	}
	public String getVIS_SEXO() {
		return VIS_SEXO;
	}
	public void setVIS_SEXO(String vIS_SEXO) {
		VIS_SEXO = vIS_SEXO;
	}
	public String getVIS_EMAIL() {
		return VIS_EMAIL;
	}
	public void setVIS_EMAIL(String vIS_EMAIL) {
		VIS_EMAIL = vIS_EMAIL;
	}
	public String getVIS_TELEFONE() {
		return VIS_TELEFONE;
	}
	public void setVIS_TELEFONE(String vIS_TELEFONE) {
		VIS_TELEFONE = vIS_TELEFONE;
	}
	public String getVIS_CELULAR() {
		return VIS_CELULAR;
	}
	public void setVIS_CELULAR(String vIS_CELULAR) {
		VIS_CELULAR = vIS_CELULAR;
	}
	public String getVIS_LOGRADOURO() {
		return VIS_LOGRADOURO;
	}
	public void setVIS_LOGRADOURO(String vIS_LOGRADOURO) {
		VIS_LOGRADOURO = vIS_LOGRADOURO;
	}
	public String getVIS_NUMERO() {
		return VIS_NUMERO;
	}
	public void setVIS_NUMERO(String vIS_NUMERO) {
		VIS_NUMERO = vIS_NUMERO;
	}
	public String getVIS_BAIRRO() {
		return VIS_BAIRRO;
	}
	public void setVIS_BAIRRO(String vIS_BAIRRO) {
		VIS_BAIRRO = vIS_BAIRRO;
	}
	public String getVIS_CIDADE() {
		return VIS_CIDADE;
	}
	public void setVIS_CIDADE(String vIS_CIDADE) {
		VIS_CIDADE = vIS_CIDADE;
	}
	public String getVIS_UF() {
		return VIS_UF;
	}
	public void setVIS_UF(String vIS_UF) {
		VIS_UF = vIS_UF;
	}
	public String getVIS_CEP() {
		return VIS_CEP;
	}
	public void setVIS_CEP(String vIS_CEP) {
		VIS_CEP = vIS_CEP;
	}
	public String getVIS_COMPLEMENTO() {
		return VIS_COMPLEMENTO;
	}
	public void setVIS_COMPLEMENTO(String vIS_COMPLEMENTO) {
		VIS_COMPLEMENTO = vIS_COMPLEMENTO;
	}
	public String getVIS_LATLNG() {
		return VIS_LATLNG;
	}
	public void setVIS_LATLNG(String vIS_LATLNG) {
		VIS_LATLNG = vIS_LATLNG;
	}
	public String getVIS_EMPRESA() {
		return VIS_EMPRESA;
	}
	public void setVIS_EMPRESA(String vIS_EMPRESA) {
		VIS_EMPRESA = vIS_EMPRESA;
	}
	public String getVIS_GERENTE() {
		return VIS_GERENTE;
	}
	public void setVIS_GERENTE(String vIS_GERENTE) {
		VIS_GERENTE = vIS_GERENTE;
	}
	public String getVIS_CORRETOR() {
		return VIS_CORRETOR;
	}
	public void setVIS_CORRETOR(String vIS_CORRETOR) {
		VIS_CORRETOR = vIS_CORRETOR;
	}
	public String getVIS_MIDIA() {
		return VIS_MIDIA;
	}
	public void setVIS_MIDIA(String vIS_MIDIA) {
		VIS_MIDIA = vIS_MIDIA;
	}
	public String getVIS_VEICULO() {
		return VIS_VEICULO;
	}
	public void setVIS_VEICULO(String vIS_VEICULO) {
		VIS_VEICULO = vIS_VEICULO;
	}
	public String getVIS_PROGRAMA() {
		return VIS_PROGRAMA;
	}
	public void setVIS_PROGRAMA(String vIS_PROGRAMA) {
		VIS_PROGRAMA = vIS_PROGRAMA;
	}
	public String getVIS_RESERVOU() {
		return VIS_RESERVOU;
	}
	public void setVIS_RESERVOU(String vIS_RESERVOU) {
		VIS_RESERVOU = vIS_RESERVOU;
	}
	
	public String getVIS_PROFISSAO() {
		return VIS_PROFISSAO;
	}
	public void setVIS_PROFISSAO(String vIS_PROFISSAO) {
		VIS_PROFISSAO = vIS_PROFISSAO;
	}
	public String getVIS_PERGUNTA() {
		return VIS_PERGUNTA;
	}
	public void setVIS_PERGUNTA(String vIS_PERGUNTA) {
		VIS_PERGUNTA = vIS_PERGUNTA;
	}
	public String getVIS_RESPOSTA() {
		return VIS_RESPOSTA;
	}
	public void setVIS_RESPOSTA(String vIS_RESPOSTA) {
		VIS_RESPOSTA = vIS_RESPOSTA;
	}
	public String getVIS_OBSERVACOES() {
		return VIS_OBSERVACOES;
	}
	public void setVIS_OBSERVACOES(String vIS_OBSERVACOES) {
		VIS_OBSERVACOES = vIS_OBSERVACOES;
	}
	

	
}	