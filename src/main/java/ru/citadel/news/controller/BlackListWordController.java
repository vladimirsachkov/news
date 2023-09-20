package ru.citadel.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.citadel.news.entity.BlackWordEntity;
import ru.citadel.news.service.BlackWordService;

import java.util.List;

@RestController
@RequestMapping("/black-word")
public class BlackListWordController {

    @Autowired
    private BlackWordService blackWordService;

    @GetMapping("/getWords")
    public List<BlackWordEntity> getAll() {
        return blackWordService.getAllWords();
    }

    @GetMapping("/getWordById/{id}")
    public BlackWordEntity getBlackWorld(@PathVariable int id) {
        return blackWordService.getWordById(id);
    }

    @GetMapping("/getWordByWord/{word}")
    public BlackWordEntity getBlackWorld(@PathVariable String word) {
        return blackWordService.getWordByWord(word);
    }
}
