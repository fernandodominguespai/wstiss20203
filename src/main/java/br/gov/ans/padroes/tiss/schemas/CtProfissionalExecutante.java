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
 * <p>Classe Java de ct_profissionalExecutante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_profissionalExecutante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome" minOccurs="0"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
 *         &lt;element name="codigoCBOS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CBOS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_profissionalExecutante", propOrder = {
    "nomeExecutante",
    "conselhoProfissional",
    "codigoCBOS"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaSPSADT.PrestadorExecutante.ProfissionalExecutanteCompl.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaSPSADTReapresentacao.PrestadorExecutante.ProfissionalExecutanteCompl.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaSolicitacaoOdonto.DadosSolicitante.DadosProfissional.class
})
public class CtProfissionalExecutante {

    protected String nomeExecutante;
    @XmlElement(required = true)
    protected CtConselhoProfissional conselhoProfissional;
    protected String codigoCBOS;

    /**
     * Obtém o valor da propriedade nomeExecutante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeExecutante() {
        return nomeExecutante;
    }

    /**
     * Define o valor da propriedade nomeExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeExecutante(String value) {
        this.nomeExecutante = value;
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
     * Obtém o valor da propriedade codigoCBOS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCBOS() {
        return codigoCBOS;
    }

    /**
     * Define o valor da propriedade codigoCBOS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCBOS(String value) {
        this.codigoCBOS = value;
    }

}
