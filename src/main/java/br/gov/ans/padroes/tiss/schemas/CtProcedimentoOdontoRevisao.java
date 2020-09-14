//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_procedimentoOdontoRevisao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoOdontoRevisao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoOdontologia">
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
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="quantidadeTotalUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="justificativaRevisao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoOdontoRevisao", propOrder = {
    "procedimentoOdontologia",
    "valorTotal",
    "quantidadeTotalUS",
    "totalFranquiaCoparticipacao",
    "justificativaRevisao"
})
public class CtProcedimentoOdontoRevisao {

    @XmlElement(required = true)
    protected CtProcedimentoOdontoRevisao.ProcedimentoOdontologia procedimentoOdontologia;
    protected BigDecimal valorTotal;
    protected BigDecimal quantidadeTotalUS;
    protected BigDecimal totalFranquiaCoparticipacao;
    @XmlElement(required = true)
    protected String justificativaRevisao;

    /**
     * Obtém o valor da propriedade procedimentoOdontologia.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoOdontoRevisao.ProcedimentoOdontologia }
     *     
     */
    public CtProcedimentoOdontoRevisao.ProcedimentoOdontologia getProcedimentoOdontologia() {
        return procedimentoOdontologia;
    }

    /**
     * Define o valor da propriedade procedimentoOdontologia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoOdontoRevisao.ProcedimentoOdontologia }
     *     
     */
    public void setProcedimentoOdontologia(CtProcedimentoOdontoRevisao.ProcedimentoOdontologia value) {
        this.procedimentoOdontologia = value;
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
     * Obtém o valor da propriedade justificativaRevisao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaRevisao() {
        return justificativaRevisao;
    }

    /**
     * Define o valor da propriedade justificativaRevisao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaRevisao(String value) {
        this.justificativaRevisao = value;
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
    public static class ProcedimentoOdontologia
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
