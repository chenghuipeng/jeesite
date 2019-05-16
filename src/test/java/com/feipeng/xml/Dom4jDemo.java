package com.feipeng.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * DOM生成与解析XML文档
 */

public class Dom4jDemo implements XmlDocment {

    @Test
    public void testDemo() {
        //        init();
        String fileName = "DomDemo2.xml";
        //createXml(fileName);
        parserXml(fileName);

    }

    @Override
    public void createXml(String fileName) {
        Document document = DocumentHelper.createDocument();
        Element employees = document.addElement("employees");

        Element employee = employees.addElement("employee");
        Element name = employee.addElement("name");
        name.setText("活这么大就没饱过");
        Element sex = employee.addElement("sex");
        sex.setText("m");
        Element age = employee.addElement("age");
        age.setText("24");
        OutputFormat formater = OutputFormat.createPrettyPrint();
        formater.setEncoding("utf-8");
        try {
            Writer fileWriter = new FileWriter(fileName);
            XMLWriter xmlWriter = new XMLWriter(fileWriter, formater);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void parserXml(String fileName) {
        File inputXml = new File(fileName);
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(inputXml);
            Element employees = document.getRootElement();
            for (Iterator i = employees.elementIterator(); i.hasNext();) {
                Element employee = (Element) i.next();
                for (Iterator j = employee.elementIterator(); j.hasNext();) {
                    Element node = (Element) j.next();
                    System.out.println(node.getName() + ":" + node.getText());
                }
            }
        } catch (DocumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("dom4j parserXml");

    }

}
