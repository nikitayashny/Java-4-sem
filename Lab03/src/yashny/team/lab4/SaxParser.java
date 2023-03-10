package yashny.team.lab4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;  //библотека для саксирования
import yashny.team.Middle;

public class SaxParser extends DefaultHandler {
    Middle worker = new Middle();
    String thisElement = "";
    @Override
    public void startDocument() throws SAXException {
        System.out.println("----> Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    public Middle getResult()
    {
        return worker;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        switch (thisElement) {
            case "name" -> worker.name = new String(ch, start, length);
            case "age" -> worker.age = new Integer(new String(ch, start, length));
            case "salary" -> worker.salary = new Integer(new String(ch, start, length));
        }

    }
    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void endDocument() {
        System.out.println("----> Stop parse XML...");
    }
}
