/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dom_count_xml;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author mrroot
 */
public class DOM_Count_XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
		String filepath = "/home/mrroot/NetBeansProjects/DOM_Count_XML/src/dom_count_xml/file.xml";
                
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(filepath);
 
		NodeList list = doc.getElementsByTagName("staff");
 
		System.out.println("Total of elements : " + list.getLength());
 
	} catch (ParserConfigurationException pce) {
		pce.printStackTrace();
	} catch (IOException ioe) {
		ioe.printStackTrace();
	} catch (SAXException sae) {
		sae.printStackTrace();
	}
  }
}
