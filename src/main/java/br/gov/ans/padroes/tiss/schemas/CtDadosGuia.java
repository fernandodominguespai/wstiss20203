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
 * <p>Classe Java de ct_dadosGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="valorProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="procedimentos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="dadosProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosProcedimento" maxOccurs="unbounded"/>
 *                   &lt;element name="dadosProcedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontoRealizado" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="codigoGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosGuia", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "beneficiario",
    "dataRealizacao",
    "valorProcessadoGuia",
    "valorLiberadoGuia",
    "valorGlosaGuia",
    "procedimentos",
    "codigoGlosaGuia"
})
public class CtDadosGuia {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRealizacao;
    protected BigDecimal valorProcessadoGuia;
    protected BigDecimal valorLiberadoGuia;
    protected BigDecimal valorGlosaGuia;
    @XmlElement(required = true)
    protected CtDadosGuia.Procedimentos procedimentos;
    protected List<CtMotivoGlosa> codigoGlosaGuia;

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
     * Obtém o valor da propriedade beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define o valor da propriedade beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setBeneficiario(CtBeneficiario value) {
        this.beneficiario = value;
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
     * Obtém o valor da propriedade valorProcessadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoGuia() {
        return valorProcessadoGuia;
    }

    /**
     * Define o valor da propriedade valorProcessadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoGuia(BigDecimal value) {
        this.valorProcessadoGuia = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoGuia() {
        return valorLiberadoGuia;
    }

    /**
     * Define o valor da propriedade valorLiberadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoGuia(BigDecimal value) {
        this.valorLiberadoGuia = value;
    }

    /**
     * Obtém o valor da propriedade valorGlosaGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaGuia() {
        return valorGlosaGuia;
    }

    /**
     * Define o valor da propriedade valorGlosaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaGuia(BigDecimal value) {
        this.valorGlosaGuia = value;
    }

    /**
     * Obtém o valor da propriedade procedimentos.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosGuia.Procedimentos }
     *     
     */
    public CtDadosGuia.Procedimentos getProcedimentos() {
        return procedimentos;
    }

    /**
     * Define o valor da propriedade procedimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosGuia.Procedimentos }
     *     
     */
    public void setProcedimentos(CtDadosGuia.Procedimentos value) {
        this.procedimentos = value;
    }

    /**
     * Gets the value of the codigoGlosaGuia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoGlosaGuia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoGlosaGuia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtMotivoGlosa }
     * 
     * 
     */
    public List<CtMotivoGlosa> getCodigoGlosaGuia() {
        if (codigoGlosaGuia == null) {
            codigoGlosaGuia = new ArrayList<CtMotivoGlosa>();
        }
        return this.codigoGlosaGuia;
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
     *         &lt;element name="dadosProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosProcedimento" maxOccurs="unbounded"/>
     *         &lt;element name="dadosProcedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontoRealizado" maxOccurs="unbounded"/>
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
        "dadosProcedimento",
        "dadosProcedimentoOdonto"
    })
    public static class Procedimentos {

        protected List<CtDadosProcedimento> dadosProcedimento;
        protected List<CtProcedimentoOdontoRealizado> dadosProcedimentoOdonto;

        /**
         * Gets the value of the dadosProcedimento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosProcedimento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosProcedimento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDadosProcedimento }
         * 
         * 
         */
        public List<CtDadosProcedimento> getDadosProcedimento() {
            if (dadosProcedimento == null) {
                dadosProcedimento = new ArrayList<CtDadosProcedimento>();
            }
            return this.dadosProcedimento;
        }

        /**
         * Gets the value of the dadosProcedimentoOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosProcedimentoOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosProcedimentoOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoOdontoRealizado }
         * 
         * 
         */
        public List<CtProcedimentoOdontoRealizado> getDadosProcedimentoOdonto() {
            if (dadosProcedimentoOdonto == null) {
                dadosProcedimentoOdonto = new ArrayList<CtProcedimentoOdontoRealizado>();
            }
            return this.dadosProcedimentoOdonto;
        }

    }

}
