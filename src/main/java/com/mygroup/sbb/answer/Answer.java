package com.mygroup.sbb.answer;

import java.time.LocalDateTime;

import com.mygroup.sbb.question.Question;
import com.mygroup.sbb.user.SiteUser;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

// question과 answer은 1:n 관계

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question; // 하나의 question 참고 가능

    @ManyToOne
    private SiteUser author; // 한명이 여러 개의 답글을 달 수 있기 때문
}