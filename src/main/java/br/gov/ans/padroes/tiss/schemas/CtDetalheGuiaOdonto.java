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
 * <p>Classe Java de ct_detalheGuiaOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_detalheGuiaOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="codigoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoBeneficiario"/>
 *         &lt;element name="NomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *         &lt;element name="procedimentoRealizado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentosOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontoRealizado" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_detalheGuiaOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "codigoBeneficiario",
    "nomeBeneficiario",
    "procedimentoRealizado",
    "valorTotalGlosaGuia",
    "valorTotalLiberadoGuia",
    "valorTotalProcessadoGuia"
})
public class CtDetalheGuiaOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected String codigoBeneficiario;
    @XmlElement(name = "NomeBeneficiario", required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected CtDetalheGuiaOdonto.ProcedimentoRealizado procedimentoRealizado;
    @XmlElement(required = true)
    protected BigDecimal valorTotalGlosaGuia;
    @XmlElement(required = true)
    protected BigDecimal valorTotalLiberadoGuia;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProcessadoGuia;

    /**
     * Obtém o valor da propriedade numeroGuiaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade codigoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    /**
     * Define o valor da propriedade codigoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBeneficiario(String value) {
        this.codigoBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade nomeBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    /**
     * Define o valor da propriedade nomeBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBeneficiario(String value) {
        this.nomeBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade procedimentoRealizado.
     * 
     * @return
     *     possible object is
     *     {@link CtDetalheGuiaOdonto.ProcedimentoRealizado }
     *     
     */
    public CtDetalheGuiaOdonto.ProcedimentoRealizado getProcedimentoRealizado() {
        return procedimentoRealizado;
    }

    /**
     * Define o valor da propriedade procedimentoRealizado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDetalheGuiaOdonto.ProcedimentoRealizado }
     *     
     */
    public void setProcedimentoRealizado(CtDetalheGuiaOdonto.ProcedimentoRealizado value) {
        this.procedimentoRealizado = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalGlosaGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGlosaGuia() {
        return valorTotalGlosaGuia;
    }

    /**
     * Define o valor da propriedade valorTotalGlosaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGlosaGuia(BigDecimal value) {
        this.valorTotalGlosaGuia = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalLiberadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalLiberadoGuia() {
        return valorTotalLiberadoGuia;
    }

    /**
     * Define o valor da propriedade valorTotalLiberadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalLiberadoGuia(BigDecimal value) {
        this.valorTotalLiberadoGuia = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalProcessadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProcessadoGuia() {
        return valorTotalProcessadoGuia;
    }

    /**
     * Define o valor da propriedade valorTotalProcessadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProcessadoGuia(BigDecimal value) {
        this.valorTotalProcessadoGuia = value;
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
     *         &lt;element name="procedimentosOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontoRealizado" maxOccurs="unbounded"/>
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
        "procedimentosOdonto"
    })
    public static class ProcedimentoRealizado {

        @XmlElement(required = true)
        protected List<CtProcedimentoOdontoRealizado> procedimentosOdonto;

        /**
         * Gets the value of the procedimentosOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentosOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentosOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoOdontoRealizado }
         * 
         * 
         */
        public List<CtProcedimentoOdontoRealizado> getProcedimentosOdonto() {
            if (procedimentosOdonto == null) {
                procedimentosOdonto = new ArrayList<CtProcedimentoOdontoRealizado>();
            }
            return this.procedimentosOdonto;
        }

    }

}
