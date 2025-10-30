package com.taro.backend.controller;


import com.taro.backend.entity.TarotCard;
import com.taro.backend.repository.TarotCardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tarot")
@CrossOrigin(origins = "http://localhost:4200") // ან "*" მხოლოდ DEV-ში
public class TarotController {
    private final TarotCardRepository repo;
    public TarotController(TarotCardRepository repo) { this.repo = repo; }

    @GetMapping
    public List<TarotCard> all() { return repo.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<TarotCard> get(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/draw")
    public ResponseEntity<Map<String,Object>> draw(@RequestBody Map<String,Object> body) {
        // აქ ლოგიკა გაშლისა — ან უბრალოდ დააბრუნე მაგალითად 3 შემთხვევითი ბარათი
        List<TarotCard> all = repo.findAll();
        Collections.shuffle(all);
        List<TarotCard> pick = all.stream().limit(3).collect(Collectors.toList());
        return ResponseEntity.ok(Map.of("cards", pick));
    }
}
