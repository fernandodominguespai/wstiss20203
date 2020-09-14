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


/**
 * <p>Classe Java de ct_anexoSituacaoInicial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_anexoSituacaoInicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoAnexoOdonto"/>
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
 *         &lt;element name="situacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoInicial"/>
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
@XmlType(name = "ct_anexoSituacaoInicial", propOrder = {
    "cabecalhoAnexoGuia",
    "dadosBeneficiario",
    "dadosContratadoExecutante",
    "situacaoInicial",
    "observacao"
})
public class CtAnexoSituacaoInicial {

    @XmlElement(required = true)
    protected CtCabecalhoAnexoOdonto cabecalhoAnexoGuia;
    @XmlElement(required = true)
    protected CtAnexoSituacaoInicial.DadosBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtAnexoSituacaoInicial.DadosContratadoExecutante dadosContratadoExecutante;
    @XmlElement(required = true)
    protected CtSituacaoInicial situacaoInicial;
    protected String observacao;

    /**
     * Obtém o valor da propriedade cabecalhoAnexoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoAnexoOdonto }
     *     
     */
    public CtCabecalhoAnexoOdonto getCabecalhoAnexoGuia() {
        return cabecalhoAnexoGuia;
    }

    /**
     * Define o valor da propriedade cabecalhoAnexoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoAnexoOdonto }
     *     
     */
    public void setCabecalhoAnexoGuia(CtCabecalhoAnexoOdonto value) {
        this.cabecalhoAnexoGuia = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoSituacaoInicial.DadosBeneficiario }
     *     
     */
    public CtAnexoSituacaoInicial.DadosBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoSituacaoInicial.DadosBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtAnexoSituacaoInicial.DadosBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade dadosContratadoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoSituacaoInicial.DadosContratadoExecutante }
     *     
     */
    public CtAnexoSituacaoInicial.DadosContratadoExecutante getDadosContratadoExecutante() {
        return dadosContratadoExecutante;
    }

    /**
     * Define o valor da propriedade dadosContratadoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoSituacaoInicial.DadosContratadoExecutante }
     *     
     */
    public void setDadosContratadoExecutante(CtAnexoSituacaoInicial.DadosContratadoExecutante value) {
        this.dadosContratadoExecutante = value;
    }

    /**
     * Obtém o valor da propriedade situacaoInicial.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoInicial }
     *     
     */
    public CtSituacaoInicial getSituacaoInicial() {
        return situacaoInicial;
    }

    /**
     * Define o valor da propriedade situacaoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoInicial }
     *     
     */
    public void setSituacaoInicial(CtSituacaoInicial value) {
        this.situacaoInicial = value;
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
        protected CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado dadosContratado;
        protected CtProfissionalExecutante dadosExecutante;

        /**
         * Obtém o valor da propriedade dadosContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado }
         *     
         */
        public CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Define o valor da propriedade dadosContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado }
         *     
         */
        public void setDadosContratado(CtAnexoSituacaoInicial.DadosContratadoExecutante.DadosContratado value) {
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

}
