//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_autorizacaoGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_autorizacaoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="senhaAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_senhaAutorizacao" minOccurs="0"/>
 *         &lt;element name="validadeSenha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_autorizacaoGuia", propOrder = {
    "dataAutorizacao",
    "senhaAutorizacao",
    "validadeSenha"
})
@XmlSeeAlso({
    CtAutorizacaoGuiaInternacao.class
})
public class CtAutorizacaoGuia {

    protected XMLGregorianCalendar dataAutorizacao;
    protected String senhaAutorizacao;
    protected XMLGregorianCalendar validadeSenha;

    /**
     * Obtém o valor da propriedade dataAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAutorizacao() {
        return dataAutorizacao;
    }

    /**
     * Define o valor da propriedade dataAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAutorizacao(XMLGregorianCalendar value) {
        this.dataAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade senhaAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAutorizacao() {
        return senhaAutorizacao;
    }

    /**
     * Define o valor da propriedade senhaAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAutorizacao(String value) {
        this.senhaAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade validadeSenha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeSenha() {
        return validadeSenha;
    }

    /**
     * Define o valor da propriedade validadeSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeSenha(XMLGregorianCalendar value) {
        this.validadeSenha = value;
    }

}
