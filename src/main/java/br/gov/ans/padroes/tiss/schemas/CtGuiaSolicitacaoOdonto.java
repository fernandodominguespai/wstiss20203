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
 * <p>Classe Java de ct_guiaSolicitacaoOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSolicitacaoOdonto">
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
 *         &lt;element name="dadosSolicitante">
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
 *                   &lt;element name="dadosProfissional" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="planoTratamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontologia">
 *                           &lt;sequence>
 *                             &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_atendimentoOdonto" minOccurs="0"/>
 *         &lt;element name="dataTerminoTratamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
@XmlType(name = "ct_guiaSolicitacaoOdonto", propOrder = {
    "cabecalhoGuia",
    "dadosBeneficiario",
    "dadosSolicitante",
    "planoTratamento",
    "tipoAtendimento",
    "dataTerminoTratamento",
    "observacao"
})
public class CtGuiaSolicitacaoOdonto {

    @XmlElement(required = true)
    protected CtCabecalhoGuiaOdonto cabecalhoGuia;
    @XmlElement(required = true)
    protected CtGuiaSolicitacaoOdonto.DadosBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtGuiaSolicitacaoOdonto.DadosSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected CtGuiaSolicitacaoOdonto.PlanoTratamento planoTratamento;
    protected String tipoAtendimento;
    protected XMLGregorianCalendar dataTerminoTratamento;
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
     *     {@link CtGuiaSolicitacaoOdonto.DadosBeneficiario }
     *     
     */
    public CtGuiaSolicitacaoOdonto.DadosBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicitacaoOdonto.DadosBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtGuiaSolicitacaoOdonto.DadosBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante }
     *     
     */
    public CtGuiaSolicitacaoOdonto.DadosSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Define o valor da propriedade dadosSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante }
     *     
     */
    public void setDadosSolicitante(CtGuiaSolicitacaoOdonto.DadosSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade planoTratamento.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaSolicitacaoOdonto.PlanoTratamento }
     *     
     */
    public CtGuiaSolicitacaoOdonto.PlanoTratamento getPlanoTratamento() {
        return planoTratamento;
    }

    /**
     * Define o valor da propriedade planoTratamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicitacaoOdonto.PlanoTratamento }
     *     
     */
    public void setPlanoTratamento(CtGuiaSolicitacaoOdonto.PlanoTratamento value) {
        this.planoTratamento = value;
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
     * Obtém o valor da propriedade dataTerminoTratamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTerminoTratamento() {
        return dataTerminoTratamento;
    }

    /**
     * Define o valor da propriedade dataTerminoTratamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTerminoTratamento(XMLGregorianCalendar value) {
        this.dataTerminoTratamento = value;
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
     *         &lt;element name="dadosProfissional" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "dadosProfissional"
    })
    public static class DadosSolicitante {

        @XmlElement(required = true)
        protected CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado dadosContratado;
        protected CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional dadosProfissional;

        /**
         * Obtém o valor da propriedade dadosContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado }
         *     
         */
        public CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Define o valor da propriedade dadosContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado }
         *     
         */
        public void setDadosContratado(CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosContratado value) {
            this.dadosContratado = value;
        }

        /**
         * Obtém o valor da propriedade dadosProfissional.
         * 
         * @return
         *     possible object is
         *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional }
         *     
         */
        public CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional getDadosProfissional() {
            return dadosProfissional;
        }

        /**
         * Define o valor da propriedade dadosProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional }
         *     
         */
        public void setDadosProfissional(CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional value) {
            this.dadosProfissional = value;
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


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DadosProfissional
            extends CtProfissionalExecutante
        {


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
     *         &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoOdontologia">
     *                 &lt;sequence>
     *                   &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "procedimentoSolicitado"
    })
    public static class PlanoTratamento {

        @XmlElement(required = true)
        protected List<CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado> procedimentoSolicitado;

        /**
         * Gets the value of the procedimentoSolicitado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoSolicitado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoSolicitado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado }
         * 
         * 
         */
        public List<CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado> getProcedimentoSolicitado() {
            if (procedimentoSolicitado == null) {
                procedimentoSolicitado = new ArrayList<CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado>();
            }
            return this.procedimentoSolicitado;
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
         *         &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
            "totalFranquiaCoparticipacao"
        })
        public static class ProcedimentoSolicitado
            extends CtProcedimentoOdontologia
        {

            protected BigDecimal totalFranquiaCoparticipacao;

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

        }

    }

}
