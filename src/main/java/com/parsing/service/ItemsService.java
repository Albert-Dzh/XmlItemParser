package com.parsing.service;

import com.parsing.dto.Item;
import com.parsing.repository.ItemsEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemsService {

    private final ItemsEntityRepository itemsEntityRepository;
    private final ItemsClient itemsClient;

    public List<Item> findCourseInfo() {
        return itemsEntityRepository.saveAll(itemsClient.getItems());
    }
}
