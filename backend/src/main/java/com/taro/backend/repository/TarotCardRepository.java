package com.taro.backend.repository;

import com.taro.backend.entity.TarotCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TarotCardRepository extends JpaRepository<TarotCard, Long> {
    @Query(value = "SELECT * FROM arcans ORDER BY RANDOM() LIMIT :limit", nativeQuery = true )
    List<TarotCard> getRandomCards(int limit);
}
