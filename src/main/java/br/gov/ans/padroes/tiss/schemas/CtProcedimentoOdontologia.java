//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_procedimentoOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="denteRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_denteRegiao" minOccurs="0"/>
 *         &lt;element name="face" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_face" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento" minOccurs="0"/>
 *         &lt;element name="quantidadeUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="franquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoOdontologia", propOrder = {
    "procedimentoOdonto",
    "denteRegiao",
    "face",
    "quantidade",
    "quantidadeUS",
    "valor",
    "franquiaCoparticipacao"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtProcedimentoOdontoRevisao.ProcedimentoOdontologia.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado.class
})
public class CtProcedimentoOdontologia {

    @XmlElement(required = true)
    protected CtTabela procedimentoOdonto;
    protected CtDenteRegiao denteRegiao;
    protected String face;
    protected BigDecimal quantidade;
    protected BigDecimal quantidadeUS;
    protected BigDecimal valor;
    protected BigDecimal franquiaCoparticipacao;

    /**
     * Obtém o valor da propriedade procedimentoOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getProcedimentoOdonto() {
        return procedimentoOdonto;
    }

    /**
     * Define o valor da propriedade procedimentoOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setProcedimentoOdonto(CtTabela value) {
        this.procedimentoOdonto = value;
    }

    /**
     * Obtém o valor da propriedade denteRegiao.
     * 
     * @return
     *     possible object is
     *     {@link CtDenteRegiao }
     *     
     */
    public CtDenteRegiao getDenteRegiao() {
        return denteRegiao;
    }

    /**
     * Define o valor da propriedade denteRegiao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDenteRegiao }
     *     
     */
    public void setDenteRegiao(CtDenteRegiao value) {
        this.denteRegiao = value;
    }

    /**
     * Obtém o valor da propriedade face.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFace() {
        return face;
    }

    /**
     * Define o valor da propriedade face.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFace(String value) {
        this.face = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeUS.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeUS() {
        return quantidadeUS;
    }

    /**
     * Define o valor da propriedade quantidadeUS.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeUS(BigDecimal value) {
        this.quantidadeUS = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade franquiaCoparticipacao.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFranquiaCoparticipacao() {
        return franquiaCoparticipacao;
    }

    /**
     * Define o valor da propriedade franquiaCoparticipacao.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFranquiaCoparticipacao(BigDecimal value) {
        this.franquiaCoparticipacao = value;
    }

}
