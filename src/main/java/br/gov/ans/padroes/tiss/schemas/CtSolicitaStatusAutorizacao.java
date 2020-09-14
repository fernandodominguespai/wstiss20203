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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_solicitaStatusAutorizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_solicitaStatusAutorizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoAutorizacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoSolicitacao" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
 *                           &lt;sequence>
 *                             &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
 *                             &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
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
 *         &lt;element name="dataSolicitaStatus" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_solicitaStatusAutorizacao", propOrder = {
    "identificacaoAutorizacao",
    "dataSolicitaStatus"
})
public class CtSolicitaStatusAutorizacao {

    @XmlElement(required = true)
    protected CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao identificacaoAutorizacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitaStatus;

    /**
     * Obtém o valor da propriedade identificacaoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao }
     *     
     */
    public CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao getIdentificacaoAutorizacao() {
        return identificacaoAutorizacao;
    }

    /**
     * Define o valor da propriedade identificacaoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao }
     *     
     */
    public void setIdentificacaoAutorizacao(CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao value) {
        this.identificacaoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataSolicitaStatus.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitaStatus() {
        return dataSolicitaStatus;
    }

    /**
     * Define o valor da propriedade dataSolicitaStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitaStatus(XMLGregorianCalendar value) {
        this.dataSolicitaStatus = value;
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
     *         &lt;element name="identificacaoSolicitacao" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
     *                 &lt;sequence>
     *                   &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
     *                   &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
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
        "identificacaoSolicitacao"
    })
    public static class IdentificacaoAutorizacao {

        @XmlElement(required = true)
        protected List<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao> identificacaoSolicitacao;

        /**
         * Gets the value of the identificacaoSolicitacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificacaoSolicitacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificacaoSolicitacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao }
         * 
         * 
         */
        public List<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao> getIdentificacaoSolicitacao() {
            if (identificacaoSolicitacao == null) {
                identificacaoSolicitacao = new ArrayList<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao>();
            }
            return this.identificacaoSolicitacao;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
         *       &lt;sequence>
         *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
         *         &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
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
            "profissionalSolicitante",
            "identificacaoBeneficiario"
        })
        public static class IdentificacaoSolicitacao
            extends CtCabecalhoSolicitacao
        {

            @XmlElement(required = true)
            protected CtContratadoSolicitante profissionalSolicitante;
            protected CtBeneficiario identificacaoBeneficiario;

            /**
             * Obtém o valor da propriedade profissionalSolicitante.
             * 
             * @return
             *     possible object is
             *     {@link CtContratadoSolicitante }
             *     
             */
            public CtContratadoSolicitante getProfissionalSolicitante() {
                return profissionalSolicitante;
            }

            /**
             * Define o valor da propriedade profissionalSolicitante.
             * 
             * @param value
             *     allowed object is
             *     {@link CtContratadoSolicitante }
             *     
             */
            public void setProfissionalSolicitante(CtContratadoSolicitante value) {
                this.profissionalSolicitante = value;
            }

            /**
             * Obtém o valor da propriedade identificacaoBeneficiario.
             * 
             * @return
             *     possible object is
             *     {@link CtBeneficiario }
             *     
             */
            public CtBeneficiario getIdentificacaoBeneficiario() {
                return identificacaoBeneficiario;
            }

            /**
             * Define o valor da propriedade identificacaoBeneficiario.
             * 
             * @param value
             *     allowed object is
             *     {@link CtBeneficiario }
             *     
             */
            public void setIdentificacaoBeneficiario(CtBeneficiario value) {
                this.identificacaoBeneficiario = value;
            }

        }

    }

}
