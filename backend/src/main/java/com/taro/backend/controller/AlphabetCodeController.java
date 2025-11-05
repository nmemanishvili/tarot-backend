package com.taro.backend.controller;

import com.taro.backend.service.AlphabetCodeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/letter")
@CrossOrigin(origins = "http://localhost:4200")
public class AlphabetCodeController {
    private final AlphabetCodeService service;

    public  AlphabetCodeController(AlphabetCodeService service){
        this.service=service;
    }

    @GetMapping("/{letter}")
    public Integer getValueByLetter(@PathVariable String letter){
        return service.getValueByLetter(letter);
    }

}
