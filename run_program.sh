#/bin/bash
javac -d bin -sourcepath source source/edu/oakland/quizwiz/production/Parser.java
java -cp bin edu.oakland.quizwiz.production.Parser
