package com.parsing.service;

import com.parsing.dto.Item;
import com.parsing.repository.ItemEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemEntityRepository itemEntityRepository;
    private final ItemClient itemClient;

    public List<Item> findCourseInfo() {
        return itemEntityRepository.saveAll(itemClient.getCourses());
    }
}
