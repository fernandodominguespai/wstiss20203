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
 * <p>Classe Java de ct_outrasDespesasRevisao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_outrasDespesasRevisao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itensDespesas" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_outrasDespesas"/>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="despesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *                   &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
 *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *                   &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalGeralOutrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_outrasDespesasRevisao", propOrder = {
    "itensDespesas",
    "totalGeralOutrasDespesas"
})
public class CtOutrasDespesasRevisao {

    @XmlElement(required = true)
    protected List<CtOutrasDespesasRevisao.ItensDespesas> itensDespesas;
    protected BigDecimal totalGeralOutrasDespesas;

    /**
     * Gets the value of the itensDespesas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itensDespesas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItensDespesas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOutrasDespesasRevisao.ItensDespesas }
     * 
     * 
     */
    public List<CtOutrasDespesasRevisao.ItensDespesas> getItensDespesas() {
        if (itensDespesas == null) {
            itensDespesas = new ArrayList<CtOutrasDespesasRevisao.ItensDespesas>();
        }
        return this.itensDespesas;
    }

    /**
     * Obtém o valor da propriedade totalGeralOutrasDespesas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGeralOutrasDespesas() {
        return totalGeralOutrasDespesas;
    }

    /**
     * Define o valor da propriedade totalGeralOutrasDespesas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGeralOutrasDespesas(BigDecimal value) {
        this.totalGeralOutrasDespesas = value;
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
     *         &lt;element name="tipoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_outrasDespesas"/>
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="despesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
     *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
     *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
     *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
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
        "tipoDespesa",
        "dataRealizacao",
        "despesa",
        "reducaoAcrescimo",
        "quantidade",
        "valorUnitario",
        "valorTotal",
        "justificativa"
    })
    public static class ItensDespesas {

        @XmlElement(required = true)
        protected String tipoDespesa;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataRealizacao;
        @XmlElement(required = true)
        protected CtTabela despesa;
        protected BigDecimal reducaoAcrescimo;
        @XmlElement(required = true)
        protected BigDecimal quantidade;
        protected BigDecimal valorUnitario;
        protected BigDecimal valorTotal;
        @XmlElement(required = true)
        protected String justificativa;

        /**
         * Obtém o valor da propriedade tipoDespesa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDespesa() {
            return tipoDespesa;
        }

        /**
         * Define o valor da propriedade tipoDespesa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDespesa(String value) {
            this.tipoDespesa = value;
        }

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

        /**
         * Obtém o valor da propriedade despesa.
         * 
         * @return
         *     possible object is
         *     {@link CtTabela }
         *     
         */
        public CtTabela getDespesa() {
            return despesa;
        }

        /**
         * Define o valor da propriedade despesa.
         * 
         * @param value
         *     allowed object is
         *     {@link CtTabela }
         *     
         */
        public void setDespesa(CtTabela value) {
            this.despesa = value;
        }

        /**
         * Obtém o valor da propriedade reducaoAcrescimo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getReducaoAcrescimo() {
            return reducaoAcrescimo;
        }

        /**
         * Define o valor da propriedade reducaoAcrescimo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setReducaoAcrescimo(BigDecimal value) {
            this.reducaoAcrescimo = value;
        }

        /**
         * Obtém o valor da propriedade quantidade.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQuantidade() {
            return quantidade;
        }

        /**
         * Define o valor da propriedade quantidade.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQuantidade(BigDecimal value) {
            this.quantidade = value;
        }

        /**
         * Obtém o valor da propriedade valorUnitario.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        /**
         * Define o valor da propriedade valorUnitario.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorUnitario(BigDecimal value) {
            this.valorUnitario = value;
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
