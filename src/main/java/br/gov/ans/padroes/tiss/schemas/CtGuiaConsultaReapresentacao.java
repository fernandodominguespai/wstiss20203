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
 * <p>Classe Java de ct_guiaConsultaReapresentacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaConsultaReapresentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="profissionalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissional"/>
 *         &lt;element name="hipoteseDiagnostica" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoAtendimento">
 *                 &lt;sequence>
 *                   &lt;element name="diagnosticoSecundario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_atendimentoConsultaReapr"/>
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
@XmlType(name = "ct_guiaConsultaReapresentacao", propOrder = {
    "identificacaoGuia",
    "beneficiario",
    "dadosContratado",
    "profissionalExecutante",
    "hipoteseDiagnostica",
    "dadosAtendimento",
    "observacao"
})
public class CtGuiaConsultaReapresentacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuia;
    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    @XmlElement(required = true)
    protected CtContratado dadosContratado;
    @XmlElement(required = true)
    protected CtIdentificacaoProfissional profissionalExecutante;
    protected CtGuiaConsultaReapresentacao.HipoteseDiagnostica hipoteseDiagnostica;
    @XmlElement(required = true)
    protected CtAtendimentoConsultaReapr dadosAtendimento;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuia() {
        return identificacaoGuia;
    }

    /**
     * Define o valor da propriedade identificacaoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuia(CtCabecalhoGuia value) {
        this.identificacaoGuia = value;
    }

    /**
     * Obtém o valor da propriedade beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define o valor da propriedade beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setBeneficiario(CtBeneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosContratado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Define o valor da propriedade dadosContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setDadosContratado(CtContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Obtém o valor da propriedade profissionalExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public CtIdentificacaoProfissional getProfissionalExecutante() {
        return profissionalExecutante;
    }

    /**
     * Define o valor da propriedade profissionalExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public void setProfissionalExecutante(CtIdentificacaoProfissional value) {
        this.profissionalExecutante = value;
    }

    /**
     * Obtém o valor da propriedade hipoteseDiagnostica.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaConsultaReapresentacao.HipoteseDiagnostica }
     *     
     */
    public CtGuiaConsultaReapresentacao.HipoteseDiagnostica getHipoteseDiagnostica() {
        return hipoteseDiagnostica;
    }

    /**
     * Define o valor da propriedade hipoteseDiagnostica.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaConsultaReapresentacao.HipoteseDiagnostica }
     *     
     */
    public void setHipoteseDiagnostica(CtGuiaConsultaReapresentacao.HipoteseDiagnostica value) {
        this.hipoteseDiagnostica = value;
    }

    /**
     * Obtém o valor da propriedade dadosAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtAtendimentoConsultaReapr }
     *     
     */
    public CtAtendimentoConsultaReapr getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Define o valor da propriedade dadosAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAtendimentoConsultaReapr }
     *     
     */
    public void setDadosAtendimento(CtAtendimentoConsultaReapr value) {
        this.dadosAtendimento = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoAtendimento">
     *       &lt;sequence>
     *         &lt;element name="diagnosticoSecundario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
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
        "diagnosticoSecundario"
    })
    public static class HipoteseDiagnostica
        extends CtDiagnosticoAtendimento
    {

        protected CtDiagnosticosSecundarios diagnosticoSecundario;

        /**
         * Obtém o valor da propriedade diagnosticoSecundario.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticosSecundarios }
         *     
         */
        public CtDiagnosticosSecundarios getDiagnosticoSecundario() {
            return diagnosticoSecundario;
        }

        /**
         * Define o valor da propriedade diagnosticoSecundario.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticosSecundarios }
         *     
         */
        public void setDiagnosticoSecundario(CtDiagnosticosSecundarios value) {
            this.diagnosticoSecundario = value;
        }

    }

}
