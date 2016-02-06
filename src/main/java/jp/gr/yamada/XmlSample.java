package jp.gr.yamada;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class XmlSample {

    public static void main(String[] args) throws Exception {
        System.out.println(XmlSample.getNodeValue(new File(
                "./src/main/resources/employees.xml"), "/employees/employee"));
    }

    /**
     * XMLファイルから指定したNode(NodeSet)の文字列を取得する
     * @param xmlfile XMLファイル
     * @param location ロケーションパス
     * @return 処理結果
     * @throws Exception 例外
     */
    public static String getNodeValue(File xmlfile, String location)
            throws Exception {

        Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder().parse(xmlfile);
        XPath xpath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xpath.evaluate(location, doc,
                XPathConstants.NODESET);

        // NodeをXML文書として出力する
        Transformer transformer = TransformerFactory.newInstance()
                .newTransformer();
        // 出力からXML宣言を省略する指定
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

        try (StringWriter sw = new StringWriter()) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                transformer.transform(
                        new DOMSource(nodeList.item(i)),
                        new StreamResult(sw));
            }

            return sw.toString();
        }
    }
}
