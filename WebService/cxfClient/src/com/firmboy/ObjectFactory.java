
package com.firmboy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.firmboy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddResponse_QNAME = new QName("http://firmboy.com/", "addResponse");
    private final static QName _ConcatResponse_QNAME = new QName("http://firmboy.com/", "concatResponse");
    private final static QName _Concat_QNAME = new QName("http://firmboy.com/", "concat");
    private final static QName _Add_QNAME = new QName("http://firmboy.com/", "add");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.firmboy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link ConcatResponse }
     * 
     */
    public ConcatResponse createConcatResponse() {
        return new ConcatResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Concat }
     * 
     */
    public Concat createConcat() {
        return new Concat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firmboy.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firmboy.com/", name = "concatResponse")
    public JAXBElement<ConcatResponse> createConcatResponse(ConcatResponse value) {
        return new JAXBElement<ConcatResponse>(_ConcatResponse_QNAME, ConcatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Concat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firmboy.com/", name = "concat")
    public JAXBElement<Concat> createConcat(Concat value) {
        return new JAXBElement<Concat>(_Concat_QNAME, Concat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://firmboy.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

}
