package br.com.pdg.modelo.compradoresAZ;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PDG_AZ_compradores")
public class Compradores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String centroLucro;
	private String codContrato;
	private String companyCode;
	private String area;
	private String nomeBloco;
	private String numeroDormitorios;
	private String numeroUnidade;
	private String codClienteSap;
	private String codClienteAz;
	private String tipoCadastro;
	private String numCpfCnpj;
	private String numRg;
	private String nomeCliente;
	private String sexo;
	private String dataNascimento;
	private String profissao;
	private String nacionalidade;
	private String estadoCivil;
	private String nomeConjugue;
	private String numCpfConjugue;
	private String valorSalario;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String telContato;
	private String telCelContato;
	private String telComContato;
	private String email;
	private String tipoContrato;
	private String statusContrato;
	private String dataAssinaturaContrato;
	private String dataAprovacaoContrato;
	private String dataRegistro;
	private String valorContrato;
	private String dataHabitese;
	private String empresa;
	private String codProjeto;
	private String apelido;
	private String tipoLogradouro;
	private String numero;
	private String complemeto;
	
	
	
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
	
	@javax.xml.bind.annotation.XmlElement(name="cod_contrato", namespace="http://tempuri.org/")
	public String getCodContrato() {
		return codContrato;
	}
	public void setCodContrato(String codContrato) {
		this.codContrato = codContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="company_code", namespace="http://tempuri.org/")
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="area", namespace="http://tempuri.org/")
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_bloco", namespace="http://tempuri.org/")
	public String getNomeBloco() {
		return nomeBloco;
	}
	public void setNomeBloco(String nomeBloco) {
		this.nomeBloco = nomeBloco;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="numero_dormitorios", namespace="http://tempuri.org/")
	public String getNumeroDormitorios() {
		return numeroDormitorios;
	}
	public void setNumeroDormitorios(String numeroDormitorios) {
		this.numeroDormitorios = numeroDormitorios;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="numero_unidade", namespace="http://tempuri.org/")
	public String getNumeroUnidade() {
		return numeroUnidade;
	}
	public void setNumeroUnidade(String numeroUnidade) {
		this.numeroUnidade = numeroUnidade;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cod_cliente_sap", namespace="http://tempuri.org/")
	public String getCodClienteSap() {
		return codClienteSap;
	}
	public void setCodClienteSap(String codClienteSap) {
		this.codClienteSap = codClienteSap;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cod_cliente_az", namespace="http://tempuri.org/")
	public String getCodClienteAz() {
		return codClienteAz;
	}
	public void setCodClienteAz(String codClienteAz) {
		this.codClienteAz = codClienteAz;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="tipo_cadastro", namespace="http://tempuri.org/")
	public String getTipoCadastro() {
		return tipoCadastro;
	}
	public void setTipoCadastro(String tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="num_cpf_cnpj", namespace="http://tempuri.org/")
	public String getNumCpfCnpj() {
		return numCpfCnpj;
	}
	public void setNumCpfCnpj(String numCpfCnpj) {
		this.numCpfCnpj = numCpfCnpj;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="num_rg", namespace="http://tempuri.org/")
	public String getNumRg() {
		return numRg;
	}
	public void setNumRg(String numRg) {
		this.numRg = numRg;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_cliente", namespace="http://tempuri.org/")
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="sexo", namespace="http://tempuri.org/")
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_nascimento", namespace="http://tempuri.org/")
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="profissao", namespace="http://tempuri.org/")
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nacionalidade", namespace="http://tempuri.org/")
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="estadocivil", namespace="http://tempuri.org/")
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome_conjuge", namespace="http://tempuri.org/")
	public String getNomeConjugue() {
		return nomeConjugue;
	}
	public void setNomeConjugue(String nomeConjugue) {
		this.nomeConjugue = nomeConjugue;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="num_cpf_conjuge", namespace="http://tempuri.org/")
	public String getNumCpfConjugue() {
		return numCpfConjugue;
	}
	public void setNumCpfConjugue(String numCpfConjugue) {
		this.numCpfConjugue = numCpfConjugue;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_salario", namespace="http://tempuri.org/")
	public String getValorSalario() {
		return valorSalario;
	}
	public void setValorSalario(String valorSalario) {
		this.valorSalario = valorSalario;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="rua", namespace="http://tempuri.org/")
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
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
	
	@javax.xml.bind.annotation.XmlElement(name="tel_contato", namespace="http://tempuri.org/")
	public String getTelContato() {
		return telContato;
	}
	public void setTelContato(String telContato) {
		this.telContato = telContato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="telCel_contato", namespace="http://tempuri.org/")
	public String getTelCelContato() {
		return telCelContato;
	}
	public void setTelCelContato(String telCelContato) {
		this.telCelContato = telCelContato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="telCom_contato", namespace="http://tempuri.org/")
	public String getTelComContato() {
		return telComContato;
	}

	public void setTelComContato(String telComContato) {
		this.telComContato = telComContato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="email", namespace="http://tempuri.org/")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="tipo_contrato", namespace="http://tempuri.org/")
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="status_contrato", namespace="http://tempuri.org/")
	public String getStatusContrato() {
		return statusContrato;
	}
	public void setStatusContrato(String statusContrato) {
		this.statusContrato = statusContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_assinatura_contrato", namespace="http://tempuri.org/")
	public String getDataAssinaturaContrato() {
		return dataAssinaturaContrato;
	}
	public void setDataAssinaturaContrato(String dataAssinaturaContrato) {
		this.dataAssinaturaContrato = dataAssinaturaContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_aprovacao_contrato", namespace="http://tempuri.org/")
	public String getDataAprovacaoContrato() {
		return dataAprovacaoContrato;
	}
	public void setDataAprovacaoContrato(String dataAprovacaoContrato) {
		this.dataAprovacaoContrato = dataAprovacaoContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_registro", namespace="http://tempuri.org/")
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_contrato", namespace="http://tempuri.org/")
	public String getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(String valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="data_habitese", namespace="http://tempuri.org/")
	public String getDataHabitese() {
		return dataHabitese;
	}
	public void setDataHabitese(String dataHabitese) {
		this.dataHabitese = dataHabitese;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="empresa", namespace="http://tempuri.org/")
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cod_projeto", namespace="http://tempuri.org/")
	public String getCodProjeto() {
		return codProjeto;
	}
	public void setCodProjeto(String codProjeto) {
		this.codProjeto = codProjeto;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="apelido", namespace="http://tempuri.org/")
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="tipo_logradouro", namespace="http://tempuri.org/")
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="numero", namespace="http://tempuri.org/")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="complemento", namespace="http://tempuri.org/")
	public String getComplemeto() {
		return complemeto;
	}
	public void setComplemeto(String complemeto) {
		this.complemeto = complemeto;
	}

	
}
