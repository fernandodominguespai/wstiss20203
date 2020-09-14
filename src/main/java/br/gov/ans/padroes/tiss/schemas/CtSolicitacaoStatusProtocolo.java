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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_solicitacaoStatusProtocolo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_solicitacaoStatusProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="detalheProtocolo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo" maxOccurs="unbounded"/>
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
@XmlType(name = "ct_solicitacaoStatusProtocolo", propOrder = {
    "dadosPrestador",
    "dataSolicitacao",
    "detalheProtocolo"
})
public class CtSolicitacaoStatusProtocolo {

    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitacao;
    @XmlElement(required = true)
    protected CtSolicitacaoStatusProtocolo.DetalheProtocolo detalheProtocolo;

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
     * Obtém o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitacao(XMLGregorianCalendar value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade detalheProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitacaoStatusProtocolo.DetalheProtocolo }
     *     
     */
    public CtSolicitacaoStatusProtocolo.DetalheProtocolo getDetalheProtocolo() {
        return detalheProtocolo;
    }

    /**
     * Define o valor da propriedade detalheProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitacaoStatusProtocolo.DetalheProtocolo }
     *     
     */
    public void setDetalheProtocolo(CtSolicitacaoStatusProtocolo.DetalheProtocolo value) {
        this.detalheProtocolo = value;
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
     *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo" maxOccurs="unbounded"/>
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
        "numeroProtocolo"
    })
    public static class DetalheProtocolo {

        @XmlElement(required = true)
        protected List<String> numeroProtocolo;

        /**
         * Gets the value of the numeroProtocolo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the numeroProtocolo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNumeroProtocolo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNumeroProtocolo() {
            if (numeroProtocolo == null) {
                numeroProtocolo = new ArrayList<String>();
            }
            return this.numeroProtocolo;
        }

    }

}
