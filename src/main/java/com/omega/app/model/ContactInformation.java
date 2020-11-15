package com.omega.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "КонтактнаяИнформация", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
public class ContactInformation {

    @XmlElement(name = "element", required = true, namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private List<Element> elements = new ArrayList<>();

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
