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
 * <p>Classe Java de ct_autorizacaoProcedimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_autorizacaoProcedimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusSolicitacao" minOccurs="0"/>
 *         &lt;element name="motivoNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="prestadorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado" minOccurs="0"/>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoGuiaInternacao" minOccurs="0"/>
 *         &lt;element name="procedimentos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
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
@XmlType(name = "ct_autorizacaoProcedimento", propOrder = {
    "identificacaoAutorizacao",
    "statusSolicitacao",
    "motivoNegativa",
    "beneficiario",
    "prestadorAutorizado",
    "dadosAutorizacao",
    "procedimentos"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.class,
    br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao.DadosAutorizacao.class
})
public class CtAutorizacaoProcedimento {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoAutorizacao;
    protected String statusSolicitacao;
    protected CtAutorizacaoProcedimento.MotivoNegativa motivoNegativa;
    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    protected CtContratado prestadorAutorizado;
    protected CtAutorizacaoGuiaInternacao dadosAutorizacao;
    protected CtAutorizacaoProcedimento.Procedimentos procedimentos;

    /**
     * Obtém o valor da propriedade identificacaoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoAutorizacao() {
        return identificacaoAutorizacao;
    }

    /**
     * Define o valor da propriedade identificacaoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoAutorizacao(CtCabecalhoGuia value) {
        this.identificacaoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade statusSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    /**
     * Define o valor da propriedade statusSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacao(String value) {
        this.statusSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade motivoNegativa.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoProcedimento.MotivoNegativa }
     *     
     */
    public CtAutorizacaoProcedimento.MotivoNegativa getMotivoNegativa() {
        return motivoNegativa;
    }

    /**
     * Define o valor da propriedade motivoNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoProcedimento.MotivoNegativa }
     *     
     */
    public void setMotivoNegativa(CtAutorizacaoProcedimento.MotivoNegativa value) {
        this.motivoNegativa = value;
    }

    /**
     * Obtém o valor da propriedade beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define o valor da propriedade beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setBeneficiario(CtBeneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Obtém o valor da propriedade prestadorAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getPrestadorAutorizado() {
        return prestadorAutorizado;
    }

    /**
     * Define o valor da propriedade prestadorAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setPrestadorAutorizado(CtContratado value) {
        this.prestadorAutorizado = value;
    }

    /**
     * Obtém o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoGuiaInternacao }
     *     
     */
    public CtAutorizacaoGuiaInternacao getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoGuiaInternacao }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoGuiaInternacao value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade procedimentos.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoProcedimento.Procedimentos }
     *     
     */
    public CtAutorizacaoProcedimento.Procedimentos getProcedimentos() {
        return procedimentos;
    }

    /**
     * Define o valor da propriedade procedimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoProcedimento.Procedimentos }
     *     
     */
    public void setProcedimentos(CtAutorizacaoProcedimento.Procedimentos value) {
        this.procedimentos = value;
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
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
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
        "motivoGlosa"
    })
    public static class MotivoNegativa {

        protected List<CtMotivoGlosa> motivoGlosa;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
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
     *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
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
        "procedimento"
    })
    public static class Procedimentos {

        @XmlElement(required = true)
        protected List<CtItemSolicitacao> procedimento;

        /**
         * Gets the value of the procedimento property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimento property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimento().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtItemSolicitacao }
         * 
         * 
         */
        public List<CtItemSolicitacao> getProcedimento() {
            if (procedimento == null) {
                procedimento = new ArrayList<CtItemSolicitacao>();
            }
            return this.procedimento;
        }

    }

}
