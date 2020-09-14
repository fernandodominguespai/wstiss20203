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
 * <p>Classe Java de ct_dadosProcedimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosProcedimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="quantidadeExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao" minOccurs="0"/>
 *         &lt;element name="relacaoGlosa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                   &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
@XmlType(name = "ct_dadosProcedimento", propOrder = {
    "procedimento",
    "quantidadeExecutada",
    "valorProcessado",
    "valorLiberado",
    "grauParticipacao",
    "relacaoGlosa"
})
public class CtDadosProcedimento {

    @XmlElement(required = true)
    protected CtTabela procedimento;
    @XmlElement(required = true)
    protected BigDecimal quantidadeExecutada;
    protected BigDecimal valorProcessado;
    protected BigDecimal valorLiberado;
    protected String grauParticipacao;
    protected CtDadosProcedimento.RelacaoGlosa relacaoGlosa;

    /**
     * Obtém o valor da propriedade procedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setProcedimento(CtTabela value) {
        this.procedimento = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeExecutada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeExecutada() {
        return quantidadeExecutada;
    }

    /**
     * Define o valor da propriedade quantidadeExecutada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeExecutada(BigDecimal value) {
        this.quantidadeExecutada = value;
    }

    /**
     * Obtém o valor da propriedade valorProcessado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessado() {
        return valorProcessado;
    }

    /**
     * Define o valor da propriedade valorProcessado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessado(BigDecimal value) {
        this.valorProcessado = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberado() {
        return valorLiberado;
    }

    /**
     * Define o valor da propriedade valorLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberado(BigDecimal value) {
        this.valorLiberado = value;
    }

    /**
     * Obtém o valor da propriedade grauParticipacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrauParticipacao() {
        return grauParticipacao;
    }

    /**
     * Define o valor da propriedade grauParticipacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrauParticipacao(String value) {
        this.grauParticipacao = value;
    }

    /**
     * Obtém o valor da propriedade relacaoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosProcedimento.RelacaoGlosa }
     *     
     */
    public CtDadosProcedimento.RelacaoGlosa getRelacaoGlosa() {
        return relacaoGlosa;
    }

    /**
     * Define o valor da propriedade relacaoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosProcedimento.RelacaoGlosa }
     *     
     */
    public void setRelacaoGlosa(CtDadosProcedimento.RelacaoGlosa value) {
        this.relacaoGlosa = value;
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
     *         &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
        "tipoGlosa",
        "valorGlosa"
    })
    public static class RelacaoGlosa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> tipoGlosa;
        protected BigDecimal valorGlosa;

        /**
         * Gets the value of the tipoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tipoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTipoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getTipoGlosa() {
            if (tipoGlosa == null) {
                tipoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.tipoGlosa;
        }

        /**
         * Obtém o valor da propriedade valorGlosa.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorGlosa() {
            return valorGlosa;
        }

        /**
         * Define o valor da propriedade valorGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorGlosa(BigDecimal value) {
            this.valorGlosa = value;
        }

    }

}
