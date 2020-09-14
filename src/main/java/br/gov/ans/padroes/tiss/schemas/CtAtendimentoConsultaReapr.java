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
 * <p>Classe Java de ct_atendimentoConsultaReapr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_atendimentoConsultaReapr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tabela"/>
 *                   &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoTabela"/>
 *                   &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tipoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoConsulta"/>
 *         &lt;element name="tipoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoSaidaGuiaConsulta"/>
 *         &lt;element name="dataAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_atendimentoConsultaReapr", propOrder = {
    "procedimento",
    "tipoConsulta",
    "tipoSaida",
    "dataAtendimento"
})
public class CtAtendimentoConsultaReapr {

    @XmlElement(required = true)
    protected CtAtendimentoConsultaReapr.Procedimento procedimento;
    @XmlElement(required = true)
    protected String tipoConsulta;
    @XmlElement(required = true)
    protected String tipoSaida;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataAtendimento;

    /**
     * Obtém o valor da propriedade procedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtAtendimentoConsultaReapr.Procedimento }
     *     
     */
    public CtAtendimentoConsultaReapr.Procedimento getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAtendimentoConsultaReapr.Procedimento }
     *     
     */
    public void setProcedimento(CtAtendimentoConsultaReapr.Procedimento value) {
        this.procedimento = value;
    }

    /**
     * Obtém o valor da propriedade tipoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define o valor da propriedade tipoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
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
     * Obtém o valor da propriedade dataAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtendimento() {
        return dataAtendimento;
    }

    /**
     * Define o valor da propriedade dataAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtendimento(XMLGregorianCalendar value) {
        this.dataAtendimento = value;
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
     *       &lt;all>
     *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tabela"/>
     *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoTabela"/>
     *         &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Procedimento {

        @XmlElement(required = true)
        protected String codigoTabela;
        @XmlElement(required = true)
        protected String codigoProcedimento;
        @XmlElement(required = true)
        protected String justificativa;

        /**
         * Obtém o valor da propriedade codigoTabela.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTabela() {
            return codigoTabela;
        }

        /**
         * Define o valor da propriedade codigoTabela.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTabela(String value) {
            this.codigoTabela = value;
        }

        /**
         * Obtém o valor da propriedade codigoProcedimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoProcedimento() {
            return codigoProcedimento;
        }

        /**
         * Define o valor da propriedade codigoProcedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoProcedimento(String value) {
            this.codigoProcedimento = value;
        }

        /**
         * Obtém o valor da propriedade justificativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativa() {
            return justificativa;
        }

        /**
         * Define o valor da propriedade justificativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativa(String value) {
            this.justificativa = value;
        }

    }

}
