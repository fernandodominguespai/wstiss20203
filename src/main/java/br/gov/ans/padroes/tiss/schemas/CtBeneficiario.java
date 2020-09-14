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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_beneficiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_beneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao20"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *         &lt;element name="nomePlano" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40"/>
 *         &lt;element name="validadeCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao15" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_beneficiario", propOrder = {
    "numeroCarteira",
    "nomeBeneficiario",
    "nomePlano",
    "validadeCarteira",
    "numeroCNS",
    "identificadorBeneficiario"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaTratamentoOdontologicoReapresentacao.DadosBeneficiario.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaOdontologia.DadosBeneficiario.class,
    br.gov.ans.padroes.tiss.schemas.CtAnexoSituacaoInicial.DadosBeneficiario.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaSolicitacaoOdonto.DadosBeneficiario.class
})
public class CtBeneficiario {

    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected String nomePlano;
    protected XMLGregorianCalendar validadeCarteira;
    protected String numeroCNS;
    protected byte[] identificadorBeneficiario;

    /**
     * Obtém o valor da propriedade numeroCarteira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    /**
     * Define o valor da propriedade numeroCarteira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarteira(String value) {
        this.numeroCarteira = value;
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
     * Obtém o valor da propriedade nomePlano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePlano() {
        return nomePlano;
    }

    /**
     * Define o valor da propriedade nomePlano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePlano(String value) {
        this.nomePlano = value;
    }

    /**
     * Obtém o valor da propriedade validadeCarteira.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidadeCarteira() {
        return validadeCarteira;
    }

    /**
     * Define o valor da propriedade validadeCarteira.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidadeCarteira(XMLGregorianCalendar value) {
        this.validadeCarteira = value;
    }

    /**
     * Obtém o valor da propriedade numeroCNS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Define o valor da propriedade numeroCNS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBeneficiario.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    /**
     * Define o valor da propriedade identificadorBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIdentificadorBeneficiario(byte[] value) {
        this.identificadorBeneficiario = value;
    }

}
