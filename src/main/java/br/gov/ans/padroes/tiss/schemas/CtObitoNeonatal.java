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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_obitoNeonatal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_obitoNeonatal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="qtdeobitoPrecoce" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeObito" minOccurs="0"/>
 *         &lt;element name="qtdeobitoTardio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeObito" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_obitoNeonatal", propOrder = {
    "qtdeobitoPrecoce",
    "qtdeobitoTardio"
})
public class CtObitoNeonatal {

    protected BigInteger qtdeobitoPrecoce;
    protected BigInteger qtdeobitoTardio;

    /**
     * Obtém o valor da propriedade qtdeobitoPrecoce.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdeobitoPrecoce() {
        return qtdeobitoPrecoce;
    }

    /**
     * Define o valor da propriedade qtdeobitoPrecoce.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdeobitoPrecoce(BigInteger value) {
        this.qtdeobitoPrecoce = value;
    }

    /**
     * Obtém o valor da propriedade qtdeobitoTardio.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdeobitoTardio() {
        return qtdeobitoTardio;
    }

    /**
     * Define o valor da propriedade qtdeobitoTardio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdeobitoTardio(BigInteger value) {
        this.qtdeobitoTardio = value;
    }

}
