/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml_pertama;

import Model.Item;
import Parsing.StarXParser;
import java.util.List;

/**
 *
 * @author mrroot
 */
public class XML_Pertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StarXParser read = new StarXParser();
        List<Item> readConfog = read.readConfig("/home/mrroot/NetBeansProjects/XML_Pertama/src/config.xml");
        for(Item item : readConfog){
            System.out.println(item);
        }
    }
}
