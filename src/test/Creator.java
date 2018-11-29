package test;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class Creator {

   public static void main(String argv[]) {

      try {
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.newDocument();
         
         // root element
         Element rootElement = doc.createElement("Rekord"); doc.appendChild(rootElement);
         Attr r_attr_1 = doc.createAttribute("xmlns:xsi"); r_attr_1.setValue("http://www.w3.org/2001/XMLSchema-instance");
         Attr r_attr_2 = doc.createAttribute("xsi:noNamespaceSchemaLocation"); r_attr_2.setValue("test.xsd");
         rootElement.setAttributeNode(r_attr_1); rootElement.setAttributeNode(r_attr_2);

         // Tulaj element
         Element t_Tulaj_1 = doc.createElement("Tulaj"); rootElement.appendChild(t_Tulaj_1);
         Element t_nev_1 = doc.createElement("nev"); t_nev_1.appendChild(doc.createTextNode("Tulaj Don")); t_Tulaj_1.appendChild(t_nev_1);
         Element t_szuletesido_1 = doc.createElement("szuletesido"); t_szuletesido_1.appendChild(doc.createTextNode("1990-01-01")); t_Tulaj_1.appendChild(t_szuletesido_1);        
         Element t_lakhely_1 = doc.createElement("lakhely"); t_Tulaj_1.appendChild(t_lakhely_1);        
         Element t_varos_1 = doc.createElement("varos"); t_varos_1.appendChild(doc.createTextNode("Debrecen")); t_lakhely_1.appendChild(t_varos_1);        
         Element t_utca_1 = doc.createElement("utca"); t_utca_1.appendChild(doc.createTextNode("Jeriko")); t_lakhely_1.appendChild(t_utca_1);         
         Element t_hazszam_1 = doc.createElement("hazszam"); t_hazszam_1.appendChild(doc.createTextNode("12")); t_lakhely_1.appendChild(t_hazszam_1);
         Element t_szig_1 = doc.createElement("szig"); t_szig_1.appendChild(doc.createTextNode("112233AA")); t_Tulaj_1.appendChild(t_szig_1);
         
         //Kedvenc element
         
         Element k_Kedvenc_1 = doc.createElement("Kedvenc"); rootElement.appendChild(k_Kedvenc_1);
         Attr k_attr_1 = doc.createAttribute("torzsszam"); k_attr_1.setValue("111111"); k_Kedvenc_1.setAttributeNode(k_attr_1);
         Element k_tipus_1 = doc.createElement("tipus"); k_tipus_1.appendChild(doc.createTextNode("Kutya")); k_Kedvenc_1.appendChild(k_tipus_1);
         Element k_nev_1 = doc.createElement("nev"); k_nev_1.appendChild(doc.createTextNode("Bodri")); k_Kedvenc_1.appendChild(k_nev_1);
         Element k_szin_1 = doc.createElement("szin"); k_szin_1.appendChild(doc.createTextNode("Fekete")); k_Kedvenc_1.appendChild(k_szin_1);
         Element k_fajta_1 = doc.createElement("fajta"); k_fajta_1.appendChild(doc.createTextNode("Spaniel")); k_Kedvenc_1.appendChild(k_fajta_1);
         Element k_nem_1 = doc.createElement("nem"); k_nem_1.appendChild(doc.createTextNode("Fiu")); k_Kedvenc_1.appendChild(k_nem_1);
         Element k_utolsovizsgalat_1 = doc.createElement("utolsovizsgalat"); k_utolsovizsgalat_1.appendChild(doc.createTextNode("2013-01-02")); k_Kedvenc_1.appendChild(k_utolsovizsgalat_1);
         Element k_eletkor_1 = doc.createElement("eletkor"); k_eletkor_1.appendChild(doc.createTextNode("4")); k_Kedvenc_1.appendChild(k_eletkor_1);
         Element k_gazdaszig_1 = doc.createElement("gazdaszig"); k_gazdaszig_1.appendChild(doc.createTextNode("112233AA")); k_Kedvenc_1.appendChild(k_gazdaszig_1);
         
         Element k_Kedvenc_2 = doc.createElement("Kedvenc"); rootElement.appendChild(k_Kedvenc_2);
         Attr k_attr_2 = doc.createAttribute("torzsszam"); k_attr_2.setValue("222222"); k_Kedvenc_2.setAttributeNode(k_attr_2);
         Element k_tipus_2 = doc.createElement("tipus"); k_tipus_2.appendChild(doc.createTextNode("Macska")); k_Kedvenc_2.appendChild(k_tipus_2);
         Element k_nev_2 = doc.createElement("nev"); k_nev_2.appendChild(doc.createTextNode("Pamacs")); k_Kedvenc_2.appendChild(k_nev_2);
         Element k_szin_2 = doc.createElement("szin"); k_szin_2.appendChild(doc.createTextNode("Feher")); k_Kedvenc_2.appendChild(k_szin_2);
         Element k_fajta_2 = doc.createElement("fajta"); k_fajta_2.appendChild(doc.createTextNode("Maine Coon")); k_Kedvenc_2.appendChild(k_fajta_2);
         Element k_nem_2 = doc.createElement("nem"); k_nem_2.appendChild(doc.createTextNode("Lany")); k_Kedvenc_2.appendChild(k_nem_2);
         Element k_utolsovizsgalat_2 = doc.createElement("utolsovizsgalat"); k_utolsovizsgalat_2.appendChild(doc.createTextNode("2015-01-02")); k_Kedvenc_2.appendChild(k_utolsovizsgalat_2);
         Element k_eletkor_2 = doc.createElement("eletkor"); k_eletkor_2.appendChild(doc.createTextNode("2")); k_Kedvenc_2.appendChild(k_eletkor_2);
         Element k_gazdaszig_2 = doc.createElement("gazdaszig"); k_gazdaszig_2.appendChild(doc.createTextNode("125599BC")); k_Kedvenc_2.appendChild(k_gazdaszig_2);

         Element k_Kedvenc_3 = doc.createElement("Kedvenc"); rootElement.appendChild(k_Kedvenc_3);
         Attr k_attr_3 = doc.createAttribute("torzsszam"); k_attr_3.setValue("333333"); k_Kedvenc_3.setAttributeNode(k_attr_3);
         Element k_tipus_3 = doc.createElement("tipus"); k_tipus_3.appendChild(doc.createTextNode("Papagaj")); k_Kedvenc_3.appendChild(k_tipus_3);
         Element k_nev_3 = doc.createElement("nev"); k_nev_3.appendChild(doc.createTextNode("Szajko")); k_Kedvenc_3.appendChild(k_nev_3);
         Element k_szin_3 = doc.createElement("szin"); k_szin_3.appendChild(doc.createTextNode("Tarka")); k_Kedvenc_3.appendChild(k_szin_3);
         Element k_fajta_3 = doc.createElement("fajta"); k_fajta_3.appendChild(doc.createTextNode("Zoldszarnyu ara")); k_Kedvenc_3.appendChild(k_fajta_3);
         Element k_nem_3 = doc.createElement("nem"); k_nem_3.appendChild(doc.createTextNode("Fiu")); k_Kedvenc_3.appendChild(k_nem_3);
         Element k_utolsovizsgalat_3 = doc.createElement("utolsovizsgalat"); k_utolsovizsgalat_3.appendChild(doc.createTextNode("2011-01-02")); k_Kedvenc_3.appendChild(k_utolsovizsgalat_3);
         Element k_eletkor_3 = doc.createElement("eletkor"); k_eletkor_3.appendChild(doc.createTextNode("1")); k_Kedvenc_3.appendChild(k_eletkor_3);
         Element k_gazdaszig_3 = doc.createElement("gazdaszig"); k_gazdaszig_3.appendChild(doc.createTextNode("786542LK")); k_Kedvenc_3.appendChild(k_gazdaszig_3);
         
         //Allatorvosok element
         
         Element a_Allatorvosok_1 = doc.createElement("Allatorvosok"); rootElement.appendChild(a_Allatorvosok_1);
         Element a_Allatorvos_1 = doc.createElement("Allatorvos"); a_Allatorvosok_1.appendChild(a_Allatorvos_1);
         Element a_nev_1 = doc.createElement("nev"); a_nev_1.appendChild(doc.createTextNode("Metszo Otto")); a_Allatorvos_1.appendChild(a_nev_1);
         Element a_engedelyervenyes_1 = doc.createElement("engedelyervenyes"); a_engedelyervenyes_1.appendChild(doc.createTextNode("2018-09-09")); a_Allatorvos_1.appendChild(a_engedelyervenyes_1);        
         Element a_beavatkozas_1 = doc.createElement("beavatkozas"); a_beavatkozas_1.appendChild(doc.createTextNode("Vedooltas")); a_Allatorvos_1.appendChild(a_beavatkozas_1);
         Element a_kedvencID_1 = doc.createElement("kedvencID"); a_kedvencID_1.appendChild(doc.createTextNode("111111")); a_Allatorvos_1.appendChild(a_kedvencID_1);        
         
         // write the content into an xml file
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
         StreamResult result = new StreamResult(new File("E:\\personal\\school\\university\\miskolc\\xml\\jdom.xml"));
         transformer.transform(source, result);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}