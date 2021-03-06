package org.sky.axis2.helloworld;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;


public class HelloWorld {
	
	public OMElement sayHello(OMElement element) throws XMLStreamException {
        element.build();
        // Secondly the OMElement should be detached from the current OMTree so
        // that it can be attached
        // some other OM Tree. Once detached the OmTree will remove its
        // connections to this OMElement.
        element.detach();
        return element;
	}
}
