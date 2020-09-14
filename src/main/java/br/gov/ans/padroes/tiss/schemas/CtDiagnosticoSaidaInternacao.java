//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_diagnosticoSaidaInternacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnosticoSaidaInternacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnosticoPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico" minOccurs="0"/>
 *         &lt;element name="indicadorAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicadorAcidente" minOccurs="0"/>
 *         &lt;element name="diagnosticosSecundarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
 *         &lt;element name="motivoSaidaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_motivoSaida"/>
 *         &lt;element name="obito" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_obitoInternacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnosticoSaidaInternacao", propOrder = {
    "diagnosticoPrincipal",
    "indicadorAcidente",
    "diagnosticosSecundarios",
    "motivoSaidaInternacao",
    "obito"
})
public class CtDiagnosticoSaidaInternacao {

    protected CtDiagnostico diagnosticoPrincipal;
    protected String indicadorAcidente;
    protected CtDiagnosticosSecundarios diagnosticosSecundarios;
    @XmlElement(required = true)
    protected String motivoSaidaInternacao;
    protected List<CtObitoInternacao> obito;

    /**
     * Obtém o valor da propriedade diagnosticoPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnostico }
     *     
     */
    public CtDiagnostico getDiagnosticoPrincipal() {
        return diagnosticoPrincipal;
    }

    /**
     * Define o valor da propriedade diagnosticoPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnostico }
     *     
     */
    public void setDiagnosticoPrincipal(CtDiagnostico value) {
        this.diagnosticoPrincipal = value;
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

    /**
     * Obtém o valor da propriedade diagnosticosSecundarios.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnosticosSecundarios }
     *     
     */
    public CtDiagnosticosSecundarios getDiagnosticosSecundarios() {
        return diagnosticosSecundarios;
    }

    /**
     * Define o valor da propriedade diagnosticosSecundarios.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnosticosSecundarios }
     *     
     */
    public void setDiagnosticosSecundarios(CtDiagnosticosSecundarios value) {
        this.diagnosticosSecundarios = value;
    }

    /**
     * Obtém o valor da propriedade motivoSaidaInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSaidaInternacao() {
        return motivoSaidaInternacao;
    }

    /**
     * Define o valor da propriedade motivoSaidaInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSaidaInternacao(String value) {
        this.motivoSaidaInternacao = value;
    }

    /**
     * Gets the value of the obito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtObitoInternacao }
     * 
     * 
     */
    public List<CtObitoInternacao> getObito() {
        if (obito == null) {
            obito = new ArrayList<CtObitoInternacao>();
        }
        return this.obito;
    }

}
