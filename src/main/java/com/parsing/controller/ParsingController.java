package com.parsing.controller;

import com.parsing.service.ItemAndPerkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;


@RestController
@RequiredArgsConstructor
public class ParsingController {

    private final ItemAndPerkService itemAndPerkService;

    @GetMapping(value = "/getItems")
    public String getItemsInfo() {
        StringJoiner sj = new StringJoiner("\n");
        var items = itemAndPerkService.findItemsInfo();
        items.forEach(i -> sj.add(i.toString()));
        sj.add(String.format("TOTAL ITEMS: %d", items.size()));
        return sj.toString();
    }

    @GetMapping(value = "/getPerks")
    public String getPerksInfo() {
        StringJoiner sj = new StringJoiner("\n");
        var perks = itemAndPerkService.findPerksInfo();
        perks.forEach(i -> sj.add(i.toString()));
        sj.add(String.format("TOTAL PERKS: %d", perks.size()));
        return sj.toString();
    }
}
