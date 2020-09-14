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
 * <p>Classe Java de ct_OPMUtilizadasRevisao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_OPMUtilizadasRevisao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPMUtilizada">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OPM" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *                             &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                             &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *                             &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao20" minOccurs="0"/>
 *                             &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                             &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotalOPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_OPMUtilizadasRevisao", propOrder = {
    "opmUtilizada",
    "valorTotalOPM"
})
public class CtOPMUtilizadasRevisao {

    @XmlElement(name = "OPMUtilizada", required = true)
    protected CtOPMUtilizadasRevisao.OPMUtilizada opmUtilizada;
    protected BigDecimal valorTotalOPM;

    /**
     * Obtém o valor da propriedade opmUtilizada.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMUtilizadasRevisao.OPMUtilizada }
     *     
     */
    public CtOPMUtilizadasRevisao.OPMUtilizada getOPMUtilizada() {
        return opmUtilizada;
    }

    /**
     * Define o valor da propriedade opmUtilizada.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMUtilizadasRevisao.OPMUtilizada }
     *     
     */
    public void setOPMUtilizada(CtOPMUtilizadasRevisao.OPMUtilizada value) {
        this.opmUtilizada = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalOPM.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalOPM() {
        return valorTotalOPM;
    }

    /**
     * Define o valor da propriedade valorTotalOPM.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalOPM(BigDecimal value) {
        this.valorTotalOPM = value;
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
     *         &lt;element name="OPM" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
     *                   &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
     *                   &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao20" minOccurs="0"/>
     *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *                   &lt;element name="justificativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_justificativa"/>
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
    @XmlType(name = "", propOrder = {
        "opm"
    })
    public static class OPMUtilizada {

        @XmlElement(name = "OPM", required = true)
        protected List<CtOPMUtilizadasRevisao.OPMUtilizada.OPM> opm;

        /**
         * Gets the value of the opm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the opm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOPM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtOPMUtilizadasRevisao.OPMUtilizada.OPM }
         * 
         * 
         */
        public List<CtOPMUtilizadasRevisao.OPMUtilizada.OPM> getOPM() {
            if (opm == null) {
                opm = new ArrayList<CtOPMUtilizadasRevisao.OPMUtilizada.OPM>();
            }
            return this.opm;
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
         *         &lt;element name="OPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
         *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
         *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
         *         &lt;element name="codigoBarra" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao20" minOccurs="0"/>
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
            "opm",
            "valorUnitario",
            "quantidade",
            "codigoBarra",
            "valorTotal",
            "justificativa"
        })
        public static class OPM {

            @XmlElement(name = "OPM", required = true)
            protected CtTabela opm;
            protected BigDecimal valorUnitario;
            @XmlElement(required = true)
            protected BigDecimal quantidade;
            protected String codigoBarra;
            protected BigDecimal valorTotal;
            @XmlElement(required = true)
            protected String justificativa;

            /**
             * Obtém o valor da propriedade opm.
             * 
             * @return
             *     possible object is
             *     {@link CtTabela }
             *     
             */
            public CtTabela getOPM() {
                return opm;
            }

            /**
             * Define o valor da propriedade opm.
             * 
             * @param value
             *     allowed object is
             *     {@link CtTabela }
             *     
             */
            public void setOPM(CtTabela value) {
                this.opm = value;
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
             * Obtém o valor da propriedade codigoBarra.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoBarra() {
                return codigoBarra;
            }

            /**
             * Define o valor da propriedade codigoBarra.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoBarra(String value) {
                this.codigoBarra = value;
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

}
