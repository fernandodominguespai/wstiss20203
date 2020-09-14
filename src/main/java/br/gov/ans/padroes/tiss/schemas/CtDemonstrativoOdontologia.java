//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_demonstrativoOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoDemonstrativo"/>
 *         &lt;element name="identificacaoFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="dadosPrestador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoPrestadorNaOperadora" minOccurs="0"/>
 *                   &lt;element name="identificadorPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificadorPrestOdontoDemo"/>
 *                   &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *                   &lt;element name="numeroCNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNES" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosPagamento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosPagamento">
 *                 &lt;sequence>
 *                   &lt;element name="totalGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_totalDemoOdonto"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="debitosCreditosTributaveis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="creditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_creditoOdonto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="valorTotalTributavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="demaisImpostos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="valorTotalImpostos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="debitosCreditosNaoTributaveis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="creditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_creditoOdonto" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="valorTotalNaoTributavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorFinalReceber" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
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
@XmlType(name = "ct_demonstrativoOdontologia", propOrder = {
    "cabecalhoDemonstrativo",
    "identificacaoFontePagadora",
    "dadosPrestador",
    "dadosPagamento",
    "debitosCreditosTributaveis",
    "demaisImpostos",
    "debitosCreditosNaoTributaveis",
    "valorFinalReceber",
    "observacao"
})
public class CtDemonstrativoOdontologia {

    @XmlElement(required = true)
    protected CtCabecalhoDemonstrativo cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected CtDemonstrativoOdontologia.DadosPrestador dadosPrestador;
    @XmlElement(required = true)
    protected List<CtDemonstrativoOdontologia.DadosPagamento> dadosPagamento;
    @XmlElement(required = true)
    protected CtDemonstrativoOdontologia.DebitosCreditosTributaveis debitosCreditosTributaveis;
    @XmlElement(required = true)
    protected CtDemonstrativoOdontologia.DemaisImpostos demaisImpostos;
    @XmlElement(required = true)
    protected CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis debitosCreditosNaoTributaveis;
    @XmlElement(required = true)
    protected BigDecimal valorFinalReceber;
    protected String observacao;

    /**
     * Obtém o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public CtCabecalhoDemonstrativo getCabecalhoDemonstrativo() {
        return cabecalhoDemonstrativo;
    }

    /**
     * Define o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public void setCabecalhoDemonstrativo(CtCabecalhoDemonstrativo value) {
        this.cabecalhoDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoFontePagadora.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    /**
     * Define o valor da propriedade identificacaoFontePagadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setIdentificacaoFontePagadora(CtIdentificacaoFontePagadora value) {
        this.identificacaoFontePagadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public CtDemonstrativoOdontologia.DadosPrestador getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public void setDadosPrestador(CtDemonstrativoOdontologia.DadosPrestador value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the dadosPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDemonstrativoOdontologia.DadosPagamento }
     * 
     * 
     */
    public List<CtDemonstrativoOdontologia.DadosPagamento> getDadosPagamento() {
        if (dadosPagamento == null) {
            dadosPagamento = new ArrayList<CtDemonstrativoOdontologia.DadosPagamento>();
        }
        return this.dadosPagamento;
    }

    /**
     * Obtém o valor da propriedade debitosCreditosTributaveis.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoOdontologia.DebitosCreditosTributaveis }
     *     
     */
    public CtDemonstrativoOdontologia.DebitosCreditosTributaveis getDebitosCreditosTributaveis() {
        return debitosCreditosTributaveis;
    }

    /**
     * Define o valor da propriedade debitosCreditosTributaveis.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoOdontologia.DebitosCreditosTributaveis }
     *     
     */
    public void setDebitosCreditosTributaveis(CtDemonstrativoOdontologia.DebitosCreditosTributaveis value) {
        this.debitosCreditosTributaveis = value;
    }

    /**
     * Obtém o valor da propriedade demaisImpostos.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoOdontologia.DemaisImpostos }
     *     
     */
    public CtDemonstrativoOdontologia.DemaisImpostos getDemaisImpostos() {
        return demaisImpostos;
    }

    /**
     * Define o valor da propriedade demaisImpostos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoOdontologia.DemaisImpostos }
     *     
     */
    public void setDemaisImpostos(CtDemonstrativoOdontologia.DemaisImpostos value) {
        this.demaisImpostos = value;
    }

    /**
     * Obtém o valor da propriedade debitosCreditosNaoTributaveis.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis }
     *     
     */
    public CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis getDebitosCreditosNaoTributaveis() {
        return debitosCreditosNaoTributaveis;
    }

    /**
     * Define o valor da propriedade debitosCreditosNaoTributaveis.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis }
     *     
     */
    public void setDebitosCreditosNaoTributaveis(CtDemonstrativoOdontologia.DebitosCreditosNaoTributaveis value) {
        this.debitosCreditosNaoTributaveis = value;
    }

    /**
     * Obtém o valor da propriedade valorFinalReceber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFinalReceber() {
        return valorFinalReceber;
    }

    /**
     * Define o valor da propriedade valorFinalReceber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFinalReceber(BigDecimal value) {
        this.valorFinalReceber = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosPagamento">
     *       &lt;sequence>
     *         &lt;element name="totalGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_totalDemoOdonto"/>
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
        "totalGeral"
    })
    public static class DadosPagamento
        extends CtDadosPagamento
    {

        @XmlElement(required = true)
        protected CtTotalDemoOdonto totalGeral;

        /**
         * Obtém o valor da propriedade totalGeral.
         * 
         * @return
         *     possible object is
         *     {@link CtTotalDemoOdonto }
         *     
         */
        public CtTotalDemoOdonto getTotalGeral() {
            return totalGeral;
        }

