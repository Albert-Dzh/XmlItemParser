package com.parsing.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemsList implements Serializable {

    @XmlElement(name = "O")
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemsList{" +
                "items=" + items +
                '}';
    }
}
