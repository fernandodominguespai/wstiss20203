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
 * <p>Classe Java de ct_solicitante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_solicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
 *         &lt;element name="profissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_solicitante", propOrder = {
    "contratado",
    "profissional"
})
public class CtSolicitante {

    @XmlElement(required = true)
    protected CtContratadoSolicitante contratado;
    @XmlElement(required = true)
    protected CtIdentificacaoProfissional profissional;

    /**
     * Obtém o valor da propriedade contratado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoSolicitante }
     *     
     */
    public CtContratadoSolicitante getContratado() {
        return contratado;
    }

    /**
     * Define o valor da propriedade contratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoSolicitante }
     *     
     */
    public void setContratado(CtContratadoSolicitante value) {
        this.contratado = value;
    }

    /**
     * Obtém o valor da propriedade profissional.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public CtIdentificacaoProfissional getProfissional() {
        return profissional;
    }

    /**
     * Define o valor da propriedade profissional.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public void setProfissional(CtIdentificacaoProfissional value) {
        this.profissional = value;
    }

}
