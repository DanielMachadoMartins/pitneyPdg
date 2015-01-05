package br.com.pdg.modelo.analiseCredito;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="PDG_AZ_analise_credito")
public class AnaliseCredito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String centroLucro;
	private String idContrato;
    private String ciclo;
    private String tipoVenda;
	private String protocolo;
	private String projeto;
	private String bloco;
	private String idUnidade;
	private String nome;
	private String cnpjCpf;
	private String contribuicaoFgts;
	private String valorContrato;
	private String valorFinanciamento;
	private String chaves;
	private String bancoFinanciador;
	private String atrasoCessao;
	private String saldoDevedor;
	private String cartaCredito;
	private String banco;
	private String avaliacao;
	private String tabelaFinanciamento;
	private String prazoFinanciamento;
	private String rendaComprador;
	private String totalFgts;
	private String valorPatrimonio;
	private String valorAvaliacao;
	private String valorSubsidio;
	private String valorFinanciamentoAprovado;
	private String valorDiferenca;
	private String sicaq;
	private String motivoRecusa;
	private String momentoSolicitacao;
	private String momentoParecer;
	
	
	
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
	
	@javax.xml.bind.annotation.XmlElement(name="id_contrato", namespace="http://tempuri.org/")
	public String getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="ciclo", namespace="http://tempuri.org/")
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="tipo_venda", namespace="http://tempuri.org/")
	public String getTipoVenda() {
		return tipoVenda;
	}
	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="protocolo", namespace="http://tempuri.org/")
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="projeto", namespace="http://tempuri.org/")
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="bloco", namespace="http://tempuri.org/")
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="id_unidade", namespace="http://tempuri.org/")
	public String getIdUnidade() {
		return idUnidade;
	}
	public void setIdUnidade(String idUnidade) {
		this.idUnidade = idUnidade;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="nome", namespace="http://tempuri.org/")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="cnpj_cpf", namespace="http://tempuri.org/")
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="comtribuicao_fgts", namespace="http://tempuri.org/")
	public String getContribuicaoFgts() {
		return contribuicaoFgts;
	}
	public void setContribuicaoFgts(String contribuicaoFgts) {
		this.contribuicaoFgts = contribuicaoFgts;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_contrato", namespace="http://tempuri.org/")
	public String getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(String valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_financiamento", namespace="http://tempuri.org/")
	public String getValorFinanciamento() {
		return valorFinanciamento;
	}
	public void setValorFinanciamento(String valorFinanciamento) {
		this.valorFinanciamento = valorFinanciamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="chaves", namespace="http://tempuri.org/")
	public String getChaves() {
		return chaves;
	}
	public void setChaves(String chaves) {
		this.chaves = chaves;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="banco_financiador", namespace="http://tempuri.org/")
	public String getBancoFinanciador() {
		return bancoFinanciador;
	}
	public void setBancoFinanciador(String bancoFinanciador) {
		this.bancoFinanciador = bancoFinanciador;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="atraso_cessao", namespace="http://tempuri.org/")
	public String getAtrasoCessao() {
		return atrasoCessao;
	}
	public void setAtrasoCessao(String atrasoCessao) {
		this.atrasoCessao = atrasoCessao;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="saldo_devedor", namespace="http://tempuri.org/")
	public String getSaldoDevedor() {
		return saldoDevedor;
	}
	public void setSaldoDevedor(String saldoDevedor) {
		this.saldoDevedor = saldoDevedor;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="carta_credito", namespace="http://tempuri.org/")
	public String getCartaCredito() {
		return cartaCredito;
	}
	public void setCartaCredito(String cartaCredito) {
		this.cartaCredito = cartaCredito;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="banco", namespace="http://tempuri.org/")
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="avaliacao", namespace="http://tempuri.org/")
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="tabela_financiamento", namespace="http://tempuri.org/")
	public String getTabelaFinanciamento() {
		return tabelaFinanciamento;
	}
	public void setTabelaFinanciamento(String tabelaFinanciamento) {
		this.tabelaFinanciamento = tabelaFinanciamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="prazo_financiamento", namespace="http://tempuri.org/")
	public String getPrazoFinanciamento() {
		return prazoFinanciamento;
	}
	public void setPrazoFinanciamento(String prazoFinanciamento) {
		this.prazoFinanciamento = prazoFinanciamento;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="renda_comprador", namespace="http://tempuri.org/")
	public String getRendaComprador() {
		return rendaComprador;
	}
	public void setRendaComprador(String rendaComprador) {
		this.rendaComprador = rendaComprador;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="total_fgts", namespace="http://tempuri.org/")
	public String getTotalFgts() {
		return totalFgts;
	}
	public void setTotalFgts(String totalFgts) {
		this.totalFgts = totalFgts;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_patrimonio", namespace="http://tempuri.org/")
	public String getValorPatrimonio() {
		return valorPatrimonio;
	}
	public void setValorPatrimonio(String valorPatrimonio) {
		this.valorPatrimonio = valorPatrimonio;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_avaliacao", namespace="http://tempuri.org/")
	public String getValorAvaliacao() {
		return valorAvaliacao;
	}
	public void setValorAvaliacao(String valorAvaliacao) {
		this.valorAvaliacao = valorAvaliacao;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_subsidio", namespace="http://tempuri.org/")
	public String getValorSubsidio() {
		return valorSubsidio;
	}
	public void setValorSubsidio(String valorSubsidio) {
		this.valorSubsidio = valorSubsidio;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_financiamento_aprovado", namespace="http://tempuri.org/")
	public String getValorFinanciamentoAprovado() {
		return valorFinanciamentoAprovado;
	}
	public void setValorFinanciamentoAprovado(String valorFinanciamentoAprovado) {
		this.valorFinanciamentoAprovado = valorFinanciamentoAprovado;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="valor_diferenca", namespace="http://tempuri.org/")
	public String getValorDiferenca() {
		return valorDiferenca;
	}
	public void setValorDiferenca(String valorDiferenca) {
		this.valorDiferenca = valorDiferenca;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="sicaq", namespace="http://tempuri.org/")
	public String getSicaq() {
		return sicaq;
	}
	public void setSicaq(String sicaq) {
		this.sicaq = sicaq;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="motivo_recusa", namespace="http://tempuri.org/")
	public String getMotivoRecusa() {
		return motivoRecusa;
	}
	public void setMotivoRecusa(String motivoRecusa) {
		this.motivoRecusa = motivoRecusa;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="momento_solicitacao", namespace="http://tempuri.org/")
	public String getMomentoSolicitacao() {
		return momentoSolicitacao;
	}
	public void setMomentoSolicitacao(String momentoSolicitacao) {
		this.momentoSolicitacao = momentoSolicitacao;
	}
	
	@javax.xml.bind.annotation.XmlElement(name="momento_parecer", namespace="http://tempuri.org/")
	public String getMomentoParecer() {
		return momentoParecer;
	}
	public void setMomentoParecer(String momentoParecer) {
		this.momentoParecer = momentoParecer;
	}
	
	
	
}
