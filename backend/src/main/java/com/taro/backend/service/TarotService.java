package com.taro.backend.service;
import com.taro.backend.entity.TarotCard;
import com.taro.backend.repository.TarotCardRepository;
import org.springframework.stereotype.Service;


@Service
public class TarotService {

    private final TarotCardRepository repo;

    public TarotService(TarotCardRepository repo){
        this.repo = repo;
    }

    public TarotCard getRandomCard() {
        return repo.findRandomCard();
    }
}
