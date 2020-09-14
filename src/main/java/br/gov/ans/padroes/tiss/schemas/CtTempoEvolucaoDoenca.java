//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_tempoEvolucaoDoenca complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_tempoEvolucaoDoenca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro"/>
 *         &lt;element name="unidadeTempo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_unidadeTempo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_tempoEvolucaoDoenca", propOrder = {
    "valor",
    "unidadeTempo"
})
public class CtTempoEvolucaoDoenca {

    @XmlElement(required = true)
    protected BigInteger valor;
    @XmlElement(required = true)
    protected StUnidadeTempo unidadeTempo;

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValor(BigInteger value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade unidadeTempo.
     * 
     * @return
     *     possible object is
     *     {@link StUnidadeTempo }
     *     
     */
    public StUnidadeTempo getUnidadeTempo() {
        return unidadeTempo;
    }

    /**
     * Define o valor da propriedade unidadeTempo.
     * 
     * @param value
     *     allowed object is
     *     {@link StUnidadeTempo }
     *     
     */
    public void setUnidadeTempo(StUnidadeTempo value) {
        this.unidadeTempo = value;
    }

}
