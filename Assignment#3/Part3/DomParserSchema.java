import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DomParserSchema {

	public static void main(String args[]) {
		String xmlSchemaFilesName = "books_schema.xsd";
		String xmlFileName = "books.xml";
		Schema schema = loadXMLSchemaFile(xmlSchemaFilesName);
		Document document = null;
		// Parse the XML file and create a DOM document
		document = parseXmlDOMFile(xmlFileName);
		// Validate the XML document against the loaded schema
		validateXmlAgainstXmlSchema(schema, document);
	}

	// Method to load an XML schema file and create a Schema object
	public static Schema loadXMLSchemaFile(String xmlSchemaFilesName) {
		Schema schema = null;
		try {
			// Set the namespace URI for XML schema
			String xmlSchemaNameSpaceURI = XMLConstants.W3C_XML_SCHEMA_NS_URI;
			SchemaFactory schemaFactory = SchemaFactory.newInstance(xmlSchemaNameSpaceURI);
			schema = schemaFactory.newSchema(new File(xmlSchemaFilesName));
			System.out.println("Loading XML Schema File is successful");
		} catch (SAXException e) {
			System.out.println("SAXException in loadXMLSchemaFile:: "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception in loadXMLSchemaFile:: "+e.getMessage());
		}
		return schema;
	}

	// Method to parse an XML file and create a DOM document
	public static Document parseXmlDOMFile(String xmlName) {
		  Document document = null;
			try {
				// Create a DocumentBuilderFactory object
				DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				document = documentBuilder.parse(new File(xmlName));
			} catch (SAXException e) {
				System.out.println("SAXException in parseXmlDOMFile:: "+e.getMessage());
			} catch (IOException e) {
				System.out.println("IOException in parseXmlDOMFile:: "+e.getMessage());
			} catch (Exception e) {
				System.out.println("Exception in parseXmlDOMFile:: "+e.getMessage());
			}
			System.out.println("Parsing XML DOM File is successful");
		return document;
	}

	// Method to validate an XML document against an XML schema
	public static void validateXmlAgainstXmlSchema(Schema schema, Document document) {
		try {
			// Create a Validator object using the loaded schema
			Validator validator = schema.newValidator();
			validator.validate(new DOMSource(document));
			System.out.println("Validating XML Againt XML Schema is successful");
		} catch (SAXException e) {
			System.out.println("SAXException in validateXmlAgainstXmlSchema:: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException in validateXmlAgainstXmlSchema:: "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception in validateXmlAgainstXmlSchema:: "+e.getMessage());
		}
	}
}
