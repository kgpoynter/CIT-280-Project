package edu.oakland.quizwiz.production;

import edu.oakland.quizwiz.production.*;
import java.util.*;
import java.io.*;
import javax.swing.DefaultListModel;

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
        
        public Quiz get_quiz(int index) {
            return quizzes.get(index);
        }

	public DefaultListModel list_quizzes() {
		Iterator<Quiz> it = quizzes.iterator();
                DefaultListModel<String> quiz_list = new DefaultListModel<String>();
		while(it.hasNext()) {
			quiz_list.addElement(it.next().get_title());
		}
                return quiz_list;
	}
}
