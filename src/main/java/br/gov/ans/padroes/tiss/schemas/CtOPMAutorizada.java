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
 * <p>Classe Java de ct_OPMAutorizada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_OPMAutorizada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPMAutorizada" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *                   &lt;element name="fabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
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
@XmlType(name = "ct_OPMAutorizada", propOrder = {
    "opmAutorizada"
})
public class CtOPMAutorizada {

    @XmlElement(name = "OPMAutorizada", required = true)
    protected List<CtOPMAutorizada.OPMAutorizada> opmAutorizada;

    /**
     * Gets the value of the opmAutorizada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opmAutorizada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPMAutorizada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOPMAutorizada.OPMAutorizada }
     * 
     * 
     */
    public List<CtOPMAutorizada.OPMAutorizada> getOPMAutorizada() {
        if (opmAutorizada == null) {
            opmAutorizada = new ArrayList<CtOPMAutorizada.OPMAutorizada>();
        }
        return this.opmAutorizada;
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
     *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
     *         &lt;element name="fabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40" minOccurs="0"/>
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
        "quantidadeAutorizada",
        "fabricante",
        "opm"
    })
    public static class OPMAutorizada {

        @XmlElement(required = true)
        protected BigDecimal quantidadeAutorizada;
        protected String fabricante;
        @XmlElement(name = "OPM", required = true)
        protected CtTabela opm;

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
