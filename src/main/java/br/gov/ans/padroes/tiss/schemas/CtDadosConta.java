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
 * <p>Classe Java de ct_dadosConta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12" minOccurs="0"/>
 *         &lt;element name="lote">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosLote" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorProcessadoFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorLiberadoFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosaFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosConta", propOrder = {
    "numeroFatura",
    "lote",
    "valorProcessadoFatura",
    "valorLiberadoFatura",
    "valorGlosaFatura"
})
public class CtDadosConta {

    protected String numeroFatura;
    @XmlElement(required = true)
    protected CtDadosConta.Lote lote;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoFatura;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoFatura;
    protected BigDecimal valorGlosaFatura;

    /**
     * Obtém o valor da propriedade numeroFatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFatura() {
        return numeroFatura;
    }

    /**
     * Define o valor da propriedade numeroFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFatura(String value) {
        this.numeroFatura = value;
    }

    /**
     * Obtém o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosConta.Lote }
     *     
     */
    public CtDadosConta.Lote getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosConta.Lote }
     *     
     */
    public void setLote(CtDadosConta.Lote value) {
        this.lote = value;
    }

    /**
     * Obtém o valor da propriedade valorProcessadoFatura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoFatura() {
        return valorProcessadoFatura;
    }

    /**
     * Define o valor da propriedade valorProcessadoFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoFatura(BigDecimal value) {
        this.valorProcessadoFatura = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberadoFatura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoFatura() {
        return valorLiberadoFatura;
    }

    /**
     * Define o valor da propriedade valorLiberadoFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoFatura(BigDecimal value) {
        this.valorLiberadoFatura = value;
    }

    /**
     * Obtém o valor da propriedade valorGlosaFatura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaFatura() {
        return valorGlosaFatura;
    }

    /**
     * Define o valor da propriedade valorGlosaFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaFatura(BigDecimal value) {
        this.valorGlosaFatura = value;
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
     *         &lt;element name="dadosLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosLote" maxOccurs="unbounded"/>
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
        "dadosLote"
    })
    public static class Lote {

        @XmlElement(required = true)
        protected List<CtDadosLote> dadosLote;

        /**
         * Gets the value of the dadosLote property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosLote property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosLote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDadosLote }
         * 
         * 
         */
        public List<CtDadosLote> getDadosLote() {
            if (dadosLote == null) {
                dadosLote = new ArrayList<CtDadosLote>();
            }
            return this.dadosLote;
        }

    }

}
