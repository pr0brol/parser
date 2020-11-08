package com.omega.app;

import com.omega.app.model.Entry;
import com.omega.app.model.Feed;
import com.omega.app.utils.XmlParse;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws JAXBException {

        Feed read = XmlParse.read("/home/ilya/IdeaProjects/prj/parser/src/main/resources/new.xml");

        for (Entry entry : read.getList()) {
            System.out.println(entry.getTitle());
        }

//        try {
//            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            Document doc = documentBuilder.parse(xml);
//            doc.getDocumentElement().normalize();
//
//            System.out.println(doc.getDocumentElement().getNodeName());
//
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        } catch (SAXException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
