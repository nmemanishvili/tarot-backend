package com.taro.backend.service;

import com.taro.backend.model.AlphabetCode;
import com.taro.backend.repository.AlphabetCodeRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AlphabetCodeService {
    private final AlphabetCodeRepository repository;

    public AlphabetCodeService(AlphabetCodeRepository repository){
        this.repository = repository;
    }
    public Integer getValueByLetter(String letter){
        Optional<AlphabetCode> code=repository.findByLetter(letter);
        return code.map(AlphabetCode::getValue).orElse(null);
    }
}
