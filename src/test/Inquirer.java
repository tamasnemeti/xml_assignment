package test;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class Inquirer {

   public static void main(String argv[]) {
 
      try {
         File inputFile = new File("E:\\personal\\school\\university\\miskolc\\xml\\test.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Gyoker elem: " + doc.getDocumentElement().getNodeName());

         NodeList kList = doc.getElementsByTagName("Kedvenc");
         System.out.println("---------------------------------------- Kedvencek");
         for (int temp = 0; temp < kList.getLength(); temp++) {
            Node kNode = kList.item(temp);
            
            if (kNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) kNode;
               System.out.println("Torzsszam: " + eElement.getAttribute("torzsszam"));
               NodeList kNameList = eElement.getElementsByTagName("nev");
               
               for (int count = 0; count < kNameList.getLength(); count++) {
                  Node node1 = kNameList.item(count);
                  
                  if (node1.getNodeType() == Node.ELEMENT_NODE) {
                     Element tulaj = (Element) node1;
                     System.out.println("Nev: " + tulaj.getTextContent());
                     System.out.println("----------");
                  }
               }
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}