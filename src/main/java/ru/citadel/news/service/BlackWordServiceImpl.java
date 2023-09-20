package ru.citadel.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.citadel.news.dao.BlackListDAO;
import ru.citadel.news.entity.BlackWordEntity;

import java.util.List;

@Service
public class BlackWordServiceImpl implements BlackWordService {
    @Autowired
    private BlackListDAO blackListDAO;

    @Transactional
    public List<BlackWordEntity> getAllWords() {
        List<BlackWordEntity> blackWords = blackListDAO.findAll();
        return blackWords;
    }

    @Override
    public BlackWordEntity getWordById(int id) {
        return blackListDAO.getFirstById(id);
    }

    @Override
    public BlackWordEntity getWordByWord(String word) {
        return blackListDAO.getFirstByWord(word);
    }
}
