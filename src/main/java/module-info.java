module org.plutext.jaxb.xslfo {
	exports org.plutext.jaxb.xslfo;

	requires java.xml;
	requires jakarta.xml.bind;
	
    opens org.plutext.jaxb.xslfo to jakarta.xml.bind, com.sun.xml.bind, org.eclipse.persistence.moxy, org.eclipse.persistence.core;

}