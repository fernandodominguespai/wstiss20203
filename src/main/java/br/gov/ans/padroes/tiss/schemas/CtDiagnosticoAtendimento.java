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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_diagnosticoAtendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnosticoAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CID" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico" minOccurs="0"/>
 *         &lt;element name="tipoDoenca" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoDoenca" minOccurs="0"/>
 *         &lt;element name="tempoReferidoEvolucaoDoenca" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tempoEvolucaoDoenca" minOccurs="0"/>
 *         &lt;element name="indicadorAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicadorAcidente" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnosticoAtendimento", propOrder = {
    "cid",
    "tipoDoenca",
    "tempoReferidoEvolucaoDoenca",
    "indicadorAcidente"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaConsultaReapresentacao.HipoteseDiagnostica.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaConsulta.HipoteseDiagnostica.class
})
public class CtDiagnosticoAtendimento {

    @XmlElement(name = "CID")
    protected CtDiagnostico cid;
    @XmlElementRef(name = "tipoDoenca", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<StTipoDoenca> tipoDoenca;
    @XmlElementRef(name = "tempoReferidoEvolucaoDoenca", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CtTempoEvolucaoDoenca> tempoReferidoEvolucaoDoenca;
    protected String indicadorAcidente;

    /**
     * Obtém o valor da propriedade cid.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnostico }
     *     
     */
    public CtDiagnostico getCID() {
        return cid;
    }

    /**
     * Define o valor da propriedade cid.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnostico }
     *     
     */
    public void setCID(CtDiagnostico value) {
        this.cid = value;
    }

    /**
     * Obtém o valor da propriedade tipoDoenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StTipoDoenca }{@code >}
     *     
     */
    public JAXBElement<StTipoDoenca> getTipoDoenca() {
        return tipoDoenca;
    }

    /**
     * Define o valor da propriedade tipoDoenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StTipoDoenca }{@code >}
     *     
     */
    public void setTipoDoenca(JAXBElement<StTipoDoenca> value) {
        this.tipoDoenca = value;
    }

    /**
     * Obtém o valor da propriedade tempoReferidoEvolucaoDoenca.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CtTempoEvolucaoDoenca }{@code >}
     *     
     */
    public JAXBElement<CtTempoEvolucaoDoenca> getTempoReferidoEvolucaoDoenca() {
        return tempoReferidoEvolucaoDoenca;
    }

    /**
     * Define o valor da propriedade tempoReferidoEvolucaoDoenca.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CtTempoEvolucaoDoenca }{@code >}
     *     
     */
    public void setTempoReferidoEvolucaoDoenca(JAXBElement<CtTempoEvolucaoDoenca> value) {
        this.tempoReferidoEvolucaoDoenca = value;
    }

    /**
     * Obtém o valor da propriedade indicadorAcidente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorAcidente() {
        return indicadorAcidente;
    }

    /**
     * Define o valor da propriedade indicadorAcidente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorAcidente(String value) {
        this.indicadorAcidente = value;
    }

}
