package com.parsing.controller;

import com.parsing.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ItemParsingController {

    private final ItemService itemService;

    @GetMapping(value = "/getItems")
    public String getListInformation() {
        return itemService.findCourseInfo().toString();
    }
}
