package com.feipeng.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * DOM生成与解析XML文档
 */

public class DomDemo implements XmlDocment {

    private Document document;
    private String   fileName;

    public void init() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            this.document = builder.newDocument();
        } catch (ParserConfigurationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void createXml(String fileName) {
        Element root = this.document.createElement("employees");
        this.document.appendChild(root);
        Element employee = this.document.createElement("employee");
        Element name = this.document.createElement("name");
        Element sex = this.document.createElement("sex");
        Element age = this.document.createElement("age");
        name.appendChild(this.document.createTextNode("name内容热热热"));
        sex.appendChild(this.document.createTextNode("sex=m啊啊"));
        age.appendChild(this.document.createTextNode("age=24啊啊"));
        employee.appendChild(name);
        employee.appendChild(sex);
        employee.appendChild(age);
        root.appendChild(employee);

        TransformerFactory tf = TransformerFactory.newInstance();
        try {
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8s");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            FileOutputStream fos = new FileOutputStream(fileName);
            StreamResult result = new StreamResult(fos);

            transformer.transform(source, result);
            System.out.println("生成XML文件成功!");

        } catch (TransformerConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void parserXml(String fileName) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(fileName);
            NodeList employees = document.getChildNodes();
            for (int i = 0; i < employees.getLength(); i++) {
                Node employee = employees.item(i);
                NodeList employeeInfo = employee.getChildNodes();
                for (int j = 0; j < employeeInfo.getLength(); j++) {
                    Node node = employeeInfo.item(j);
                    NodeList employeeMeta = node.getChildNodes();
                    for (int k = 0; k < employeeMeta.getLength(); k++) {
                        System.out.println(employeeMeta.item(k).getNodeName() + ":"
                                           + employeeMeta.item(k).getTextContent());
                    }
                }
            }
            System.out.println("解析完毕");

        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void testDemo() {
        //        init();
        //        createXml("");
        String fileName = "DomDemo.xml";
        parserXml(fileName);

    }

}
