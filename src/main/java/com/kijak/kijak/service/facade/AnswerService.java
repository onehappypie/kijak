package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.Answer;

public interface AnswerService {
    public int save(Answer answer);
    public Optional<Answer> findbyid(Long id);
    public List<Answer> findall();
    public  int deleteByReference(String reference);
    public Answer findByReference(String reference);
}
