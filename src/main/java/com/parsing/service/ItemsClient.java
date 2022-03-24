package com.parsing.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.parsing.dto.ItemsList;
import com.parsing.dto.Item;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.util.List;


@Component
public class ItemsClient {
    public static final String URL = "http://heckzero.adlernet.ru/item.xml";

    final RestTemplate restTemplate = new RestTemplate();

    @SneakyThrows
    public List<Item> getItems() {

        //ItemsList response = restTemplate.getForObject(URL, ItemsList.class);

        return new XmlMapper().readValue(new FileInputStream("item.xml"), new TypeReference<>(){});
    }
}
