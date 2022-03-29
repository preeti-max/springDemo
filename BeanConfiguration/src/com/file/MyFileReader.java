package com.file;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class MyFileReader {public static void main(String args[]) {
	File file = new File("src/user_data.xml");

	try {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(file);
		MyBean bean = MyBean.getInstance();
		bean.setFirstname(document.getElementsByTagName("first_name").item(0).getTextContent());
		bean.setLastname(document.getElementsByTagName("last_name").item(0).getTextContent());
		System.out.println(bean);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

}

}
