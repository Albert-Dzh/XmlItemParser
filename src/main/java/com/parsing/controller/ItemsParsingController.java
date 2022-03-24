package com.parsing.controller;

import com.parsing.service.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ItemsParsingController {

    private final ItemsService itemsService;


    @GetMapping(value = "/getItems")
    public String getListInformation() {
        return itemsService.findCourseInfo().toString();
    }
}
