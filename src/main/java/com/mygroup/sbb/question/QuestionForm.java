package com.mygroup.sbb.question;

// validate, form 정보 관리
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message="제목은 필수항목입니다.")
    @Size(max=200)
    private String subject; // dto

    @NotEmpty(message="내용은 필수항목입니다.")
    private String content; // dto
}
