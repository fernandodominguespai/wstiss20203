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
 * <p>Classe Java de ct_protocoloRecebimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="protocoloRecebimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroProtocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *                   &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *                   &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="mensagemDetalheProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_detalheProtocolo" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecebimento", propOrder = {
    "protocoloRecebimento",
    "mensagemErro"
})
public class CtProtocoloRecebimento {

    protected CtProtocoloRecebimento.ProtocoloRecebimento protocoloRecebimento;
    protected String mensagemErro;

    /**
     * Obtém o valor da propriedade protocoloRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloRecebimento.ProtocoloRecebimento }
     *     
     */
    public CtProtocoloRecebimento.ProtocoloRecebimento getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Define o valor da propriedade protocoloRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloRecebimento.ProtocoloRecebimento }
     *     
     */
    public void setProtocoloRecebimento(CtProtocoloRecebimento.ProtocoloRecebimento value) {
        this.protocoloRecebimento = value;
    }

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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="numeroProtocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
     *         &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
     *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
     *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="mensagemDetalheProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_detalheProtocolo" minOccurs="0"/>
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
        "numeroProtocoloRecebimento",
        "dadosOperadora",
        "dadosPrestador",
        "numeroLote",
        "dataEnvioLote",
        "mensagemDetalheProtocolo"
    })
    public static class ProtocoloRecebimento {

        @XmlElement(required = true)
        protected String numeroProtocoloRecebimento;
        @XmlElement(required = true)
        protected CtIdentificacaoFontePagadora dadosOperadora;
        @XmlElement(required = true)
        protected CtContratado dadosPrestador;
        @XmlElement(required = true)
        protected String numeroLote;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataEnvioLote;
        protected CtDetalheProtocolo mensagemDetalheProtocolo;

        /**
         * Obtém o valor da propriedade numeroProtocoloRecebimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroProtocoloRecebimento() {
            return numeroProtocoloRecebimento;
        }

        /**
         * Define o valor da propriedade numeroProtocoloRecebimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroProtocoloRecebimento(String value) {
            this.numeroProtocoloRecebimento = value;
        }

        /**
         * Obtém o valor da propriedade dadosOperadora.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentificacaoFontePagadora }
         *     
         */
        public CtIdentificacaoFontePagadora getDadosOperadora() {
            return dadosOperadora;
        }

        /**
         * Define o valor da propriedade dadosOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentificacaoFontePagadora }
         *     
         */
        public void setDadosOperadora(CtIdentificacaoFontePagadora value) {
            this.dadosOperadora = value;
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
         * Obtém o valor da propriedade numeroLote.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroLote() {
            return numeroLote;
        }

        /**
         * Define o valor da propriedade numeroLote.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroLote(String value) {
            this.numeroLote = value;
        }

        /**
         * Obtém o valor da propriedade dataEnvioLote.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEnvioLote() {
            return dataEnvioLote;
        }

        /**
         * Define o valor da propriedade dataEnvioLote.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEnvioLote(XMLGregorianCalendar value) {
            this.dataEnvioLote = value;
        }

        /**
         * Obtém o valor da propriedade mensagemDetalheProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link CtDetalheProtocolo }
         *     
         */
        public CtDetalheProtocolo getMensagemDetalheProtocolo() {
            return mensagemDetalheProtocolo;
        }

        /**
         * Define o valor da propriedade mensagemDetalheProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDetalheProtocolo }
         *     
         */
        public void setMensagemDetalheProtocolo(CtDetalheProtocolo value) {
            this.mensagemDetalheProtocolo = value;
        }

    }

}
