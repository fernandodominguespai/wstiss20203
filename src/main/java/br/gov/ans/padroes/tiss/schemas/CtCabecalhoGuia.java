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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_cabecalhoGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_cabecalhoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoFontePagadora">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="cnpjFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataEmissaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_cabecalhoGuia", propOrder = {
    "identificacaoFontePagadora",
    "dataEmissaoGuia",
    "numeroGuiaPrestador",
    "numeroGuiaOperadora"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtReciboCancelaGuia.GuiasCanceladas.DadosGuia.class
})
public class CtCabecalhoGuia {

    @XmlElement(required = true)
    protected CtCabecalhoGuia.IdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEmissaoGuia;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;

    /**
     * Obtém o valor da propriedade identificacaoFontePagadora.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia.IdentificacaoFontePagadora }
     *     
     */
    public CtCabecalhoGuia.IdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    /**
     * Define o valor da propriedade identificacaoFontePagadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia.IdentificacaoFontePagadora }
     *     
     */
    public void setIdentificacaoFontePagadora(CtCabecalhoGuia.IdentificacaoFontePagadora value) {
        this.identificacaoFontePagadora = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissaoGuia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    /**
     * Define o valor da propriedade dataEmissaoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoGuia(XMLGregorianCalendar value) {
        this.dataEmissaoGuia = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
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
     *       &lt;choice>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="cnpjFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registroANS",
        "cnpjFontePagadora"
    })
    public static class IdentificacaoFontePagadora {

        protected String registroANS;
        protected String cnpjFontePagadora;

        /**
         * Obtém o valor da propriedade registroANS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistroANS() {
            return registroANS;
        }

        /**
         * Define o valor da propriedade registroANS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistroANS(String value) {
            this.registroANS = value;
        }

        /**
         * Obtém o valor da propriedade cnpjFontePagadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjFontePagadora() {
            return cnpjFontePagadora;
        }

        /**
         * Define o valor da propriedade cnpjFontePagadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjFontePagadora(String value) {
            this.cnpjFontePagadora = value;
        }

    }

}
