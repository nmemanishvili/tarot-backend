package com.taro.backend.repository;

import com.taro.backend.entity.TarotCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarotCardRepository extends JpaRepository<TarotCard, Long> {
    List<TarotCard> findByNameContainingIgnoreCase(String q);
}
