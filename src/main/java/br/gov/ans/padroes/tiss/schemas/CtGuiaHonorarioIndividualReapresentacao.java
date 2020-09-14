//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guiaHonorarioIndividualReapresentacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaHonorarioIndividualReapresentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaHonorarioIndividual" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="contratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="contratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
 *                   &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
 *                   &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosExamesRealizados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao">
 *                 &lt;sequence>
 *                   &lt;element name="totalGeralHonorario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ct_guiaHonorarioIndividualReapresentacao", propOrder = {
    "identificacaoGuiaHonorarioIndividual",
    "numeroGuiaPrincipal",
    "dadosBeneficiario",
    "contratado",
    "contratadoExecutante",
    "procedimentosExamesRealizados",
    "observacao"
})
public class CtGuiaHonorarioIndividualReapresentacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuiaHonorarioIndividual;
    @XmlElement(required = true)
    protected String numeroGuiaPrincipal;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtContratado contratado;
    @XmlElement(required = true)
    protected CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante contratadoExecutante;
    @XmlElement(required = true)
    protected CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados procedimentosExamesRealizados;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuiaHonorarioIndividual.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuiaHonorarioIndividual() {
        return identificacaoGuiaHonorarioIndividual;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaHonorarioIndividual.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuiaHonorarioIndividual(CtCabecalhoGuia value) {
        this.identificacaoGuiaHonorarioIndividual = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
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
     * Obtém o valor da propriedade contratado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getContratado() {
        return contratado;
    }

    /**
     * Define o valor da propriedade contratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setContratado(CtContratado value) {
        this.contratado = value;
    }

    /**
     * Obtém o valor da propriedade contratadoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante }
     *     
     */
    public CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante getContratadoExecutante() {
        return contratadoExecutante;
    }

    /**
     * Define o valor da propriedade contratadoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante }
     *     
     */
    public void setContratadoExecutante(CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante value) {
        this.contratadoExecutante = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosExamesRealizados.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados }
     *     
     */
    public CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados getProcedimentosExamesRealizados() {
        return procedimentosExamesRealizados;
    }

    /**
     * Define o valor da propriedade procedimentosExamesRealizados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados }
     *     
     */
    public void setProcedimentosExamesRealizados(CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados value) {
        this.procedimentosExamesRealizados = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
     *       &lt;sequence>
     *         &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
     *         &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
     *         &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
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
        "identificacaoProfissional",
        "posicaoProfissional",
        "tipoAcomodacao"
    })
    public static class ContratadoExecutante
        extends CtContratado
    {

        @XmlElement(required = true)
        protected CtProfissionalExecutante identificacaoProfissional;
        @XmlElement(required = true)
        protected String posicaoProfissional;
        protected String tipoAcomodacao;

        /**
         * Obtém o valor da propriedade identificacaoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public CtProfissionalExecutante getIdentificacaoProfissional() {
            return identificacaoProfissional;
        }

        /**
         * Define o valor da propriedade identificacaoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public void setIdentificacaoProfissional(CtProfissionalExecutante value) {
            this.identificacaoProfissional = value;
        }

        /**
         * Obtém o valor da propriedade posicaoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosicaoProfissional() {
            return posicaoProfissional;
        }

        /**
         * Define o valor da propriedade posicaoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosicaoProfissional(String value) {
            this.posicaoProfissional = value;
        }

        /**
         * Obtém o valor da propriedade tipoAcomodacao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoAcomodacao() {
            return tipoAcomodacao;
        }

        /**
         * Define o valor da propriedade tipoAcomodacao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoAcomodacao(String value) {
            this.tipoAcomodacao = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao">
     *       &lt;sequence>
     *         &lt;element name="totalGeralHonorario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
        "totalGeralHonorario"
    })
    public static class ProcedimentosExamesRealizados
        extends CtProcedimentoRevisao
    {

        protected BigDecimal totalGeralHonorario;

        /**
         * Obtém o valor da propriedade totalGeralHonorario.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralHonorario() {
            return totalGeralHonorario;
        }

        /**
         * Define o valor da propriedade totalGeralHonorario.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralHonorario(BigDecimal value) {
            this.totalGeralHonorario = value;
        }

    }

}
