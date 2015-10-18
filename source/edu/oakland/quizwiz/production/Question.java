package edu.oakland.quizwiz.production;

/**
* This class defines objects for storing data pertaining to one question
*@author
*@version version 0.1 151018
*@since version 0.1
*/
public class Question {
	private String type;
	private String text;
	private String[] selections;
	private int answer_index;
	private int user_input_index;
	private String answer_str;
	private String user_input_str;
	
	/**
	* Constructor for multiple choice question
	*/
	public Question(String _text, String[] _selections, int _answer_index) {
		type = "MC";
		text = _text;
		selections = _selections;
		answer_index = _answer_index;
		user_input_index = 0;
		answer_str = selections[answer_index];
	}

	/**
	* Constructor for short answer question
	*/
	public Question(String _text, String _answer_str) {
		type = "SA";
		text = _text;
		answer_str = _answer_str;
		user_input_str = "";
	}
	
	public void answer_question(String _user_input_str) {
		user_input_str = _user_input_str;
	}
	
	public void answer_question(int _user_input_index) {
		user_input_index = _user_input_index;
	}

	public String get_question_type() {
		return type;
	}

	public String get_question_text() {
		return text;
	}

	public String[] get_selections() {
		return selections;
	}

	public String get_answer_string() {
		if (type == "MC") {
			return selections[answer_index];
		}
		return answer_str;
	}

	public boolean get_correctness() {
		boolean correctness = false;
		if (type == "MC") {
			if (answer_index == user_input_index) {
				correctness = true;
			}
		} else if (type == "SA") {
			if (answer_str.equals(user_input_str)) {
				correctness = true;
			}
		}
		return correctness;
	}
}
