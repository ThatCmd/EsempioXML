/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempioxml.elementi;

import ttt.utils.xml.document.XMLElement;
import ttt.utils.xml.engine.annotations.Element;
import ttt.utils.xml.engine.annotations.EngineMethod;
import ttt.utils.xml.engine.enums.MethodType;

/**
 *
 * @author gabri
 */
@Element(Name = "blalasd")
public class ElementoStrano extends XMLElement {

    private Integer valore;

    public ElementoStrano() {
        super("blalasd");
    }

    @EngineMethod(MethodType = MethodType.CALC)
    public void inizializza() {
        valore = Integer.parseInt(getValue());
    }

    public Integer getValoreDellElemento() {
        return valore;
    }

}
