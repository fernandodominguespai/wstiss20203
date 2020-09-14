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
 * <p>Classe Java de ct_situacaoInicial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoInicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
 *         &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoInicial", propOrder = {
    "situacaoClinica",
    "doencaPeriodontal",
    "alteracaoTecidoMole",
    "observacao"
})
public class CtSituacaoInicial {

    @XmlElement(required = true)
    protected CtSituacaoClinica situacaoClinica;
    protected Boolean doencaPeriodontal;
    protected Boolean alteracaoTecidoMole;
    protected String observacao;

    /**
     * Obtém o valor da propriedade situacaoClinica.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoClinica }
     *     
     */
    public CtSituacaoClinica getSituacaoClinica() {
        return situacaoClinica;
    }

    /**
     * Define o valor da propriedade situacaoClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoClinica }
     *     
     */
    public void setSituacaoClinica(CtSituacaoClinica value) {
        this.situacaoClinica = value;
    }

    /**
     * Obtém o valor da propriedade doencaPeriodontal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoencaPeriodontal() {
        return doencaPeriodontal;
    }

    /**
     * Define o valor da propriedade doencaPeriodontal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoencaPeriodontal(Boolean value) {
        this.doencaPeriodontal = value;
    }

    /**
     * Obtém o valor da propriedade alteracaoTecidoMole.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlteracaoTecidoMole() {
        return alteracaoTecidoMole;
    }

    /**
     * Define o valor da propriedade alteracaoTecidoMole.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlteracaoTecidoMole(Boolean value) {
        this.alteracaoTecidoMole = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

}
