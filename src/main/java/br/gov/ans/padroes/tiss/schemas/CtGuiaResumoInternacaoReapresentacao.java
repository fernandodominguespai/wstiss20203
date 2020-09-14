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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_guiaResumoInternacaoReapresentacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaResumoInternacaoReapresentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="numeroGuiaSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="identificacaoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoGuia" minOccurs="0"/>
 *         &lt;element name="caraterInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_eletivaEmergencia"/>
 *         &lt;element name="acomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao"/>
 *         &lt;element name="dataHoraInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora"/>
 *         &lt;element name="dataHoraSaidaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora" minOccurs="0"/>
 *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
 *         &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_regimeInternacao"/>
 *         &lt;element name="internacaoObstetrica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_internacaoObstetrica" minOccurs="0"/>
 *         &lt;element name="obitoNeonatal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_obitoNeonatal" minOccurs="0"/>
 *         &lt;element name="diagnosticosSaidaInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoSaidaInternacao"/>
 *         &lt;element name="procedimentosRealizados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao" minOccurs="0"/>
 *         &lt;element name="OPMUtilizadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMUtilizadasRevisao" minOccurs="0"/>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesasRevisao" minOccurs="0"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoFaturamento"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotalServicos" minOccurs="0"/>
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
@XmlType(name = "ct_guiaResumoInternacaoReapresentacao", propOrder = {
    "identificacaoGuiaInternacao",
    "numeroGuiaSolicitacao",
    "dadosBeneficiario",
    "identificacaoExecutante",
    "dadosAutorizacao",
    "caraterInternacao",
    "acomodacao",
    "dataHoraInternacao",
    "dataHoraSaidaInternacao",
    "tipoInternacao",
    "regimeInternacao",
    "internacaoObstetrica",
    "obitoNeonatal",
    "diagnosticosSaidaInternacao",
    "procedimentosRealizados",
    "opmUtilizadas",
    "outrasDespesas",
    "tipoFaturamento",
    "valorTotal",
    "observacao"
})
public class CtGuiaResumoInternacaoReapresentacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuiaInternacao;
    protected String numeroGuiaSolicitacao;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtContratado identificacaoExecutante;
    protected CtAutorizacaoGuia dadosAutorizacao;
    @XmlElement(required = true)
    protected StEletivaEmergencia caraterInternacao;
    @XmlElement(required = true)
    protected String acomodacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataHoraInternacao;
    protected XMLGregorianCalendar dataHoraSaidaInternacao;
    @XmlElement(required = true)
    protected String tipoInternacao;
    @XmlElement(required = true)
    protected String regimeInternacao;
    protected CtInternacaoObstetrica internacaoObstetrica;
    protected CtObitoNeonatal obitoNeonatal;
    @XmlElement(required = true)
    protected CtDiagnosticoSaidaInternacao diagnosticosSaidaInternacao;
    protected CtProcedimentoRevisao procedimentosRealizados;
    @XmlElement(name = "OPMUtilizadas")
    protected CtOPMUtilizadasRevisao opmUtilizadas;
    protected CtOutrasDespesasRevisao outrasDespesas;
    @XmlElement(required = true)
    protected StTipoFaturamento tipoFaturamento;
    protected CtValorTotalServicos valorTotal;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuiaInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuiaInternacao() {
        return identificacaoGuiaInternacao;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuiaInternacao(CtCabecalhoGuia value) {
        this.identificacaoGuiaInternacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaSolicitacao() {
        return numeroGuiaSolicitacao;
    }

    /**
     * Define o valor da propriedade numeroGuiaSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaSolicitacao(String value) {
        this.numeroGuiaSolicitacao = value;
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
     * Obtém o valor da propriedade identificacaoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getIdentificacaoExecutante() {
        return identificacaoExecutante;
    }

    /**
     * Define o valor da propriedade identificacaoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setIdentificacaoExecutante(CtContratado value) {
        this.identificacaoExecutante = value;
    }

    /**
     * Obtém o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoGuia }
     *     
     */
    public CtAutorizacaoGuia getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoGuia }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoGuia value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade caraterInternacao.
     * 
     * @return
     *     possible object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public StEletivaEmergencia getCaraterInternacao() {
        return caraterInternacao;
    }

    /**
     * Define o valor da propriedade caraterInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public void setCaraterInternacao(StEletivaEmergencia value) {
        this.caraterInternacao = value;
    }

    /**
     * Obtém o valor da propriedade acomodacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcomodacao() {
        return acomodacao;
    }

    /**
     * Define o valor da propriedade acomodacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcomodacao(String value) {
        this.acomodacao = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraInternacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraInternacao() {
        return dataHoraInternacao;
    }

    /**
     * Define o valor da propriedade dataHoraInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraInternacao(XMLGregorianCalendar value) {
        this.dataHoraInternacao = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraSaidaInternacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSaidaInternacao() {
        return dataHoraSaidaInternacao;
    }

    /**
     * Define o valor da propriedade dataHoraSaidaInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSaidaInternacao(XMLGregorianCalendar value) {
        this.dataHoraSaidaInternacao = value;
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

    /**
     * Obtém o valor da propriedade regimeInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeInternacao() {
        return regimeInternacao;
    }

    /**
     * Define o valor da propriedade regimeInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeInternacao(String value) {
        this.regimeInternacao = value;
    }

    /**
     * Obtém o valor da propriedade internacaoObstetrica.
     * 
     * @return
     *     possible object is
     *     {@link CtInternacaoObstetrica }
     *     
     */
    public CtInternacaoObstetrica getInternacaoObstetrica() {
        return internacaoObstetrica;
    }

    /**
     * Define o valor da propriedade internacaoObstetrica.
     * 
     * @param value
     *     allowed object is
     *     {@link CtInternacaoObstetrica }
     *     
     */
    public void setInternacaoObstetrica(CtInternacaoObstetrica value) {
        this.internacaoObstetrica = value;
    }

    /**
     * Obtém o valor da propriedade obitoNeonatal.
     * 
     * @return
     *     possible object is
     *     {@link CtObitoNeonatal }
     *     
     */
    public CtObitoNeonatal getObitoNeonatal() {
        return obitoNeonatal;
    }

    /**
     * Define o valor da propriedade obitoNeonatal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtObitoNeonatal }
     *     
     */
    public void setObitoNeonatal(CtObitoNeonatal value) {
        this.obitoNeonatal = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticosSaidaInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnosticoSaidaInternacao }
     *     
     */
    public CtDiagnosticoSaidaInternacao getDiagnosticosSaidaInternacao() {
        return diagnosticosSaidaInternacao;
    }

    /**
     * Define o valor da propriedade diagnosticosSaidaInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnosticoSaidaInternacao }
     *     
     */
    public void setDiagnosticosSaidaInternacao(CtDiagnosticoSaidaInternacao value) {
        this.diagnosticosSaidaInternacao = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosRealizados.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoRevisao }
     *     
     */
    public CtProcedimentoRevisao getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    /**
     * Define o valor da propriedade procedimentosRealizados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoRevisao }
     *     
     */
    public void setProcedimentosRealizados(CtProcedimentoRevisao value) {
        this.procedimentosRealizados = value;
    }

    /**
     * Obtém o valor da propriedade opmUtilizadas.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMUtilizadasRevisao }
     *     
     */
    public CtOPMUtilizadasRevisao getOPMUtilizadas() {
        return opmUtilizadas;
    }

    /**
     * Define o valor da propriedade opmUtilizadas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMUtilizadasRevisao }
     *     
     */
    public void setOPMUtilizadas(CtOPMUtilizadasRevisao value) {
        this.opmUtilizadas = value;
    }

    /**
     * Obtém o valor da propriedade outrasDespesas.
     * 
     * @return
     *     possible object is
     *     {@link CtOutrasDespesasRevisao }
     *     
     */
    public CtOutrasDespesasRevisao getOutrasDespesas() {
        return outrasDespesas;
    }

    /**
     * Define o valor da propriedade outrasDespesas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOutrasDespesasRevisao }
     *     
     */
    public void setOutrasDespesas(CtOutrasDespesasRevisao value) {
        this.outrasDespesas = value;
    }

    /**
     * Obtém o valor da propriedade tipoFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link StTipoFaturamento }
     *     
     */
    public StTipoFaturamento getTipoFaturamento() {
        return tipoFaturamento;
    }

    /**
     * Define o valor da propriedade tipoFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link StTipoFaturamento }
     *     
     */
    public void setTipoFaturamento(StTipoFaturamento value) {
        this.tipoFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotalServicos }
     *     
     */
    public CtValorTotalServicos getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotalServicos }
     *     
     */
    public void setValorTotal(CtValorTotalServicos value) {
        this.valorTotal = value;
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

}
