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
 * <p>Classe Java de ct_situacaoDentes complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoDentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dente" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dente"/>
 *         &lt;element name="obturado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao"/>
 *         &lt;element name="careado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao"/>
 *         &lt;element name="perdido" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoDentes", propOrder = {
    "dente",
    "obturado",
    "careado",
    "perdido"
})
public class CtSituacaoDentes {

    @XmlElement(required = true)
    protected String dente;
    protected boolean obturado;
    protected boolean careado;
    protected boolean perdido;

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
     * Obtém o valor da propriedade obturado.
     * 
     */
    public boolean isObturado() {
        return obturado;
    }

    /**
     * Define o valor da propriedade obturado.
     * 
     */
    public void setObturado(boolean value) {
        this.obturado = value;
    }

    /**
     * Obtém o valor da propriedade careado.
     * 
     */
    public boolean isCareado() {
        return careado;
    }

    /**
     * Define o valor da propriedade careado.
     * 
     */
    public void setCareado(boolean value) {
        this.careado = value;
    }

    /**
     * Obtém o valor da propriedade perdido.
     * 
     */
    public boolean isPerdido() {
        return perdido;
    }

    /**
     * Define o valor da propriedade perdido.
     * 
     */
    public void setPerdido(boolean value) {
        this.perdido = value;
    }

}
