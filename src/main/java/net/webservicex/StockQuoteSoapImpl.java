
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.webservicex;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2015-01-06T19:22:03.480+05:30
 * Generated source version: 2.3.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "StockQuote",
                      portName = "StockQuoteSoap",
                      targetNamespace = "http://www.webserviceX.NET/",
                      wsdlLocation = "file:/D:/workspace/CXFWebService-Maven/src/main/resources/wsdl/stockquote.wsdl",
                      endpointInterface = "net.webservicex.StockQuoteSoap")
                      
public class StockQuoteSoapImpl implements StockQuoteSoap {

    private static final Logger LOG = Logger.getLogger(StockQuoteSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.StockQuoteSoap#getQuote(java.lang.String  symbol )*
     */
    public java.lang.String getQuote(java.lang.String symbol) { 
        LOG.info("Executing operation getQuote");
        System.out.println(symbol);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
