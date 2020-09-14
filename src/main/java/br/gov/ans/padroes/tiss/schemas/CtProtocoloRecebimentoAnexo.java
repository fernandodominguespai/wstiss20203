//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_protocoloRecebimentoAnexo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimentoAnexo">
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
 *                   &lt;element name="dataEnvioAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *                   &lt;element name="quantidadeAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro"/>
 *                   &lt;element name="relacaoAnexo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
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
@XmlType(name = "ct_protocoloRecebimentoAnexo", propOrder = {
    "protocoloRecebimento",
    "mensagemErro"
})
public class CtProtocoloRecebimentoAnexo {

    protected CtProtocoloRecebimentoAnexo.ProtocoloRecebimento protocoloRecebimento;
    protected String mensagemErro;

    /**
     * Obtém o valor da propriedade protocoloRecebimento.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento }
     *     
     */
    public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Define o valor da propriedade protocoloRecebimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento }
     *     
     */
    public void setProtocoloRecebimento(CtProtocoloRecebimentoAnexo.ProtocoloRecebimento value) {
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
     *         &lt;element name="dataEnvioAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
     *         &lt;element name="quantidadeAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro"/>
     *         &lt;element name="relacaoAnexo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
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
    @XmlType(name = "", propOrder = {
        "numeroProtocoloRecebimento",
        "dadosOperadora",
        "dadosPrestador",
        "dataEnvioAnexo",
        "numeroLote",
        "quantidadeAnexo",
        "relacaoAnexo",
        "observacao"
    })
    public static class ProtocoloRecebimento {

        @XmlElement(required = true)
        protected String numeroProtocoloRecebimento;
        @XmlElement(required = true)
        protected CtIdentificacaoFontePagadora dadosOperadora;
        @XmlElement(required = true)
        protected CtContratado dadosPrestador;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataEnvioAnexo;
        @XmlElement(required = true)
        protected String numeroLote;
        @XmlElement(required = true)
        protected BigInteger quantidadeAnexo;
        @XmlElement(required = true)
        protected CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo relacaoAnexo;
        protected String observacao;

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
         * Obtém o valor da propriedade dataEnvioAnexo.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEnvioAnexo() {
            return dataEnvioAnexo;
        }

        /**
         * Define o valor da propriedade dataEnvioAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEnvioAnexo(XMLGregorianCalendar value) {
            this.dataEnvioAnexo = value;
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
         * Obtém o valor da propriedade quantidadeAnexo.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidadeAnexo() {
            return quantidadeAnexo;
        }

        /**
         * Define o valor da propriedade quantidadeAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidadeAnexo(BigInteger value) {
            this.quantidadeAnexo = value;
        }

        /**
         * Obtém o valor da propriedade relacaoAnexo.
         * 
         * @return
         *     possible object is
         *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo }
         *     
         */
        public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo getRelacaoAnexo() {
            return relacaoAnexo;
        }

        /**
         * Define o valor da propriedade relacaoAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo }
         *     
         */
        public void setRelacaoAnexo(CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo value) {
            this.relacaoAnexo = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
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
            "numeroGuiaPrincipal"
        })
        public static class RelacaoAnexo {

            protected List<String> numeroGuiaPrincipal;

            /**
             * Gets the value of the numeroGuiaPrincipal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numeroGuiaPrincipal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNumeroGuiaPrincipal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNumeroGuiaPrincipal() {
                if (numeroGuiaPrincipal == null) {
                    numeroGuiaPrincipal = new ArrayList<String>();
                }
                return this.numeroGuiaPrincipal;
            }

        }

    }

}
