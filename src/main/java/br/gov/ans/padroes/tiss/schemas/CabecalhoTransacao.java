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
 * <p>Classe Java de cabecalhoTransacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cabecalhoTransacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoTransacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoTransacao"/>
 *                   &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12"/>
 *                   &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="falhaNegocio" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa">
 *                 &lt;sequence>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="origem">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorExecutante"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="cnpjPagador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="destino">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorExecutante"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="cnpjPagador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="versaoPadrao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_versao"/>
 *         &lt;element name="identificacaoSoftwareGerador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoSoftwareGerador"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabecalhoTransacao", propOrder = {
    "identificacaoTransacao",
    "falhaNegocio",
    "origem",
    "destino",
    "versaoPadrao",
    "identificacaoSoftwareGerador"
})
public class CabecalhoTransacao {

    @XmlElement(required = true)
    protected CabecalhoTransacao.IdentificacaoTransacao identificacaoTransacao;
    protected CabecalhoTransacao.FalhaNegocio falhaNegocio;
    @XmlElement(required = true)
    protected CabecalhoTransacao.Origem origem;
    @XmlElement(required = true)
    protected CabecalhoTransacao.Destino destino;
    @XmlElement(required = true)
    protected String versaoPadrao;
    @XmlElement(required = true)
    protected CtIdentificacaoSoftwareGerador identificacaoSoftwareGerador;

    /**
     * Obtém o valor da propriedade identificacaoTransacao.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.IdentificacaoTransacao }
     *     
     */
    public CabecalhoTransacao.IdentificacaoTransacao getIdentificacaoTransacao() {
        return identificacaoTransacao;
    }

    /**
     * Define o valor da propriedade identificacaoTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.IdentificacaoTransacao }
     *     
     */
    public void setIdentificacaoTransacao(CabecalhoTransacao.IdentificacaoTransacao value) {
        this.identificacaoTransacao = value;
    }

    /**
     * Obtém o valor da propriedade falhaNegocio.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.FalhaNegocio }
     *     
     */
    public CabecalhoTransacao.FalhaNegocio getFalhaNegocio() {
        return falhaNegocio;
    }

    /**
     * Define o valor da propriedade falhaNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.FalhaNegocio }
     *     
     */
    public void setFalhaNegocio(CabecalhoTransacao.FalhaNegocio value) {
        this.falhaNegocio = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.Origem }
     *     
     */
    public CabecalhoTransacao.Origem getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.Origem }
     *     
     */
    public void setOrigem(CabecalhoTransacao.Origem value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao.Destino }
     *     
     */
    public CabecalhoTransacao.Destino getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao.Destino }
     *     
     */
    public void setDestino(CabecalhoTransacao.Destino value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade versaoPadrao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoPadrao() {
        return versaoPadrao;
    }

    /**
     * Define o valor da propriedade versaoPadrao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoPadrao(String value) {
        this.versaoPadrao = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoSoftwareGerador.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoSoftwareGerador }
     *     
     */
    public CtIdentificacaoSoftwareGerador getIdentificacaoSoftwareGerador() {
        return identificacaoSoftwareGerador;
    }

    /**
     * Define o valor da propriedade identificacaoSoftwareGerador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoSoftwareGerador }
     *     
     */
    public void setIdentificacaoSoftwareGerador(CtIdentificacaoSoftwareGerador value) {
        this.identificacaoSoftwareGerador = value;
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
     *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorExecutante"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="cnpjPagador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
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
        "codigoPrestadorNaOperadora",
        "registroANS",
        "cnpjPagador"
    })
    public static class Destino {

        protected CtIdentificacaoPrestadorExecutante codigoPrestadorNaOperadora;
        protected String registroANS;
        protected String cnpjPagador;

        /**
         * Obtém o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentificacaoPrestadorExecutante }
         *     
         */
        public CtIdentificacaoPrestadorExecutante getCodigoPrestadorNaOperadora() {
            return codigoPrestadorNaOperadora;
        }

        /**
         * Define o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentificacaoPrestadorExecutante }
         *     
         */
        public void setCodigoPrestadorNaOperadora(CtIdentificacaoPrestadorExecutante value) {
            this.codigoPrestadorNaOperadora = value;
        }

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
         * Obtém o valor da propriedade cnpjPagador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjPagador() {
            return cnpjPagador;
        }

        /**
         * Define o valor da propriedade cnpjPagador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjPagador(String value) {
            this.cnpjPagador = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa">
     *       &lt;sequence>
     *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
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
        "observacao"
    })
    public static class FalhaNegocio
        extends CtMotivoGlosa
    {

        protected String observacao;

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
     *         &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoTransacao"/>
     *         &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12"/>
     *         &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
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
        "tipoTransacao",
        "sequencialTransacao",
        "dataRegistroTransacao",
        "horaRegistroTransacao"
    })
    public static class IdentificacaoTransacao {

        @XmlElement(required = true)
        protected StTipoTransacao tipoTransacao;
        @XmlElement(required = true)
        protected BigInteger sequencialTransacao;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRegistroTransacao;
        @XmlElement(required = true)
        protected XMLGregorianCalendar horaRegistroTransacao;

        /**
         * Obtém o valor da propriedade tipoTransacao.
         * 
         * @return
         *     possible object is
         *     {@link StTipoTransacao }
         *     
         */
        public StTipoTransacao getTipoTransacao() {
            return tipoTransacao;
        }

        /**
         * Define o valor da propriedade tipoTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link StTipoTransacao }
         *     
         */
        public void setTipoTransacao(StTipoTransacao value) {
            this.tipoTransacao = value;
        }

        /**
         * Obtém o valor da propriedade sequencialTransacao.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequencialTransacao() {
            return sequencialTransacao;
        }

        /**
         * Define o valor da propriedade sequencialTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequencialTransacao(BigInteger value) {
            this.sequencialTransacao = value;
        }

        /**
         * Obtém o valor da propriedade dataRegistroTransacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRegistroTransacao() {
            return dataRegistroTransacao;
        }

        /**
         * Define o valor da propriedade dataRegistroTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRegistroTransacao(XMLGregorianCalendar value) {
            this.dataRegistroTransacao = value;
        }

        /**
         * Obtém o valor da propriedade horaRegistroTransacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraRegistroTransacao() {
            return horaRegistroTransacao;
        }

        /**
         * Define o valor da propriedade horaRegistroTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraRegistroTransacao(XMLGregorianCalendar value) {
            this.horaRegistroTransacao = value;
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
     *       &lt;choice>
     *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorExecutante"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="cnpjPagador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
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
        "codigoPrestadorNaOperadora",
        "registroANS",
        "cnpjPagador"
    })
    public static class Origem {

        protected CtIdentificacaoPrestadorExecutante codigoPrestadorNaOperadora;
        protected String registroANS;
        protected String cnpjPagador;

        /**
         * Obtém o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentificacaoPrestadorExecutante }
         *     
         */
        public CtIdentificacaoPrestadorExecutante getCodigoPrestadorNaOperadora() {
            return codigoPrestadorNaOperadora;
        }

        /**
         * Define o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentificacaoPrestadorExecutante }
         *     
         */
        public void setCodigoPrestadorNaOperadora(CtIdentificacaoPrestadorExecutante value) {
            this.codigoPrestadorNaOperadora = value;
        }

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
         * Obtém o valor da propriedade cnpjPagador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjPagador() {
            return cnpjPagador;
        }

        /**
         * Define o valor da propriedade cnpjPagador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjPagador(String value) {
            this.cnpjPagador = value;
        }

    }

}
