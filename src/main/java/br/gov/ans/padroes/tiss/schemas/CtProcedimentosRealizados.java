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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_procedimentosRealizados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentosRealizados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoRealizado" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="data" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="horaFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *                   &lt;element name="quantidadeRealizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento"/>
 *                   &lt;element name="viaAcesso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_viaDeAcesso" minOccurs="0"/>
 *                   &lt;element name="tecnicaUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tecnicaUtilizada" minOccurs="0"/>
 *                   &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
 *                   &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
@XmlType(name = "ct_procedimentosRealizados", propOrder = {
    "procedimentoRealizado"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaHonorarioIndividual.ProcedimentosExamesRealizados.class
})
public class CtProcedimentosRealizados {

    @XmlElement(required = true)
    protected List<CtProcedimentosRealizados.ProcedimentoRealizado> procedimentoRealizado;

    /**
     * Gets the value of the procedimentoRealizado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentoRealizado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentoRealizado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtProcedimentosRealizados.ProcedimentoRealizado }
     * 
     * 
     */
    public List<CtProcedimentosRealizados.ProcedimentoRealizado> getProcedimentoRealizado() {
        if (procedimentoRealizado == null) {
            procedimentoRealizado = new ArrayList<CtProcedimentosRealizados.ProcedimentoRealizado>();
        }
        return this.procedimentoRealizado;
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
     *         &lt;element name="data" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="horaFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
     *         &lt;element name="quantidadeRealizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento"/>
     *         &lt;element name="viaAcesso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_viaDeAcesso" minOccurs="0"/>
     *         &lt;element name="tecnicaUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tecnicaUtilizada" minOccurs="0"/>
     *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
     *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
        "data",
        "horaInicio",
        "horaFim",
        "procedimento",
        "quantidadeRealizada",
        "viaAcesso",
        "tecnicaUtilizada",
        "reducaoAcrescimo",
        "valor",
        "valorTotal"
    })
    public static class ProcedimentoRealizado {

        @XmlElement(required = true)
        protected XMLGregorianCalendar data;
        protected XMLGregorianCalendar horaInicio;
        protected XMLGregorianCalendar horaFim;
        @XmlElement(required = true)
        protected CtTabela procedimento;
        @XmlElement(required = true)
        protected BigDecimal quantidadeRealizada;
        protected StViaDeAcesso viaAcesso;
        protected StTecnicaUtilizada tecnicaUtilizada;
        protected BigDecimal reducaoAcrescimo;
        @XmlElementRef(name = "valor", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> valor;
        @XmlElementRef(name = "valorTotal", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> valorTotal;

        /**
         * Obtém o valor da propriedade data.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getData() {
            return data;
        }

        /**
         * Define o valor da propriedade data.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setData(XMLGregorianCalendar value) {
            this.data = value;
        }

        /**
         * Obtém o valor da propriedade horaInicio.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraInicio() {
            return horaInicio;
        }

        /**
         * Define o valor da propriedade horaInicio.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraInicio(XMLGregorianCalendar value) {
            this.horaInicio = value;
        }

        /**
         * Obtém o valor da propriedade horaFim.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraFim() {
            return horaFim;
        }

        /**
         * Define o valor da propriedade horaFim.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraFim(XMLGregorianCalendar value) {
            this.horaFim = value;
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

        /**
         * Obtém o valor da propriedade quantidadeRealizada.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQuantidadeRealizada() {
            return quantidadeRealizada;
        }

        /**
         * Define o valor da propriedade quantidadeRealizada.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQuantidadeRealizada(BigDecimal value) {
            this.quantidadeRealizada = value;
        }

        /**
         * Obtém o valor da propriedade viaAcesso.
         * 
         * @return
         *     possible object is
         *     {@link StViaDeAcesso }
         *     
         */
        public StViaDeAcesso getViaAcesso() {
            return viaAcesso;
        }

        /**
         * Define o valor da propriedade viaAcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link StViaDeAcesso }
         *     
         */
        public void setViaAcesso(StViaDeAcesso value) {
            this.viaAcesso = value;
        }

        /**
         * Obtém o valor da propriedade tecnicaUtilizada.
         * 
         * @return
         *     possible object is
         *     {@link StTecnicaUtilizada }
         *     
         */
        public StTecnicaUtilizada getTecnicaUtilizada() {
            return tecnicaUtilizada;
        }

        /**
         * Define o valor da propriedade tecnicaUtilizada.
         * 
         * @param value
         *     allowed object is
         *     {@link StTecnicaUtilizada }
         *     
         */
        public void setTecnicaUtilizada(StTecnicaUtilizada value) {
            this.tecnicaUtilizada = value;
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
         * Obtém o valor da propriedade valor.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getValor() {
            return valor;
        }

        /**
         * Define o valor da propriedade valor.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setValor(JAXBElement<BigDecimal> value) {
            this.valor = value;
        }

        /**
         * Obtém o valor da propriedade valorTotal.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getValorTotal() {
            return valorTotal;
        }

        /**
         * Define o valor da propriedade valorTotal.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setValorTotal(JAXBElement<BigDecimal> value) {
            this.valorTotal = value;
        }

    }

}
