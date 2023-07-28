package com.mygroup.sbb.question;

import java.util.List;
import java.util.Optional;
import com.mygroup.sbb.DataNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll(); // 레포지토리가 실행해서 나오는 값을 넘겨줌
    }

    public Question getQuestion(Integer id) {  
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else {
            throw new DataNotFoundException("question not found");
        }
    }
}


// 컨트롤러를 통해 직접 레포지토리 만지는 게 아니고, 서비스를 통해 데이터를 주고 받음