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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_loteOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loteOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12" minOccurs="0"/>
 *         &lt;element name="detalheGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_detalheGuiaOdonto" maxOccurs="unbounded"/>
 *         &lt;element name="valorTotalLiberadoLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalProcessadoLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalGlosaLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_loteOdonto", propOrder = {
    "numeroLote",
    "detalheGuia",
    "valorTotalLiberadoLote",
    "valorTotalProcessadoLote",
    "valorTotalGlosaLote"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtDadosPagamento.LoteOdonto.class
})
public class CtLoteOdonto {

    protected String numeroLote;
    @XmlElement(required = true)
    protected List<CtDetalheGuiaOdonto> detalheGuia;
    @XmlElement(required = true)
    protected BigDecimal valorTotalLiberadoLote;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProcessadoLote;
    @XmlElement(required = true)
    protected BigDecimal valorTotalGlosaLote;

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
     * Gets the value of the detalheGuia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalheGuia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalheGuia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDetalheGuiaOdonto }
     * 
     * 
     */
    public List<CtDetalheGuiaOdonto> getDetalheGuia() {
        if (detalheGuia == null) {
            detalheGuia = new ArrayList<CtDetalheGuiaOdonto>();
        }
        return this.detalheGuia;
    }

    /**
     * Obtém o valor da propriedade valorTotalLiberadoLote.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalLiberadoLote() {
        return valorTotalLiberadoLote;
    }

    /**
     * Define o valor da propriedade valorTotalLiberadoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalLiberadoLote(BigDecimal value) {
        this.valorTotalLiberadoLote = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalProcessadoLote.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProcessadoLote() {
        return valorTotalProcessadoLote;
    }

    /**
     * Define o valor da propriedade valorTotalProcessadoLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProcessadoLote(BigDecimal value) {
        this.valorTotalProcessadoLote = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalGlosaLote.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGlosaLote() {
        return valorTotalGlosaLote;
    }

    /**
     * Define o valor da propriedade valorTotalGlosaLote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGlosaLote(BigDecimal value) {
        this.valorTotalGlosaLote = value;
    }

}
