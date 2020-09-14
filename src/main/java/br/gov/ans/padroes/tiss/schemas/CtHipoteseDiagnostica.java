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
 * <p>Classe Java de ct_hipoteseDiagnostica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_hipoteseDiagnostica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CIDPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoGuia" minOccurs="0"/>
 *         &lt;element name="diagnosticosSecundarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_hipoteseDiagnostica", propOrder = {
    "cidPrincipal",
    "diagnosticosSecundarios"
})
public class CtHipoteseDiagnostica {

    @XmlElement(name = "CIDPrincipal")
    protected CtDiagnosticoGuia cidPrincipal;
    @XmlElementRef(name = "diagnosticosSecundarios", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CtDiagnosticosSecundarios> diagnosticosSecundarios;

    /**
     * Obtém o valor da propriedade cidPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnosticoGuia }
     *     
     */
    public CtDiagnosticoGuia getCIDPrincipal() {
        return cidPrincipal;
    }

    /**
     * Define o valor da propriedade cidPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnosticoGuia }
     *     
     */
    public void setCIDPrincipal(CtDiagnosticoGuia value) {
        this.cidPrincipal = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticosSecundarios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnosticosSecundarios }{@code >}
     *     
     */
    public JAXBElement<CtDiagnosticosSecundarios> getDiagnosticosSecundarios() {
        return diagnosticosSecundarios;
    }

    /**
     * Define o valor da propriedade diagnosticosSecundarios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnosticosSecundarios }{@code >}
     *     
     */
    public void setDiagnosticosSecundarios(JAXBElement<CtDiagnosticosSecundarios> value) {
        this.diagnosticosSecundarios = value;
    }

}
