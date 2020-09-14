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
 * <p>Classe Java de ct_demonstrativoPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoDemonstrativo"/>
 *         &lt;element name="identificacaoFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadoBancario"/>
 *         &lt;element name="dadosResumo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="detalheResumo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumo" maxOccurs="unbounded"/>
 *                   &lt;element name="totalGeralInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *                   &lt;element name="TotalGeralProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *                   &lt;element name="TotalGeralGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="TotalGeralLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="demaisDescontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" minOccurs="0"/>
 *         &lt;element name="valorFinalLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_demonstrativoPagamento", propOrder = {
    "cabecalhoDemonstrativo",
    "identificacaoFontePagadora",
    "dadosPrestador",
    "dadosPagamento",
    "dadosResumo",
    "valorTotal",
    "demaisDescontos",
    "valorFinalLiberado"
})
public class CtDemonstrativoPagamento {

    @XmlElement(required = true)
    protected CtCabecalhoDemonstrativo cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(required = true)
    protected CtDadoBancario dadosPagamento;
    @XmlElement(required = true)
    protected CtDemonstrativoPagamento.DadosResumo dadosResumo;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    protected CtDescontos demaisDescontos;
    @XmlElement(required = true)
    protected BigDecimal valorFinalLiberado;

    /**
     * Obtém o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public CtCabecalhoDemonstrativo getCabecalhoDemonstrativo() {
        return cabecalhoDemonstrativo;
    }

    /**
     * Define o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public void setCabecalhoDemonstrativo(CtCabecalhoDemonstrativo value) {
        this.cabecalhoDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade identificacaoFontePagadora.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    /**
     * Define o valor da propriedade identificacaoFontePagadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setIdentificacaoFontePagadora(CtIdentificacaoFontePagadora value) {
        this.identificacaoFontePagadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setDadosPrestador(CtContratado value) {
        this.dadosPrestador = value;
    }

    /**
     * Obtém o valor da propriedade dadosPagamento.
     * 
     * @return
     *     possible object is
     *     {@link CtDadoBancario }
     *     
     */
    public CtDadoBancario getDadosPagamento() {
        return dadosPagamento;
    }

    /**
     * Define o valor da propriedade dadosPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadoBancario }
     *     
     */
    public void setDadosPagamento(CtDadoBancario value) {
        this.dadosPagamento = value;
    }

    /**
     * Obtém o valor da propriedade dadosResumo.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoPagamento.DadosResumo }
     *     
     */
    public CtDemonstrativoPagamento.DadosResumo getDadosResumo() {
        return dadosResumo;
    }

    /**
     * Define o valor da propriedade dadosResumo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoPagamento.DadosResumo }
     *     
     */
    public void setDadosResumo(CtDemonstrativoPagamento.DadosResumo value) {
        this.dadosResumo = value;
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
     * Obtém o valor da propriedade demaisDescontos.
     * 
     * @return
     *     possible object is
     *     {@link CtDescontos }
     *     
     */
    public CtDescontos getDemaisDescontos() {
        return demaisDescontos;
    }

    /**
     * Define o valor da propriedade demaisDescontos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDescontos }
     *     
     */
    public void setDemaisDescontos(CtDescontos value) {
        this.demaisDescontos = value;
    }

    /**
     * Obtém o valor da propriedade valorFinalLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFinalLiberado() {
        return valorFinalLiberado;
    }

    /**
     * Define o valor da propriedade valorFinalLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFinalLiberado(BigDecimal value) {
        this.valorFinalLiberado = value;
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
     *         &lt;element name="detalheResumo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumo" maxOccurs="unbounded"/>
     *         &lt;element name="totalGeralInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
     *         &lt;element name="TotalGeralProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
     *         &lt;element name="TotalGeralGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="TotalGeralLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
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
        "detalheResumo",
        "totalGeralInformado",
        "totalGeralProcessado",
        "totalGeralGlosa",
        "totalGeralLiberado"
    })
    public static class DadosResumo {

        @XmlElement(required = true)
        protected List<CtDadosResumo> detalheResumo;
        @XmlElement(required = true)
        protected BigDecimal totalGeralInformado;
        @XmlElement(name = "TotalGeralProcessado", required = true)
        protected BigDecimal totalGeralProcessado;
        @XmlElement(name = "TotalGeralGlosa")
        protected BigDecimal totalGeralGlosa;
        @XmlElement(name = "TotalGeralLiberado", required = true)
        protected BigDecimal totalGeralLiberado;

        /**
         * Gets the value of the detalheResumo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheResumo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheResumo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDadosResumo }
         * 
         * 
         */
        public List<CtDadosResumo> getDetalheResumo() {
            if (detalheResumo == null) {
                detalheResumo = new ArrayList<CtDadosResumo>();
            }
            return this.detalheResumo;
        }

        /**
         * Obtém o valor da propriedade totalGeralInformado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralInformado() {
            return totalGeralInformado;
        }

        /**
         * Define o valor da propriedade totalGeralInformado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralInformado(BigDecimal value) {
            this.totalGeralInformado = value;
        }

        /**
         * Obtém o valor da propriedade totalGeralProcessado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralProcessado() {
            return totalGeralProcessado;
        }

        /**
         * Define o valor da propriedade totalGeralProcessado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralProcessado(BigDecimal value) {
            this.totalGeralProcessado = value;
        }

        /**
         * Obtém o valor da propriedade totalGeralGlosa.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralGlosa() {
            return totalGeralGlosa;
        }

        /**
         * Define o valor da propriedade totalGeralGlosa.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralGlosa(BigDecimal value) {
            this.totalGeralGlosa = value;
        }

        /**
         * Obtém o valor da propriedade totalGeralLiberado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralLiberado() {
            return totalGeralLiberado;
        }

        /**
         * Define o valor da propriedade totalGeralLiberado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralLiberado(BigDecimal value) {
            this.totalGeralLiberado = value;
        }

    }

}
