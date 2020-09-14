//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.09.14 às 12:18:19 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de st_conselhoProfissional.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="st_conselhoProfissional">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRAS"/>
 *     &lt;enumeration value="COREN"/>
 *     &lt;enumeration value="CRF"/>
 *     &lt;enumeration value="CREFITO"/>
 *     &lt;enumeration value="CRM"/>
 *     &lt;enumeration value="CRN"/>
 *     &lt;enumeration value="CRO"/>
 *     &lt;enumeration value="CRP"/>
 *     &lt;enumeration value="OUT"/>
 *     &lt;enumeration value="CRFA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "st_conselhoProfissional")
@XmlEnum
public enum StConselhoProfissional {

    CRAS,
    COREN,
    CRF,
    CREFITO,
    CRM,
    CRN,
    CRO,
    CRP,
    OUT,
    CRFA;

    public String value() {
        return name();
    }

    public static StConselhoProfissional fromValue(String v) {
        return valueOf(v);
    }

}
