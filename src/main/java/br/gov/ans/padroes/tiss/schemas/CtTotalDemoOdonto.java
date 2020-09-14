//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_totalDemoOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_totalDemoOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorTotalGeralGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalGeralLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_totalDemoOdonto", propOrder = {
    "valorTotalGeralGlosa",
    "valorTotalGeralLiberado",
    "valorTotalProcessadoGuia"
})
public class CtTotalDemoOdonto {

    @XmlElement(required = true)
    protected BigDecimal valorTotalGeralGlosa;
    @XmlElement(required = true)
    protected BigDecimal valorTotalGeralLiberado;
    @XmlElement(required = true)
    protected BigDecimal valorTotalProcessadoGuia;

    /**
     * Obtém o valor da propriedade valorTotalGeralGlosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGeralGlosa() {
        return valorTotalGeralGlosa;
    }

    /**
     * Define o valor da propriedade valorTotalGeralGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGeralGlosa(BigDecimal value) {
        this.valorTotalGeralGlosa = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalGeralLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGeralLiberado() {
        return valorTotalGeralLiberado;
    }

    /**
     * Define o valor da propriedade valorTotalGeralLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGeralLiberado(BigDecimal value) {
        this.valorTotalGeralLiberado = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalProcessadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalProcessadoGuia() {
        return valorTotalProcessadoGuia;
    }

    /**
     * Define o valor da propriedade valorTotalProcessadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalProcessadoGuia(BigDecimal value) {
        this.valorTotalProcessadoGuia = value;
    }

}
