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
 * <p>Classe Java de ct_diariaProrrogacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diariaProrrogacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao"/>
 *         &lt;element name="quantidadeDiaria" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diariaProrrogacao", propOrder = {
    "tipoAcomodacao",
    "quantidadeDiaria"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.MensagemTISS.OperadoraParaPrestador.AutorizacaoServico.DiariaProrrogacaoAutorizada.class,
    br.gov.ans.padroes.tiss.schemas.CtSituacaoAutorizacao.DadosAutorizacao.CtDiariaProrrogacaoAutorizada.class,
    br.gov.ans.padroes.tiss.schemas.CtDiariaProrrogacaoAutorizada.class
})
public class CtDiariaProrrogacao {

    @XmlElement(required = true)
    protected String tipoAcomodacao;
    @XmlElement(required = true)
    protected BigDecimal quantidadeDiaria;

    /**
     * Obtém o valor da propriedade tipoAcomodacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    /**
     * Define o valor da propriedade tipoAcomodacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcomodacao(String value) {
        this.tipoAcomodacao = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeDiaria.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    /**
     * Define o valor da propriedade quantidadeDiaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeDiaria(BigDecimal value) {
        this.quantidadeDiaria = value;
    }

}
