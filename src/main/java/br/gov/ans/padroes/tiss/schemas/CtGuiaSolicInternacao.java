//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_guiaSolicInternacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSolicInternacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaSolicitacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosSolicitanteAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante" minOccurs="0"/>
 *         &lt;element name="dadosSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante"/>
 *         &lt;element name="prestadorSolicitado" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestador">
 *                 &lt;sequence>
 *                   &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="caraterInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_eletivaEmergencia"/>
 *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicacaoClinica"/>
 *         &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_regimeInternacao"/>
 *         &lt;element name="hipotesesDiagnosticas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_hipoteseDiagnostica"/>
 *         &lt;element name="procedimentosExamesSolicitados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosSolicitados"/>
 *         &lt;element name="OPMsSolicitadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMSolicitadas" minOccurs="0"/>
 *         &lt;element name="diasSolicitados" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dataProvavelAdmisHosp" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
@XmlType(name = "ct_guiaSolicInternacao", propOrder = {
    "identificacaoGuiaSolicitacaoInternacao",
    "dadosBeneficiario",
    "dadosSolicitanteAtendimento",
    "dadosSolicitante",
    "prestadorSolicitado",
    "caraterInternacao",
    "tipoInternacao",
    "indicacaoClinica",
    "regimeInternacao",
    "hipotesesDiagnosticas",
    "procedimentosExamesSolicitados",
    "opMsSolicitadas",
    "diasSolicitados",
    "dataProvavelAdmisHosp",
    "observacao"
})
public class CtGuiaSolicInternacao {

    @XmlElement(required = true)
    protected CtCabecalhoSolicitacao identificacaoGuiaSolicitacaoInternacao;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    protected CtSolicitante dadosSolicitanteAtendimento;
    @XmlElement(required = true)
    protected CtSolicitante dadosSolicitante;
    protected CtGuiaSolicInternacao.PrestadorSolicitado prestadorSolicitado;
    @XmlElement(required = true)
    protected StEletivaEmergencia caraterInternacao;
    @XmlElement(required = true)
    protected String tipoInternacao;
    @XmlElement(required = true)
    protected String indicacaoClinica;
    @XmlElement(required = true)
    protected String regimeInternacao;
    @XmlElement(required = true)
    protected CtHipoteseDiagnostica hipotesesDiagnosticas;
    @XmlElement(required = true)
    protected CtProcedimentosSolicitados procedimentosExamesSolicitados;
    @XmlElement(name = "OPMsSolicitadas")
    protected CtOPMSolicitadas opMsSolicitadas;
    @XmlElement(required = true)
    protected BigInteger diasSolicitados;
    protected XMLGregorianCalendar dataProvavelAdmisHosp;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuiaSolicitacaoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public CtCabecalhoSolicitacao getIdentificacaoGuiaSolicitacaoInternacao() {
        return identificacaoGuiaSolicitacaoInternacao;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaSolicitacaoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public void setIdentificacaoGuiaSolicitacaoInternacao(CtCabecalhoSolicitacao value) {
        this.identificacaoGuiaSolicitacaoInternacao = value;
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
     * Obtém o valor da propriedade dadosSolicitanteAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitante }
     *     
     */
    public CtSolicitante getDadosSolicitanteAtendimento() {
        return dadosSolicitanteAtendimento;
    }

    /**
     * Define o valor da propriedade dadosSolicitanteAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitante }
     *     
     */
    public void setDadosSolicitanteAtendimento(CtSolicitante value) {
        this.dadosSolicitanteAtendimento = value;
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
     * Obtém o valor da propriedade prestadorSolicitado.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaSolicInternacao.PrestadorSolicitado }
     *     
     */
    public CtGuiaSolicInternacao.PrestadorSolicitado getPrestadorSolicitado() {
        return prestadorSolicitado;
    }

    /**
     * Define o valor da propriedade prestadorSolicitado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicInternacao.PrestadorSolicitado }
     *     
     */
    public void setPrestadorSolicitado(CtGuiaSolicInternacao.PrestadorSolicitado value) {
        this.prestadorSolicitado = value;
    }

    /**
     * Obtém o valor da propriedade caraterInternacao.
     * 
     * @return
     *     possible object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public StEletivaEmergencia getCaraterInternacao() {
        return caraterInternacao;
    }

    /**
     * Define o valor da propriedade caraterInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public void setCaraterInternacao(StEletivaEmergencia value) {
        this.caraterInternacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInternacao() {
        return tipoInternacao;
    }

    /**
     * Define o valor da propriedade tipoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInternacao(String value) {
        this.tipoInternacao = value;
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
     * Obtém o valor da propriedade regimeInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeInternacao() {
        return regimeInternacao;
    }

    /**
     * Define o valor da propriedade regimeInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeInternacao(String value) {
        this.regimeInternacao = value;
    }

    /**
     * Obtém o valor da propriedade hipotesesDiagnosticas.
     * 
     * @return
     *     possible object is
     *     {@link CtHipoteseDiagnostica }
     *     
     */
    public CtHipoteseDiagnostica getHipotesesDiagnosticas() {
        return hipotesesDiagnosticas;
    }

    /**
     * Define o valor da propriedade hipotesesDiagnosticas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtHipoteseDiagnostica }
     *     
     */
    public void setHipotesesDiagnosticas(CtHipoteseDiagnostica value) {
        this.hipotesesDiagnosticas = value;
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
     * Obtém o valor da propriedade diasSolicitados.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiasSolicitados() {
        return diasSolicitados;
    }

    /**
     * Define o valor da propriedade diasSolicitados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiasSolicitados(BigInteger value) {
        this.diasSolicitados = value;
    }

    /**
     * Obtém o valor da propriedade dataProvavelAdmisHosp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavelAdmisHosp() {
        return dataProvavelAdmisHosp;
    }

    /**
     * Define o valor da propriedade dataProvavelAdmisHosp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavelAdmisHosp(XMLGregorianCalendar value) {
        this.dataProvavelAdmisHosp = value;
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestador">
     *       &lt;sequence>
     *         &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nomePrestador"
    })
    public static class PrestadorSolicitado
        extends CtIdentificacaoPrestador
    {

        @XmlElement(required = true)
        protected String nomePrestador;

        /**
         * Obtém o valor da propriedade nomePrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePrestador() {
            return nomePrestador;
        }

        /**
         * Define o valor da propriedade nomePrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePrestador(String value) {
            this.nomePrestador = value;
        }

    }

}
