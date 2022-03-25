package com.parsing.service;

import com.parsing.dto.ItemsList;
import com.parsing.dto.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class ItemClient {
    public static final String URL = "http://heckzero.adlernet.ru/item.xml";

    final RestTemplate restTemplate = new RestTemplate();


    public List<Item> getCourses() {
        ItemsList response = restTemplate.getForObject(URL, ItemsList.class);

        if (response != null) {
            return response.getItems();
        }

        return null;
    }
}
