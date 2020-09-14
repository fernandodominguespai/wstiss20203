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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_diariaProrrogacaoAutorizada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diariaProrrogacaoAutorizada">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diariaProrrogacao">
 *       &lt;sequence>
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
@XmlType(name = "ct_diariaProrrogacaoAutorizada", propOrder = {
    "quantidadeAutorizada",
    "motivoGlosa"
})
public class CtDiariaProrrogacaoAutorizada
    extends CtDiariaProrrogacao
{

    protected BigDecimal quantidadeAutorizada;
    protected CtMotivoGlosa motivoGlosa;

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
