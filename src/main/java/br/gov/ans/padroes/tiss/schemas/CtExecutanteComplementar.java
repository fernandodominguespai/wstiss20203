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
 * <p>Classe Java de ct_executanteComplementar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_executanteComplementar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoProfissionalCompl" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestador"/>
 *         &lt;element name="nomeProfissionalCompl" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_executanteComplementar", propOrder = {
    "codigoProfissionalCompl",
    "nomeProfissionalCompl"
})
public class CtExecutanteComplementar {

    @XmlElement(required = true)
    protected CtIdentificacaoPrestador codigoProfissionalCompl;
    @XmlElement(required = true)
    protected String nomeProfissionalCompl;

    /**
     * Obtém o valor da propriedade codigoProfissionalCompl.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoPrestador }
     *     
     */
    public CtIdentificacaoPrestador getCodigoProfissionalCompl() {
        return codigoProfissionalCompl;
    }

    /**
     * Define o valor da propriedade codigoProfissionalCompl.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoPrestador }
     *     
     */
    public void setCodigoProfissionalCompl(CtIdentificacaoPrestador value) {
        this.codigoProfissionalCompl = value;
    }

    /**
     * Obtém o valor da propriedade nomeProfissionalCompl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfissionalCompl() {
        return nomeProfissionalCompl;
    }

    /**
     * Define o valor da propriedade nomeProfissionalCompl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfissionalCompl(String value) {
        this.nomeProfissionalCompl = value;
    }

}
