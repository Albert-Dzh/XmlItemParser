package com.parsing.service;

import com.parsing.dto.Item;
import com.parsing.dto.Perk;
import com.parsing.repository.ItemEntityRepository;
import com.parsing.repository.PerkEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemAndPerkService {

    private final ItemEntityRepository itemEntityRepository;
    private final PerkEntityRepository perkEntityRepository;

    private final ItemAndPerkClient itemAndPerkClient;

    public List<Item> findItemsInfo() {
        return itemEntityRepository.saveAll(itemAndPerkClient.getItems());
    }

    public List<Perk> findPerksInfo() {
        return perkEntityRepository.saveAll(itemAndPerkClient.getPerks());
    }
}