        /**
         * Define o valor da propriedade totalGeral.
         * 
         * @param value
         *     allowed object is
         *     {@link CtTotalDemoOdonto }
         *     
         */
        public void setTotalGeral(CtTotalDemoOdonto value) {
            this.totalGeral = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoPrestadorNaOperadora" minOccurs="0"/>
     *         &lt;element name="identificadorPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificadorPrestOdontoDemo"/>
     *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
     *         &lt;element name="numeroCNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNES" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoPrestadorNaOperadora",
        "identificadorPrestador",
        "nomeContratado",
        "numeroCNES"
    })
    public static class DadosPrestador {

        protected String codigoPrestadorNaOperadora;
        @XmlElement(required = true)
        protected CtIdentificadorPrestOdontoDemo identificadorPrestador;
        @XmlElement(required = true)
        protected String nomeContratado;
        protected String numeroCNES;

        /**
         * Obtém o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestadorNaOperadora() {
            return codigoPrestadorNaOperadora;
        }

        /**
         * Define o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestadorNaOperadora(String value) {
            this.codigoPrestadorNaOperadora = value;
        }

        /**
         * Obtém o valor da propriedade identificadorPrestador.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentificadorPrestOdontoDemo }
         *     
         */
        public CtIdentificadorPrestOdontoDemo getIdentificadorPrestador() {
            return identificadorPrestador;
        }

        /**
         * Define o valor da propriedade identificadorPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentificadorPrestOdontoDemo }
         *     
         */
        public void setIdentificadorPrestador(CtIdentificadorPrestOdontoDemo value) {
            this.identificadorPrestador = value;
        }

        /**
         * Obtém o valor da propriedade nomeContratado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratado() {
            return nomeContratado;
        }

        /**
         * Define o valor da propriedade nomeContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratado(String value) {
            this.nomeContratado = value;
        }

        /**
         * Obtém o valor da propriedade numeroCNES.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroCNES() {
            return numeroCNES;
        }

        /**
         * Define o valor da propriedade numeroCNES.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroCNES(String value) {
            this.numeroCNES = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="creditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_creditoOdonto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="valorTotalNaoTributavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descontos",
        "creditos",
        "valorTotalNaoTributavel"
    })
    public static class DebitosCreditosNaoTributaveis {

        protected List<CtDescontoOdonto> descontos;
        protected List<CtCreditoOdonto> creditos;
        protected BigDecimal valorTotalNaoTributavel;

        /**
         * Gets the value of the descontos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descontos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescontos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontoOdonto }
         * 
         * 
         */
        public List<CtDescontoOdonto> getDescontos() {
            if (descontos == null) {
                descontos = new ArrayList<CtDescontoOdonto>();
            }
            return this.descontos;
        }

        /**
         * Gets the value of the creditos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtCreditoOdonto }
         * 
         * 
         */
        public List<CtCreditoOdonto> getCreditos() {
            if (creditos == null) {
                creditos = new ArrayList<CtCreditoOdonto>();
            }
            return this.creditos;
        }

        /**
         * Obtém o valor da propriedade valorTotalNaoTributavel.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotalNaoTributavel() {
            return valorTotalNaoTributavel;
        }

        /**
         * Define o valor da propriedade valorTotalNaoTributavel.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotalNaoTributavel(BigDecimal value) {
            this.valorTotalNaoTributavel = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="creditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_creditoOdonto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="valorTotalTributavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descontos",
        "creditos",
        "valorTotalTributavel"
    })
    public static class DebitosCreditosTributaveis {

        protected List<CtDescontoOdonto> descontos;
        protected List<CtCreditoOdonto> creditos;
        protected BigDecimal valorTotalTributavel;

        /**
         * Gets the value of the descontos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descontos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescontos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontoOdonto }
         * 
         * 
         */
        public List<CtDescontoOdonto> getDescontos() {
            if (descontos == null) {
                descontos = new ArrayList<CtDescontoOdonto>();
            }
            return this.descontos;
        }

        /**
         * Gets the value of the creditos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtCreditoOdonto }
         * 
         * 
         */
        public List<CtCreditoOdonto> getCreditos() {
            if (creditos == null) {
                creditos = new ArrayList<CtCreditoOdonto>();
            }
            return this.creditos;
        }

        /**
         * Obtém o valor da propriedade valorTotalTributavel.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotalTributavel() {
            return valorTotalTributavel;
        }

        /**
         * Define o valor da propriedade valorTotalTributavel.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotalTributavel(BigDecimal value) {
            this.valorTotalTributavel = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontoOdonto" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="valorTotalImpostos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "descontos",
        "valorTotalImpostos"
    })
    public static class DemaisImpostos {

        protected List<CtDescontoOdonto> descontos;
        protected BigDecimal valorTotalImpostos;

        /**
         * Gets the value of the descontos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descontos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescontos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontoOdonto }
         * 
         * 
         */
        public List<CtDescontoOdonto> getDescontos() {
            if (descontos == null) {
                descontos = new ArrayList<CtDescontoOdonto>();
            }
            return this.descontos;
        }

        /**
         * Obtém o valor da propriedade valorTotalImpostos.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotalImpostos() {
            return valorTotalImpostos;
        }

        /**
         * Define o valor da propriedade valorTotalImpostos.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotalImpostos(BigDecimal value) {
            this.valorTotalImpostos = value;
        }

    }

}
