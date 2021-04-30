/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioxml;

import esempioxml.elementi.Elemento;
import esempioxml.elementi.ElementoPrincipale;
import esempioxml.elementi.ElementoSecondario;
import esempioxml.elementi.ElementoStrano;
import java.io.File;
import java.io.IOException;
import ttt.utils.xml.document.XMLDocument;
import ttt.utils.xml.engine.XMLEngine;
import ttt.utils.xml.io.XMLReader;
import ttt.utils.xml.io.XMLWriter;

/**
 *
 * @author gabri
 */
public class EsempioXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            // TODO code application logic here
            XMLReader lettoreFile = new XMLReader(new File("V:\\Documents\\NetBeansProjects\\EsempioXML\\esempio.xml"));//Crea lettore
            XMLDocument fileEsempioXML = lettoreFile.readDocument();//Legge il file
            XMLEngine motore_compliazione
                    = new XMLEngine(fileEsempioXML, Elemento.class, ElementoPrincipale.class, ElementoSecondario.class, ElementoStrano.class);// Inizializza il motore

            XMLDocument fileConvertito = new XMLDocument(new File("asoduoasdiu.xml")); // crea documento temporaneo
            motore_compliazione.morph(fileConvertito);//Converte tutti gli XMLElement con le classi Elemento, ElementoPrincipale, ElementoSecondario

            XMLWriter scrittoreFile = new XMLWriter(new File("output.xml"));
            scrittoreFile.writeDocument(fileConvertito);
            
        } catch (IOException ex) {
            System.out.println("File non trovato o inaccessibile");
        }
    }

}
