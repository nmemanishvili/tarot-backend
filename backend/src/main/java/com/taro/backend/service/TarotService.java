package com.taro.backend.service;

import com.taro.backend.dto.TarotCardDTO;
import com.taro.backend.repository.TarotCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarotService {
    private final TarotCardRepository repo;

    public TarotService(TarotCardRepository repo){
        this.repo = repo;
    }
    public List<TarotCardDTO> drawCards(int count){
        return repo.getRandomCards(count)
                .stream()
                .map(card -> new TarotCardDTO(
                        card.getId(),
                        card.getName(),
                        card.getMeaning()
                ))
                .toList();
    }
}
