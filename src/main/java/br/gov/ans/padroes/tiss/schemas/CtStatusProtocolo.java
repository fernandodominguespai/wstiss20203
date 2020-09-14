//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_StatusProtocolo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_StatusProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusProtocolo" minOccurs="0"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="CNESPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNES" minOccurs="0"/>
 *         &lt;element name="lote">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_statusLote" maxOccurs="unbounded"/>
 *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao"/>
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
@XmlType(name = "ct_StatusProtocolo", propOrder = {
    "identificacaoFontePagadora",
    "statusProtocolo",
    "dadosPrestador",
    "cnesPrestador",
    "lote"
})
public class CtStatusProtocolo {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora identificacaoFontePagadora;
    protected String statusProtocolo;
    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(name = "CNESPrestador")
    protected String cnesPrestador;
    @XmlElement(required = true)
    protected CtStatusProtocolo.Lote lote;

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
     * Obtém o valor da propriedade cnesPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNESPrestador() {
        return cnesPrestador;
    }

    /**
     * Define o valor da propriedade cnesPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNESPrestador(String value) {
        this.cnesPrestador = value;
    }

    /**
     * Obtém o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link CtStatusProtocolo.Lote }
     *     
     */
    public CtStatusProtocolo.Lote getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtStatusProtocolo.Lote }
     *     
     */
    public void setLote(CtStatusProtocolo.Lote value) {
        this.lote = value;
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
     *         &lt;element name="detalheLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_statusLote" maxOccurs="unbounded"/>
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
    @XmlType(name = "", propOrder = {
        "detalheLote",
        "mensagemErro"
    })
    public static class Lote {

        protected List<CtStatusLote> detalheLote;
        protected String mensagemErro;

        /**
         * Gets the value of the detalheLote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheLote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheLote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtStatusLote }
         * 
         * 
         */
        public List<CtStatusLote> getDetalheLote() {
            if (detalheLote == null) {
                detalheLote = new ArrayList<CtStatusLote>();
            }
            return this.detalheLote;
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

    }

}
