//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_endereco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_endereco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoLogradouro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoLogradouro"/>
 *         &lt;element name="logradouro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logradouro"/>
 *         &lt;element name="numero" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroLogradouro"/>
 *         &lt;element name="complemento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao15" minOccurs="0"/>
 *         &lt;element name="codigoIBGEMunicipio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoMunicipioIBGE"/>
 *         &lt;element name="municipio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
 *         &lt;element name="codigoUF" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_UF"/>
 *         &lt;element name="cep" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CEP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_endereco", propOrder = {
    "tipoLogradouro",
    "logradouro",
    "numero",
    "complemento",
    "codigoIBGEMunicipio",
    "municipio",
    "codigoUF",
    "cep"
})
public class CtEndereco {

    @XmlElement(required = true)
    protected String tipoLogradouro;
    @XmlElement(required = true)
    protected String logradouro;
    @XmlElement(required = true)
    protected String numero;
    @XmlElementRef(name = "complemento", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complemento;
    @XmlElement(required = true)
    protected String codigoIBGEMunicipio;
    protected String municipio;
    @XmlElement(required = true)
    protected StUF codigoUF;
    @XmlElement(required = true)
    protected String cep;

    /**
     * Obtém o valor da propriedade tipoLogradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    /**
     * Define o valor da propriedade tipoLogradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLogradouro(String value) {
        this.tipoLogradouro = value;
    }

    /**
     * Obtém o valor da propriedade logradouro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Define o valor da propriedade logradouro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplemento(JAXBElement<String> value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade codigoIBGEMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIBGEMunicipio() {
        return codigoIBGEMunicipio;
    }

    /**
     * Define o valor da propriedade codigoIBGEMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIBGEMunicipio(String value) {
        this.codigoIBGEMunicipio = value;
    }

    /**
     * Obtém o valor da propriedade municipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * Define o valor da propriedade municipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipio(String value) {
        this.municipio = value;
    }

    /**
     * Obtém o valor da propriedade codigoUF.
     * 
     * @return
     *     possible object is
     *     {@link StUF }
     *     
     */
    public StUF getCodigoUF() {
        return codigoUF;
    }

    /**
     * Define o valor da propriedade codigoUF.
     * 
     * @param value
     *     allowed object is
     *     {@link StUF }
     *     
     */
    public void setCodigoUF(StUF value) {
        this.codigoUF = value;
    }

    /**
     * Obtém o valor da propriedade cep.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o valor da propriedade cep.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

}
