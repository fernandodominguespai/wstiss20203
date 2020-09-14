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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_guiaSolicitacaoSP_SADT complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSolicitacaoSP_SADT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaSolicitacaoSADTSP" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante"/>
 *         &lt;element name="prestadorExecutante" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="caraterSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_eletivaEmergencia"/>
 *         &lt;element name="dataHoraSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora"/>
 *         &lt;element name="Diagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico" minOccurs="0"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicacaoClinica" minOccurs="0"/>
 *         &lt;element name="procedimentosSolicitados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosSolicitados"/>
 *         &lt;element name="opmSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMSolicitadas" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaSolicitacaoSP_SADT", propOrder = {
    "identificacaoGuiaSolicitacaoSADTSP",
    "numeroGuiaPrincipal",
    "dadosBeneficiario",
    "dadosSolicitante",
    "prestadorExecutante",
    "caraterSolicitacao",
    "dataHoraSolicitacao",
    "diagnostico",
    "indicacaoClinica",
    "procedimentosSolicitados",
    "opmSolicitada",
    "observacao"
})
public class CtGuiaSolicitacaoSPSADT {

    @XmlElement(required = true)
    protected CtCabecalhoSolicitacao identificacaoGuiaSolicitacaoSADTSP;
    protected String numeroGuiaPrincipal;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtSolicitante dadosSolicitante;
    protected CtGuiaSolicitacaoSPSADT.PrestadorExecutante prestadorExecutante;
    @XmlElement(required = true)
    protected StEletivaEmergencia caraterSolicitacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataHoraSolicitacao;
    @XmlElementRef(name = "Diagnostico", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CtDiagnostico> diagnostico;
    @XmlElementRef(name = "indicacaoClinica", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicacaoClinica;
    @XmlElement(required = true)
    protected CtProcedimentosSolicitados procedimentosSolicitados;
    protected CtOPMSolicitadas opmSolicitada;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuiaSolicitacaoSADTSP.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public CtCabecalhoSolicitacao getIdentificacaoGuiaSolicitacaoSADTSP() {
        return identificacaoGuiaSolicitacaoSADTSP;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaSolicitacaoSADTSP.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public void setIdentificacaoGuiaSolicitacaoSADTSP(CtCabecalhoSolicitacao value) {
        this.identificacaoGuiaSolicitacaoSADTSP = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitante }
     *     
     */
    public CtSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Define o valor da propriedade dadosSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitante }
     *     
     */
    public void setDadosSolicitante(CtSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade prestadorExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaSolicitacaoSPSADT.PrestadorExecutante }
     *     
     */
    public CtGuiaSolicitacaoSPSADT.PrestadorExecutante getPrestadorExecutante() {
        return prestadorExecutante;
    }

    /**
     * Define o valor da propriedade prestadorExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicitacaoSPSADT.PrestadorExecutante }
     *     
     */
    public void setPrestadorExecutante(CtGuiaSolicitacaoSPSADT.PrestadorExecutante value) {
        this.prestadorExecutante = value;
    }

    /**
     * Obtém o valor da propriedade caraterSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public StEletivaEmergencia getCaraterSolicitacao() {
        return caraterSolicitacao;
    }

    /**
     * Define o valor da propriedade caraterSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public void setCaraterSolicitacao(StEletivaEmergencia value) {
        this.caraterSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSolicitacao() {
        return dataHoraSolicitacao;
    }

    /**
     * Define o valor da propriedade dataHoraSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSolicitacao(XMLGregorianCalendar value) {
        this.dataHoraSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade diagnostico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnostico }{@code >}
     *     
     */
    public JAXBElement<CtDiagnostico> getDiagnostico() {
        return diagnostico;
    }

    /**
     * Define o valor da propriedade diagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnostico }{@code >}
     *     
     */
    public void setDiagnostico(JAXBElement<CtDiagnostico> value) {
        this.diagnostico = value;
    }

    /**
     * Obtém o valor da propriedade indicacaoClinica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicacaoClinica() {
        return indicacaoClinica;
    }

    /**
     * Define o valor da propriedade indicacaoClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicacaoClinica(JAXBElement<String> value) {
        this.indicacaoClinica = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosSolicitados.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public CtProcedimentosSolicitados getProcedimentosSolicitados() {
        return procedimentosSolicitados;
    }

    /**
     * Define o valor da propriedade procedimentosSolicitados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public void setProcedimentosSolicitados(CtProcedimentosSolicitados value) {
        this.procedimentosSolicitados = value;
    }

    /**
     * Obtém o valor da propriedade opmSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public CtOPMSolicitadas getOpmSolicitada() {
        return opmSolicitada;
    }

    /**
     * Define o valor da propriedade opmSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public void setOpmSolicitada(CtOPMSolicitadas value) {
        this.opmSolicitada = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrestadorExecutante
        extends CtContratado
    {


    }

}
