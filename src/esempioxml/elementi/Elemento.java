/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioxml.elementi;

import ttt.utils.xml.document.XMLElement;
import ttt.utils.xml.engine.annotations.Element;
import ttt.utils.xml.engine.interfaces.IXMLTag;

/**
 *
 * @author gabri
 */
@Element(Name = "elementi", CanHaveValue = false)
public class Elemento extends XMLElement {

    public Elemento() {
        super("elementi");
    }

    public int getQuanti() {
        IXMLTag tag = getTag("quanti");
        return Integer.parseInt(tag.getValue());
    }

    public String getColore() {
        return getTag("colore").getValue();
    }

}
