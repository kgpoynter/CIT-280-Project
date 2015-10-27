package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.*;
import java.util.*;
import java.io.*;

/**
* This class defines an object that holds all of the Quiz objects in memory
*@author
*@version version 0.1 151020
*@since version 0.1 151020
*/
public class Database {
	private ArrayList<Quiz> quizzes = new ArrayList<Quiz>();
	
	public void add_quiz(Quiz qz) {
		quizzes.add(qz);
	}

	public void list_quizzes() {
		Iterator<Quiz> it = quizzes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().get_title());
		}
	}

	public void export_quiz(int index) throws IOException {
		Quiz quiz = quizzes.get(index);
		Question q;
		String filename = "quiz/";
		filename += quiz.get_title();
		filename += ".txt";
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		writer.println(quiz.get_title());
		writer.println(quiz.get_num_questions());
		writer.println();
		int count = 0;
		while (count < quiz.get_num_questions()) {
			q = quiz.get_question(count);
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
