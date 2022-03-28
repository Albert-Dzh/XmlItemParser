package com.parsing.dto.xmlAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ToDoubleAdapter extends XmlAdapter<String, Double> {
    public Double unmarshal(String v) { return Double.parseDouble(v.replace(",", ".")); }

    public String marshal(Double v) { return v.toString(); }
}
