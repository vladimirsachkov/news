package ru.citadel.news.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.citadel.news.entity.BlackWordEntity;

import java.util.List;

public interface BlackListDAO extends JpaRepository<BlackWordEntity, Integer> {
    List<BlackWordEntity> findAll();
    BlackWordEntity getFirstById(int id);
    BlackWordEntity getFirstByWord(String word);
    BlackWordEntity save(BlackWordEntity blackWordEntity);
}
