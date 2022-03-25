package com.parsing.dto;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


@Entity
@XmlRootElement(name = "O")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item implements Serializable {

    @Id
    @XmlAttribute(name = "id")
    private Long id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "txt")
    private String txt;

    @XmlAttribute(name = "massa")
    private String massa;

    @XmlAttribute(name = "st")
    private String st;

    @XmlAttribute(name = "made")
    private String made;

    @XmlAttribute(name = "min")
    private String min;

    @XmlAttribute(name = "protect")
    private String protect;

    @XmlAttribute(name = "quality")
    private String quality;

    @XmlAttribute(name = "maxquality")
    private String maxquality;

    @XmlAttribute(name = "OD")
    private String OD;

    @XmlAttribute(name = "rOD")
    private String rOD;

    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(value = ToDoubleAdapter.class)
    private Double type;

    @XmlAttribute(name = "damage")
    private String damage;

    @XmlAttribute(name = "calibre")
    private String calibre;

    @XmlAttribute(name = "shot")
    private String shot;

    @XmlAttribute(name = "nskill")
    private String nskill;

    @XmlAttribute(name = "max_count")
    private String max_count;

    @XmlAttribute(name = "up")
    private String up;

    @XmlAttribute(name = "grouping")
    private String grouping;

    @XmlAttribute(name = "range")
    private String range;

    @XmlAttribute(name = "nt")
    private String nt;

    @XmlAttribute(name = "build_in")
    private String build_in;

    @XmlAttribute(name = "c")
    private String c;

    @XmlAttribute(name = "radius")
    private String radius;

    @XmlAttribute(name = "cost")
    private String cost;

    @XmlAttribute(name = "s1")
    private String s1;
    @XmlAttribute(name = "s2")
    private String s2;
    @XmlAttribute(name = "s3")
    private String s3;
    @XmlAttribute(name = "s4")
    private String s4;

    @XmlAttribute(name = "count")
    private String count;

    @XmlAttribute(name = "lb")
    private String lb;

    @XmlAttribute(name = "dt")
    private String dt;

    @XmlAttribute(name = "hz")
    private String hz;

    @XmlAttribute(name = "res")
    private String res;

    @XmlAttribute(name = "owner")
    private String owner;

    @XmlAttribute(name = "tm")
    private String tm;

    @XmlAttribute(name = "ln")
    private String ln;

    //-----------------------------

    @XmlAttribute(name = "section")
    private String section;

    @XmlAttribute(name = "lvl")
    private String lvl;

    @XmlAttribute(name = "piercing")
    private String piercing;

    @XmlAttribute(name = "price")
    private String price;

    @XmlAttribute(name = "PriceType")
    private String PriceType;

    @XmlAttribute(name = "txt2")
    private String txt2;

    @XmlAttribute(name = "hint")
    private String hint;

    @XmlAttribute(name = "gc")
    private String gc;

    @XmlAttribute(name = "X")
    private String X;

    @XmlAttribute(name = "Y")
    private String Y;


    @Override
    public String toString() {
        return "\nItem " + id +
                " { name='" + name + '\'' +
                ", txt='" + txt + '\'' +
                ", massa='" + massa + '\'' +
                ", st='" + st + '\'' +
                ", made='" + made + '\'' +
                ", min='" + min + '\'' +
                ", protect='" + protect + '\'' +
                ", quality='" + quality + '\'' +
                ", maxquality='" + maxquality + '\'' +
                ", OD='" + OD + '\'' +
                ", rOD='" + rOD + '\'' +
                ", type=" + type +
                ", damage='" + damage + '\'' +
                ", calibre='" + calibre + '\'' +
                ", shot='" + shot + '\'' +
                ", nskill='" + nskill + '\'' +
                ", max_count='" + max_count + '\'' +
                ", up='" + up + '\'' +
                ", grouping='" + grouping + '\'' +
                ", range='" + range + '\'' +
                ", nt='" + nt + '\'' +
                ", build_in='" + build_in + '\'' +
                ", c='" + c + '\'' +
                ", radius='" + radius + '\'' +
                ", cost='" + cost + '\'' +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", count='" + count + '\'' +
                ", lb='" + lb + '\'' +
                ", dt='" + dt + '\'' +
                ", hz='" + hz + '\'' +
                ", res='" + res + '\'' +
                ", owner='" + owner + '\'' +
                ", tm='" + tm + '\'' +
                ", ln='" + ln + '\'' +
                ", section='" + section + '\'' +
                ", lvl='" + lvl + '\'' +
                ", piercing='" + piercing + '\'' +
                ", price='" + price + '\'' +
                ", PriceType='" + PriceType + '\'' +
                ", txt2='" + txt2 + '\'' +
                ", hint='" + hint + '\'' +
                ", gc='" + gc + '\'' +
                ", X='" + X + '\'' +
                ", Y='" + Y + '\'' +
                '}';
    }

    static class ToDoubleAdapter extends XmlAdapter<String, Double> {
        public Double unmarshal(String v) { return Double.parseDouble(v.replace(",", ".")); }

        public String marshal(Double v) { return v.toString(); }
    }
}
