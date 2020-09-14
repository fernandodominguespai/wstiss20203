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
 * <p>Classe Java de ct_comunicacaoBeneficiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_comunicacaoBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoEvento"/>
 *         &lt;choice>
 *           &lt;element name="motivoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_motivoSaida"/>
 *           &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_comunicacaoBeneficiario", propOrder = {
    "beneficiario",
    "dataEvento",
    "tipoEvento",
    "motivoSaida",
    "tipoInternacao"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario.class
})
public class CtComunicacaoBeneficiario {

    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEvento;
    @XmlElement(required = true)
    protected StTipoEvento tipoEvento;
    protected String motivoSaida;
    protected String tipoInternacao;

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
     * Obtém o valor da propriedade dataEvento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvento() {
        return dataEvento;
    }

    /**
     * Define o valor da propriedade dataEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvento(XMLGregorianCalendar value) {
        this.dataEvento = value;
    }

    /**
     * Obtém o valor da propriedade tipoEvento.
     * 
     * @return
     *     possible object is
     *     {@link StTipoEvento }
     *     
     */
    public StTipoEvento getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Define o valor da propriedade tipoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link StTipoEvento }
     *     
     */
    public void setTipoEvento(StTipoEvento value) {
        this.tipoEvento = value;
    }

    /**
     * Obtém o valor da propriedade motivoSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSaida() {
        return motivoSaida;
    }

    /**
     * Define o valor da propriedade motivoSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSaida(String value) {
        this.motivoSaida = value;
    }

    /**
     * Obtém o valor da propriedade tipoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInternacao() {
        return tipoInternacao;
    }

    /**
     * Define o valor da propriedade tipoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInternacao(String value) {
        this.tipoInternacao = value;
    }

}
