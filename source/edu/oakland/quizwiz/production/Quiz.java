package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.Question;
import java.util.*;

/**
* This class defines objects for storing data pertaining to an entire quiz
*@author
*@version version 0.1 151018
*@since version 0.1
*/
public class Quiz {
	private String title;
	private int num_questions;
	private ArrayList<Question> questions = new ArrayList<Question>();
	
	public Quiz(String _title) {
		title = _title;
		num_questions = 0;
	}

	public void add_question(Question _question) {
		questions.add(_question);
		num_questions = num_questions + 1;
	}

	public Question get_question(int index) {
		return (Question)questions.get(index);
	}

	public String get_title() {
		return title;
	}

	public int get_num_questions() {
		return num_questions;
	}
}
