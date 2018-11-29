package test;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Modifier {

   public static void main(String argv[]) {

      try {
         File inputFile = new File("E:\\personal\\school\\university\\miskolc\\xml\\jdom.xml");
         DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
         Document doc = docBuilder.parse(inputFile);
         //Node k_Kedvenc_1 = doc.getElementsByTagName("Kedvenc").item(0);         
         
         // update Kedvenc attribute
         NodeList k_attr_list = doc.getElementsByTagName("Kedvenc");
         for (int k_attr_temp = 0; k_attr_temp < k_attr_list.getLength(); k_attr_temp++) {
        	 Node k_a_list = doc.getElementsByTagName("Kedvenc").item(k_attr_temp);
        	 NamedNodeMap k_a_node = k_a_list.getAttributes();
        	 Node k_attr_node = k_a_node.getNamedItem("torzsszam");
        	 if ("222222".equals(k_attr_node.getTextContent())) {
        		 k_attr_node.setTextContent("444444");
        	 }
         }

         // update the Tulaj node's szuletesido child node
         NodeList pNode = doc.getElementsByTagName("Tulaj");
         Node parent = null;
         for (int p_temp = 0; p_temp < pNode.getLength(); p_temp++) {
        	 parent = pNode.item(p_temp);
        	 if (parent.getNodeType() == Node.ELEMENT_NODE) {
        		 Element pElement = (Element) parent;
        		 if (pElement.getTagName().equals("Tulaj")) {
        			 NodeList chNode = parent.getChildNodes();
        			 Node child = null;
        			 for (int ch_temp = 0; ch_temp < chNode.getLength(); ch_temp++) {
        	        	 child = chNode.item(ch_temp);
        	        	 if (child.getNodeType() == Node.ELEMENT_NODE) {
        	        		 Element chElement = (Element) child;
        	        		 if (chElement.getTagName().equals("szig")) {
        	        			 if ("112233AA".equals(chElement.getTextContent())) {
        	        				 chElement.setTextContent("LQQ43K");
        	        			 }
        	        		 }
        	        	 }
        			 }
        		 }
        	 }
         }
         
         // write the content to xml
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult Result = new StreamResult(new File("E:\\personal\\school\\university\\miskolc\\xml\\jdom.xml"));
         transformer.transform(source, Result);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}