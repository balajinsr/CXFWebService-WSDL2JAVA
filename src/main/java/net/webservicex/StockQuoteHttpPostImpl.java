
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
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.2
 * 2015-01-06T19:22:03.449+05:30
 * Generated source version: 2.3.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "StockQuote",
                      portName = "StockQuoteHttpPost",
                      targetNamespace = "http://www.webserviceX.NET/",
                      wsdlLocation = "file:/D:/workspace/CXFWebService-Maven/src/main/resources/wsdl/stockquote.wsdl",
                      endpointInterface = "net.webservicex.StockQuoteHttpPost")
                      
public class StockQuoteHttpPostImpl implements StockQuoteHttpPost {

    private static final Logger LOG = Logger.getLogger(StockQuoteHttpPostImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.StockQuoteHttpPost#getQuote(java.lang.String  symbol )*
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