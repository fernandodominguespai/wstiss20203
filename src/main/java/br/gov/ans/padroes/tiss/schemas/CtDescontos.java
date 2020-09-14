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
 * <p>Classe Java de ct_descontos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_descontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemDesconto" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="valorDesconto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *                   &lt;element name="descricao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40"/>
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
@XmlType(name = "ct_descontos", propOrder = {
    "itemDesconto"
})
public class CtDescontos {

    @XmlElement(required = true)
    protected List<CtDescontos.ItemDesconto> itemDesconto;

    /**
     * Gets the value of the itemDesconto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDesconto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDesconto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDescontos.ItemDesconto }
     * 
     * 
     */
    public List<CtDescontos.ItemDesconto> getItemDesconto() {
        if (itemDesconto == null) {
            itemDesconto = new ArrayList<CtDescontos.ItemDesconto>();
        }
        return this.itemDesconto;
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
     *         &lt;element name="valorDesconto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
     *         &lt;element name="descricao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao40"/>
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
        "valorDesconto",
        "descricao"
    })
    public static class ItemDesconto {

        @XmlElement(required = true)
        protected BigDecimal valorDesconto;
        @XmlElement(required = true)
        protected String descricao;

        /**
         * Obtém o valor da propriedade valorDesconto.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorDesconto() {
            return valorDesconto;
        }

        /**
         * Define o valor da propriedade valorDesconto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorDesconto(BigDecimal value) {
            this.valorDesconto = value;
        }

        /**
         * Obtém o valor da propriedade descricao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescricao() {
            return descricao;
        }

        /**
         * Define o valor da propriedade descricao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescricao(String value) {
            this.descricao = value;
        }

    }

}
