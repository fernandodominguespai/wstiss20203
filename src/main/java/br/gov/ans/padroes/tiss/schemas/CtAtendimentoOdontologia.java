//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_atendimentoOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_atendimentoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataTerminoTratamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_atendimentoOdonto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_atendimentoOdontologia", propOrder = {
    "dataTerminoTratamento",
    "tipoAtendimento"
})
public class CtAtendimentoOdontologia {

    protected XMLGregorianCalendar dataTerminoTratamento;
    protected String tipoAtendimento;

    /**
     * Obtém o valor da propriedade dataTerminoTratamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTerminoTratamento() {
        return dataTerminoTratamento;
    }

    /**
     * Define o valor da propriedade dataTerminoTratamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTerminoTratamento(XMLGregorianCalendar value) {
        this.dataTerminoTratamento = value;
    }

    /**
     * Obtém o valor da propriedade tipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Define o valor da propriedade tipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
    }

}
