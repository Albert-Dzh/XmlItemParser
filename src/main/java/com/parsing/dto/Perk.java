package com.parsing.dto;

import com.parsing.dto.xmlAdapter.ToDoubleAdapter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


@Entity
@XmlRootElement(name = "O")
@XmlAccessorType(XmlAccessType.FIELD)
public class Perk implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "txt")
    private String txt;

    @XmlAttribute(name = "min")
    private String min;

    @XmlAttribute(name = "damage")
    private String damage;

    @XmlAttribute(name = "max_count")
    private String max_count;

    @XmlAttribute(name = "shot")
    private String shot;

    @XmlAttribute(name = "OD")
    private String OD;

    @XmlAttribute(name = "rOD")
    private String rOD;

    @XmlAttribute(name = "s4")
    private String s4;

    @XmlAttribute(name = "PriceType")
    private String PriceType;

    @XmlAttribute(name = "X")
    private String X;

    @XmlAttribute(name = "cost")
    private String cost;

    @XmlAttribute(name = "count")
    private String count;

    @XmlAttribute(name = "s2")
    private String s2;

    @XmlAttribute(name = "s3")
    private String s3;

    @XmlAttribute(name = "range")
    private String range;

    @XmlAttribute(name = "radius")
    private String radius;

    @XmlAttribute(name = "made")
    private String made;

    @XmlAttribute(name = "res")
    private String res;

    @XmlAttribute(name = "section")
    private String section;

    @XmlAttribute(name = "nt")
    private String nt;

    @XmlAttribute(name = "calibre")
    private String calibre;

    @XmlAttribute(name = "grouping")
    private String grouping;

    @XmlAttribute(name = "quality")
    private String quality;

    @XmlAttribute(name = "nskill")
    private String nskill;

    @XmlAttribute(name = "s1")
    private String s1;

    @XmlAttribute(name = "hz")
    private String hz;

    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(value = ToDoubleAdapter.class)
    private Double type;

    @XmlAttribute(name = "gc")
    private String gc;

    @XmlAttribute(name = "protect")
    private String protect;

    @XmlAttribute(name = "cost2")
    private String cost2;

    @XmlAttribute(name = "txt2")
    private String txt2;

    @XmlAttribute(name = "price")
    private String price;

    @Override
    public String toString() {
        return "\nPerk{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", txt='" + txt + '\'' +
                ", min='" + min + '\'' +
                ", damage='" + damage + '\'' +
                ", max_count='" + max_count + '\'' +
                ", shot='" + shot + '\'' +
                ", OD='" + OD + '\'' +
                ", rOD='" + rOD + '\'' +
                ", s4='" + s4 + '\'' +
                ", PriceType='" + PriceType + '\'' +
                ", X='" + X + '\'' +
                ", cost='" + cost + '\'' +
                ", count='" + count + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", range='" + range + '\'' +
                ", radius='" + radius + '\'' +
                ", made='" + made + '\'' +
                ", res='" + res + '\'' +
                ", section='" + section + '\'' +
                ", nt='" + nt + '\'' +
                ", calibre='" + calibre + '\'' +
                ", grouping='" + grouping + '\'' +
                ", quality='" + quality + '\'' +
                ", nskill='" + nskill + '\'' +
                ", s1='" + s1 + '\'' +
                ", hz='" + hz + '\'' +
                ", type=" + type +
                ", gc='" + gc + '\'' +
                ", protect='" + protect + '\'' +
                ", cost2='" + cost2 + '\'' +
                ", txt2='" + txt2 + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
