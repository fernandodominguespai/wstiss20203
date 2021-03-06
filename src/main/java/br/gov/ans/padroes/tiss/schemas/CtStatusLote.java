//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_statusLote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_statusLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusProtocolo" minOccurs="0"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12" minOccurs="0"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusProtocolo"/>
 *         &lt;element name="guias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheguiaMedica" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *                             &lt;element name="procedimentosAnalisados">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="detalheguiaOdonto" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *                             &lt;element name="procedimentosAnalisados">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_statusLote", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "numeroFatura",
    "valorProcessado",
    "valorLiberado",
    "valorGlosa",
    "status",
    "guias"
})
public class CtStatusLote {

    protected String statusProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected BigInteger numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    protected BigInteger numeroFatura;
    protected BigDecimal valorProcessado;
    protected BigDecimal valorLiberado;
    protected BigDecimal valorGlosa;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected CtStatusLote.Guias guias;

    /**
     * Obtém o valor da propriedade statusProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocolo() {
        return statusProtocolo;
    }

    /**
     * Define o valor da propriedade statusProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProtocolo(String value) {
        this.statusProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
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
     * Obtém o valor da propriedade numeroFatura.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroFatura() {
        return numeroFatura;
    }

    /**
     * Define o valor da propriedade numeroFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroFatura(BigInteger value) {
        this.numeroFatura = value;
    }

    /**
     * Obtém o valor da propriedade valorProcessado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessado() {
        return valorProcessado;
    }

    /**
     * Define o valor da propriedade valorProcessado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessado(BigDecimal value) {
        this.valorProcessado = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberado() {
        return valorLiberado;
    }

    /**
     * Define o valor da propriedade valorLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberado(BigDecimal value) {
        this.valorLiberado = value;
    }

    /**
     * Obtém o valor da propriedade valorGlosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosa() {
        return valorGlosa;
    }

    /**
     * Define o valor da propriedade valorGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosa(BigDecimal value) {
        this.valorGlosa = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade guias.
     * 
     * @return
     *     possible object is
     *     {@link CtStatusLote.Guias }
     *     
     */
    public CtStatusLote.Guias getGuias() {
        return guias;
    }

    /**
     * Define o valor da propriedade guias.
     * 
     * @param value
     *     allowed object is
     *     {@link CtStatusLote.Guias }
     *     
     */
    public void setGuias(CtStatusLote.Guias value) {
        this.guias = value;
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
     *         &lt;element name="detalheguiaMedica" maxOccurs="100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
     *                   &lt;element name="procedimentosAnalisados">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="detalheguiaOdonto" maxOccurs="100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
     *                   &lt;element name="procedimentosAnalisados">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "detalheguiaMedica",
        "detalheguiaOdonto"
    })
    public static class Guias {

        protected List<CtStatusLote.Guias.DetalheguiaMedica> detalheguiaMedica;
        protected List<CtStatusLote.Guias.DetalheguiaOdonto> detalheguiaOdonto;

        /**
         * Gets the value of the detalheguiaMedica property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheguiaMedica property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheguiaMedica().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtStatusLote.Guias.DetalheguiaMedica }
         * 
         * 
         */
        public List<CtStatusLote.Guias.DetalheguiaMedica> getDetalheguiaMedica() {
            if (detalheguiaMedica == null) {
                detalheguiaMedica = new ArrayList<CtStatusLote.Guias.DetalheguiaMedica>();
            }
            return this.detalheguiaMedica;
        }

        /**
         * Gets the value of the detalheguiaOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheguiaOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheguiaOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtStatusLote.Guias.DetalheguiaOdonto }
         * 
         * 
         */
        public List<CtStatusLote.Guias.DetalheguiaOdonto> getDetalheguiaOdonto() {
            if (detalheguiaOdonto == null) {
                detalheguiaOdonto = new ArrayList<CtStatusLote.Guias.DetalheguiaOdonto>();
            }
            return this.detalheguiaOdonto;
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
         *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
         *         &lt;element name="procedimentosAnalisados">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "identificacaoGuia",
            "procedimentosAnalisados"
        })
        public static class DetalheguiaMedica {

            @XmlElement(required = true)
            protected CtCabecalhoGuia identificacaoGuia;
            @XmlElement(required = true)
            protected CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados procedimentosAnalisados;

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
             * Obtém o valor da propriedade procedimentosAnalisados.
             * 
             * @return
             *     possible object is
             *     {@link CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados }
             *     
             */
            public CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados getProcedimentosAnalisados() {
                return procedimentosAnalisados;
            }

            /**
             * Define o valor da propriedade procedimentosAnalisados.
             * 
             * @param value
             *     allowed object is
             *     {@link CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados }
             *     
             */
            public void setProcedimentosAnalisados(CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados value) {
                this.procedimentosAnalisados = value;
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
             *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
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
                "procedimento"
            })
            public static class ProcedimentosAnalisados {

                @XmlElement(required = true)
                protected List<CtItemSolicitacao> procedimento;

                /**
                 * Gets the value of the procedimento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedimento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedimento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtItemSolicitacao }
                 * 
                 * 
                 */
                public List<CtItemSolicitacao> getProcedimento() {
                    if (procedimento == null) {
                        procedimento = new ArrayList<CtItemSolicitacao>();
                    }
                    return this.procedimento;
                }

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
         *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
         *         &lt;element name="procedimentosAnalisados">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "identificacaoGuia",
            "procedimentosAnalisados"
        })
        public static class DetalheguiaOdonto {

            @XmlElement(required = true)
            protected CtCabecalhoGuia identificacaoGuia;
            @XmlElement(required = true)
            protected CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados procedimentosAnalisados;

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
             * Obtém o valor da propriedade procedimentosAnalisados.
             * 
             * @return
             *     possible object is
             *     {@link CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados }
             *     
             */
            public CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados getProcedimentosAnalisados() {
                return procedimentosAnalisados;
            }

            /**
             * Define o valor da propriedade procedimentosAnalisados.
             * 
             * @param value
             *     allowed object is
             *     {@link CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados }
             *     
             */
            public void setProcedimentosAnalisados(CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados value) {
                this.procedimentosAnalisados = value;
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
             *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
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
                "procedimento"
            })
            public static class ProcedimentosAnalisados {

                @XmlElement(required = true)
                protected List<CtItemSolicitacaoOdonto> procedimento;

                /**
                 * Gets the value of the procedimento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedimento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedimento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtItemSolicitacaoOdonto }
                 * 
                 * 
                 */
                public List<CtItemSolicitacaoOdonto> getProcedimento() {
                    if (procedimento == null) {
                        procedimento = new ArrayList<CtItemSolicitacaoOdonto>();
                    }
                    return this.procedimento;
                }

            }

        }

    }

}
