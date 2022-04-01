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
        itemAndPerkService.findItemsInfo().forEach(i -> sj.add(i.toString()));
        return sj.toString();
    }

    @GetMapping(value = "/getPerks")
    public String getPerksInfo() {
        StringJoiner sj = new StringJoiner("\n");
        itemAndPerkService.findPerksInfo().forEach(i -> sj.add(i.toString()));
        return sj.toString();
    }
}
