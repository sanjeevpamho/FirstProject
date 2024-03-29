package code.bind;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class XMLTONODE {
	public static void main(String[] args) {
	    String exp = "/configs/markets/market";
	    String path = "C:/Sanjeev_folder/documentation_folder/cucumber/testConfig.xml";
	    try {
	        Document xmlDocument = DocumentBuilderFactory.newInstance()
	                .newDocumentBuilder().parse(path);

	        XPath xPath = XPathFactory.newInstance().newXPath();
	        XPathExpression xPathExpression = xPath.compile(exp);
	        NodeList nodes = (NodeList) xPathExpression.
	                evaluate(xmlDocument, XPathConstants.NODESET);

	        
	        
	        System.out.println("nodes.getLength()::"+nodes.getLength());
	        for (int i = 0, len = nodes.getLength(); i < len; i++) {
        		System.out.println("*************nodes.item(i).getTextContent()::"+nodes.item(i).getTextContent());
        		}
	       
	       
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}

	
}
