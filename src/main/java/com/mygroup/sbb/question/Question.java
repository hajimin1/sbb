package com.mygroup.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import com.mygroup.sbb.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

// 질문(게시글)과 답변(답글)은 1:n 관계

@Getter
@Setter
@Entity
public class Question {
    @Id // 고유 번호 생성
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY -> unique해짐, index 생성, auto increase 와 같다고 보면 됨
    // 유저 아이디는 auto increse 안쓰는 게 좋음, 번호 단순하면 유저정보 예측 가능해서 조회될 수 있음, 유효 아이디 쓰는 게 좋음
    private Integer id;

    @Column(length = 200) // 컬럼으로 설정
    private String subject; // 게시글 제목

    @Column(columnDefinition = "TEXT") // text로 설정한 컬럼
    private String content; // 게시글 내용

    private LocalDateTime createDate; // 생성 시간
    // createdate, updatedate deletedate를 주로 사용

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}