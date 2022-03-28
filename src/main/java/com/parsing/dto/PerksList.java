package com.parsing.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


@XmlRootElement(name = "perks")
@XmlAccessorType(XmlAccessType.FIELD)
public class PerksList implements Serializable {

    @XmlElement(name = "O")
    private List<Perk> perks;

    public List<Perk> getPerks() {
        return perks;
    }

    @Override
    public String toString() {
        return "PerksList{" +
                "perks=" + perks +
                '}';
    }
}
