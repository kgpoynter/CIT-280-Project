package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.Question;
import java.io.IOException;
import java.io.PrintWriter;
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
        
        public void set_title(String _title) {
                title = _title;
        }

	public int get_num_questions() {
		return num_questions;
	}
        
        public void export_quiz() throws IOException {
		Question q;
		String filename = "quiz/";
		filename += get_title();
		filename += ".txt";
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		writer.println(get_title());
		writer.println(get_num_questions());
		writer.println();
		int count = 0;
		while (count < get_num_questions()) {
			q = get_question(count);
			writer.println(q.get_question_type());
			if (q.get_question_type().equals("MC")) {
				ArrayList<String> selections = q.get_selections();
				int sel_num = selections.size();
				int sel_count = 0;
				writer.println(sel_num);
				writer.println(q.get_question_text());
				while (sel_count < sel_num) {
					writer.println(selections.get(sel_count));
					sel_count = sel_count + 1;
				}
				writer.println(q.get_answer_index());
			} else {
				writer.println(q.get_question_text());
				writer.println(q.get_answer_string());	
			}
			writer.println();
			count = count + 1;
		}
		writer.close();
	}
}
