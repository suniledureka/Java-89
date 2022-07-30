package co.edureka.xml;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class CreateXMLDoc {

	public static void main(String[] args) throws Exception {
		/*-- initialize DOM Parser --*/
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = factory.newDocumentBuilder();

		/*-- create a new Document ---*/
		Document doc = parser.newDocument();

		Element root = doc.createElement("students");
		doc.appendChild(root);

		Element student = doc.createElement("student");
		root.appendChild(student);

		Element name = doc.createElement("name");
		Text name_data = doc.createTextNode("Sunil Joseph");
		name.appendChild(name_data);
		student.appendChild(name);

		Element email = doc.createElement("email");
		Text email_data = doc.createTextNode("sunil@hotmail.com");
		email.appendChild(email_data);
		student.appendChild(email);

		Element address = doc.createElement("address");
		Text addr_data = doc.createTextNode("Hyderabad");
		address.appendChild(addr_data);
		student.appendChild(address);

		TransformerFactory tfactory = TransformerFactory.newInstance();
		Transformer t = tfactory.newTransformer();

		FileOutputStream fos = new FileOutputStream("E:/students.xml");
		t.transform(new DOMSource(doc), new StreamResult(fos));

		System.out.println("XML file generated..");
	}

}
