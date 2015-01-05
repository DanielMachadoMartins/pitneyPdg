package br.com.pdg.modelo.comercialVendas;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PDG_AZ_comercialVendas")
public class ComercialVenda implements Serializable {
	
	public ComercialVenda(){
		
	}
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String centroLucro;
	private String codigoProjeto;
	private String nomeEmpresa;
	private String empreendimento;
	private String apelido;
	private String companyCode;
	private String endereco;
	private String complemeto;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String area;
	private String numeroDormitorios;
	private String qtdUnidades;
	private String dataLancamento;
	private String qtdUnidadeMesLamcamento;
	private String precoMedioUnidadeMesLancamento;
	private String qtdUnidade1mesLancamento;
	private String precoMedioUnidade1mesLancamento;
	private String qtdUnidade2mesLancamento;
	private String precoMedioUnidade2mesLancamento;
	private String qtdUnidade3mesLancamento;
	private String precoMedioUnidade3mesLancamento;
	private String qtdUnidade6mesLancamento;
	private String precoMedioUnidade6mesLancamento;
	private String qtdUnidade1anoLancamento;
	private String precoMedioUnidade1anoLancamento;
	private String qtdUnidadeAtual;
	private String precoMedioUnidadeAtual;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="centro_lucro", namespace="http://tempuri.org/")
	public String getCentroLucro() {
		return centroLucro;
	}
	
	public void setCentroLucro(String centroLucro) {
		this.centroLucro = centroLucro;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="codigo_projeto", namespace="http://tempuri.org/")
	public String getCodigoProjeto() {
		return codigoProjeto;
	}
	
	public void setCodigoProjeto(String codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_empresa", namespace="http://tempuri.org/")
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="empreendimento", namespace="http://tempuri.org/")
	public String getEmpreendimento() {
		return empreendimento;
	}
	
	public void setEmpreendimento(String empreendimento) {
		this.empreendimento = empreendimento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="apelido", namespace="http://tempuri.org/")
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="company_code", namespace="http://tempuri.org/")
	public String getCompanyCode() {
		return companyCode;
	}
	
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="endereco", namespace="http://tempuri.org/")
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="complemento", namespace="http://tempuri.org/")
	public String getComplemeto() {
		return complemeto;
	}
	
	public void setComplemeto(String complemeto) {
		this.complemeto = complemeto;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="bairro", namespace="http://tempuri.org/")
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
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
	
	@javax.xml.bind.annotation.XmlElement(name="cep", namespace="http://tempuri.org/")
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="area", namespace="http://tempuri.org/")
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="numero_dormitorios", namespace="http://tempuri.org/")
	public String getNumeroDormitorios() {
		return numeroDormitorios;
	}
	
	public void setNumeroDormitorios(String numeroDormitorios) {
		this.numeroDormitorios = numeroDormitorios;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidades", namespace="http://tempuri.org/")
	public String getQtdUnidades() {
		return qtdUnidades;
	}
	
	public void setQtdUnidades(String qtdUnidades) {
		this.qtdUnidades = qtdUnidades;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_lancamento", namespace="http://tempuri.org/")
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_mes_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidadeMesLamcamento() {
		return qtdUnidadeMesLamcamento;
	}
	
	public void setQtdUnidadeMesLamcamento(String qtdUnidadeMesLamcamento) {
		this.qtdUnidadeMesLamcamento = qtdUnidadeMesLamcamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_mes_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidadeMesLancamento() {
		return precoMedioUnidadeMesLancamento;
	}
	
	public void setPrecoMedioUnidadeMesLancamento(
			String precoMedioUnidadeMesLancamento) {
		this.precoMedioUnidadeMesLancamento = precoMedioUnidadeMesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_1mes_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidade1mesLancamento() {
		return qtdUnidade1mesLancamento;
	}
	
	public void setQtdUnidade1mesLancamento(String qtdUnidade1mesLancamento) {
		this.qtdUnidade1mesLancamento = qtdUnidade1mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_1mes_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidade1mesLancamento() {
		return precoMedioUnidade1mesLancamento;
	}
	
	public void setPrecoMedioUnidade1mesLancamento(
			String precoMedioUnidade1mesLancamento) {
		this.precoMedioUnidade1mesLancamento = precoMedioUnidade1mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_2mes_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidade2mesLancamento() {
		return qtdUnidade2mesLancamento;
	}
	
	public void setQtdUnidade2mesLancamento(String qtdUnidade2mesLancamento) {
		this.qtdUnidade2mesLancamento = qtdUnidade2mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_2mes_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidade2mesLancamento() {
		return precoMedioUnidade2mesLancamento;
	}
	
	public void setPrecoMedioUnidade2mesLancamento(
			String precoMedioUnidade2mesLancamento) {
		this.precoMedioUnidade2mesLancamento = precoMedioUnidade2mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_3mes_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidade3mesLancamento() {
		return qtdUnidade3mesLancamento;
	}
	
	public void setQtdUnidade3mesLancamento(String qtdUnidade3mesLancamento) {
		this.qtdUnidade3mesLancamento = qtdUnidade3mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_3mes_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidade3mesLancamento() {
		return precoMedioUnidade3mesLancamento;
	}
	
	public void setPrecoMedioUnidade3mesLancamento(
			String precoMedioUnidade3mesLancamento) {
		this.precoMedioUnidade3mesLancamento = precoMedioUnidade3mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_6mes_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidade6mesLancamento() {
		return qtdUnidade6mesLancamento;
	}
	
	public void setQtdUnidade6mesLancamento(String qtdUnidade6mesLancamento) {
		this.qtdUnidade6mesLancamento = qtdUnidade6mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_6mes_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidade6mesLancamento() {
		return precoMedioUnidade6mesLancamento;
	}
	
	public void setPrecoMedioUnidade6mesLancamento(
			String precoMedioUnidade6mesLancamento) {
		this.precoMedioUnidade6mesLancamento = precoMedioUnidade6mesLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_1ano_lancamento", namespace="http://tempuri.org/")
	public String getQtdUnidade1anoLancamento() {
		return qtdUnidade1anoLancamento;
	}
	
	public void setQtdUnidade1anoLancamento(String qtdUnidade1anoLancamento) {
		this.qtdUnidade1anoLancamento = qtdUnidade1anoLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_1ano_lancamento", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidade1anoLancamento() {
		return precoMedioUnidade1anoLancamento;
	}
	
	public void setPrecoMedioUnidade1anoLancamento(
			String precoMedioUnidade1anoLancamento) {
		this.precoMedioUnidade1anoLancamento = precoMedioUnidade1anoLancamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="qtd_unidade_atual", namespace="http://tempuri.org/")
	public String getQtdUnidadeAtual() {
		return qtdUnidadeAtual;
	}
	
	public void setQtdUnidadeAtual(String qtdUnidadeAtual) {
		this.qtdUnidadeAtual = qtdUnidadeAtual;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="preco_medio_unidade_atual", namespace="http://tempuri.org/")
	public String getPrecoMedioUnidadeAtual() {
		return precoMedioUnidadeAtual;
	}
	
	public void setPrecoMedioUnidadeAtual(String precoMedioUnidadeAtual) {
		this.precoMedioUnidadeAtual = precoMedioUnidadeAtual;
	}
	
	

}
