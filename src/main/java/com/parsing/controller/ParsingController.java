package com.parsing.controller;

import com.parsing.service.ItemAndPerkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class ParsingController {

    private final ItemAndPerkService itemAndPerkService;

    @GetMapping(value = "/getItems")
    public String getItemsInfo() {
        return itemAndPerkService.findItemsInfo().toString();
    }

    @GetMapping(value = "/getPerks")
    public String getPerksInfo() {
        return itemAndPerkService.findPerksInfo().toString();
    }
}
