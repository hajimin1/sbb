package com.mygroup.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb") // sbb 경로로 요청이 들어오면
    @ResponseBody // 응답 보내줌, return이 response body가 됨
    public String index() {
        //System.out.println("index");
        // 요청을 했는데 응답을 안주므로(void 반환형) 500 error 발생
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}