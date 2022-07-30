package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLDom {

	public static void main(String[] args) throws Exception {
		File file = new File("src/co/edureka/xml/staff.xml");
		
		if (file.exists()) {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document doc = parser.parse(file);

			Node root = doc.getDocumentElement();
			System.out.println("Root element ---> " + root.getNodeName());

			NodeList list = doc.getElementsByTagName("staff");
			System.out.println("No of Staffs ---> " + list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				System.out.println("-------------------------------------");
				Node staff = list.item(i);

				if (staff.getNodeType() == Node.ELEMENT_NODE) {
					Element stf = (Element) staff;
					System.out.println("Staff ID : " + stf.getAttribute("id"));

					System.out.println("First Name  : " + stf.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name   : " + stf.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Salary 		: " + stf.getElementsByTagName("salary").item(0).getTextContent());
				}
			}
		} else {
			System.out.println("XML Document missing!");
		}

	}
}
