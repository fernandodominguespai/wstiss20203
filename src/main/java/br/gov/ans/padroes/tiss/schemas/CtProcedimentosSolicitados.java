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
 * <p>Classe Java de ct_procedimentosSolicitados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentosSolicitados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoSolicitado" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento"/>
 *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
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
@XmlType(name = "ct_procedimentosSolicitados", propOrder = {
    "procedimentoSolicitado"
})
public class CtProcedimentosSolicitados {

    @XmlElement(required = true)
    protected List<CtProcedimentosSolicitados.ProcedimentoSolicitado> procedimentoSolicitado;

    /**
     * Gets the value of the procedimentoSolicitado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentoSolicitado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentoSolicitado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtProcedimentosSolicitados.ProcedimentoSolicitado }
     * 
     * 
     */
    public List<CtProcedimentosSolicitados.ProcedimentoSolicitado> getProcedimentoSolicitado() {
        if (procedimentoSolicitado == null) {
            procedimentoSolicitado = new ArrayList<CtProcedimentosSolicitados.ProcedimentoSolicitado>();
        }
        return this.procedimentoSolicitado;
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
     *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento"/>
     *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
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
        "procedimento"
    })
    public static class ProcedimentoSolicitado {

        @XmlElement(required = true)
        protected BigDecimal quantidadeSolicitada;
        @XmlElement(required = true)
        protected CtTabela procedimento;

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

    }

}
