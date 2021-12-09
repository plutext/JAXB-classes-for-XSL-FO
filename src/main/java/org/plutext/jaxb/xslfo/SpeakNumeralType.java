
package org.plutext.jaxb.xslfo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speak_numeral_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="speak_numeral_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="digits"/>
 *     &lt;enumeration value="continuous"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "speak_numeral_Type")
@XmlEnum
public enum SpeakNumeralType {

    @XmlEnumValue("digits")
    DIGITS("digits"),
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),
    @XmlEnumValue("inherit")
    INHERIT("inherit");
    private final String value;

    SpeakNumeralType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeakNumeralType fromValue(String v) {
        for (SpeakNumeralType c: SpeakNumeralType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
