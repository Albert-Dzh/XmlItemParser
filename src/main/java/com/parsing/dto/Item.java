package com.parsing.dto;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@Entity
@XmlRootElement(name = "O")
@XmlAccessorType(XmlAccessType.FIELD)
public class Item implements Serializable {

    @Id
    @JacksonXmlProperty(isAttribute = true)
    private Long id;
    @JacksonXmlProperty(isAttribute = true)
    private String name;
    @JacksonXmlProperty(isAttribute = true)
    private String txt;
    @JacksonXmlProperty(isAttribute = true)
    private String massa;
    @JacksonXmlProperty(isAttribute = true)
    private String st;
    @JacksonXmlProperty(isAttribute = true)
    private String made;
    @JacksonXmlProperty(isAttribute = true)
    private String min;
    @JacksonXmlProperty(isAttribute = true)
    private String protect;
    @JacksonXmlProperty(isAttribute = true)
    private String quality;
    @JacksonXmlProperty(isAttribute = true)
    private String maxquality;
    @JacksonXmlProperty(isAttribute = true)
    @Column(name = "\"OD\"")
    private String OD;
    @JacksonXmlProperty(isAttribute = true)
    @Column(name = "\"rOD\"")
    private String rOD;
    @JacksonXmlProperty(isAttribute = true)
    private double type;
    @JacksonXmlProperty(isAttribute = true)
    private String damage;
    @JacksonXmlProperty(isAttribute = true)
    private String calibre;
    @JacksonXmlProperty(isAttribute = true)
    private String shot;
    @JacksonXmlProperty(isAttribute = true)
    private String nskill;
    @JacksonXmlProperty(isAttribute = true)
    private String max_count;
    @JacksonXmlProperty(isAttribute = true)
    private String up;
    @JacksonXmlProperty(isAttribute = true)
    private String grouping;
    @JacksonXmlProperty(isAttribute = true)
    private String range;
    @JacksonXmlProperty(isAttribute = true)
    private String nt;
    @JacksonXmlProperty(isAttribute = true)
    private String build_in;
    @JacksonXmlProperty(isAttribute = true)
    private String c;
    @JacksonXmlProperty(isAttribute = true)
    private String radius;
    @JacksonXmlProperty(isAttribute = true)
    private String cost;
    @JacksonXmlProperty(isAttribute = true)
    private String cost2;
    @JacksonXmlProperty(isAttribute = true)
    private String s1;
    @JacksonXmlProperty(isAttribute = true)
    private String s2;
    @JacksonXmlProperty(isAttribute = true)
    private String s3;
    @JacksonXmlProperty(isAttribute = true)
    private String s4;
    @JacksonXmlProperty(isAttribute = true)
    private String count;
    @JacksonXmlProperty(isAttribute = true)
    private String lb;
    @JacksonXmlProperty(isAttribute = true)
    private String dt;
    @JacksonXmlProperty(isAttribute = true)
    private String hz;
    @JacksonXmlProperty(isAttribute = true)
    private String res;
    @JacksonXmlProperty(isAttribute = true)
    private String owner;
    @JacksonXmlProperty(isAttribute = true)
    private String tm;
    @JacksonXmlProperty(isAttribute = true)
    private String ln;

    //-------------------------------------
    @JacksonXmlProperty(isAttribute = true)
    private String section;
    @JacksonXmlProperty(isAttribute = true)
    private String lvl;
    @JacksonXmlProperty(isAttribute = true)
    private String piercing;
    @JacksonXmlProperty(isAttribute = true)
    String price;
    @JacksonXmlProperty(isAttribute = true)
    String PriceType;
    @JacksonXmlProperty(isAttribute = true)
    String txt2;
    @JacksonXmlProperty(isAttribute = true)
    String hint;
    @JacksonXmlProperty(isAttribute = true)
    String gc;
    @JacksonXmlProperty(isAttribute = true)
    String X;
    @JacksonXmlProperty(isAttribute = true)
    String Y;


    public Item() { }

    @Override
    public String toString() {
        return "\n" + id + " (" + name + ')';
    }
}
