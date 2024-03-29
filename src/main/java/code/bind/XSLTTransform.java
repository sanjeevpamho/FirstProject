package code.bind;

import java.io.File;
import java.io.StringWriter;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransform {

	/*	public String transformPayload(String source, String xslfile) {

		System.out.println("sanjeev");
		StringWriter stringWriter = new StringWriter();
		TransformerFactory factory = TransformerFactory.newInstance();
		try {
			Source xslt = new StreamSource(new File(xslfile));
			Transformer transformer = factory.newTransformer(xslt);

			Source text = new StreamSource(new File(source));
			transformer.transform(text, new StreamResult(stringWriter));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringWriter.toString();
	}
	 */	
	public static void main(String[] args) {

		TransformerFactory tFactory = TransformerFactory.newInstance();

			
		StreamSource xmlInputFile = new StreamSource("C:/Demoo/xml_input/delete_acl.xml");

		StreamSource xslTransformationFile = new StreamSource("c:/Demoo/xslt/ACL_Remove_config.xslt");

		StreamResult xmlOutputFile = new StreamResult("c:/Demoo/output_convert.xml");
		
		
		/*
		StreamSource xmlInputFile = new StreamSource("C:/Demoo/xml_input/provide_acl.xml");

		StreamSource xslTransformationFile = new StreamSource("c:/Demoo/xslt/ACL_Provide_config.xslt");

		StreamResult xmlOutputFile = new StreamResult("c:/Demoo/output_convert.xml");
*/


		try {
			Transformer transformer = tFactory.newTransformer(xslTransformationFile);
			transformer.transform(xmlInputFile, xmlOutputFile);



		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}

		System.out.println("DONE>>>>>>");
	}

}