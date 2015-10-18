package edu.oakland.quizwiz.test;

import junit.framework.TestCase;

import edu.oakland.quizwiz.production.*;

/**
* This class tests everything.
*@author
*@version version 0.1 151018
*@since version 0.1
*/

public class TestAll extends TestCase {

	public void test_mc_question() {
		String text = "question1";
		String[] selections = {"sel1", "sel2"};
		int answer_index = 1;
		Question test_question = new Question(text, selections, answer_index);
		assertEquals("MC", test_question.get_question_type());
		assertEquals(text, test_question.get_question_text());
		test_question.answer_question(1);
		assertEquals(selections[1], test_question.get_answer_string());
		assertTrue(test_question.get_correctness());
		test_question.answer_question(0);
		assertFalse(test_question.get_correctness());
		assertEquals(selections, test_question.get_selections());
	}

	public void test_sa_question() {
		String text = "question1";
		String answer_str = "answerrr";
		Question test_question = new Question(text, answer_str);
		assertEquals("SA", test_question.get_question_type());
		assertEquals(text, test_question.get_question_text());
		test_question.answer_question("answerrr");
		assertEquals(answer_str, test_question.get_answer_string());
		assertTrue(test_question.get_correctness());
		test_question.answer_question("not_answerrr");
		assertFalse(test_question.get_correctness());
	}

	public void test_quiz() {
		String text = "question1";
		String text2 = "question2";
		String answer_str = "answer";
		String[] selections = {"sel1", "sel2"};
		int answer_int = 1;
		String title = "title";
		Quiz test_quiz = new Quiz(title);
		Question question1 = new Question(text, answer_str);
		Question question2 = new Question(text, selections, answer_int);
		test_quiz.add_question(question1);
		test_quiz.add_question(question2);
		assertEquals(title, test_quiz.get_title());
		assertEquals(question1, test_quiz.get_question(0));
		assertEquals(question2, test_quiz.get_question(1));
		assertEquals(2, test_quiz.get_num_questions());
	}
}
