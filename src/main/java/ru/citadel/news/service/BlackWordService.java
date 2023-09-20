package ru.citadel.news.service;

import org.springframework.transaction.annotation.Transactional;
import ru.citadel.news.entity.BlackWordEntity;

import java.util.List;

public interface BlackWordService {
    public List<BlackWordEntity> getAllWords();
    public BlackWordEntity getWordById(int id);
    public BlackWordEntity getWordByWord(String word);
}
