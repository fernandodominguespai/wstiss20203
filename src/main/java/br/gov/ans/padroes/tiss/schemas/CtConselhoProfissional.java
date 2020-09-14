//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_conselhoProfissional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_conselhoProfissional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="siglaConselho" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_conselhoProfissional"/>
 *         &lt;element name="numeroConselho" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao15"/>
 *         &lt;element name="ufConselho" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_UF"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_conselhoProfissional", propOrder = {
    "siglaConselho",
    "numeroConselho",
    "ufConselho"
})
public class CtConselhoProfissional {

    @XmlElement(required = true)
    protected StConselhoProfissional siglaConselho;
    @XmlElement(required = true)
    protected String numeroConselho;
    @XmlElement(required = true)
    protected StUF ufConselho;

    /**
     * Obtém o valor da propriedade siglaConselho.
     * 
     * @return
     *     possible object is
     *     {@link StConselhoProfissional }
     *     
     */
    public StConselhoProfissional getSiglaConselho() {
        return siglaConselho;
    }

    /**
     * Define o valor da propriedade siglaConselho.
     * 
     * @param value
     *     allowed object is
     *     {@link StConselhoProfissional }
     *     
     */
    public void setSiglaConselho(StConselhoProfissional value) {
        this.siglaConselho = value;
    }

    /**
     * Obtém o valor da propriedade numeroConselho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConselho() {
        return numeroConselho;
    }

    /**
     * Define o valor da propriedade numeroConselho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConselho(String value) {
        this.numeroConselho = value;
    }

    /**
     * Obtém o valor da propriedade ufConselho.
     * 
     * @return
     *     possible object is
     *     {@link StUF }
     *     
     */
    public StUF getUfConselho() {
        return ufConselho;
    }

    /**
     * Define o valor da propriedade ufConselho.
     * 
     * @param value
     *     allowed object is
     *     {@link StUF }
     *     
     */
    public void setUfConselho(StUF value) {
        this.ufConselho = value;
    }

}
