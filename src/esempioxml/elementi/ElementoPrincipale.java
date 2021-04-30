/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioxml.elementi;

import ttt.utils.xml.document.XMLElement;
import ttt.utils.xml.engine.annotations.Element;

/**
 *
 * @author gabri
 */
@Element(Name = "elementoPrincipale", CanHaveValue = false)
public class ElementoPrincipale extends XMLElement {

    public ElementoPrincipale() {
        super("elementoPrincipale");
    }

    public String rappresentaStringa() {
        return "" + getName() + " TAGS disponibili: " + getTags().size() + "\tSotto elementi disponibili: " + getElements().size();
    }

}
