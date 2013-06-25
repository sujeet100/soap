
package com.restclient.proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice package. 
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

    private final static QName _GetAgeMessage_QNAME = new QName("http://webservice.com/", "getAgeMessage");
    private final static QName _GetMessage_QNAME = new QName("http://webservice.com/", "getMessage");
    private final static QName _GetMessageResponse_QNAME = new QName("http://webservice.com/", "getMessageResponse");
    private final static QName _GetAgeMessageResponse_QNAME = new QName("http://webservice.com/", "getAgeMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAgeMessageResponse }
     * 
     */
    public GetAgeMessageResponse createGetAgeMessageResponse() {
        return new GetAgeMessageResponse();
    }

    /**
     * Create an instance of {@link GetAgeMessage }
     * 
     */
    public GetAgeMessage createGetAgeMessage() {
        return new GetAgeMessage();
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "getAgeMessage")
    public JAXBElement<GetAgeMessage> createGetAgeMessage(GetAgeMessage value) {
        return new JAXBElement<GetAgeMessage>(_GetAgeMessage_QNAME, GetAgeMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAgeMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.com/", name = "getAgeMessageResponse")
    public JAXBElement<GetAgeMessageResponse> createGetAgeMessageResponse(GetAgeMessageResponse value) {
        return new JAXBElement<GetAgeMessageResponse>(_GetAgeMessageResponse_QNAME, GetAgeMessageResponse.class, null, value);
    }

}
