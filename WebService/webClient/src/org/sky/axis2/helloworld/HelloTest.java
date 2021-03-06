package org.sky.axis2.helloworld;

import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.llom.OMAttributeImpl;

public class HelloTest {
	
	public OMElement helloTest(OMElement element) throws XMLStreamException {
        element.build();
        // Secondly the OMElement should be detached from the current OMTree so
        // that it can be attached
        // some other OM Tree. Once detached the OmTree will remove its
        // connections to this OMElement.
        /*OMAttributeImpl om= new OMAttributeImpl();
        om.setAttributeValue("hehe");
        element.addAttribute(om);*/
        System.err.println("hehe");
        element.detach();
        return element;
	}
}
