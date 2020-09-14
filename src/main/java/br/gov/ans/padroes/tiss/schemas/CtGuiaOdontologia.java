//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_guiaOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuiaOdonto"/>
 *         &lt;element name="dadosBeneficiario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario">
 *                 &lt;sequence>
 *                   &lt;element name="nomeEmpresa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
 *                   &lt;element name="numeroTelefone" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroTel" minOccurs="0"/>
 *                   &lt;element name="nomeTitular" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosContratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosContratado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *                           &lt;sequence>
 *                             &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dadosExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosExecutados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoExecutado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontologia">
 *                           &lt;sequence>
 *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="quantidadeTotalUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesas" minOccurs="0"/>
 *         &lt;element name="dadosAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_atendimentoOdontologia"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoFaturamento" minOccurs="0"/>
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
@XmlType(name = "ct_guiaOdontologia", propOrder = {
    "cabecalhoGuia",
    "dadosBeneficiario",
    "dadosContratadoExecutante",
    "procedimentosExecutados",
    "outrasDespesas",
    "dadosAtendimento",
    "tipoFaturamento",
    "observacao"
})
public class CtGuiaOdontologia {

    @XmlElement(required = true)
    protected CtCabecalhoGuiaOdonto cabecalhoGuia;
    @XmlElement(required = true)
    protected CtGuiaOdontologia.DadosBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtGuiaOdontologia.DadosContratadoExecutante dadosContratadoExecutante;
    @XmlElement(required = true)
    protected CtGuiaOdontologia.ProcedimentosExecutados procedimentosExecutados;
    protected CtOutrasDespesas outrasDespesas;
    @XmlElement(required = true)
    protected CtAtendimentoOdontologia dadosAtendimento;
    protected StTipoFaturamento tipoFaturamento;
    protected String observacao;

