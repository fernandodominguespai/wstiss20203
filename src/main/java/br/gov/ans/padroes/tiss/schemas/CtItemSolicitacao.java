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


/**
 * <p>Classe Java de ct_itemSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_itemSolicitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoProcedimentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *         &lt;element name="statusSolicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusSolicitacao"/>
 *         &lt;element name="glosas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ct_itemSolicitacao", propOrder = {
    "identificacaoProcedimentos",
    "quantidadeSolicitada",
    "quantidadeAutorizada",
    "statusSolicitacaoProcedimento",
    "glosas",
    "observacao"
})
public class CtItemSolicitacao {

    @XmlElement(required = true)
    protected CtTabela identificacaoProcedimentos;
    @XmlElement(required = true)
    protected BigDecimal quantidadeSolicitada;
    protected BigDecimal quantidadeAutorizada;
    @XmlElement(required = true)
    protected String statusSolicitacaoProcedimento;
    protected CtItemSolicitacao.Glosas glosas;
    protected String observacao;

    /**
     * Obtém o valor da propriedade identificacaoProcedimentos.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getIdentificacaoProcedimentos() {
        return identificacaoProcedimentos;
    }

    /**
     * Define o valor da propriedade identificacaoProcedimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setIdentificacaoProcedimentos(CtTabela value) {
        this.identificacaoProcedimentos = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Define o valor da propriedade quantidadeSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeSolicitada(BigDecimal value) {
        this.quantidadeSolicitada = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeAutorizada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeAutorizada() {
        return quantidadeAutorizada;
    }

    /**
     * Define o valor da propriedade quantidadeAutorizada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeAutorizada(BigDecimal value) {
        this.quantidadeAutorizada = value;
    }

    /**
     * Obtém o valor da propriedade statusSolicitacaoProcedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacaoProcedimento() {
        return statusSolicitacaoProcedimento;
    }

    /**
     * Define o valor da propriedade statusSolicitacaoProcedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacaoProcedimento(String value) {
        this.statusSolicitacaoProcedimento = value;
    }

    /**
     * Obtém o valor da propriedade glosas.
     * 
     * @return
     *     possible object is
     *     {@link CtItemSolicitacao.Glosas }
     *     
     */
    public CtItemSolicitacao.Glosas getGlosas() {
        return glosas;
    }

    /**
     * Define o valor da propriedade glosas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtItemSolicitacao.Glosas }
     *     
     */
    public void setGlosas(CtItemSolicitacao.Glosas value) {
        this.glosas = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
    public static class Glosas {

        @XmlElement(required = true)
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

}
