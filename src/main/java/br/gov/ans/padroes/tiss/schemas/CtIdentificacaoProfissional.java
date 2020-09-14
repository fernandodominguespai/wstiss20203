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


/**
 * <p>Classe Java de ct_identificacaoProfissional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoProfissional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
 *         &lt;element name="cbos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CBOS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoProfissional", propOrder = {
    "nomeProfissional",
    "conselhoProfissional",
    "cbos"
})
public class CtIdentificacaoProfissional {

    protected String nomeProfissional;
    @XmlElement(required = true)
    protected CtConselhoProfissional conselhoProfissional;
    protected String cbos;

    /**
     * Obtém o valor da propriedade nomeProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfissional() {
        return nomeProfissional;
    }

    /**
     * Define o valor da propriedade nomeProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfissional(String value) {
        this.nomeProfissional = value;
    }

    /**
     * Obtém o valor da propriedade conselhoProfissional.
     * 
     * @return
     *     possible object is
     *     {@link CtConselhoProfissional }
     *     
     */
    public CtConselhoProfissional getConselhoProfissional() {
        return conselhoProfissional;
    }

    /**
     * Define o valor da propriedade conselhoProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link CtConselhoProfissional }
     *     
     */
    public void setConselhoProfissional(CtConselhoProfissional value) {
        this.conselhoProfissional = value;
    }

    /**
     * Obtém o valor da propriedade cbos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbos() {
        return cbos;
    }

    /**
     * Define o valor da propriedade cbos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbos(String value) {
        this.cbos = value;
    }

}
