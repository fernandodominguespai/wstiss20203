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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guias complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="guiaFaturamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="guiaConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaConsulta" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaSP_SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSP_SADT" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaResumoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaResumoInternacao" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaHonorarioIndividual" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaHonorarioIndividual" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaOdontologia" maxOccurs="100" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guiaRevisaoGlosa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="guiaConsultaReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaConsultaReapresentacao" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaSP_SADTReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSP_SADTReapresentacao" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaResumoInternacaoReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaResumoInternacaoReapresentacao" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaHonorarioIndividualReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaHonorarioIndividualReapresentacao" maxOccurs="100" minOccurs="0"/>
 *                   &lt;element name="guiaOdontologiaReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaTratamentoOdontologicoReapresentacao" maxOccurs="100" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guias", propOrder = {
    "guiaFaturamento",
    "guiaRevisaoGlosa"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtLoteGuias.Guias.class
})
public class CtGuias {

    protected CtGuias.GuiaFaturamento guiaFaturamento;
    protected CtGuias.GuiaRevisaoGlosa guiaRevisaoGlosa;

    /**
     * Obtém o valor da propriedade guiaFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link CtGuias.GuiaFaturamento }
     *     
     */
    public CtGuias.GuiaFaturamento getGuiaFaturamento() {
        return guiaFaturamento;
    }

    /**
     * Define o valor da propriedade guiaFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuias.GuiaFaturamento }
     *     
     */
    public void setGuiaFaturamento(CtGuias.GuiaFaturamento value) {
        this.guiaFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade guiaRevisaoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtGuias.GuiaRevisaoGlosa }
     *     
     */
    public CtGuias.GuiaRevisaoGlosa getGuiaRevisaoGlosa() {
        return guiaRevisaoGlosa;
    }

