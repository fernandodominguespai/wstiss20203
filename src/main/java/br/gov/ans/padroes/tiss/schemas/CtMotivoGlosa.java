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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_motivoGlosa complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_motivoGlosa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoGlosa"/>
 *         &lt;element name="descricaoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricaoGlosa"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_motivoGlosa", propOrder = {
    "codigoGlosa",
    "descricaoGlosa"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CabecalhoTransacao.FalhaNegocio.class
})
public class CtMotivoGlosa {

    @XmlElement(required = true)
    protected String codigoGlosa;
    @XmlElement(required = true)
    protected String descricaoGlosa;

    /**
     * Obtém o valor da propriedade codigoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGlosa() {
        return codigoGlosa;
    }

    /**
     * Define o valor da propriedade codigoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGlosa(String value) {
        this.codigoGlosa = value;
    }

    /**
     * Obtém o valor da propriedade descricaoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoGlosa() {
        return descricaoGlosa;
    }

    /**
     * Define o valor da propriedade descricaoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoGlosa(String value) {
        this.descricaoGlosa = value;
    }

}
