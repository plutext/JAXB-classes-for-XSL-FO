
package org.plutext.jaxb.xslfo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for background_image_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="background_image_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="uri-specification"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "background_image_Type")
@XmlEnum
public enum BackgroundImageType {

    @XmlEnumValue("uri-specification")
    URI_SPECIFICATION("uri-specification"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("inherit")
    INHERIT("inherit");
    private final String value;

    BackgroundImageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackgroundImageType fromValue(String v) {
        for (BackgroundImageType c: BackgroundImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
