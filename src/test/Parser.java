package test;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Parser {

   public static void main(String[] args) {

      try {
         File inputFile = new File("E:\\personal\\school\\university\\miskolc\\xml\\test.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         System.out.println("Gyoker elem: " + doc.getDocumentElement().getNodeName());
         
         NodeList tList = doc.getElementsByTagName("Tulaj");
         System.out.println("---------------------------------------- Tulajok");
         for (int temp = 0; temp < tList.getLength(); temp++) {
            Node nNode = tList.item(temp);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Nev: " + eElement.getElementsByTagName("nev").item(0).getTextContent());
               System.out.println("Szulido: " + eElement.getElementsByTagName("szuletesido").item(0).getTextContent());
               System.out.println("Lakhely: " + eElement.getElementsByTagName("varos").item(0).getTextContent() + ", " + eElement.getElementsByTagName("utca").item(0).getTextContent() + " " + eElement.getElementsByTagName("hazszam").item(0).getTextContent());
               System.out.println("SZIG: " + eElement.getElementsByTagName("szig").item(0).getTextContent());
            }
         }
         
         NodeList kList = doc.getElementsByTagName("Kedvenc");
         System.out.println("---------------------------------------- Kedvencek");
         for (int temp = 0; temp < kList.getLength(); temp++) {
            Node nNode = kList.item(temp);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Torzsszam: " + eElement.getAttribute("torzsszam"));
               System.out.println("Tipus: " + eElement.getElementsByTagName("tipus").item(0).getTextContent());
               System.out.println("Nev: " + eElement.getElementsByTagName("nev").item(0).getTextContent());
               System.out.println("Szin: " + eElement.getElementsByTagName("szin").item(0).getTextContent());
               System.out.println("Fajta: " + eElement.getElementsByTagName("fajta").item(0).getTextContent());
               System.out.println("Nem: " + eElement.getElementsByTagName("nem").item(0).getTextContent());
               System.out.println("Utolso vizsgalat: " + eElement.getElementsByTagName("utolsovizsgalat").item(0).getTextContent());
               System.out.println("Eletkor: " + eElement.getElementsByTagName("eletkor").item(0).getTextContent());
               System.out.println("Gazda SZIG: " + eElement.getElementsByTagName("gazdaszig").item(0).getTextContent());
               System.out.println("----------");
            }
         }
         
         NodeList aList = doc.getElementsByTagName("Allatorvos");
         System.out.println("---------------------------------------- Allatorvosok");
         for (int temp = 0; temp < aList.getLength(); temp++) {
            Node nNode = aList.item(temp);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Nev: " + eElement.getElementsByTagName("nev").item(0).getTextContent());
               System.out.println("Engedely: " + eElement.getElementsByTagName("engedelyervenyes").item(0).getTextContent());
               System.out.println("Beavatkozas: " + eElement.getElementsByTagName("beavatkozas").item(0).getTextContent());
               System.out.println("Kedvenc torzsszama: " + eElement.getElementsByTagName("kedvencID").item(0).getTextContent());
               System.out.println("----------");
            }
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}