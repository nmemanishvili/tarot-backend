package com.taro.backend.repository;

import com.taro.backend.model.AlphabetCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlphabetCodeRepository extends JpaRepository<AlphabetCode, Long> {
    Optional<AlphabetCode> findByLetter(String letter);
}
