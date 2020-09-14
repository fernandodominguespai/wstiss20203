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
 * <p>Classe Java de st_UF.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="st_UF">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="RJ"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="GO"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="DF"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="AP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "st_UF")
@XmlEnum
public enum StUF {

    RS,
    SC,
    PR,
    SP,
    MG,
    RJ,
    ES,
    MS,
    MT,
    GO,
    TO,
    PA,
    AM,
    RO,
    RR,
    AC,
    DF,
    BA,
    SE,
    CE,
    PI,
    PB,
    RN,
    AL,
    MA,
    PE,
    AP;

    public String value() {
        return name();
    }

    public static StUF fromValue(String v) {
        return valueOf(v);
    }

}