    /**
     * Define o valor da propriedade guiaRevisaoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuias.GuiaRevisaoGlosa }
     *     
     */
    public void setGuiaRevisaoGlosa(CtGuias.GuiaRevisaoGlosa value) {
        this.guiaRevisaoGlosa = value;
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
     *       &lt;choice>
     *         &lt;element name="guiaConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaConsulta" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaSP_SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSP_SADT" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaResumoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaResumoInternacao" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaHonorarioIndividual" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaHonorarioIndividual" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaOdontologia" maxOccurs="100" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guiaConsulta",
        "guiaSPSADT",
        "guiaResumoInternacao",
        "guiaHonorarioIndividual",
        "guiaOdontologia"
    })
    public static class GuiaFaturamento {

        protected List<CtGuiaConsulta> guiaConsulta;
        @XmlElement(name = "guiaSP_SADT")
        protected List<CtGuiaSPSADT> guiaSPSADT;
        protected List<CtGuiaResumoInternacao> guiaResumoInternacao;
        protected List<CtGuiaHonorarioIndividual> guiaHonorarioIndividual;
        protected List<CtGuiaOdontologia> guiaOdontologia;

        /**
         * Gets the value of the guiaConsulta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaConsulta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaConsulta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaConsulta }
         * 
         * 
         */
        public List<CtGuiaConsulta> getGuiaConsulta() {
            if (guiaConsulta == null) {
                guiaConsulta = new ArrayList<CtGuiaConsulta>();
            }
            return this.guiaConsulta;
        }

        /**
         * Gets the value of the guiaSPSADT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaSPSADT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaSPSADT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaSPSADT }
         * 
         * 
         */
        public List<CtGuiaSPSADT> getGuiaSPSADT() {
            if (guiaSPSADT == null) {
                guiaSPSADT = new ArrayList<CtGuiaSPSADT>();
            }
            return this.guiaSPSADT;
        }

        /**
         * Gets the value of the guiaResumoInternacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaResumoInternacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaResumoInternacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaResumoInternacao }
         * 
         * 
         */
        public List<CtGuiaResumoInternacao> getGuiaResumoInternacao() {
            if (guiaResumoInternacao == null) {
                guiaResumoInternacao = new ArrayList<CtGuiaResumoInternacao>();
            }
            return this.guiaResumoInternacao;
        }

        /**
         * Gets the value of the guiaHonorarioIndividual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaHonorarioIndividual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaHonorarioIndividual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaHonorarioIndividual }
         * 
         * 
         */
        public List<CtGuiaHonorarioIndividual> getGuiaHonorarioIndividual() {
            if (guiaHonorarioIndividual == null) {
                guiaHonorarioIndividual = new ArrayList<CtGuiaHonorarioIndividual>();
            }
            return this.guiaHonorarioIndividual;
        }

        /**
         * Gets the value of the guiaOdontologia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaOdontologia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaOdontologia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaOdontologia }
         * 
         * 
         */
        public List<CtGuiaOdontologia> getGuiaOdontologia() {
            if (guiaOdontologia == null) {
                guiaOdontologia = new ArrayList<CtGuiaOdontologia>();
            }
            return this.guiaOdontologia;
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
     *       &lt;choice>
     *         &lt;element name="guiaConsultaReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaConsultaReapresentacao" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaSP_SADTReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSP_SADTReapresentacao" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaResumoInternacaoReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaResumoInternacaoReapresentacao" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaHonorarioIndividualReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaHonorarioIndividualReapresentacao" maxOccurs="100" minOccurs="0"/>
     *         &lt;element name="guiaOdontologiaReapresentacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaTratamentoOdontologicoReapresentacao" maxOccurs="100" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guiaConsultaReapresentacao",
        "guiaSPSADTReapresentacao",
        "guiaResumoInternacaoReapresentacao",
        "guiaHonorarioIndividualReapresentacao",
        "guiaOdontologiaReapresentacao"
    })
    public static class GuiaRevisaoGlosa {

        protected List<CtGuiaConsultaReapresentacao> guiaConsultaReapresentacao;
        @XmlElement(name = "guiaSP_SADTReapresentacao")
        protected List<CtGuiaSPSADTReapresentacao> guiaSPSADTReapresentacao;
        protected List<CtGuiaResumoInternacaoReapresentacao> guiaResumoInternacaoReapresentacao;
        protected List<CtGuiaHonorarioIndividualReapresentacao> guiaHonorarioIndividualReapresentacao;
        protected List<CtGuiaTratamentoOdontologicoReapresentacao> guiaOdontologiaReapresentacao;

        /**
         * Gets the value of the guiaConsultaReapresentacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaConsultaReapresentacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaConsultaReapresentacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaConsultaReapresentacao }
         * 
         * 
         */
        public List<CtGuiaConsultaReapresentacao> getGuiaConsultaReapresentacao() {
            if (guiaConsultaReapresentacao == null) {
                guiaConsultaReapresentacao = new ArrayList<CtGuiaConsultaReapresentacao>();
            }
            return this.guiaConsultaReapresentacao;
        }

        /**
         * Gets the value of the guiaSPSADTReapresentacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaSPSADTReapresentacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaSPSADTReapresentacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaSPSADTReapresentacao }
         * 
         * 
         */
        public List<CtGuiaSPSADTReapresentacao> getGuiaSPSADTReapresentacao() {
            if (guiaSPSADTReapresentacao == null) {
                guiaSPSADTReapresentacao = new ArrayList<CtGuiaSPSADTReapresentacao>();
            }
            return this.guiaSPSADTReapresentacao;
        }

        /**
         * Gets the value of the guiaResumoInternacaoReapresentacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaResumoInternacaoReapresentacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaResumoInternacaoReapresentacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaResumoInternacaoReapresentacao }
         * 
         * 
         */
        public List<CtGuiaResumoInternacaoReapresentacao> getGuiaResumoInternacaoReapresentacao() {
            if (guiaResumoInternacaoReapresentacao == null) {
                guiaResumoInternacaoReapresentacao = new ArrayList<CtGuiaResumoInternacaoReapresentacao>();
            }
            return this.guiaResumoInternacaoReapresentacao;
        }

        /**
         * Gets the value of the guiaHonorarioIndividualReapresentacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaHonorarioIndividualReapresentacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaHonorarioIndividualReapresentacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaHonorarioIndividualReapresentacao }
         * 
         * 
         */
        public List<CtGuiaHonorarioIndividualReapresentacao> getGuiaHonorarioIndividualReapresentacao() {
            if (guiaHonorarioIndividualReapresentacao == null) {
                guiaHonorarioIndividualReapresentacao = new ArrayList<CtGuiaHonorarioIndividualReapresentacao>();
            }
            return this.guiaHonorarioIndividualReapresentacao;
        }

        /**
         * Gets the value of the guiaOdontologiaReapresentacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaOdontologiaReapresentacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaOdontologiaReapresentacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaTratamentoOdontologicoReapresentacao }
         * 
         * 
         */
        public List<CtGuiaTratamentoOdontologicoReapresentacao> getGuiaOdontologiaReapresentacao() {
            if (guiaOdontologiaReapresentacao == null) {
                guiaOdontologiaReapresentacao = new ArrayList<CtGuiaTratamentoOdontologicoReapresentacao>();
            }
            return this.guiaOdontologiaReapresentacao;
        }

    }

}
