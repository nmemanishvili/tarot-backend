package com.taro.backend.repository;
import com.taro.backend.entity.TarotCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TarotCardRepository extends JpaRepository<TarotCard, Long> {

    @Query(value = "SELECT * FROM majors ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    TarotCard findRandomCard();

}
