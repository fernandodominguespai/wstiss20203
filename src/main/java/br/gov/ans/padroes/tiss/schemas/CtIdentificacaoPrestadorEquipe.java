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
 * <p>Classe Java de ct_identificacaoPrestadorEquipe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoPrestadorEquipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="cpf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoPrestadorNaOperadora"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoPrestadorEquipe", propOrder = {
    "cpf",
    "codigoPrestadorNaOperadora",
    "conselhoProfissional"
})
public class CtIdentificacaoPrestadorEquipe {

    protected String cpf;
    protected String codigoPrestadorNaOperadora;
    protected CtConselhoProfissional conselhoProfissional;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade codigoPrestadorNaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    /**
     * Define o valor da propriedade codigoPrestadorNaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrestadorNaOperadora(String value) {
        this.codigoPrestadorNaOperadora = value;
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

}
