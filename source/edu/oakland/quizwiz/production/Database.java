package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.*;
import java.util.*;

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
}
