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
 * <p>Classe Java de nodo_tissnet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="nodo_tissnet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="pontoAPonto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="socket" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_hostporta"/>
 *                   &lt;element name="service" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="webServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tissCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissLoteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissSolicitacaoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissSolicitacaoDemonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissSolicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissSolicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
 *                   &lt;element name="tissVerificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
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
@XmlType(name = "nodo_tissnet", propOrder = {
    "operadora",
    "pontoAPonto",
    "webServices"
})
public class NodoTissnet {

    @XmlElement(required = true)
    protected String operadora;
    protected NodoTissnet.PontoAPonto pontoAPonto;
    protected NodoTissnet.WebServices webServices;

    /**
     * Obtém o valor da propriedade operadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperadora() {
        return operadora;
    }

    /**
     * Define o valor da propriedade operadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperadora(String value) {
        this.operadora = value;
    }

    /**
     * Obtém o valor da propriedade pontoAPonto.
     * 
     * @return
     *     possible object is
     *     {@link NodoTissnet.PontoAPonto }
     *     
     */
    public NodoTissnet.PontoAPonto getPontoAPonto() {
        return pontoAPonto;
    }

    /**
     * Define o valor da propriedade pontoAPonto.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoTissnet.PontoAPonto }
     *     
     */
    public void setPontoAPonto(NodoTissnet.PontoAPonto value) {
        this.pontoAPonto = value;
    }

    /**
     * Obtém o valor da propriedade webServices.
     * 
     * @return
     *     possible object is
     *     {@link NodoTissnet.WebServices }
     *     
     */
    public NodoTissnet.WebServices getWebServices() {
        return webServices;
    }

    /**
     * Define o valor da propriedade webServices.
     * 
     * @param value
     *     allowed object is
     *     {@link NodoTissnet.WebServices }
     *     
     */
    public void setWebServices(NodoTissnet.WebServices value) {
        this.webServices = value;
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
     *         &lt;element name="socket" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_hostporta"/>
     *         &lt;element name="service" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl"/>
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
        "socket",
        "service"
    })
    public static class PontoAPonto {

        protected CtHostporta socket;
        protected String service;

        /**
         * Obtém o valor da propriedade socket.
         * 
         * @return
         *     possible object is
         *     {@link CtHostporta }
         *     
         */
        public CtHostporta getSocket() {
            return socket;
        }

        /**
         * Define o valor da propriedade socket.
         * 
         * @param value
         *     allowed object is
         *     {@link CtHostporta }
         *     
         */
        public void setSocket(CtHostporta value) {
            this.socket = value;
        }

        /**
         * Obtém o valor da propriedade service.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getService() {
            return service;
        }

        /**
         * Define o valor da propriedade service.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setService(String value) {
            this.service = value;
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
     *         &lt;element name="tissCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissLoteGuias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissSolicitacaoAnaliseConta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissSolicitacaoDemonstrativoPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissSolicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissSolicitacaoStatusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
     *         &lt;element name="tissVerificaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_wsurl" minOccurs="0"/>
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
        "tissCancelaGuia",
        "tissLoteGuias",
        "tissSolicitacaoAnaliseConta",
        "tissSolicitacaoDemonstrativoPagamento",
        "tissSolicitacaoProcedimento",
        "tissSolicitacaoStatusProtocolo",
        "tissVerificaElegibilidade"
    })
    public static class WebServices {

        protected String tissCancelaGuia;
        protected String tissLoteGuias;
        protected String tissSolicitacaoAnaliseConta;
        protected String tissSolicitacaoDemonstrativoPagamento;
        protected String tissSolicitacaoProcedimento;
        protected String tissSolicitacaoStatusProtocolo;
        protected String tissVerificaElegibilidade;

        /**
         * Obtém o valor da propriedade tissCancelaGuia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissCancelaGuia() {
            return tissCancelaGuia;
        }

        /**
         * Define o valor da propriedade tissCancelaGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissCancelaGuia(String value) {
            this.tissCancelaGuia = value;
        }

        /**
         * Obtém o valor da propriedade tissLoteGuias.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissLoteGuias() {
            return tissLoteGuias;
        }

        /**
         * Define o valor da propriedade tissLoteGuias.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissLoteGuias(String value) {
            this.tissLoteGuias = value;
        }

        /**
         * Obtém o valor da propriedade tissSolicitacaoAnaliseConta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissSolicitacaoAnaliseConta() {
            return tissSolicitacaoAnaliseConta;
        }

        /**
         * Define o valor da propriedade tissSolicitacaoAnaliseConta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissSolicitacaoAnaliseConta(String value) {
            this.tissSolicitacaoAnaliseConta = value;
        }

        /**
         * Obtém o valor da propriedade tissSolicitacaoDemonstrativoPagamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissSolicitacaoDemonstrativoPagamento() {
            return tissSolicitacaoDemonstrativoPagamento;
        }

        /**
         * Define o valor da propriedade tissSolicitacaoDemonstrativoPagamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissSolicitacaoDemonstrativoPagamento(String value) {
            this.tissSolicitacaoDemonstrativoPagamento = value;
        }

        /**
         * Obtém o valor da propriedade tissSolicitacaoProcedimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissSolicitacaoProcedimento() {
            return tissSolicitacaoProcedimento;
        }

        /**
         * Define o valor da propriedade tissSolicitacaoProcedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissSolicitacaoProcedimento(String value) {
            this.tissSolicitacaoProcedimento = value;
        }

        /**
         * Obtém o valor da propriedade tissSolicitacaoStatusProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissSolicitacaoStatusProtocolo() {
            return tissSolicitacaoStatusProtocolo;
        }

        /**
         * Define o valor da propriedade tissSolicitacaoStatusProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissSolicitacaoStatusProtocolo(String value) {
            this.tissSolicitacaoStatusProtocolo = value;
        }

        /**
         * Obtém o valor da propriedade tissVerificaElegibilidade.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTissVerificaElegibilidade() {
            return tissVerificaElegibilidade;
        }

        /**
         * Define o valor da propriedade tissVerificaElegibilidade.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTissVerificaElegibilidade(String value) {
            this.tissVerificaElegibilidade = value;
        }

    }

}
