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
 * <p>Classe Java de ct_OPMSolicitadas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_OPMSolicitadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPMSolicitada" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *                   &lt;element name="fabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
 *                   &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="OPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
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
@XmlType(name = "ct_OPMSolicitadas", propOrder = {
    "opmSolicitada"
})
public class CtOPMSolicitadas {

    @XmlElement(name = "OPMSolicitada", required = true)
    protected List<CtOPMSolicitadas.OPMSolicitada> opmSolicitada;

    /**
     * Gets the value of the opmSolicitada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opmSolicitada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPMSolicitada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOPMSolicitadas.OPMSolicitada }
     * 
     * 
     */
    public List<CtOPMSolicitadas.OPMSolicitada> getOPMSolicitada() {
        if (opmSolicitada == null) {
            opmSolicitada = new ArrayList<CtOPMSolicitadas.OPMSolicitada>();
        }
        return this.opmSolicitada;
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
     *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
     *         &lt;element name="fabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
     *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="OPM" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
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
        "quantidadeSolicitada",
        "fabricante",
        "valor",
        "opm"
    })
    public static class OPMSolicitada {

        @XmlElement(required = true)
        protected BigDecimal quantidadeSolicitada;
        protected String fabricante;
        protected BigDecimal valor;
        @XmlElement(name = "OPM", required = true)
        protected CtTabela opm;

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
         * Obtém o valor da propriedade fabricante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFabricante() {
            return fabricante;
        }

        /**
         * Define o valor da propriedade fabricante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFabricante(String value) {
            this.fabricante = value;
        }

        /**
         * Obtém o valor da propriedade valor.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValor() {
            return valor;
        }

        /**
         * Define o valor da propriedade valor.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValor(BigDecimal value) {
            this.valor = value;
        }

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

    }

}
