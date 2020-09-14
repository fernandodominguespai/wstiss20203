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
 * <p>Classe Java de ct_loteAnexo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loteAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *         &lt;element name="anexoGuia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoSituacaoInicial"/>
 *                 &lt;/choice>
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
@XmlType(name = "ct_loteAnexo", propOrder = {
    "numeroLote",
    "anexoGuia"
})
public class CtLoteAnexo {

    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected CtLoteAnexo.AnexoGuia anexoGuia;

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade anexoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtLoteAnexo.AnexoGuia }
     *     
     */
    public CtLoteAnexo.AnexoGuia getAnexoGuia() {
        return anexoGuia;
    }

    /**
     * Define o valor da propriedade anexoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoteAnexo.AnexoGuia }
     *     
     */
    public void setAnexoGuia(CtLoteAnexo.AnexoGuia value) {
        this.anexoGuia = value;
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
     *       &lt;choice>
     *         &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoSituacaoInicial"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anexoSituacaoInicial"
    })
    public static class AnexoGuia {

        protected CtAnexoSituacaoInicial anexoSituacaoInicial;

        /**
         * Obtém o valor da propriedade anexoSituacaoInicial.
         * 
         * @return
         *     possible object is
         *     {@link CtAnexoSituacaoInicial }
         *     
         */
        public CtAnexoSituacaoInicial getAnexoSituacaoInicial() {
            return anexoSituacaoInicial;
        }

        /**
         * Define o valor da propriedade anexoSituacaoInicial.
         * 
         * @param value
         *     allowed object is
         *     {@link CtAnexoSituacaoInicial }
         *     
         */
        public void setAnexoSituacaoInicial(CtAnexoSituacaoInicial value) {
            this.anexoSituacaoInicial = value;
        }

    }

}
