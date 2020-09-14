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
 * <p>Classe Java de ct_guiaSP_SADTReapresentacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSP_SADTReapresentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaSADTSP" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoGuia" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante"/>
 *         &lt;element name="prestadorExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *                 &lt;sequence>
 *                   &lt;element name="profissionalExecutanteCompl" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
 *                           &lt;sequence>
 *                             &lt;element name="codigoProfissionalCompl" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissionalCompl" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicacaoClinica" minOccurs="0"/>
 *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_eletivaEmergencia"/>
 *         &lt;element name="dataHoraAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora" minOccurs="0"/>
 *         &lt;element name="diagnosticoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoAtendimento" minOccurs="0"/>
 *         &lt;element name="tipoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoSaidaGuiaSADT"/>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAtendimento"/>
 *         &lt;element name="procedimentosRealizados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao" minOccurs="0"/>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesasRevisao" minOccurs="0"/>
 *         &lt;element name="OPMUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMUtilizadasRevisao" minOccurs="0"/>
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
@XmlType(name = "ct_guiaSP_SADTReapresentacao", propOrder = {
    "identificacaoGuiaSADTSP",
    "numeroGuiaPrincipal",
    "dadosAutorizacao",
    "dadosBeneficiario",
    "dadosSolicitante",
    "prestadorExecutante",
    "indicacaoClinica",
    "caraterAtendimento",
    "dataHoraAtendimento",
    "diagnosticoAtendimento",
    "tipoSaida",
    "tipoAtendimento",
    "procedimentosRealizados",
    "outrasDespesas",
    "opmUtilizada",
    "valorTotal",
    "observacao"
})
public class CtGuiaSPSADTReapresentacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuiaSADTSP;
    protected String numeroGuiaPrincipal;
    protected CtAutorizacaoGuia dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected CtGuiaSPSADTReapresentacao.PrestadorExecutante prestadorExecutante;
    protected String indicacaoClinica;
    @XmlElement(required = true)
    protected StEletivaEmergencia caraterAtendimento;
    protected XMLGregorianCalendar dataHoraAtendimento;
    protected CtDiagnosticoAtendimento diagnosticoAtendimento;
    @XmlElement(required = true)
    protected String tipoSaida;
    @XmlElement(required = true)
    protected String tipoAtendimento;
    protected CtProcedimentoRevisao procedimentosRealizados;
    protected CtOutrasDespesasRevisao outrasDespesas;
    @XmlElement(name = "OPMUtilizada")
    protected CtOPMUtilizadasRevisao opmUtilizada;
    protected CtValorTotalServicos valorTotal;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoGuiaSADTSP.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuiaSADTSP() {
        return identificacaoGuiaSADTSP;
    }

    /**
     * Define o valor da propriedade identificacaoGuiaSADTSP.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuiaSADTSP(CtCabecalhoGuia value) {
        this.identificacaoGuiaSADTSP = value;
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
     *     {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante }
     *     
     */
    public CtGuiaSPSADTReapresentacao.PrestadorExecutante getPrestadorExecutante() {
        return prestadorExecutante;
    }

    /**
     * Define o valor da propriedade prestadorExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante }
     *     
     */
    public void setPrestadorExecutante(CtGuiaSPSADTReapresentacao.PrestadorExecutante value) {
        this.prestadorExecutante = value;
    }

    /**
     * Obtém o valor da propriedade indicacaoClinica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoClinica() {
        return indicacaoClinica;
    }

    /**
     * Define o valor da propriedade indicacaoClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoClinica(String value) {
        this.indicacaoClinica = value;
    }

    /**
     * Obtém o valor da propriedade caraterAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public StEletivaEmergencia getCaraterAtendimento() {
        return caraterAtendimento;
    }

    /**
     * Define o valor da propriedade caraterAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public void setCaraterAtendimento(StEletivaEmergencia value) {
        this.caraterAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    /**
     * Define o valor da propriedade dataHoraAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraAtendimento(XMLGregorianCalendar value) {
        this.dataHoraAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnosticoAtendimento }
     *     
     */
    public CtDiagnosticoAtendimento getDiagnosticoAtendimento() {
        return diagnosticoAtendimento;
    }

    /**
     * Define o valor da propriedade diagnosticoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnosticoAtendimento }
     *     
     */
    public void setDiagnosticoAtendimento(CtDiagnosticoAtendimento value) {
        this.diagnosticoAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade tipoSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSaida() {
        return tipoSaida;
    }

    /**
     * Define o valor da propriedade tipoSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSaida(String value) {
        this.tipoSaida = value;
    }

    /**
     * Obtém o valor da propriedade tipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Define o valor da propriedade tipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
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
     * Obtém o valor da propriedade opmUtilizada.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMUtilizadasRevisao }
     *     
     */
    public CtOPMUtilizadasRevisao getOPMUtilizada() {
        return opmUtilizada;
    }

    /**
     * Define o valor da propriedade opmUtilizada.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMUtilizadasRevisao }
     *     
     */
    public void setOPMUtilizada(CtOPMUtilizadasRevisao value) {
        this.opmUtilizada = value;
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
     *       &lt;sequence>
     *         &lt;element name="profissionalExecutanteCompl" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
     *                 &lt;sequence>
     *                   &lt;element name="codigoProfissionalCompl" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissionalCompl" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profissionalExecutanteCompl"
    })
    public static class PrestadorExecutante
        extends CtContratado
    {

        protected CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl profissionalExecutanteCompl;

        /**
         * Obtém o valor da propriedade profissionalExecutanteCompl.
         * 
         * @return
         *     possible object is
         *     {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl }
         *     
         */
        public CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl getProfissionalExecutanteCompl() {
            return profissionalExecutanteCompl;
        }

        /**
         * Define o valor da propriedade profissionalExecutanteCompl.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl }
         *     
         */
        public void setProfissionalExecutanteCompl(CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl value) {
            this.profissionalExecutanteCompl = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
         *       &lt;sequence>
         *         &lt;element name="codigoProfissionalCompl" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissionalCompl" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "codigoProfissionalCompl"
        })
        public static class ProfissionalExecutanteCompl
            extends CtProfissionalExecutante
        {

            protected CtIdentificacaoProfissionalCompl codigoProfissionalCompl;

            /**
             * Obtém o valor da propriedade codigoProfissionalCompl.
             * 
             * @return
             *     possible object is
             *     {@link CtIdentificacaoProfissionalCompl }
             *     
             */
            public CtIdentificacaoProfissionalCompl getCodigoProfissionalCompl() {
                return codigoProfissionalCompl;
            }

            /**
             * Define o valor da propriedade codigoProfissionalCompl.
             * 
             * @param value
             *     allowed object is
             *     {@link CtIdentificacaoProfissionalCompl }
             *     
             */
            public void setCodigoProfissionalCompl(CtIdentificacaoProfissionalCompl value) {
                this.codigoProfissionalCompl = value;
            }

        }

    }

}
