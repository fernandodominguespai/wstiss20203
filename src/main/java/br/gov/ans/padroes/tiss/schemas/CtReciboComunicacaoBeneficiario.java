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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_reciboComunicacaoBeneficiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboComunicacaoBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao"/>
 *         &lt;element name="reciboComunicacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="statusComunicacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusComunicacaoBeneficiario"/>
 *                   &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *                   &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoEvento"/>
 *                   &lt;choice>
 *                     &lt;element name="motivoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_motivoSaida"/>
 *                     &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
 *                   &lt;/choice>
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
@XmlType(name = "ct_reciboComunicacaoBeneficiario", propOrder = {
    "mensagemErro",
    "reciboComunicacao"
})
public class CtReciboComunicacaoBeneficiario {

    protected String mensagemErro;
    protected CtReciboComunicacaoBeneficiario.ReciboComunicacao reciboComunicacao;

    /**
     * Obtém o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemErro(String value) {
        this.mensagemErro = value;
    }

    /**
     * Obtém o valor da propriedade reciboComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboComunicacaoBeneficiario.ReciboComunicacao }
     *     
     */
    public CtReciboComunicacaoBeneficiario.ReciboComunicacao getReciboComunicacao() {
        return reciboComunicacao;
    }

    /**
     * Define o valor da propriedade reciboComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboComunicacaoBeneficiario.ReciboComunicacao }
     *     
     */
    public void setReciboComunicacao(CtReciboComunicacaoBeneficiario.ReciboComunicacao value) {
        this.reciboComunicacao = value;
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
     *         &lt;element name="statusComunicacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusComunicacaoBeneficiario"/>
     *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
     *         &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoEvento"/>
     *         &lt;choice>
     *           &lt;element name="motivoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_motivoSaida"/>
     *           &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
     *         &lt;/choice>
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
        "statusComunicacaoBeneficiario",
        "beneficiario",
        "dataEvento",
        "tipoEvento",
        "motivoSaida",
        "tipoInternacao"
    })
    public static class ReciboComunicacao {

        @XmlElement(required = true)
        protected StStatusComunicacaoBeneficiario statusComunicacaoBeneficiario;
        @XmlElement(required = true)
        protected CtBeneficiario beneficiario;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataEvento;
        @XmlElement(required = true)
        protected StTipoEvento tipoEvento;
        protected String motivoSaida;
        protected String tipoInternacao;

        /**
         * Obtém o valor da propriedade statusComunicacaoBeneficiario.
         * 
         * @return
         *     possible object is
         *     {@link StStatusComunicacaoBeneficiario }
         *     
         */
        public StStatusComunicacaoBeneficiario getStatusComunicacaoBeneficiario() {
            return statusComunicacaoBeneficiario;
        }

        /**
         * Define o valor da propriedade statusComunicacaoBeneficiario.
         * 
         * @param value
         *     allowed object is
         *     {@link StStatusComunicacaoBeneficiario }
         *     
         */
        public void setStatusComunicacaoBeneficiario(StStatusComunicacaoBeneficiario value) {
            this.statusComunicacaoBeneficiario = value;
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
         * Obtém o valor da propriedade dataEvento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEvento() {
            return dataEvento;
        }

        /**
         * Define o valor da propriedade dataEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEvento(XMLGregorianCalendar value) {
            this.dataEvento = value;
        }

        /**
         * Obtém o valor da propriedade tipoEvento.
         * 
         * @return
         *     possible object is
         *     {@link StTipoEvento }
         *     
         */
        public StTipoEvento getTipoEvento() {
            return tipoEvento;
        }

        /**
         * Define o valor da propriedade tipoEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link StTipoEvento }
         *     
         */
        public void setTipoEvento(StTipoEvento value) {
            this.tipoEvento = value;
        }

        /**
         * Obtém o valor da propriedade motivoSaida.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoSaida() {
            return motivoSaida;
        }

        /**
         * Define o valor da propriedade motivoSaida.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoSaida(String value) {
            this.motivoSaida = value;
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

    }

}
