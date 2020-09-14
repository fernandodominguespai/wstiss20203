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
 * <p>Classe Java de ct_cabecalhoDemonstrativo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_cabecalhoDemonstrativo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao20"/>
 *         &lt;element name="dataEmissao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_cabecalhoDemonstrativo", propOrder = {
    "numeroDemonstrativo",
    "dataEmissao"
})
public class CtCabecalhoDemonstrativo {

    @XmlElement(required = true)
    protected String numeroDemonstrativo;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEmissao;

    /**
     * Obtém o valor da propriedade numeroDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDemonstrativo() {
        return numeroDemonstrativo;
    }

    /**
     * Define o valor da propriedade numeroDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDemonstrativo(String value) {
        this.numeroDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade dataEmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Define o valor da propriedade dataEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

}
