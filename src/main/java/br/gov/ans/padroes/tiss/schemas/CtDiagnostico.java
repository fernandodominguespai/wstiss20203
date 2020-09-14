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
 * <p>Classe Java de ct_diagnostico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tabelasDiagnostico"/>
 *         &lt;element name="codigoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoDiagnostico"/>
 *         &lt;element name="descricaoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnostico", propOrder = {
    "nomeTabela",
    "codigoDiagnostico",
    "descricaoDiagnostico"
})
public class CtDiagnostico {

    @XmlElement(required = true)
    protected StTabelasDiagnostico nomeTabela;
    @XmlElement(required = true)
    protected String codigoDiagnostico;
    @XmlElementRef(name = "descricaoDiagnostico", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricaoDiagnostico;

    /**
     * Obtém o valor da propriedade nomeTabela.
     * 
     * @return
     *     possible object is
     *     {@link StTabelasDiagnostico }
     *     
     */
    public StTabelasDiagnostico getNomeTabela() {
        return nomeTabela;
    }

    /**
     * Define o valor da propriedade nomeTabela.
     * 
     * @param value
     *     allowed object is
     *     {@link StTabelasDiagnostico }
     *     
     */
    public void setNomeTabela(StTabelasDiagnostico value) {
        this.nomeTabela = value;
    }

    /**
     * Obtém o valor da propriedade codigoDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    /**
     * Define o valor da propriedade codigoDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDiagnostico(String value) {
        this.codigoDiagnostico = value;
    }

    /**
     * Obtém o valor da propriedade descricaoDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricaoDiagnostico() {
        return descricaoDiagnostico;
    }

    /**
     * Define o valor da propriedade descricaoDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricaoDiagnostico(JAXBElement<String> value) {
        this.descricaoDiagnostico = value;
    }

}
