package com.taro.backend.controller;


import com.taro.backend.dto.TarotCardDTO;
import com.taro.backend.entity.TarotCard;
import com.taro.backend.repository.TarotCardRepository;
import com.taro.backend.service.TarotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tarot")
@CrossOrigin(origins = "http://localhost:4200")
public class TarotController {

    private final TarotService service;

    public TarotController(TarotService service){
        this.service = service;
    }

    @GetMapping("/draw")
    public List<TarotCardDTO> draw(@RequestParam(defaultValue = "3") int count) {
        return service.drawCards(count);
    }


}
