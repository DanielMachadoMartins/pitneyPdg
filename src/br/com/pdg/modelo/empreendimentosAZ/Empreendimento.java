package br.com.pdg.modelo.empreendimentosAZ;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PDG_AZ_Empreendimentos")
public class Empreendimento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String codProjeto;
	private String nomeEmpresa;
	private String nomeEmpreendimento;
	private String apelido;
	private String endereco;
	private String cidade;
	private String estado;
	private String bairro;
	private String complemento;
	private String cep;
	private String centroLucro;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cod_projeto", namespace="http://tempuri.org/")
	public String getCodProjeto() {
		return codProjeto;
	}
	public void setCodProjeto(String codProjeto) {
		this.codProjeto = codProjeto;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_empresa", namespace="http://tempuri.org/")
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_empreendimento", namespace="http://tempuri.org/")
	public String getNomeEmpreendimento() {
		return nomeEmpreendimento;
	}
	public void setNomeEmpreendimento(String nomeEmpreendimento) {
		this.nomeEmpreendimento = nomeEmpreendimento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="apelido", namespace="http://tempuri.org/")
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="endereco", namespace="http://tempuri.org/")
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cidade", namespace="http://tempuri.org/")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="estado", namespace="http://tempuri.org/")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="bairro", namespace="http://tempuri.org/")
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="complemento", namespace="http://tempuri.org/")
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="CEP", namespace="http://tempuri.org/")
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="centro_lucro", namespace="http://tempuri.org/")
	public String getCentroLucro() {
		return centroLucro;
	}
	public void setCentroLucro(String centroLucro) {
		this.centroLucro = centroLucro;
	}	
	
}
