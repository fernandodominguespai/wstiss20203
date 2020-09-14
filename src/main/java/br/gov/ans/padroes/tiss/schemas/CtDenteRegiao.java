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


/**
 * <p>Classe Java de ct_denteRegiao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_denteRegiao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="dente" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dente"/>
 *         &lt;element name="regiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_regiao"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_denteRegiao", propOrder = {
    "dente",
    "regiao"
})
public class CtDenteRegiao {

    protected String dente;
    protected StRegiao regiao;

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
     * Obtém o valor da propriedade regiao.
     * 
     * @return
     *     possible object is
     *     {@link StRegiao }
     *     
     */
    public StRegiao getRegiao() {
        return regiao;
    }

    /**
     * Define o valor da propriedade regiao.
     * 
     * @param value
     *     allowed object is
     *     {@link StRegiao }
     *     
     */
    public void setRegiao(StRegiao value) {
        this.regiao = value;
    }

}
