package com.parsing.service;

import com.parsing.dto.ItemsList;
import com.parsing.dto.Item;
import com.parsing.dto.Perk;
import com.parsing.dto.PerksList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Component
public class ItemAndPerkClient {
    public static final String ITEM_URL = "http://heckzero.adlernet.ru/item.xml";
    public static final String PERK_URL = "http://heckzero.adlernet.ru/perk.xml";

    final RestTemplate restTemplate = new RestTemplate();


    public List<Item> getItems() {
        ItemsList response = restTemplate.getForObject(ITEM_URL, ItemsList.class);

        return response == null ? null : response.getItems();
    }

    public List<Perk> getPerks() {
        PerksList response = restTemplate.getForObject(PERK_URL, PerksList.class);

        return response == null ? null : response.getPerks();
    }
}
