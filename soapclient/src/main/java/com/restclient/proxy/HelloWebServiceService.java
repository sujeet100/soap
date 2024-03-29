
package com.restclient.proxy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloWebServiceService", targetNamespace = "http://webservice.com/", wsdlLocation = "file:/D:/gen/HelloWebServiceService.wsdl")
public class HelloWebServiceService
    extends Service
{

    private final static URL HELLOWEBSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.restclient.proxy.HelloWebServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.restclient.proxy.HelloWebServiceService.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/gen/HelloWebServiceService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/gen/HelloWebServiceService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOWEBSERVICESERVICE_WSDL_LOCATION = url;
    }

    public HelloWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebServiceService() {
        super(HELLOWEBSERVICESERVICE_WSDL_LOCATION, new QName("http://webservice.com/", "HelloWebServiceService"));
    }

    /**
     * 
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWebServicePort")
    public HelloWebService getHelloWebServicePort() {
        return super.getPort(new QName("http://webservice.com/", "HelloWebServicePort"), HelloWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWebService
     */
    @WebEndpoint(name = "HelloWebServicePort")
    public HelloWebService getHelloWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.com/", "HelloWebServicePort"), HelloWebService.class, features);
    }

}
