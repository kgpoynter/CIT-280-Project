#/bin/bash
javac -d bin -sourcepath source -cp /home/gkabacin/junit3.8.2/junit.jar source/edu/oakland/quizwiz/test/TestAll.java
java -cp bin:/home/gkabacin/junit3.8.2/junit.jar junit.swingui.TestRunner edu.oakland.quizwiz.test.TestAll
