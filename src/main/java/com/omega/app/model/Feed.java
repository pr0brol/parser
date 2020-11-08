package com.omega.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "feed")
@XmlAccessorType(XmlAccessType.FIELD)
public class Feed {

    @XmlElement(name = "entry")
    private List<Entry> list = new ArrayList<>();

    public List<Entry> getList() {
        return list;
    }

    public void setList(List<Entry> list) {
        this.list = list;
    }
}
