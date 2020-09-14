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
 * <p>Classe Java de ct_identificacaoSoftwareGerador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoSoftwareGerador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeAplicativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *         &lt;element name="versaoAplicativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *         &lt;element name="fabricanteAplicativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoSoftwareGerador", propOrder = {
    "nomeAplicativo",
    "versaoAplicativo",
    "fabricanteAplicativo"
})
public class CtIdentificacaoSoftwareGerador {

    @XmlElement(required = true)
    protected String nomeAplicativo;
    @XmlElement(required = true)
    protected String versaoAplicativo;
    @XmlElement(required = true)
    protected String fabricanteAplicativo;

    /**
     * Obtém o valor da propriedade nomeAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAplicativo() {
        return nomeAplicativo;
    }

    /**
     * Define o valor da propriedade nomeAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAplicativo(String value) {
        this.nomeAplicativo = value;
    }

    /**
     * Obtém o valor da propriedade versaoAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoAplicativo() {
        return versaoAplicativo;
    }

    /**
     * Define o valor da propriedade versaoAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoAplicativo(String value) {
        this.versaoAplicativo = value;
    }

    /**
     * Obtém o valor da propriedade fabricanteAplicativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricanteAplicativo() {
        return fabricanteAplicativo;
    }

    /**
     * Define o valor da propriedade fabricanteAplicativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricanteAplicativo(String value) {
        this.fabricanteAplicativo = value;
    }

}