    /**
     * Obtém o valor da propriedade cabecalhoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuiaOdonto }
     *     
     */
    public CtCabecalhoGuiaOdonto getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Define o valor da propriedade cabecalhoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuiaOdonto }
     *     
     */
    public void setCabecalhoGuia(CtCabecalhoGuiaOdonto value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaOdontologia.DadosBeneficiario }
     *     
     */
    public CtGuiaOdontologia.DadosBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaOdontologia.DadosBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtGuiaOdontologia.DadosBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosContratadoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaOdontologia.DadosContratadoExecutante }
     *     
     */
    public CtGuiaOdontologia.DadosContratadoExecutante getDadosContratadoExecutante() {
        return dadosContratadoExecutante;
    }

    /**
     * Define o valor da propriedade dadosContratadoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaOdontologia.DadosContratadoExecutante }
     *     
     */
    public void setDadosContratadoExecutante(CtGuiaOdontologia.DadosContratadoExecutante value) {
        this.dadosContratadoExecutante = value;
    }

    /**
     * Obtém o valor da propriedade procedimentosExecutados.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaOdontologia.ProcedimentosExecutados }
     *     
     */
    public CtGuiaOdontologia.ProcedimentosExecutados getProcedimentosExecutados() {
        return procedimentosExecutados;
    }

    /**
     * Define o valor da propriedade procedimentosExecutados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaOdontologia.ProcedimentosExecutados }
     *     
     */
    public void setProcedimentosExecutados(CtGuiaOdontologia.ProcedimentosExecutados value) {
        this.procedimentosExecutados = value;
    }

    /**
     * Obtém o valor da propriedade outrasDespesas.
     * 
     * @return
     *     possible object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public CtOutrasDespesas getOutrasDespesas() {
        return outrasDespesas;
    }

    /**
     * Define o valor da propriedade outrasDespesas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public void setOutrasDespesas(CtOutrasDespesas value) {
        this.outrasDespesas = value;
    }

    /**
     * Obtém o valor da propriedade dadosAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtAtendimentoOdontologia }
     *     
     */
    public CtAtendimentoOdontologia getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Define o valor da propriedade dadosAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAtendimentoOdontologia }
     *     
     */
    public void setDadosAtendimento(CtAtendimentoOdontologia value) {
        this.dadosAtendimento = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario">
     *       &lt;sequence>
     *         &lt;element name="nomeEmpresa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
     *         &lt;element name="numeroTelefone" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroTel" minOccurs="0"/>
     *         &lt;element name="nomeTitular" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
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
        "nomeEmpresa",
        "numeroTelefone",
        "nomeTitular"
    })
    public static class DadosBeneficiario
        extends CtBeneficiario
    {

        protected String nomeEmpresa;
        protected String numeroTelefone;
        protected String nomeTitular;

        /**
         * Obtém o valor da propriedade nomeEmpresa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeEmpresa() {
            return nomeEmpresa;
        }

        /**
         * Define o valor da propriedade nomeEmpresa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeEmpresa(String value) {
            this.nomeEmpresa = value;
        }

        /**
         * Obtém o valor da propriedade numeroTelefone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroTelefone() {
            return numeroTelefone;
        }

        /**
         * Define o valor da propriedade numeroTelefone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroTelefone(String value) {
            this.numeroTelefone = value;
        }

        /**
         * Obtém o valor da propriedade nomeTitular.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeTitular() {
            return nomeTitular;
        }

        /**
         * Define o valor da propriedade nomeTitular.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeTitular(String value) {
            this.nomeTitular = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dadosContratado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
     *                 &lt;sequence>
     *                   &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dadosExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dadosContratado",
        "dadosExecutante"
    })
    public static class DadosContratadoExecutante {

        @XmlElement(required = true)
        protected CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado dadosContratado;
        protected CtProfissionalExecutante dadosExecutante;

        /**
         * Obtém o valor da propriedade dadosContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado }
         *     
         */
        public CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Define o valor da propriedade dadosContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado }
         *     
         */
        public void setDadosContratado(CtGuiaOdontologia.DadosContratadoExecutante.DadosContratado value) {
            this.dadosContratado = value;
        }

        /**
         * Obtém o valor da propriedade dadosExecutante.
         * 
         * @return
         *     possible object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public CtProfissionalExecutante getDadosExecutante() {
            return dadosExecutante;
        }

        /**
         * Define o valor da propriedade dadosExecutante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public void setDadosExecutante(CtProfissionalExecutante value) {
            this.dadosExecutante = value;
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
         *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
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
            "conselhoProfissional"
        })
        public static class DadosContratado
            extends CtContratado
        {

            @XmlElement(required = true)
            protected CtConselhoProfissional conselhoProfissional;

            /**
             * Obtém o valor da propriedade conselhoProfissional.
             * 
             * @return
             *     possible object is
             *     {@link CtConselhoProfissional }
             *     
             */
            public CtConselhoProfissional getConselhoProfissional() {
                return conselhoProfissional;
            }

            /**
             * Define o valor da propriedade conselhoProfissional.
             * 
             * @param value
             *     allowed object is
             *     {@link CtConselhoProfissional }
             *     
             */
            public void setConselhoProfissional(CtConselhoProfissional value) {
                this.conselhoProfissional = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="procedimentoExecutado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontologia">
     *                 &lt;sequence>
     *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="quantidadeTotalUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "procedimentoExecutado",
        "quantidadeTotalUS",
        "valorTotal",
        "totalFranquiaCoparticipacao"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected List<CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado> procedimentoExecutado;
        protected BigDecimal quantidadeTotalUS;
        protected BigDecimal valorTotal;
        protected BigDecimal totalFranquiaCoparticipacao;

        /**
         * Gets the value of the procedimentoExecutado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoExecutado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoExecutado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado }
         * 
         * 
         */
        public List<CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado> getProcedimentoExecutado() {
            if (procedimentoExecutado == null) {
                procedimentoExecutado = new ArrayList<CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado>();
            }
            return this.procedimentoExecutado;
        }

        /**
         * Obtém o valor da propriedade quantidadeTotalUS.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQuantidadeTotalUS() {
            return quantidadeTotalUS;
        }

        /**
         * Define o valor da propriedade quantidadeTotalUS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQuantidadeTotalUS(BigDecimal value) {
            this.quantidadeTotalUS = value;
        }

        /**
         * Obtém o valor da propriedade valorTotal.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotal() {
            return valorTotal;
        }

        /**
         * Define o valor da propriedade valorTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotal(BigDecimal value) {
            this.valorTotal = value;
        }

        /**
         * Obtém o valor da propriedade totalFranquiaCoparticipacao.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalFranquiaCoparticipacao() {
            return totalFranquiaCoparticipacao;
        }

        /**
         * Define o valor da propriedade totalFranquiaCoparticipacao.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalFranquiaCoparticipacao(BigDecimal value) {
            this.totalFranquiaCoparticipacao = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontologia">
         *       &lt;sequence>
         *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
            "dataRealizacao"
        })
        public static class ProcedimentoExecutado
            extends CtProcedimentoOdontologia
        {

            @XmlElement(required = true)
            protected XMLGregorianCalendar dataRealizacao;

            /**
             * Obtém o valor da propriedade dataRealizacao.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDataRealizacao() {
                return dataRealizacao;
            }

            /**
             * Define o valor da propriedade dataRealizacao.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDataRealizacao(XMLGregorianCalendar value) {
                this.dataRealizacao = value;
            }

        }

    }

}
