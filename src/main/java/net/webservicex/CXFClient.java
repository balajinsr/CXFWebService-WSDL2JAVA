package net.webservicex;

import java.net.URL;

import javax.xml.ws.BindingProvider;

public class CXFClient {
	public static void main(String[] args) {
		String endpoint = "http://www.webservicex.net/stockquote.asmx";
		URL wsdlUrl = StockQuote.class.getClassLoader().getResource("wsdl/stockquote.wsdl");
		StockQuoteSoap soapRequest = new StockQuote(wsdlUrl).getStockQuoteSoap();
		((BindingProvider)soapRequest).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
		System.out.println(soapRequest.getQuote("GOOG"));
	}
}
