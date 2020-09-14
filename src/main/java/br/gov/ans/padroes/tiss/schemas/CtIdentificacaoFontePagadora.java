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
 * <p>Classe Java de ct_identificacaoFontePagadora complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoFontePagadora">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="operadoraRegulada">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="CNPJ" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                   &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entidadeNaoRegulada">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CNPJ" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                   &lt;element name="nomeOperadoraEntidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoFontePagadora", propOrder = {
    "operadoraRegulada",
    "entidadeNaoRegulada"
})
public class CtIdentificacaoFontePagadora {

    protected CtIdentificacaoFontePagadora.OperadoraRegulada operadoraRegulada;
    protected CtIdentificacaoFontePagadora.EntidadeNaoRegulada entidadeNaoRegulada;

    /**
     * Obtém o valor da propriedade operadoraRegulada.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora.OperadoraRegulada }
     *     
     */
    public CtIdentificacaoFontePagadora.OperadoraRegulada getOperadoraRegulada() {
        return operadoraRegulada;
    }

    /**
     * Define o valor da propriedade operadoraRegulada.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora.OperadoraRegulada }
     *     
     */
    public void setOperadoraRegulada(CtIdentificacaoFontePagadora.OperadoraRegulada value) {
        this.operadoraRegulada = value;
    }

    /**
     * Obtém o valor da propriedade entidadeNaoRegulada.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora.EntidadeNaoRegulada }
     *     
     */
    public CtIdentificacaoFontePagadora.EntidadeNaoRegulada getEntidadeNaoRegulada() {
        return entidadeNaoRegulada;
    }

    /**
     * Define o valor da propriedade entidadeNaoRegulada.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora.EntidadeNaoRegulada }
     *     
     */
    public void setEntidadeNaoRegulada(CtIdentificacaoFontePagadora.EntidadeNaoRegulada value) {
        this.entidadeNaoRegulada = value;
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
     *         &lt;element name="CNPJ" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *         &lt;element name="nomeOperadoraEntidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
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
        "cnpj",
        "nomeOperadoraEntidade"
    })
    public static class EntidadeNaoRegulada {

        @XmlElement(name = "CNPJ", required = true)
        protected String cnpj;
        @XmlElement(required = true)
        protected String nomeOperadoraEntidade;

        /**
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade nomeOperadoraEntidade.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeOperadoraEntidade() {
            return nomeOperadoraEntidade;
        }

        /**
         * Define o valor da propriedade nomeOperadoraEntidade.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeOperadoraEntidade(String value) {
            this.nomeOperadoraEntidade = value;
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
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="CNPJ" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
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
        "registroANS",
        "cnpj",
        "nomeOperadora"
    })
    public static class OperadoraRegulada {

        @XmlElement(required = true)
        protected String registroANS;
        @XmlElement(name = "CNPJ", required = true)
        protected String cnpj;
        @XmlElement(required = true)
        protected String nomeOperadora;

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
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade nomeOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeOperadora() {
            return nomeOperadora;
        }

        /**
         * Define o valor da propriedade nomeOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeOperadora(String value) {
            this.nomeOperadora = value;
        }

    }

}
