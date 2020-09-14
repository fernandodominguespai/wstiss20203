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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="cabecalho" type="{http://www.ans.gov.br/padroes/tiss/schemas}cabecalhoTransacao"/>
 *         &lt;choice>
 *           &lt;element name="operadoraParaPrestador" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="protocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloRecebimento" minOccurs="0"/>
 *                     &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloRecebimentoAnexo" minOccurs="0"/>
 *                     &lt;element name="demonstrativosRetorno" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="demonstrativoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoAnaliseConta" maxOccurs="30"/>
 *                               &lt;element name="demonstrativoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoOdontologia" maxOccurs="30"/>
 *                               &lt;element name="demonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoPagamento" maxOccurs="30"/>
 *                               &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" maxOccurs="30"/>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_StatusProtocolo" minOccurs="0"/>
 *                     &lt;element name="autorizacaoServico" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimento">
 *                             &lt;sequence>
 *                               &lt;element name="diariaProrrogacaoAutorizada" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao">
 *                                       &lt;sequence>
 *                                         &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
 *                                         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *                                         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="autorizacaoServicoOdonto" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimentoOdonto">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="situacaoAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
 *                     &lt;element name="respostaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_retornoElegibilidade" minOccurs="0"/>
 *                     &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboCancelaGuia" minOccurs="0"/>
 *                     &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboComunicacaoBeneficiario" minOccurs="0"/>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="prestadorParaOperadora" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;choice>
 *                     &lt;element name="loteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteGuias" minOccurs="0"/>
 *                     &lt;element name="loteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexo" minOccurs="0"/>
 *                     &lt;element name="solicitacaoDemonstrativoRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoDemonstrativoPagamento" minOccurs="0"/>
 *                     &lt;element name="solicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoStatusProtocolo" minOccurs="0"/>
 *                     &lt;element name="solicitacaoProcedimento" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="guiaSolicInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicInternacao" minOccurs="0"/>
 *                               &lt;element name="guiaSolicitacaoSADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoSP_SADT" minOccurs="0"/>
 *                               &lt;element name="guiaSolicitacaoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoOdonto" minOccurs="0"/>
 *                               &lt;element name="guiaSolicitacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoProrrogacao" minOccurs="0"/>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="solicitaStatusAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitaStatusAutorizacao" minOccurs="0"/>
 *                     &lt;element name="verificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitaElegibilidade" minOccurs="0"/>
 *                     &lt;element name="cancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cancelaGuia" minOccurs="0"/>
 *                     &lt;element name="comunicacaoBeneficiario" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_comunicacaoBeneficiario">
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="epilogo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "cabecalho",
    "operadoraParaPrestador",
    "prestadorParaOperadora",
    "epilogo"
})
@XmlRootElement(name = "mensagemTISS")
public class MensagemTISS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    protected MensagemTISS.OperadoraParaPrestador operadoraParaPrestador;
    protected MensagemTISS.PrestadorParaOperadora prestadorParaOperadora;
    @XmlElement(required = true)
    protected MensagemTISS.Epilogo epilogo;

    /**
     * Obtém o valor da propriedade cabecalho.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public CabecalhoTransacao getCabecalho() {
        return cabecalho;
    }

    /**
     * Define o valor da propriedade cabecalho.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public void setCabecalho(CabecalhoTransacao value) {
        this.cabecalho = value;
    }

    /**
     * Obtém o valor da propriedade operadoraParaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link MensagemTISS.OperadoraParaPrestador }
     *     
     */
    public MensagemTISS.OperadoraParaPrestador getOperadoraParaPrestador() {
        return operadoraParaPrestador;
    }

    /**
     * Define o valor da propriedade operadoraParaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemTISS.OperadoraParaPrestador }
     *     
     */
    public void setOperadoraParaPrestador(MensagemTISS.OperadoraParaPrestador value) {
        this.operadoraParaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade prestadorParaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link MensagemTISS.PrestadorParaOperadora }
     *     
     */
    public MensagemTISS.PrestadorParaOperadora getPrestadorParaOperadora() {
        return prestadorParaOperadora;
    }

    /**
     * Define o valor da propriedade prestadorParaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemTISS.PrestadorParaOperadora }
     *     
     */
    public void setPrestadorParaOperadora(MensagemTISS.PrestadorParaOperadora value) {
        this.prestadorParaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade epilogo.
     * 
     * @return
     *     possible object is
     *     {@link MensagemTISS.Epilogo }
     *     
     */
    public MensagemTISS.Epilogo getEpilogo() {
        return epilogo;
    }

    /**
     * Define o valor da propriedade epilogo.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemTISS.Epilogo }
     *     
     */
    public void setEpilogo(MensagemTISS.Epilogo value) {
        this.epilogo = value;
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
     *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "hash"
    })
    public static class Epilogo {

        @XmlElement(required = true)
        protected String hash;

        /**
         * Obtém o valor da propriedade hash.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHash() {
            return hash;
        }

        /**
         * Define o valor da propriedade hash.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHash(String value) {
            this.hash = value;
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
     *       &lt;choice>
     *         &lt;element name="protocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloRecebimento" minOccurs="0"/>
     *         &lt;element name="protocoloRecebimentoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloRecebimentoAnexo" minOccurs="0"/>
     *         &lt;element name="demonstrativosRetorno" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="demonstrativoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoAnaliseConta" maxOccurs="30"/>
     *                   &lt;element name="demonstrativoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoOdontologia" maxOccurs="30"/>
     *                   &lt;element name="demonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoPagamento" maxOccurs="30"/>
     *                   &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" maxOccurs="30"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_StatusProtocolo" minOccurs="0"/>
     *         &lt;element name="autorizacaoServico" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimento">
     *                 &lt;sequence>
     *                   &lt;element name="diariaProrrogacaoAutorizada" minOccurs="0">
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
     *         &lt;element name="autorizacaoServicoOdonto" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimentoOdonto">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="situacaoAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoAutorizacao" minOccurs="0"/>
     *         &lt;element name="respostaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_retornoElegibilidade" minOccurs="0"/>
     *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboCancelaGuia" minOccurs="0"/>
     *         &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_reciboComunicacaoBeneficiario" minOccurs="0"/>
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
        "protocoloRecebimento",
        "protocoloRecebimentoAnexo",
        "demonstrativosRetorno",
        "situacaoProtocolo",
        "autorizacaoServico",
        "autorizacaoServicoOdonto",
        "situacaoAutorizacao",
        "respostaElegibilidade",
        "reciboCancelaGuia",
        "reciboComunicacao"
    })
    public static class OperadoraParaPrestador {

        protected CtProtocoloRecebimento protocoloRecebimento;
        protected CtProtocoloRecebimentoAnexo protocoloRecebimentoAnexo;
        protected MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno demonstrativosRetorno;
        protected CtStatusProtocolo situacaoProtocolo;
        protected List<MensagemTISS.OperadoraParaPrestador.AutorizacaoServico> autorizacaoServico;
        protected MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto autorizacaoServicoOdonto;
        protected CtSituacaoAutorizacao situacaoAutorizacao;
        protected CtRetornoElegibilidade respostaElegibilidade;
        protected CtReciboCancelaGuia reciboCancelaGuia;
        protected CtReciboComunicacaoBeneficiario reciboComunicacao;

        /**
         * Obtém o valor da propriedade protocoloRecebimento.
         * 
         * @return
         *     possible object is
         *     {@link CtProtocoloRecebimento }
         *     
         */
        public CtProtocoloRecebimento getProtocoloRecebimento() {
            return protocoloRecebimento;
        }

        /**
         * Define o valor da propriedade protocoloRecebimento.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProtocoloRecebimento }
         *     
         */
        public void setProtocoloRecebimento(CtProtocoloRecebimento value) {
            this.protocoloRecebimento = value;
        }

        /**
         * Obtém o valor da propriedade protocoloRecebimentoAnexo.
         * 
         * @return
         *     possible object is
         *     {@link CtProtocoloRecebimentoAnexo }
         *     
         */
        public CtProtocoloRecebimentoAnexo getProtocoloRecebimentoAnexo() {
            return protocoloRecebimentoAnexo;
        }

        /**
         * Define o valor da propriedade protocoloRecebimentoAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProtocoloRecebimentoAnexo }
         *     
         */
        public void setProtocoloRecebimentoAnexo(CtProtocoloRecebimentoAnexo value) {
            this.protocoloRecebimentoAnexo = value;
        }

        /**
         * Obtém o valor da propriedade demonstrativosRetorno.
         * 
         * @return
         *     possible object is
         *     {@link MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno }
         *     
         */
        public MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno getDemonstrativosRetorno() {
            return demonstrativosRetorno;
        }

        /**
         * Define o valor da propriedade demonstrativosRetorno.
         * 
         * @param value
         *     allowed object is
         *     {@link MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno }
         *     
         */
        public void setDemonstrativosRetorno(MensagemTISS.OperadoraParaPrestador.DemonstrativosRetorno value) {
            this.demonstrativosRetorno = value;
        }

        /**
         * Obtém o valor da propriedade situacaoProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link CtStatusProtocolo }
         *     
         */
        public CtStatusProtocolo getSituacaoProtocolo() {
            return situacaoProtocolo;
        }

        /**
         * Define o valor da propriedade situacaoProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtStatusProtocolo }
         *     
         */
        public void setSituacaoProtocolo(CtStatusProtocolo value) {
            this.situacaoProtocolo = value;
        }

        /**
         * Gets the value of the autorizacaoServico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the autorizacaoServico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAutorizacaoServico().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServico }
         * 
         * 
         */
        public List<MensagemTISS.OperadoraParaPrestador.AutorizacaoServico> getAutorizacaoServico() {
            if (autorizacaoServico == null) {
                autorizacaoServico = new ArrayList<MensagemTISS.OperadoraParaPrestador.AutorizacaoServico>();
            }
            return this.autorizacaoServico;
        }

        /**
         * Obtém o valor da propriedade autorizacaoServicoOdonto.
         * 
         * @return
         *     possible object is
         *     {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto }
         *     
         */
        public MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto getAutorizacaoServicoOdonto() {
            return autorizacaoServicoOdonto;
        }

        /**
         * Define o valor da propriedade autorizacaoServicoOdonto.
         * 
         * @param value
         *     allowed object is
         *     {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto }
         *     
         */
        public void setAutorizacaoServicoOdonto(MensagemTISS.OperadoraParaPrestador.AutorizacaoServicoOdonto value) {
            this.autorizacaoServicoOdonto = value;
        }

        /**
         * Obtém o valor da propriedade situacaoAutorizacao.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoAutorizacao }
         *     
         */
        public CtSituacaoAutorizacao getSituacaoAutorizacao() {
            return situacaoAutorizacao;
        }

        /**
         * Define o valor da propriedade situacaoAutorizacao.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoAutorizacao }
         *     
         */
        public void setSituacaoAutorizacao(CtSituacaoAutorizacao value) {
            this.situacaoAutorizacao = value;
        }

        /**
         * Obtém o valor da propriedade respostaElegibilidade.
         * 
         * @return
         *     possible object is
         *     {@link CtRetornoElegibilidade }
         *     
         */
        public CtRetornoElegibilidade getRespostaElegibilidade() {
            return respostaElegibilidade;
        }

        /**
         * Define o valor da propriedade respostaElegibilidade.
         * 
         * @param value
         *     allowed object is
         *     {@link CtRetornoElegibilidade }
         *     
         */
        public void setRespostaElegibilidade(CtRetornoElegibilidade value) {
            this.respostaElegibilidade = value;
        }

        /**
         * Obtém o valor da propriedade reciboCancelaGuia.
         * 
         * @return
         *     possible object is
         *     {@link CtReciboCancelaGuia }
         *     
         */
        public CtReciboCancelaGuia getReciboCancelaGuia() {
            return reciboCancelaGuia;
        }

        /**
         * Define o valor da propriedade reciboCancelaGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link CtReciboCancelaGuia }
         *     
         */
        public void setReciboCancelaGuia(CtReciboCancelaGuia value) {
            this.reciboCancelaGuia = value;
        }

        /**
         * Obtém o valor da propriedade reciboComunicacao.
         * 
         * @return
         *     possible object is
         *     {@link CtReciboComunicacaoBeneficiario }
         *     
         */
        public CtReciboComunicacaoBeneficiario getReciboComunicacao() {
            return reciboComunicacao;
        }

        /**
         * Define o valor da propriedade reciboComunicacao.
         * 
         * @param value
         *     allowed object is
         *     {@link CtReciboComunicacaoBeneficiario }
         *     
         */
        public void setReciboComunicacao(CtReciboComunicacaoBeneficiario value) {
            this.reciboComunicacao = value;
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
         *         &lt;element name="diariaProrrogacaoAutorizada" minOccurs="0">
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
            "diariaProrrogacaoAutorizada"
        })
        public static class AutorizacaoServico
            extends CtAutorizacaoProcedimento
        {

            protected MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada diariaProrrogacaoAutorizada;

            /**
             * Obtém o valor da propriedade diariaProrrogacaoAutorizada.
             * 
             * @return
             *     possible object is
             *     {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada }
             *     
             */
            public MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada getDiariaProrrogacaoAutorizada() {
                return diariaProrrogacaoAutorizada;
            }

            /**
             * Define o valor da propriedade diariaProrrogacaoAutorizada.
             * 
             * @param value
             *     allowed object is
             *     {@link MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada }
             *     
             */
            public void setDiariaProrrogacaoAutorizada(MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada value) {
                this.diariaProrrogacaoAutorizada = value;
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
            public static class DiariaProrrogacaoAutorizada
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

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoProcedimentoOdonto">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AutorizacaoServicoOdonto
            extends CtAutorizacaoProcedimentoOdonto
        {


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
         *         &lt;element name="demonstrativoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoAnaliseConta" maxOccurs="30"/>
         *         &lt;element name="demonstrativoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoOdontologia" maxOccurs="30"/>
         *         &lt;element name="demonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoPagamento" maxOccurs="30"/>
         *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" maxOccurs="30"/>
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
            "demonstrativoAnaliseConta",
            "demonstrativoOdontologia",
            "demonstrativoPagamento",
            "mensagemErro"
        })
        public static class DemonstrativosRetorno {

            protected List<CtDemonstrativoAnaliseConta> demonstrativoAnaliseConta;
            protected List<CtDemonstrativoOdontologia> demonstrativoOdontologia;
            protected List<CtDemonstrativoPagamento> demonstrativoPagamento;
            protected List<String> mensagemErro;

            /**
             * Gets the value of the demonstrativoAnaliseConta property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the demonstrativoAnaliseConta property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDemonstrativoAnaliseConta().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtDemonstrativoAnaliseConta }
             * 
             * 
             */
            public List<CtDemonstrativoAnaliseConta> getDemonstrativoAnaliseConta() {
                if (demonstrativoAnaliseConta == null) {
                    demonstrativoAnaliseConta = new ArrayList<CtDemonstrativoAnaliseConta>();
                }
                return this.demonstrativoAnaliseConta;
            }

            /**
             * Gets the value of the demonstrativoOdontologia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the demonstrativoOdontologia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDemonstrativoOdontologia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtDemonstrativoOdontologia }
             * 
             * 
             */
            public List<CtDemonstrativoOdontologia> getDemonstrativoOdontologia() {
                if (demonstrativoOdontologia == null) {
                    demonstrativoOdontologia = new ArrayList<CtDemonstrativoOdontologia>();
                }
                return this.demonstrativoOdontologia;
            }

            /**
             * Gets the value of the demonstrativoPagamento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the demonstrativoPagamento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDemonstrativoPagamento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtDemonstrativoPagamento }
             * 
             * 
             */
            public List<CtDemonstrativoPagamento> getDemonstrativoPagamento() {
                if (demonstrativoPagamento == null) {
                    demonstrativoPagamento = new ArrayList<CtDemonstrativoPagamento>();
                }
                return this.demonstrativoPagamento;
            }

            /**
             * Gets the value of the mensagemErro property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mensagemErro property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMensagemErro().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getMensagemErro() {
                if (mensagemErro == null) {
                    mensagemErro = new ArrayList<String>();
                }
                return this.mensagemErro;
            }

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
     *       &lt;choice>
     *         &lt;element name="loteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteGuias" minOccurs="0"/>
     *         &lt;element name="loteAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loteAnexo" minOccurs="0"/>
     *         &lt;element name="solicitacaoDemonstrativoRetorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoDemonstrativoPagamento" minOccurs="0"/>
     *         &lt;element name="solicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoStatusProtocolo" minOccurs="0"/>
     *         &lt;element name="solicitacaoProcedimento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="guiaSolicInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicInternacao" minOccurs="0"/>
     *                   &lt;element name="guiaSolicitacaoSADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoSP_SADT" minOccurs="0"/>
     *                   &lt;element name="guiaSolicitacaoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoOdonto" minOccurs="0"/>
     *                   &lt;element name="guiaSolicitacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoProrrogacao" minOccurs="0"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="solicitaStatusAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitaStatusAutorizacao" minOccurs="0"/>
     *         &lt;element name="verificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitaElegibilidade" minOccurs="0"/>
     *         &lt;element name="cancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cancelaGuia" minOccurs="0"/>
     *         &lt;element name="comunicacaoBeneficiario" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_comunicacaoBeneficiario">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "loteGuias",
        "loteAnexo",
        "solicitacaoDemonstrativoRetorno",
        "solicitacaoStatusProtocolo",
        "solicitacaoProcedimento",
        "solicitaStatusAutorizacao",
        "verificaElegibilidade",
        "cancelaGuia",
        "comunicacaoBeneficiario"
    })
    public static class PrestadorParaOperadora {

        protected CtLoteGuias loteGuias;
        protected CtLoteAnexo loteAnexo;
        protected CtSolicitacaoDemonstrativoPagamento solicitacaoDemonstrativoRetorno;
        protected CtSolicitacaoStatusProtocolo solicitacaoStatusProtocolo;
        protected MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento solicitacaoProcedimento;
        protected CtSolicitaStatusAutorizacao solicitaStatusAutorizacao;
        protected CtSolicitaElegibilidade verificaElegibilidade;
        protected CtCancelaGuia cancelaGuia;
        protected MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario comunicacaoBeneficiario;

        /**
         * Obtém o valor da propriedade loteGuias.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteGuias }
         *     
         */
        public CtLoteGuias getLoteGuias() {
            return loteGuias;
        }

        /**
         * Define o valor da propriedade loteGuias.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteGuias }
         *     
         */
        public void setLoteGuias(CtLoteGuias value) {
            this.loteGuias = value;
        }

        /**
         * Obtém o valor da propriedade loteAnexo.
         * 
         * @return
         *     possible object is
         *     {@link CtLoteAnexo }
         *     
         */
        public CtLoteAnexo getLoteAnexo() {
            return loteAnexo;
        }

        /**
         * Define o valor da propriedade loteAnexo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtLoteAnexo }
         *     
         */
        public void setLoteAnexo(CtLoteAnexo value) {
            this.loteAnexo = value;
        }

        /**
         * Obtém o valor da propriedade solicitacaoDemonstrativoRetorno.
         * 
         * @return
         *     possible object is
         *     {@link CtSolicitacaoDemonstrativoPagamento }
         *     
         */
        public CtSolicitacaoDemonstrativoPagamento getSolicitacaoDemonstrativoRetorno() {
            return solicitacaoDemonstrativoRetorno;
        }

        /**
         * Define o valor da propriedade solicitacaoDemonstrativoRetorno.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSolicitacaoDemonstrativoPagamento }
         *     
         */
        public void setSolicitacaoDemonstrativoRetorno(CtSolicitacaoDemonstrativoPagamento value) {
            this.solicitacaoDemonstrativoRetorno = value;
        }

        /**
         * Obtém o valor da propriedade solicitacaoStatusProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link CtSolicitacaoStatusProtocolo }
         *     
         */
        public CtSolicitacaoStatusProtocolo getSolicitacaoStatusProtocolo() {
            return solicitacaoStatusProtocolo;
        }

        /**
         * Define o valor da propriedade solicitacaoStatusProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSolicitacaoStatusProtocolo }
         *     
         */
        public void setSolicitacaoStatusProtocolo(CtSolicitacaoStatusProtocolo value) {
            this.solicitacaoStatusProtocolo = value;
        }

        /**
         * Obtém o valor da propriedade solicitacaoProcedimento.
         * 
         * @return
         *     possible object is
         *     {@link MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento }
         *     
         */
        public MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento getSolicitacaoProcedimento() {
            return solicitacaoProcedimento;
        }

        /**
         * Define o valor da propriedade solicitacaoProcedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento }
         *     
         */
        public void setSolicitacaoProcedimento(MensagemTISS.PrestadorParaOperadora.SolicitacaoProcedimento value) {
            this.solicitacaoProcedimento = value;
        }

        /**
         * Obtém o valor da propriedade solicitaStatusAutorizacao.
         * 
         * @return
         *     possible object is
         *     {@link CtSolicitaStatusAutorizacao }
         *     
         */
        public CtSolicitaStatusAutorizacao getSolicitaStatusAutorizacao() {
            return solicitaStatusAutorizacao;
        }

        /**
         * Define o valor da propriedade solicitaStatusAutorizacao.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSolicitaStatusAutorizacao }
         *     
         */
        public void setSolicitaStatusAutorizacao(CtSolicitaStatusAutorizacao value) {
            this.solicitaStatusAutorizacao = value;
        }

        /**
         * Obtém o valor da propriedade verificaElegibilidade.
         * 
         * @return
         *     possible object is
         *     {@link CtSolicitaElegibilidade }
         *     
         */
        public CtSolicitaElegibilidade getVerificaElegibilidade() {
            return verificaElegibilidade;
        }

        /**
         * Define o valor da propriedade verificaElegibilidade.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSolicitaElegibilidade }
         *     
         */
        public void setVerificaElegibilidade(CtSolicitaElegibilidade value) {
            this.verificaElegibilidade = value;
        }

        /**
         * Obtém o valor da propriedade cancelaGuia.
         * 
         * @return
         *     possible object is
         *     {@link CtCancelaGuia }
         *     
         */
        public CtCancelaGuia getCancelaGuia() {
            return cancelaGuia;
        }

        /**
         * Define o valor da propriedade cancelaGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link CtCancelaGuia }
         *     
         */
        public void setCancelaGuia(CtCancelaGuia value) {
            this.cancelaGuia = value;
        }

        /**
         * Obtém o valor da propriedade comunicacaoBeneficiario.
         * 
         * @return
         *     possible object is
         *     {@link MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario }
         *     
         */
        public MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario getComunicacaoBeneficiario() {
            return comunicacaoBeneficiario;
        }

        /**
         * Define o valor da propriedade comunicacaoBeneficiario.
         * 
         * @param value
         *     allowed object is
         *     {@link MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario }
         *     
         */
        public void setComunicacaoBeneficiario(MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario value) {
            this.comunicacaoBeneficiario = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_comunicacaoBeneficiario">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ComunicacaoBeneficiario
            extends CtComunicacaoBeneficiario
        {


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
         *         &lt;element name="guiaSolicInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicInternacao" minOccurs="0"/>
         *         &lt;element name="guiaSolicitacaoSADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoSP_SADT" minOccurs="0"/>
         *         &lt;element name="guiaSolicitacaoOdontologia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoOdonto" minOccurs="0"/>
         *         &lt;element name="guiaSolicitacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaSolicitacaoProrrogacao" minOccurs="0"/>
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
            "guiaSolicInternacao",
            "guiaSolicitacaoSADT",
            "guiaSolicitacaoOdontologia",
            "guiaSolicitacaoProrrogacao"
        })
        public static class SolicitacaoProcedimento {

            protected CtGuiaSolicInternacao guiaSolicInternacao;
            protected CtGuiaSolicitacaoSPSADT guiaSolicitacaoSADT;
            protected CtGuiaSolicitacaoOdonto guiaSolicitacaoOdontologia;
            protected CtGuiaSolicitacaoProrrogacao guiaSolicitacaoProrrogacao;

            /**
             * Obtém o valor da propriedade guiaSolicInternacao.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaSolicInternacao }
             *     
             */
            public CtGuiaSolicInternacao getGuiaSolicInternacao() {
                return guiaSolicInternacao;
            }

            /**
             * Define o valor da propriedade guiaSolicInternacao.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaSolicInternacao }
             *     
             */
            public void setGuiaSolicInternacao(CtGuiaSolicInternacao value) {
                this.guiaSolicInternacao = value;
            }

            /**
             * Obtém o valor da propriedade guiaSolicitacaoSADT.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaSolicitacaoSPSADT }
             *     
             */
            public CtGuiaSolicitacaoSPSADT getGuiaSolicitacaoSADT() {
                return guiaSolicitacaoSADT;
            }

            /**
             * Define o valor da propriedade guiaSolicitacaoSADT.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaSolicitacaoSPSADT }
             *     
             */
            public void setGuiaSolicitacaoSADT(CtGuiaSolicitacaoSPSADT value) {
                this.guiaSolicitacaoSADT = value;
            }

            /**
             * Obtém o valor da propriedade guiaSolicitacaoOdontologia.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaSolicitacaoOdonto }
             *     
             */
            public CtGuiaSolicitacaoOdonto getGuiaSolicitacaoOdontologia() {
                return guiaSolicitacaoOdontologia;
            }

            /**
             * Define o valor da propriedade guiaSolicitacaoOdontologia.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaSolicitacaoOdonto }
             *     
             */
            public void setGuiaSolicitacaoOdontologia(CtGuiaSolicitacaoOdonto value) {
                this.guiaSolicitacaoOdontologia = value;
            }

            /**
             * Obtém o valor da propriedade guiaSolicitacaoProrrogacao.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaSolicitacaoProrrogacao }
             *     
             */
            public CtGuiaSolicitacaoProrrogacao getGuiaSolicitacaoProrrogacao() {
                return guiaSolicitacaoProrrogacao;
            }

            /**
             * Define o valor da propriedade guiaSolicitacaoProrrogacao.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaSolicitacaoProrrogacao }
             *     
             */
            public void setGuiaSolicitacaoProrrogacao(CtGuiaSolicitacaoProrrogacao value) {
                this.guiaSolicitacaoProrrogacao = value;
            }

        }

    }

}
