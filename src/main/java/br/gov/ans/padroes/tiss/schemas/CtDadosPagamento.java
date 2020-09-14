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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_dadosPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="loteOdonto" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteOdonto">
 *                 &lt;sequence>
 *                   &lt;element name="totalGeralLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_totalDemoOdonto"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "ct_dadosPagamento", propOrder = {
    "dataPagamento",
    "loteOdonto"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtDemonstrativoOdontologia.DadosPagamento.class
})
public class CtDadosPagamento {

    @XmlElement(required = true)
    protected XMLGregorianCalendar dataPagamento;
    @XmlElement(required = true)
    protected List<CtDadosPagamento.LoteOdonto> loteOdonto;

    /**
     * Obtém o valor da propriedade dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Define o valor da propriedade dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the loteOdonto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loteOdonto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoteOdonto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtDadosPagamento.LoteOdonto }
     * 
     * 
     */
    public List<CtDadosPagamento.LoteOdonto> getLoteOdonto() {
        if (loteOdonto == null) {
            loteOdonto = new ArrayList<CtDadosPagamento.LoteOdonto>();
        }
        return this.loteOdonto;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteOdonto">
     *       &lt;sequence>
     *         &lt;element name="totalGeralLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_totalDemoOdonto"/>
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
        "totalGeralLote"
    })
    public static class LoteOdonto
        extends CtLoteOdonto
    {

        @XmlElement(required = true)
        protected CtTotalDemoOdonto totalGeralLote;

        /**
         * Obtém o valor da propriedade totalGeralLote.
         * 
         * @return
         *     possible object is
         *     {@link CtTotalDemoOdonto }
         *     
         */
        public CtTotalDemoOdonto getTotalGeralLote() {
            return totalGeralLote;
        }

        /**
         * Define o valor da propriedade totalGeralLote.
         * 
         * @param value
         *     allowed object is
         *     {@link CtTotalDemoOdonto }
         *     
         */
        public void setTotalGeralLote(CtTotalDemoOdonto value) {
            this.totalGeralLote = value;
        }

    }

}
