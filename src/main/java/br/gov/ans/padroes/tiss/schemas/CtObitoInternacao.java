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
 * <p>Classe Java de ct_obitoInternacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_obitoInternacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CID" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico" minOccurs="0"/>
 *         &lt;element name="numeroDeclaracao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_obitoInternacao", propOrder = {
    "cid",
    "numeroDeclaracao"
})
public class CtObitoInternacao {

    @XmlElement(name = "CID")
    protected CtDiagnostico cid;
    protected String numeroDeclaracao;

    /**
     * Obtém o valor da propriedade cid.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnostico }
     *     
     */
    public CtDiagnostico getCID() {
        return cid;
    }

    /**
     * Define o valor da propriedade cid.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnostico }
     *     
     */
    public void setCID(CtDiagnostico value) {
        this.cid = value;
    }

    /**
     * Obtém o valor da propriedade numeroDeclaracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDeclaracao() {
        return numeroDeclaracao;
    }

    /**
     * Define o valor da propriedade numeroDeclaracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDeclaracao(String value) {
        this.numeroDeclaracao = value;
    }

}
