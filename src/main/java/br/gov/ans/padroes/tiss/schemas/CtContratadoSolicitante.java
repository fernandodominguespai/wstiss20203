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
 * <p>Classe Java de ct_contratadoSolicitante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_contratadoSolicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestador"/>
 *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_nome"/>
 *         &lt;element name="enderecoContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_endereco" minOccurs="0"/>
 *         &lt;element name="numeroCNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contratadoSolicitante", propOrder = {
    "identificacao",
    "nomeContratado",
    "enderecoContratado",
    "numeroCNES"
})
public class CtContratadoSolicitante {

    @XmlElement(required = true)
    protected CtIdentificacaoPrestador identificacao;
    @XmlElement(required = true)
    protected String nomeContratado;
    protected CtEndereco enderecoContratado;
    protected String numeroCNES;

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoPrestador }
     *     
     */
    public CtIdentificacaoPrestador getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoPrestador }
     *     
     */
    public void setIdentificacao(CtIdentificacaoPrestador value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade nomeContratado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContratado() {
        return nomeContratado;
    }

    /**
     * Define o valor da propriedade nomeContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContratado(String value) {
        this.nomeContratado = value;
    }

    /**
     * Obtém o valor da propriedade enderecoContratado.
     * 
     * @return
     *     possible object is
     *     {@link CtEndereco }
     *     
     */
    public CtEndereco getEnderecoContratado() {
        return enderecoContratado;
    }

    /**
     * Define o valor da propriedade enderecoContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtEndereco }
     *     
     */
    public void setEnderecoContratado(CtEndereco value) {
        this.enderecoContratado = value;
    }

    /**
     * Obtém o valor da propriedade numeroCNES.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNES() {
        return numeroCNES;
    }

    /**
     * Define o valor da propriedade numeroCNES.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNES(String value) {
        this.numeroCNES = value;
    }

}
