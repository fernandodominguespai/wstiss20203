//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_situacaoAutorizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoAutorizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimento">
 *                 &lt;sequence>
 *                   &lt;element name="totalOdonto" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="totalvalor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *                             &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *                             &lt;element name="totalquantidadeUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ct_diariaProrrogacaoAutorizada" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao">
 *                           &lt;sequence>
 *                             &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
 *                             &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *                             &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "ct_situacaoAutorizacao", propOrder = {
    "dadosAutorizacao"
})
public class CtSituacaoAutorizacao {

    @XmlElement(required = true)
    protected List<CtSituacaoAutorizacao.DadosAutorizacao> dadosAutorizacao;

    /**
     * Gets the value of the dadosAutorizacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosAutorizacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosAutorizacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtSituacaoAutorizacao.DadosAutorizacao }
     * 
     * 
     */
    public List<CtSituacaoAutorizacao.DadosAutorizacao> getDadosAutorizacao() {
        if (dadosAutorizacao == null) {
            dadosAutorizacao = new ArrayList<CtSituacaoAutorizacao.DadosAutorizacao>();
        }
        return this.dadosAutorizacao;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimento">
     *       &lt;sequence>
     *         &lt;element name="totalOdonto" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="totalvalor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
     *                   &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
     *                   &lt;element name="totalquantidadeUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ct_diariaProrrogacaoAutorizada" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao">
     *                 &lt;sequence>
     *                   &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
     *                   &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
     *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalOdonto",
        "ctDiariaProrrogacaoAutorizada"
    })
    public static class DadosAutorizacao
        extends CtAutorizacaoProcedimento
    {

        protected CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto totalOdonto;
        @XmlElement(name = "ct_diariaProrrogacaoAutorizada")
        protected CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada ctDiariaProrrogacaoAutorizada;

        /**
         * Obtém o valor da propriedade totalOdonto.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto }
         *     
         */
        public CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto getTotalOdonto() {
            return totalOdonto;
        }

        /**
         * Define o valor da propriedade totalOdonto.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto }
         *     
         */
        public void setTotalOdonto(CtSituacaoAutorizacao.DadosAutorizacao.TotalOdonto value) {
            this.totalOdonto = value;
        }

        /**
         * Obtém o valor da propriedade ctDiariaProrrogacaoAutorizada.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada }
         *     
         */
        public CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada getCtDiariaProrrogacaoAutorizada() {
            return ctDiariaProrrogacaoAutorizada;
        }

        /**
         * Define o valor da propriedade ctDiariaProrrogacaoAutorizada.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada }
         *     
         */
        public void setCtDiariaProrrogacaoAutorizada(CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada value) {
            this.ctDiariaProrrogacaoAutorizada = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao">
         *       &lt;sequence>
         *         &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
         *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
         *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tipoAcomodacaoAutorizada",
            "quantidadeAutorizada",
            "motivoGlosa"
        })
        public static class CtDiariaProrrogacaoAutorizada
            extends CtDiariaProrrogacao
        {

            protected String tipoAcomodacaoAutorizada;
            protected BigDecimal quantidadeAutorizada;
            protected CtMotivoGlosa motivoGlosa;

            /**
             * Obtém o valor da propriedade tipoAcomodacaoAutorizada.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoAcomodacaoAutorizada() {
                return tipoAcomodacaoAutorizada;
            }

            /**
             * Define o valor da propriedade tipoAcomodacaoAutorizada.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoAcomodacaoAutorizada(String value) {
                this.tipoAcomodacaoAutorizada = value;
            }

            /**
             * Obtém o valor da propriedade quantidadeAutorizada.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQuantidadeAutorizada() {
                return quantidadeAutorizada;
            }

            /**
             * Define o valor da propriedade quantidadeAutorizada.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQuantidadeAutorizada(BigDecimal value) {
                this.quantidadeAutorizada = value;
            }

            /**
             * Obtém o valor da propriedade motivoGlosa.
             * 
             * @return
             *     possible object is
             *     {@link CtMotivoGlosa }
             *     
             */
            public CtMotivoGlosa getMotivoGlosa() {
                return motivoGlosa;
            }

            /**
             * Define o valor da propriedade motivoGlosa.
             * 
             * @param value
             *     allowed object is
             *     {@link CtMotivoGlosa }
             *     
             */
            public void setMotivoGlosa(CtMotivoGlosa value) {
                this.motivoGlosa = value;
            }

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
         *         &lt;element name="totalvalor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
         *         &lt;element name="totalFranquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
         *         &lt;element name="totalquantidadeUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
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
            "totalvalor",
            "totalFranquiaCoparticipacao",
            "totalquantidadeUS"
        })
        public static class TotalOdonto {

            protected BigDecimal totalvalor;
            protected BigDecimal totalFranquiaCoparticipacao;
            protected BigDecimal totalquantidadeUS;

            /**
             * Obtém o valor da propriedade totalvalor.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalvalor() {
                return totalvalor;
            }

            /**
             * Define o valor da propriedade totalvalor.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalvalor(BigDecimal value) {
                this.totalvalor = value;
            }

            /**
             * Obtém o valor da propriedade totalFranquiaCoparticipacao.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalFranquiaCoparticipacao() {
                return totalFranquiaCoparticipacao;
            }

            /**
             * Define o valor da propriedade totalFranquiaCoparticipacao.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalFranquiaCoparticipacao(BigDecimal value) {
                this.totalFranquiaCoparticipacao = value;
            }

            /**
             * Obtém o valor da propriedade totalquantidadeUS.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalquantidadeUS() {
                return totalquantidadeUS;
            }

            /**
             * Define o valor da propriedade totalquantidadeUS.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalquantidadeUS(BigDecimal value) {
                this.totalquantidadeUS = value;
            }

        }

    }

}
