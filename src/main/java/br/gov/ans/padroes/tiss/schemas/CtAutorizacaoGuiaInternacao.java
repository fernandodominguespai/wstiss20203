//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_autorizacaoGuiaInternacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_autorizacaoGuiaInternacao">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoGuia">
 *       &lt;sequence>
 *         &lt;element name="diasAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="dataProvavelAdmisHosp" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_autorizacaoGuiaInternacao", propOrder = {
    "diasAutorizado",
    "dataProvavelAdmisHosp",
    "tipoAcomodacao"
})
public class CtAutorizacaoGuiaInternacao
    extends CtAutorizacaoGuia
{

    protected BigInteger diasAutorizado;
    protected XMLGregorianCalendar dataProvavelAdmisHosp;
    protected String tipoAcomodacao;

    /**
     * Obtém o valor da propriedade diasAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiasAutorizado() {
        return diasAutorizado;
    }

    /**
     * Define o valor da propriedade diasAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiasAutorizado(BigInteger value) {
        this.diasAutorizado = value;
    }

    /**
     * Obtém o valor da propriedade dataProvavelAdmisHosp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavelAdmisHosp() {
        return dataProvavelAdmisHosp;
    }

    /**
     * Define o valor da propriedade dataProvavelAdmisHosp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavelAdmisHosp(XMLGregorianCalendar value) {
        this.dataProvavelAdmisHosp = value;
    }

    /**
     * Obtém o valor da propriedade tipoAcomodacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    /**
     * Define o valor da propriedade tipoAcomodacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcomodacao(String value) {
        this.tipoAcomodacao = value;
    }

}
