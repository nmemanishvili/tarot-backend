package com.taro.backend.controller;
import com.taro.backend.entity.TarotCard;
import com.taro.backend.service.TarotService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tarot")
@CrossOrigin(origins = "http://localhost:4200")

public class TarotController {

    private final TarotService service;

    public TarotController(TarotService service){
        this.service = service;
    }

    @GetMapping("/random")
    public TarotCard getRandomCard(){
        return service.getRandomCard();
    }
}
