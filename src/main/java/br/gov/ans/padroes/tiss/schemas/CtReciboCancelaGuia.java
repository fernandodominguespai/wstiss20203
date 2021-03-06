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
 * <p>Classe Java de ct_reciboCancelaGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboCancelaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="guiasCanceladas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosGuia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia">
 *                           &lt;sequence>
 *                             &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusCancelamento"/>
 *                             &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboCancelaGuia", propOrder = {
    "operadora",
    "guiasCanceladas"
})
public class CtReciboCancelaGuia {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora operadora;
    @XmlElement(required = true)
    protected CtReciboCancelaGuia.GuiasCanceladas guiasCanceladas;

    /**
     * Obtém o valor da propriedade operadora.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getOperadora() {
        return operadora;
    }

    /**
     * Define o valor da propriedade operadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setOperadora(CtIdentificacaoFontePagadora value) {
        this.operadora = value;
    }

    /**
     * Obtém o valor da propriedade guiasCanceladas.
     * 
     * @return
     *     possible object is
     *     {@link CtReciboCancelaGuia.GuiasCanceladas }
     *     
     */
    public CtReciboCancelaGuia.GuiasCanceladas getGuiasCanceladas() {
        return guiasCanceladas;
    }

    /**
     * Define o valor da propriedade guiasCanceladas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtReciboCancelaGuia.GuiasCanceladas }
     *     
     */
    public void setGuiasCanceladas(CtReciboCancelaGuia.GuiasCanceladas value) {
        this.guiasCanceladas = value;
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
     *         &lt;element name="dadosGuia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia">
     *                 &lt;sequence>
     *                   &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusCancelamento"/>
     *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
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
        "dadosGuia"
    })
    public static class GuiasCanceladas {

        @XmlElement(required = true)
        protected List<CtReciboCancelaGuia.GuiasCanceladas.DadosGuia> dadosGuia;

        /**
         * Gets the value of the dadosGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtReciboCancelaGuia.GuiasCanceladas.DadosGuia }
         * 
         * 
         */
        public List<CtReciboCancelaGuia.GuiasCanceladas.DadosGuia> getDadosGuia() {
            if (dadosGuia == null) {
                dadosGuia = new ArrayList<CtReciboCancelaGuia.GuiasCanceladas.DadosGuia>();
            }
            return this.dadosGuia;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia">
         *       &lt;sequence>
         *         &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusCancelamento"/>
         *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
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
            "statusCancelamento",
            "observacao"
        })
        public static class DadosGuia
            extends CtCabecalhoGuia
        {

            @XmlElement(required = true)
            protected String statusCancelamento;
            protected String observacao;

            /**
             * Obtém o valor da propriedade statusCancelamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCancelamento() {
                return statusCancelamento;
            }

            /**
             * Define o valor da propriedade statusCancelamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCancelamento(String value) {
                this.statusCancelamento = value;
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

    }

}
