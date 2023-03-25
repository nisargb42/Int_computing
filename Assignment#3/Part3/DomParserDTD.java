import java.io.FileInputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class DomParserDTD {

    public static void main(String[] args) {
        String dtdFileName = "books_dtd.dtd";
        String xmlFileName = "books.xml";
        // Parse the XML file using the DOM parser
        Document document = parseXmlDomFile(xmlFileName);
        if (document != null) {
            validateXmlAgainstDTD(document, dtdFileName);
        }
    }

    public static void validateXmlAgainstDTD(Document document, String dtdFileName) {
        try {
            // Create a new DOMSource object from the parsed document
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new StringWriter());
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // Set the output property to specify the DTD file
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, dtdFileName);
            transformer.transform(domSource, streamResult);
            // Validation is successful if no exceptions are thrown
            System.out.println("Validating XML against DTD is successful");
        } catch (TransformerConfigurationException e) {
            // Handle TransformerConfigurationException if it occurs
            System.out.println("TransformerConfigurationException in validateXmlAgainstDTD: " + e.getMessage());
        } catch (TransformerException e) {
            // Handle TransformerException if it occurs
            System.out.println("TransformerException in validateXmlAgainstDTD: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("Exception in validateXmlAgainstDTD: " + e.getMessage());
        }
    }

    public static Document parseXmlDomFile(String xmlFileName) {
        Document document = null;
        try {
            // Create a new DocumentBuilderFactory object
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new FileInputStream(xmlFileName));
            // Parsing is successful if no exceptions are thrown
            System.out.println("Parsing XML DOM File is successful");

        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Exception in parseXmlDomFile: " + e.getMessage());
        }
        return document;
    }

}
