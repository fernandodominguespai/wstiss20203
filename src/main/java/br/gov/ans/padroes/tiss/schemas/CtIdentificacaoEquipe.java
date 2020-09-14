//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_identificacaoEquipe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoEquipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="membroEquipe" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorEquipe"/>
 *                   &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
 *                   &lt;element name="cpf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF" minOccurs="0"/>
 *                   &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoEquipe", propOrder = {
    "membroEquipe"
})
public class CtIdentificacaoEquipe {

    @XmlElement(required = true)
    protected List<CtIdentificacaoEquipe.MembroEquipe> membroEquipe;

    /**
     * Gets the value of the membroEquipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membroEquipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembroEquipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtIdentificacaoEquipe.MembroEquipe }
     * 
     * 
     */
    public List<CtIdentificacaoEquipe.MembroEquipe> getMembroEquipe() {
        if (membroEquipe == null) {
            membroEquipe = new ArrayList<CtIdentificacaoEquipe.MembroEquipe>();
        }
        return this.membroEquipe;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="codigoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoPrestadorEquipe"/>
     *         &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
     *         &lt;element name="cpf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF" minOccurs="0"/>
     *         &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigoProfissional",
        "identificacaoProfissional",
        "cpf",
        "posicaoProfissional"
    })
    public static class MembroEquipe {

        @XmlElement(required = true)
        protected CtIdentificacaoPrestadorEquipe codigoProfissional;
        @XmlElement(required = true)
        protected CtProfissionalExecutante identificacaoProfissional;
        protected String cpf;
        @XmlElement(required = true)
        protected String posicaoProfissional;

        /**
         * Obtém o valor da propriedade codigoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentificacaoPrestadorEquipe }
         *     
         */
        public CtIdentificacaoPrestadorEquipe getCodigoProfissional() {
            return codigoProfissional;
        }

        /**
         * Define o valor da propriedade codigoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentificacaoPrestadorEquipe }
         *     
         */
        public void setCodigoProfissional(CtIdentificacaoPrestadorEquipe value) {
            this.codigoProfissional = value;
        }

        /**
         * Obtém o valor da propriedade identificacaoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public CtProfissionalExecutante getIdentificacaoProfissional() {
            return identificacaoProfissional;
        }

        /**
         * Define o valor da propriedade identificacaoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public void setIdentificacaoProfissional(CtProfissionalExecutante value) {
            this.identificacaoProfissional = value;
        }

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
         * Obtém o valor da propriedade posicaoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosicaoProfissional() {
            return posicaoProfissional;
        }

        /**
         * Define o valor da propriedade posicaoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosicaoProfissional(String value) {
            this.posicaoProfissional = value;
        }

    }

}
