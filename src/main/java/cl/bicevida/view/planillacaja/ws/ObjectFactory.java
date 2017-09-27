
package cl.bicevida.view.planillacaja.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.bicevida.view.planillacaja.ws package. 
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

    private final static QName _GetUrlPDF_QNAME = new QName("http://ws.planillacaja.view.bicevida.cl/", "getUrlPDF");
    private final static QName _GetUrlPDFResponse_QNAME = new QName("http://ws.planillacaja.view.bicevida.cl/", "getUrlPDFResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.bicevida.view.planillacaja.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUrlPDF }
     * 
     */
    public GetUrlPDF createGetUrlPDF() {
        return new GetUrlPDF();
    }

    /**
     * Create an instance of {@link GetUrlPDFResponse }
     * 
     */
    public GetUrlPDFResponse createGetUrlPDFResponse() {
        return new GetUrlPDFResponse();
    }

    /**
     * Create an instance of {@link DatoPDFResponse }
     * 
     */
    public DatoPDFResponse createDatoPDFResponse() {
        return new DatoPDFResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlPDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.planillacaja.view.bicevida.cl/", name = "getUrlPDF")
    public JAXBElement<GetUrlPDF> createGetUrlPDF(GetUrlPDF value) {
        return new JAXBElement<GetUrlPDF>(_GetUrlPDF_QNAME, GetUrlPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUrlPDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.planillacaja.view.bicevida.cl/", name = "getUrlPDFResponse")
    public JAXBElement<GetUrlPDFResponse> createGetUrlPDFResponse(GetUrlPDFResponse value) {
        return new JAXBElement<GetUrlPDFResponse>(_GetUrlPDFResponse_QNAME, GetUrlPDFResponse.class, null, value);
    }

}
