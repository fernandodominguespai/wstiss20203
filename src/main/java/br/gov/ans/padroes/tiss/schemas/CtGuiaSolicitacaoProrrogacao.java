//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guiaSolicitacaoProrrogacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSolicitacaoProrrogacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="identificacaoGuiaReferencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicacaoClinica"/>
 *         &lt;element name="responsavelAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
 *         &lt;element name="procedimentosExamesSolicitados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosSolicitados" minOccurs="0"/>
 *         &lt;element name="diarias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao" minOccurs="0"/>
 *         &lt;element name="OPMsSolicitadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMSolicitadas" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaSolicitacaoProrrogacao", propOrder = {
    "identificacaoProrrogacao",
    "identificacaoGuiaReferencia",
    "dadosBeneficiario",
    "dadosSolicitante",
    "indicacaoClinica",
    "responsavelAutorizacao",
    "procedimentosExamesSolicitados",
    "diarias",
    "opMsSolicitadas",
    "observacao"
})
public class CtGuiaSolicitacaoProrrogacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoProrrogacao;
    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuiaReferencia;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected String indicacaoClinica;
    protected String responsavelAutorizacao;
    protected CtProcedimentosSolicitados procedimentosExamesSolicitados;
    protected CtDiariaProrrogacao diarias;
    @XmlElement(name = "OPMsSolicitadas")
    protected CtOPMSolicitadas opMsSolicitadas;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoProrrogacao.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoProrrogacao() {
        return identificacaoProrrogacao;
    }

    /**
     * Define o valor da propriedade identificacaoProrrogacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoProrrogacao(CtCabecalhoGuia value) {
        this.identificacaoProrrogacao = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoGuiaReferencia.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuiaReferencia() {
        return identificacaoGuiaReferencia;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuiaReferencia(CtCabecalhoGuia value) {
        this.identificacaoGuiaReferencia = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitante }
     *     
     */
    public CtSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Define o valor da propriedade dadosSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitante }
     *     
     */
    public void setDadosSolicitante(CtSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade indicacaoClinica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoClinica() {
        return indicacaoClinica;
    }

    /**
     * Define o valor da propriedade indicacaoClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoClinica(String value) {
        this.indicacaoClinica = value;
    }

    /**
     * Obtém o valor da propriedade responsavelAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavelAutorizacao() {
        return responsavelAutorizacao;
    }

    /**
     * Define o valor da propriedade responsavelAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavelAutorizacao(String value) {
        this.responsavelAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosExamesSolicitados.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public CtProcedimentosSolicitados getProcedimentosExamesSolicitados() {
        return procedimentosExamesSolicitados;
    }

    /**
     * Define o valor da propriedade procedimentosExamesSolicitados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public void setProcedimentosExamesSolicitados(CtProcedimentosSolicitados value) {
        this.procedimentosExamesSolicitados = value;
    }

    /**
     * Obtém o valor da propriedade diarias.
     * 
     * @return
     *     possible object is
     *     {@link CtDiariaProrrogacao }
     *     
     */
    public CtDiariaProrrogacao getDiarias() {
        return diarias;
    }

    /**
     * Define o valor da propriedade diarias.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiariaProrrogacao }
     *     
     */
    public void setDiarias(CtDiariaProrrogacao value) {
        this.diarias = value;
    }

    /**
     * Obtém o valor da propriedade opMsSolicitadas.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public CtOPMSolicitadas getOPMsSolicitadas() {
        return opMsSolicitadas;
    }

    /**
     * Define o valor da propriedade opMsSolicitadas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public void setOPMsSolicitadas(CtOPMSolicitadas value) {
        this.opMsSolicitadas = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
