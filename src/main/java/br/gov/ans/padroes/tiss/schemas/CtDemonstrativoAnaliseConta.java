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
 * <p>Classe Java de ct_demonstrativoAnaliseConta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoAnaliseConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoDemonstrativo"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="fatura">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosConta"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorProcessadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorLiberadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosaGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_demonstrativoAnaliseConta", propOrder = {
    "identificacaoFontePagadora",
    "cabecalhoDemonstrativo",
    "dadosPrestador",
    "fatura",
    "valorProcessadoGeral",
    "valorLiberadoGeral",
    "valorGlosaGeral"
})
public class CtDemonstrativoAnaliseConta {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected CtCabecalhoDemonstrativo cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(required = true)
    protected CtDemonstrativoAnaliseConta.Fatura fatura;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoGeral;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoGeral;
    protected BigDecimal valorGlosaGeral;

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
     * Obtém o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setDadosPrestador(CtContratado value) {
        this.dadosPrestador = value;
    }

    /**
     * Obtém o valor da propriedade fatura.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoAnaliseConta.Fatura }
     *     
     */
    public CtDemonstrativoAnaliseConta.Fatura getFatura() {
        return fatura;
    }

    /**
     * Define o valor da propriedade fatura.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoAnaliseConta.Fatura }
     *     
     */
    public void setFatura(CtDemonstrativoAnaliseConta.Fatura value) {
        this.fatura = value;
    }

    /**
     * Obtém o valor da propriedade valorProcessadoGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoGeral() {
        return valorProcessadoGeral;
    }

    /**
     * Define o valor da propriedade valorProcessadoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoGeral(BigDecimal value) {
        this.valorProcessadoGeral = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberadoGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoGeral() {
        return valorLiberadoGeral;
    }

    /**
     * Define o valor da propriedade valorLiberadoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoGeral(BigDecimal value) {
        this.valorLiberadoGeral = value;
    }

    /**
     * Obtém o valor da propriedade valorGlosaGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaGeral() {
        return valorGlosaGeral;
    }

    /**
     * Define o valor da propriedade valorGlosaGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaGeral(BigDecimal value) {
        this.valorGlosaGeral = value;
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
     *         &lt;element name="dadosFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosConta"/>
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
        "dadosFatura"
    })
    public static class Fatura {

        @XmlElement(required = true)
        protected CtDadosConta dadosFatura;

        /**
         * Obtém o valor da propriedade dadosFatura.
         * 
         * @return
         *     possible object is
         *     {@link CtDadosConta }
         *     
         */
        public CtDadosConta getDadosFatura() {
            return dadosFatura;
        }

        /**
         * Define o valor da propriedade dadosFatura.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDadosConta }
         *     
         */
        public void setDadosFatura(CtDadosConta value) {
            this.dadosFatura = value;
        }

    }

}
