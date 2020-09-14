//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_internacaoObstetrica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_internacaoObstetrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emGestacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="aborto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="transtornoMaternoRelGravidez" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="complicacaoPeriodoPuerperio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="atendimentoRNSalaParto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="complicacaoNeonatal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="baixoPeso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="partoCesareo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="partoNormal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="declaracoesNascidosVivos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_numeroDN" minOccurs="0"/>
 *         &lt;element name="qtdNascidosVivosTermo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="qtdNascidosMortos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="qtdVivosPrematuros" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="obitoMulher" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_obitoMulher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_internacaoObstetrica", propOrder = {
    "emGestacao",
    "aborto",
    "transtornoMaternoRelGravidez",
    "complicacaoPeriodoPuerperio",
    "atendimentoRNSalaParto",
    "complicacaoNeonatal",
    "baixoPeso",
    "partoCesareo",
    "partoNormal",
    "declaracoesNascidosVivos",
    "qtdNascidosVivosTermo",
    "qtdNascidosMortos",
    "qtdVivosPrematuros",
    "obitoMulher"
})
public class CtInternacaoObstetrica {

    protected Boolean emGestacao;
    protected Boolean aborto;
    protected Boolean transtornoMaternoRelGravidez;
    protected Boolean complicacaoPeriodoPuerperio;
    protected Boolean atendimentoRNSalaParto;
    protected Boolean complicacaoNeonatal;
    protected Boolean baixoPeso;
    protected Boolean partoCesareo;
    protected Boolean partoNormal;
    protected CtNumeroDN declaracoesNascidosVivos;
    protected BigInteger qtdNascidosVivosTermo;
    protected BigInteger qtdNascidosMortos;
    protected BigInteger qtdVivosPrematuros;
    protected String obitoMulher;

    /**
     * Obtém o valor da propriedade emGestacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmGestacao() {
        return emGestacao;
    }

    /**
     * Define o valor da propriedade emGestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmGestacao(Boolean value) {
        this.emGestacao = value;
    }

    /**
     * Obtém o valor da propriedade aborto.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAborto() {
        return aborto;
    }

    /**
     * Define o valor da propriedade aborto.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAborto(Boolean value) {
        this.aborto = value;
    }

    /**
     * Obtém o valor da propriedade transtornoMaternoRelGravidez.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranstornoMaternoRelGravidez() {
        return transtornoMaternoRelGravidez;
    }

    /**
     * Define o valor da propriedade transtornoMaternoRelGravidez.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranstornoMaternoRelGravidez(Boolean value) {
        this.transtornoMaternoRelGravidez = value;
    }

    /**
     * Obtém o valor da propriedade complicacaoPeriodoPuerperio.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplicacaoPeriodoPuerperio() {
        return complicacaoPeriodoPuerperio;
    }

    /**
     * Define o valor da propriedade complicacaoPeriodoPuerperio.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplicacaoPeriodoPuerperio(Boolean value) {
        this.complicacaoPeriodoPuerperio = value;
    }

    /**
     * Obtém o valor da propriedade atendimentoRNSalaParto.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtendimentoRNSalaParto() {
        return atendimentoRNSalaParto;
    }

    /**
     * Define o valor da propriedade atendimentoRNSalaParto.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtendimentoRNSalaParto(Boolean value) {
        this.atendimentoRNSalaParto = value;
    }

    /**
     * Obtém o valor da propriedade complicacaoNeonatal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplicacaoNeonatal() {
        return complicacaoNeonatal;
    }

    /**
     * Define o valor da propriedade complicacaoNeonatal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplicacaoNeonatal(Boolean value) {
        this.complicacaoNeonatal = value;
    }

    /**
     * Obtém o valor da propriedade baixoPeso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaixoPeso() {
        return baixoPeso;
    }

    /**
     * Define o valor da propriedade baixoPeso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaixoPeso(Boolean value) {
        this.baixoPeso = value;
    }

    /**
     * Obtém o valor da propriedade partoCesareo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartoCesareo() {
        return partoCesareo;
    }

    /**
     * Define o valor da propriedade partoCesareo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartoCesareo(Boolean value) {
        this.partoCesareo = value;
    }

    /**
     * Obtém o valor da propriedade partoNormal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartoNormal() {
        return partoNormal;
    }

    /**
     * Define o valor da propriedade partoNormal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartoNormal(Boolean value) {
        this.partoNormal = value;
    }

    /**
     * Obtém o valor da propriedade declaracoesNascidosVivos.
     * 
     * @return
     *     possible object is
     *     {@link CtNumeroDN }
     *     
     */
    public CtNumeroDN getDeclaracoesNascidosVivos() {
        return declaracoesNascidosVivos;
    }

    /**
     * Define o valor da propriedade declaracoesNascidosVivos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtNumeroDN }
     *     
     */
    public void setDeclaracoesNascidosVivos(CtNumeroDN value) {
        this.declaracoesNascidosVivos = value;
    }

    /**
     * Obtém o valor da propriedade qtdNascidosVivosTermo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdNascidosVivosTermo() {
        return qtdNascidosVivosTermo;
    }

    /**
     * Define o valor da propriedade qtdNascidosVivosTermo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdNascidosVivosTermo(BigInteger value) {
        this.qtdNascidosVivosTermo = value;
    }

    /**
     * Obtém o valor da propriedade qtdNascidosMortos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdNascidosMortos() {
        return qtdNascidosMortos;
    }

    /**
     * Define o valor da propriedade qtdNascidosMortos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdNascidosMortos(BigInteger value) {
        this.qtdNascidosMortos = value;
    }

    /**
     * Obtém o valor da propriedade qtdVivosPrematuros.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdVivosPrematuros() {
        return qtdVivosPrematuros;
    }

    /**
     * Define o valor da propriedade qtdVivosPrematuros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdVivosPrematuros(BigInteger value) {
        this.qtdVivosPrematuros = value;
    }

    /**
     * Obtém o valor da propriedade obitoMulher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObitoMulher() {
        return obitoMulher;
    }

    /**
     * Define o valor da propriedade obitoMulher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObitoMulher(String value) {
        this.obitoMulher = value;
    }

}
