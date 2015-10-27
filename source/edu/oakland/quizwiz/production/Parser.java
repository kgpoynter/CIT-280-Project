package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.*;
import java.util.*;
import java.io.*;

/**
* This class parses quiz files and loads them into the Database
*@author
*@version version 0.1 151020
*@since version 0.1 151020
*/
public class Parser {
	public static void main(String[] args) throws IOException {
		Database db = new Database();
		Parser.load_files(db);
		db.list_quizzes();
	}

	public static void load_files(Database db) throws IOException {
		final File folder = new File("quiz");
		listFilesForFolder(folder, db);
	}

	private static void listFilesForFolder(final File folder, Database db) throws IOException {
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry, db);
			} else {
				parse_file(fileEntry, db);
			}
		}
	}
	
	private static void parse_file(File file, Database db) throws IOException {
		try (final BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			line = br.readLine();
			Quiz quiz = new Quiz(line);
			line = br.readLine();
			int count = 0;
			int num_questions = Integer.parseInt(line);
			while ((line = br.readLine()) != null) {
				if (num_questions < count) {
					if (line == "SA") {
						String text = br.readLine();
						String answer = br.readLine();
						Question q = new Question(text, answer);
						quiz.add_question(q);
					} else if (line == "MC") {
						int sel_num = Integer.parseInt(br.readLine());
						String text = br.readLine();
						ArrayList<String> selections = new ArrayList<String>();
						int i = 0;
						while (i < sel_num) {
							i = i + 1;
							selections.add(br.readLine());
						}
						line = br.readLine();
						Question q = new Question(text, selections, Integer.parseInt(line));
						quiz.add_question(q);
					} else if (line == "TF") {
						String text = br.readLine();
						line = br.readLine();
						boolean answer = (line == "T");
						Question q = new Question(text, answer);
						quiz.add_question(q);
					}
				}
			}
			db.add_quiz(quiz);
		} 
	}
}
