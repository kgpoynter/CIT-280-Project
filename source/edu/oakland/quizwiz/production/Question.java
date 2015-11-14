package edu.oakland.quizwiz.production;

import java.util.*;

/**
* This class defines objects for storing data pertaining to one question
*@author
*@version version 0.1 151018
*@since version 0.1
*/
public class Question {
	private String type;
	private String text;
	private ArrayList<String> selections;
	private int answer_index;
	private int user_input_index;
	private String answer_str;
	private String user_input_str;
	private boolean answer_boolean;
	private boolean user_input_boolean;
	
	/**
	* Constructor for multiple choice question
	*/
	public Question(String _text, ArrayList<String> _selections, int _answer_index) {
		type = "MC";
		text = _text;
		selections = _selections;
		answer_index = _answer_index;
		user_input_index = 0;
		answer_str = (String)selections.get(answer_index);
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
	
	/**
	* Constructor for true / false question
	*/
	public Question(String _text, boolean _answer) {
		type = "TF";
		text = _text;
		answer_boolean = _answer;
		if (answer_boolean) {
			answer_str = "T";
		} else {
			answer_str = "F";
		}
		user_input_boolean = false;
	}	
	
	public void answer_question(String _user_input_str) {
		user_input_str = _user_input_str;
	}
	
	public void answer_question(int _user_input_index) {
		user_input_index = _user_input_index;
	}

	public void answer_question(boolean _user_input_boolean) {
		user_input_boolean = _user_input_boolean;
	}

	public String get_question_type() {
		return type;
	}

	public String get_question_text() {
		return text;
	}

	public ArrayList<String> get_selections() {
		return selections;
	}

	public String get_answer_string() {
		if (type.equals("MC")) {
			return (String)selections.get(answer_index);
		}
		return answer_str;
	}

	public int get_answer_index() {
		return answer_index;
	}

	public boolean get_answer_boolean() {
		return answer_boolean;
	}
        
        public boolean get_user_input_boolean() {
            return user_input_boolean;
        }
        
        public int get_user_input_index() {
            return user_input_index;
        }

        public String get_user_input_str() {
            return user_input_str;
        }

	public boolean get_correctness() {
		boolean correctness = false;
		if (type.equals("MC")) {
			if (answer_index == user_input_index) {
				correctness = true;
			}
		} else if (type.equals("SA")) {
			if (answer_str.equals(user_input_str)) {
				correctness = true;
			}
		} else if (type.equals("TF")) {
			correctness = (answer_boolean == user_input_boolean);
		}
		return correctness;
	}
}
