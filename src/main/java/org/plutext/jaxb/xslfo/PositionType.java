
package org.plutext.jaxb.xslfo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for position_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="position_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="relative"/>
 *     &lt;enumeration value="absolute"/>
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="inherit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "position_Type")
@XmlEnum
public enum PositionType {

    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("relative")
    RELATIVE("relative"),
    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("fixed")
    FIXED("fixed"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;fop_fail xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Unknown enumerated value&lt;/fop_fail&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("inherit")
    INHERIT("inherit");
    private final String value;

    PositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionType fromValue(String v) {
        for (PositionType c: PositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
