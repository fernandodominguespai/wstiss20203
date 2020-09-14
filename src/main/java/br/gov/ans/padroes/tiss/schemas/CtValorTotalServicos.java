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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_valorTotalServicos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_valorTotalServicos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="servicosExecutados" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="diarias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="taxas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="materiais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="medicamentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="gases" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="totalGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_valorTotalServicos", propOrder = {
    "servicosExecutados",
    "diarias",
    "taxas",
    "materiais",
    "medicamentos",
    "gases",
    "totalGeral"
})
public class CtValorTotalServicos {

    protected BigDecimal servicosExecutados;
    protected BigDecimal diarias;
    protected BigDecimal taxas;
    protected BigDecimal materiais;
    protected BigDecimal medicamentos;
    protected BigDecimal gases;
    protected BigDecimal totalGeral;

    /**
     * Obtém o valor da propriedade servicosExecutados.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicosExecutados() {
        return servicosExecutados;
    }

    /**
     * Define o valor da propriedade servicosExecutados.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicosExecutados(BigDecimal value) {
        this.servicosExecutados = value;
    }

    /**
     * Obtém o valor da propriedade diarias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiarias() {
        return diarias;
    }

    /**
     * Define o valor da propriedade diarias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiarias(BigDecimal value) {
        this.diarias = value;
    }

    /**
     * Obtém o valor da propriedade taxas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxas() {
        return taxas;
    }

    /**
     * Define o valor da propriedade taxas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxas(BigDecimal value) {
        this.taxas = value;
    }

    /**
     * Obtém o valor da propriedade materiais.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMateriais() {
        return materiais;
    }

    /**
     * Define o valor da propriedade materiais.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMateriais(BigDecimal value) {
        this.materiais = value;
    }

    /**
     * Obtém o valor da propriedade medicamentos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedicamentos() {
        return medicamentos;
    }

    /**
     * Define o valor da propriedade medicamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedicamentos(BigDecimal value) {
        this.medicamentos = value;
    }

    /**
     * Obtém o valor da propriedade gases.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGases() {
        return gases;
    }

    /**
     * Define o valor da propriedade gases.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGases(BigDecimal value) {
        this.gases = value;
    }

    /**
     * Obtém o valor da propriedade totalGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGeral() {
        return totalGeral;
    }

    /**
     * Define o valor da propriedade totalGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGeral(BigDecimal value) {
        this.totalGeral = value;
    }

}
