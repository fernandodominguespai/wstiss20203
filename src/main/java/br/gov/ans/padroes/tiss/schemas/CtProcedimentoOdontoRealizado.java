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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_procedimentoOdontoRealizado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoOdontoRealizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="denteRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_denteRegiao" minOccurs="0"/>
 *         &lt;element name="face" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_face" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento" minOccurs="0"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="glosas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoOdontoRealizado", propOrder = {
    "procedimentoOdonto",
    "denteRegiao",
    "face",
    "dataRealizacao",
    "quantidade",
    "valorProcessado",
    "valorGlosaEstorno",
    "glosas",
    "valorLiberado"
})
public class CtProcedimentoOdontoRealizado {

    @XmlElement(required = true)
    protected CtTabela procedimentoOdonto;
    protected CtDenteRegiao denteRegiao;
    protected String face;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRealizacao;
    protected BigDecimal quantidade;
    @XmlElement(required = true)
    protected BigDecimal valorProcessado;
    protected BigDecimal valorGlosaEstorno;
    protected CtProcedimentoOdontoRealizado.Glosas glosas;
    @XmlElement(required = true)
    protected BigDecimal valorLiberado;

    /**
     * Obtém o valor da propriedade procedimentoOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getProcedimentoOdonto() {
        return procedimentoOdonto;
    }

    /**
     * Define o valor da propriedade procedimentoOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setProcedimentoOdonto(CtTabela value) {
        this.procedimentoOdonto = value;
    }

    /**
     * Obtém o valor da propriedade denteRegiao.
     * 
     * @return
     *     possible object is
     *     {@link CtDenteRegiao }
     *     
     */
    public CtDenteRegiao getDenteRegiao() {
        return denteRegiao;
    }

    /**
     * Define o valor da propriedade denteRegiao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDenteRegiao }
     *     
     */
    public void setDenteRegiao(CtDenteRegiao value) {
        this.denteRegiao = value;
    }

    /**
     * Obtém o valor da propriedade face.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFace() {
        return face;
    }

    /**
     * Define o valor da propriedade face.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFace(String value) {
        this.face = value;
    }

    /**
     * Obtém o valor da propriedade dataRealizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    /**
     * Define o valor da propriedade dataRealizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRealizacao(XMLGregorianCalendar value) {
        this.dataRealizacao = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
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
     * Obtém o valor da propriedade valorGlosaEstorno.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaEstorno() {
        return valorGlosaEstorno;
    }

    /**
     * Define o valor da propriedade valorGlosaEstorno.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaEstorno(BigDecimal value) {
        this.valorGlosaEstorno = value;
    }

    /**
     * Obtém o valor da propriedade glosas.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoOdontoRealizado.Glosas }
     *     
     */
    public CtProcedimentoOdontoRealizado.Glosas getGlosas() {
        return glosas;
    }

    /**
     * Define o valor da propriedade glosas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoOdontoRealizado.Glosas }
     *     
     */
    public void setGlosas(CtProcedimentoOdontoRealizado.Glosas value) {
        this.glosas = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
        "motivoGlosa"
    })
    public static class Glosas {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
        }

    }

}
