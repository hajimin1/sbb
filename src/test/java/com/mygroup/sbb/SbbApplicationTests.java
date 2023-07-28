// package com.mygroup.sbb;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// // import java.time.LocalDateTime;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired; 
// // autowired -> DI라는 의존성 주입 패턴이라는 것이 있음(필요한 객체를 직접 생성하거나 찾지 않고, 외부에서 넣어주는 방식)
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.transaction.annotation.Transactional;

// import com.mygroup.sbb.answer.Answer;
// import com.mygroup.sbb.question.Question;
// import com.mygroup.sbb.question.QuestionRepository;

// // import java.time.LocalDateTime;

// import java.util.List;

// import java.util.Optional;

// @SpringBootTest
// class SbbApplicationTests {

//     @Autowired
//     private QuestionRepository questionRepository;

// 	@Autowired
//     // private AnswerRepository answerRepository;

//     @Transactional
//     @Test
//     void testJpa() {       
//         // Question q1 = new Question(); //  객체 생성
//         // q1.setSubject("sbb가 무엇인가요?"); // 제목 넣음
//         // q1.setContent("sbb에 대해서 알고 싶습니다."); // 내용 넣음
//         // q1.setCreateDate(LocalDateTime.now()); // 현재 시간 넣음
//         // this.questionRepository.save(q1);  // 첫번째 질문 저장, autowired를 통해 구현된 save 함수를 통해 구현

//         // Question q2 = new Question();
//         // q2.setSubject("스프링부트 모델 질문입니다.");
//         // q2.setContent("id는 자동으로 생성되나요?");
//         // q2.setCreateDate(LocalDateTime.now());
//         // this.questionRepository.save(q2);  // 두번째 질문 저장
// 		// // 성공적으로 실행되면 질문 2개가 들어감

// 		// List<Question> all = this.questionRepository.findAll(); // findAll => SELECT * FROM question
// 		// // 모든 질문에 대한 question 데이터를 담음
//         // assertEquals(2, all.size());

//         // Question q = all.get(0);
//         // assertEquals("sbb가 무엇인가요?", q.getSubject());

// 		//Optional<Question> oq = this.questionRepository.findById(1);
//         // if(oq.isPresent()) {
//         //     // Question q = oq.get();
//         //     // assertEquals("sbb가 무엇인가요?", q.getSubject());
// 		// 	// Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//         // 	// assertEquals(1, q.getId());
// 		// 	// Question q = this.questionRepository.findBySubjectAndContent(
//         //     //     "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//         // 	// assertEquals(1, q.getId());
// 		// 	// List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//         // 	// Question q = qList.get(0);
//         // 	// assertEquals("sbb가 무엇인가요?", q.getSubject());
//         // }

// 		// 데이터 수정 test
// 			// Optional<Question> oq = this.questionRepository.findById(1);
//         	// assertTrue(oq.isPresent());
//         	// Question q = oq.get();
//         	// q.setSubject("수정된 제목");
//         	// this.questionRepository.save(q);

// 		// // 데이터 삭제 test
// 		// assertEquals(2, this.questionRepository.count());
//         // Optional<Question> oq = this.questionRepository.findById(1);
//         // assertTrue(oq.isPresent());
//         // Question q = oq.get();
//         // this.questionRepository.delete(q);
//         // assertEquals(1, this.questionRepository.count());

// 		// // 답변데이터 생성, 저장 test
// 		// Optional<Question> oq = this.questionRepository.findById(2);
//         // assertTrue(oq.isPresent());
//         // Question q = oq.get(); // 객체 연결

//         // Answer a = new Answer();
//         // a.setContent("네 자동으로 생성됩니다.");
//         // a.setQuestion(q);  // 어떤 질문의 답변인지 알기위해서 Question 객체가 필요하다.
//         // a.setCreateDate(LocalDateTime.now());
//         // this.answerRepository.save(a);

//         // 답변 조회 test
//         // Optional<Answer> oa = this.answerRepository.findById(1);
//         // assertTrue(oa.isPresent());
//         // Answer a = oa.get();
//         // assertEquals(2, a.getQuestion().getId());
//         Optional<Question> oq = this.questionRepository.findById(2);
//         assertTrue(oq.isPresent());
//         Question q = oq.get();

//         List<Answer> answerList = q.getAnswerList();

//         assertEquals(1, answerList.size());
//         assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());

//     }
// }