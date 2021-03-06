package jp.gr.yamada;

import java.io.CharArrayWriter;
import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.Charsets;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XmlSample {
    public static void main(String[] args) throws Exception {
        File xmlfile = new File("./src/main/resources/employees.xml");
        String location = "/employees/employee";

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlfile);
        XPath xpath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xpath.evaluate(location, doc, XPathConstants.NODESET);

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        // 出力するXML文書からXML宣言を省略する指定
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        // サロゲートペアが数値文字参照に変換されないように対策
        transformer.setOutputProperty(OutputKeys.ENCODING, Charsets.UTF_16.name());

        try (CharArrayWriter sw = new CharArrayWriter()) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                // NodeをXML文書として出力する
                transformer.transform(new DOMSource(nodeList.item(i)), new StreamResult(sw));
            }
            System.out.println(sw.toString());
        }
    }
}
