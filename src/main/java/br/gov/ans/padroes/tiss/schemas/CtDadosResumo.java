//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_dadosResumo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosResumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosResumo", propOrder = {
    "numeroFatura",
    "numeroLote",
    "dataEnvioLote",
    "numeroProtocolo",
    "valorInformado",
    "valorProcessado",
    "valorLiberado",
    "valorGlosa"
})
public class CtDadosResumo {

    protected String numeroFatura;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorInformado;
    @XmlElement(required = true)
    protected BigDecimal valorProcessado;
    @XmlElement(required = true)
    protected BigDecimal valorLiberado;
    protected BigDecimal valorGlosa;

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
     * Obtém o valor da propriedade valorInformado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInformado() {
        return valorInformado;
    }

    /**
     * Define o valor da propriedade valorInformado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInformado(BigDecimal value) {
        this.valorInformado = value;
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

}
