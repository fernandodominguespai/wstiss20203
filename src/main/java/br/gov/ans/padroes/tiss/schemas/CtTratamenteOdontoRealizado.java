//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_tratamenteOdontoRealizado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_tratamenteOdontoRealizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="dente" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dente"/>
 *         &lt;element name="face" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_face"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_tratamenteOdontoRealizado", propOrder = {
    "data",
    "procedimento",
    "dente",
    "face"
})
public class CtTratamenteOdontoRealizado {

    @XmlElement(required = true)
    protected XMLGregorianCalendar data;
    @XmlElement(required = true)
    protected CtTabela procedimento;
    @XmlElement(required = true)
    protected String dente;
    @XmlElement(required = true)
    protected String face;

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
     * Obtém o valor da propriedade dente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDente() {
        return dente;
    }

    /**
     * Define o valor da propriedade dente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDente(String value) {
        this.dente = value;
    }

    /**
     * Obtém o valor da propriedade face.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFace() {
        return face;
    }

    /**
     * Define o valor da propriedade face.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFace(String value) {
        this.face = value;
    }

}
