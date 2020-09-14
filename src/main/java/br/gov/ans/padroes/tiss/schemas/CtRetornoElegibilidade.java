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
 * <p>Classe Java de ct_retornoElegibilidade complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_retornoElegibilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="respostaSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao"/>
 *         &lt;element name="motivoNegacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_retornoElegibilidade", propOrder = {
    "dadosOperadora",
    "dadosBeneficiario",
    "respostaSolicitacao",
    "motivoNegacao"
})
public class CtRetornoElegibilidade {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora dadosOperadora;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    protected boolean respostaSolicitacao;
    protected CtMotivoGlosa motivoNegacao;

    /**
     * Obtém o valor da propriedade dadosOperadora.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getDadosOperadora() {
        return dadosOperadora;
    }

    /**
     * Define o valor da propriedade dadosOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setDadosOperadora(CtIdentificacaoFontePagadora value) {
        this.dadosOperadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade respostaSolicitacao.
     * 
     */
    public boolean isRespostaSolicitacao() {
        return respostaSolicitacao;
    }

    /**
     * Define o valor da propriedade respostaSolicitacao.
     * 
     */
    public void setRespostaSolicitacao(boolean value) {
        this.respostaSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade motivoNegacao.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMotivoNegacao() {
        return motivoNegacao;
    }

    /**
     * Define o valor da propriedade motivoNegacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMotivoNegacao(CtMotivoGlosa value) {
        this.motivoNegacao = value;
    }

}
