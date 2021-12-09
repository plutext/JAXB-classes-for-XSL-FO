
package org.plutext.jaxb.xslfo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transparent_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transparent_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="transparent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transparent_Type")
@XmlEnum
public enum TransparentType {

    @XmlEnumValue("transparent")
    TRANSPARENT("transparent");
    private final String value;

    TransparentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransparentType fromValue(String v) {
        for (TransparentType c: TransparentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
