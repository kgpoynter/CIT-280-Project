package edu.oakland.quizwiz.production;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import edu.oakland.quizwiz.production.*;



public class SA extends JFrame{


    public static void SA(){

        final JFrame frame = new JFrame();



        final JPanel number_question_title = new JPanel();
                        final JPanel number_question = new JPanel();
                        final JButton back_button = new JButton("Take me back!!");
                        final JButton five = new JButton("5!!");
                        final JButton six = new JButton("6!!");
                        final JButton seven = new JButton("7!!");
                        final JButton eight = new JButton("8!!");
                        final JButton nine = new JButton("9!!");
                        final JButton ten = new JButton("10!!");
                        final JLabel number_title = new JLabel("How many questions do you want?!!");


                        number_question_title.setLayout(new FlowLayout());
                        number_question.setLayout(new FlowLayout());

                        number_question_title.add(number_title);
                        number_question.add(back_button);
                        number_question.add(five);
                        number_question.add(six);
                        number_question.add(seven);
                        number_question.add(eight);
                        number_question.add(nine);
                        number_question.add(ten);

                        number_title.setFont(new Font("Serif", Font.BOLD, 32));
                        number_question.setLayout(new FlowLayout(FlowLayout.CENTER));

                        frame.add(number_question_title);
                        number_question.setLayout(new FlowLayout(FlowLayout.CENTER));
                        frame.add(number_question, BorderLayout.SOUTH);

                        frame.setVisible(true);
                        frame.setSize(700, 150);
                        frame.setLocationRelativeTo(null);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




                        back_button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                //quiz_type_title.setVisible(true);
                                //quiz_type.setVisible(true);

                                Back_button();
                                frame.setVisible(false);

                                number_question_title.setVisible(false);
                                number_question.setVisible(false);



                            }


                         });



                         five.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel quiz_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_5 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField q_title = new JTextField( 10 );
                                final JLabel Quiz_title = new JLabel("Enter quiz title: ", JLabel.TRAILING);
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);

                                //Enter quiz title
                                quiz_title.add(Quiz_title);
                                Quiz_title.setLabelFor(q_title);
                                quiz_title.add(q_title);

                                quiz_title.setLayout(new BorderLayout());
                                quiz_title.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_5);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                frame.add(quiz_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);

                                back_5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                quiz_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                back_panel.setVisible(false);


                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });

                                

                                submit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)


                      {
                                quiz_title.setVisible(false);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                back_panel.setVisible(false);


                                int num_of_q = 5;
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());
                                Quiz q = new Quiz(q_title.getText());
                                final JLabel title = new JLabel(q.get_title());

                                final JPanel the_title = new JPanel();
                                final JPanel number1 = new JPanel();
                                final JPanel answer1 = new JPanel();
                                final JPanel question_title = new JPanel();
                                final JPanel bottom = new JPanel();
                                final JTextField number1_input = new JTextField( 10 );
                                final JButton next = new JButton("Next!!");
                                final JLabel title_question1 = new JLabel("Question 1");
                                final JLabel question1 = new JLabel(ques.get_question_text());
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);

                                the_title.add(title);
                                the_title.setLayout(new BorderLayout());
                                the_title.setLayout(new FlowLayout(FlowLayout.CENTER));

                                number1.add(q1);
                                q1.setLabelFor(question1);
                                number1.add(question1);

                                number1.setLayout(new BorderLayout());
                                number1.setLayout(new FlowLayout(FlowLayout.CENTER));

                                answer1.add(a1);
                                a1.setLabelFor(number1_input);
                                answer1.add(number1_input);

                                number1.setLayout(new BorderLayout());
                                number1.setLayout(new FlowLayout(FlowLayout.CENTER));

                                question_title.add(title_question1);

                                bottom.add(next);
                                bottom.setLayout(new BorderLayout());
                                bottom.setLayout(new FlowLayout(FlowLayout.CENTER));


                                frame.add(the_title);
                                frame.add(question_title, BorderLayout.SOUTH);
                                frame.add(number1, BorderLayout.SOUTH);
                                frame.add(answer1, BorderLayout.SOUTH);
                                frame.add(bottom, BorderLayout.SOUTH);

                                question_title.setVisible(true);
                                number1.setVisible(true);
                                answer1.setVisible(true);
                                bottom.setVisible(true);



                            }

                                });


                                

                            flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                quiz_title.setVisible(false);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);

                                


                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();

                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);
                                


                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);


                                    

                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();

                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());

                                
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());
                               
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });






                            }
                                });

                                

                            }
                                });

                                


                            }
                                });

                                



                            }
                                });






                            }


                         });




                            }


                         });

                         six.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input6 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_6 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField Ques6_op6 = new JTextField( 10 );
                                final JTextField Ans6 = new JTextField( 10 );
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);
                                final JLabel q6 = new JLabel("Q6: ", JLabel.TRAILING);
                                final JLabel a6 = new JLabel("A6: ", JLabel.TRAILING);


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 6 and answer 6 set
                                question_input6.add(q6);
                                q6.setLabelFor(Ques6_op6);
                                question_input6.add(Ques6_op6);

                                question_input6.add(a6);
                                a6.setLabelFor(Ans6);
                                question_input6.add(Ans6);

                                question_input6.setLayout(new BorderLayout());
                                question_input6.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_6);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(question_input6, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);


                                back_6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                back_panel.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });

                         flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card, fuckface!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();

                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);




                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());

                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);



                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);




                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });



                                 next_card5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back6 = new JButton("flip that to the back!!");
                                final JButton flip_to_front6 = new JButton("flip that to the front!!");
                                final JButton next_card6 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side6 = new JPanel();
                                final JPanel back_side6 = new JPanel();
                                final JPanel flip_pan6 = new JPanel();
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side6.setLayout(new BorderLayout());
                                front_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side6, BorderLayout.SOUTH);

                                flip_pan6.setLayout(new BorderLayout());
                                flip_pan6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan6, BorderLayout.SOUTH);

                                flip_pan6.add(flip_to_back6);
                                flip_pan6.add(flip_to_front6);
                                flip_pan6.add(next_card6);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(back_side6);
                                frame.add(flip_pan6);



                                flip_to_back6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side6.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side6.setLayout(new BorderLayout());
                                    back_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side6, BorderLayout.SOUTH);
                                    frame.add(back_side6);
                                    frame.add(flip_pan6);




                                    flip_pan6.setVisible(true);
                                    back_side6.setVisible(true);
                                    front_side6.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(flip_pan6);


                            }
                                        });



                            }
                                 });






                            }
                                });


                            }
                                });


                                


                            }
                                });






                            }
                                });





                            }
                                });






                            }


                         });




                            }


                         });

                         seven.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input6 = new JPanel(new SpringLayout());
                                final JPanel question_input7 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_7 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField Ques6_op6 = new JTextField( 10 );
                                final JTextField Ans6 = new JTextField( 10 );
                                final JTextField Ques7_op7 = new JTextField( 10 );
                                final JTextField Ans7 = new JTextField( 10 );
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);
                                final JLabel q6 = new JLabel("Q6: ", JLabel.TRAILING);
                                final JLabel a6 = new JLabel("A6: ", JLabel.TRAILING);
                                final JLabel q7 = new JLabel("Q7: ", JLabel.TRAILING);
                                final JLabel a7 = new JLabel("A7: ", JLabel.TRAILING);


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 6 and answer 6 set
                                question_input6.add(q6);
                                q6.setLabelFor(Ques6_op6);
                                question_input6.add(Ques6_op6);

                                question_input6.add(a6);
                                a6.setLabelFor(Ans6);
                                question_input6.add(Ans6);

                                question_input6.setLayout(new BorderLayout());
                                question_input6.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 7 and answer 7 set
                                question_input7.add(q7);
                                q7.setLabelFor(Ques7_op7);
                                question_input7.add(Ques7_op7);

                                question_input7.add(a7);
                                a7.setLabelFor(Ans7);
                                question_input7.add(Ans7);

                                question_input7.setLayout(new BorderLayout());
                                question_input7.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_7);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(question_input6, BorderLayout.SOUTH);
                                frame.add(question_input7, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);


                                back_7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                back_panel.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });


                         flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card, fuckface!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();

                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);




                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);



                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);




                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());


                               
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });



                                 next_card5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back6 = new JButton("flip that to the back!!");
                                final JButton flip_to_front6 = new JButton("flip that to the front!!");
                                final JButton next_card6 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side6 = new JPanel();
                                final JPanel back_side6 = new JPanel();
                                final JPanel flip_pan6 = new JPanel();
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side6.setLayout(new BorderLayout());
                                front_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side6, BorderLayout.SOUTH);

                                flip_pan6.setLayout(new BorderLayout());
                                flip_pan6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan6, BorderLayout.SOUTH);

                                flip_pan6.add(flip_to_back6);
                                flip_pan6.add(flip_to_front6);
                                flip_pan6.add(next_card6);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(back_side6);
                                frame.add(flip_pan6);



                                flip_to_back6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side6.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side6.setLayout(new BorderLayout());
                                    back_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side6, BorderLayout.SOUTH);
                                    frame.add(back_side6);
                                    frame.add(flip_pan6);




                                    flip_pan6.setVisible(true);
                                    back_side6.setVisible(true);
                                    front_side6.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(flip_pan6);


                            }
                                        });



                            }
                                 });



                                 next_card6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back7 = new JButton("flip that to the back!!");
                                final JButton flip_to_front7 = new JButton("flip to the front!!");
                                final JButton next_card7 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side7 = new JPanel();
                                final JPanel back_side7 = new JPanel();
                                final JPanel flip_pan7 = new JPanel();
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());


                                
                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side7.setLayout(new BorderLayout());
                                front_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side7, BorderLayout.SOUTH);

                                flip_pan7.setLayout(new BorderLayout());
                                flip_pan7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan7, BorderLayout.SOUTH);

                                flip_pan7.add(flip_to_back7);
                                flip_pan7.add(flip_to_front7);
                                flip_pan7.add(next_card7);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(back_side7);
                                frame.add(flip_pan7);



                                flip_to_back7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side7.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side7.setLayout(new BorderLayout());
                                    back_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side7, BorderLayout.SOUTH);
                                    frame.add(back_side7);
                                    frame.add(flip_pan7);




                                    flip_pan7.setVisible(true);
                                    back_side7.setVisible(true);
                                    front_side7.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());
                                
                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(flip_pan7);


                            }
                                        });



                            }
                                 });






                            }
                                });


                            }
                                });


                                


                            }
                                });





                            }
                                });






                            }
                                });





                            }
                                });






                            }


                         });

                            }


                         });

                         eight.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input6 = new JPanel(new SpringLayout());
                                final JPanel question_input7 = new JPanel(new SpringLayout());
                                final JPanel question_input8 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_8 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField Ques6_op6 = new JTextField( 10 );
                                final JTextField Ans6 = new JTextField( 10 );
                                final JTextField Ques7_op7 = new JTextField( 10 );
                                final JTextField Ans7 = new JTextField( 10 );
                                final JTextField Ques8_op8 = new JTextField( 10 );
                                final JTextField Ans8 = new JTextField( 10 );
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);
                                final JLabel q6 = new JLabel("Q6: ", JLabel.TRAILING);
                                final JLabel a6 = new JLabel("A6: ", JLabel.TRAILING);
                                final JLabel q7 = new JLabel("Q7: ", JLabel.TRAILING);
                                final JLabel a7 = new JLabel("A7: ", JLabel.TRAILING);
                                final JLabel q8 = new JLabel("Q8: ", JLabel.TRAILING);
                                final JLabel a8 = new JLabel("A8: ", JLabel.TRAILING);


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 6 and answer 6 set
                                question_input6.add(q6);
                                q6.setLabelFor(Ques6_op6);
                                question_input6.add(Ques6_op6);

                                question_input6.add(a6);
                                a6.setLabelFor(Ans6);
                                question_input6.add(Ans6);

                                question_input6.setLayout(new BorderLayout());
                                question_input6.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 7 and answer 7 set
                                question_input7.add(q7);
                                q7.setLabelFor(Ques7_op7);
                                question_input7.add(Ques7_op7);

                                question_input7.add(a7);
                                a7.setLabelFor(Ans7);
                                question_input7.add(Ans7);

                                question_input7.setLayout(new BorderLayout());
                                question_input7.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 8 and answer 8
                                question_input8.add(q8);
                                q8.setLabelFor(Ques8_op8);
                                question_input8.add(Ques8_op8);

                                question_input8.add(a8);
                                a8.setLabelFor(Ans8);
                                question_input8.add(Ans8);

                                question_input8.setLayout(new BorderLayout());
                                question_input8.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_8);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(question_input6, BorderLayout.SOUTH);
                                frame.add(question_input7, BorderLayout.SOUTH);
                                frame.add(question_input8, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);


                                back_8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                back_panel.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });



                             flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card, fuckface!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();

                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);




                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());



                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);



                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);




                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());

                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());



                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());

                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());



                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());

                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());



                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());

                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });



                                 next_card5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back6 = new JButton("flip that to the back!!");
                                final JButton flip_to_front6 = new JButton("flip that to the front!!");
                                final JButton next_card6 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side6 = new JPanel();
                                final JPanel back_side6 = new JPanel();
                                final JPanel flip_pan6 = new JPanel();
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());



                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side6.setLayout(new BorderLayout());
                                front_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side6, BorderLayout.SOUTH);

                                flip_pan6.setLayout(new BorderLayout());
                                flip_pan6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan6, BorderLayout.SOUTH);

                                flip_pan6.add(flip_to_back6);
                                flip_pan6.add(flip_to_front6);
                                flip_pan6.add(next_card6);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(back_side6);
                                frame.add(flip_pan6);



                                flip_to_back6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side6.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side6.setLayout(new BorderLayout());
                                    back_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side6, BorderLayout.SOUTH);
                                    frame.add(back_side6);
                                    frame.add(flip_pan6);




                                    flip_pan6.setVisible(true);
                                    back_side6.setVisible(true);
                                    front_side6.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());

                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(flip_pan6);


                            }
                                        });



                            }
                                 });



                                 next_card6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back7 = new JButton("flip that to the back!!");
                                final JButton flip_to_front7 = new JButton("flip to the front!!");
                                final JButton next_card7 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side7 = new JPanel();
                                final JPanel back_side7 = new JPanel();
                                final JPanel flip_pan7 = new JPanel();
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());



                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side7.setLayout(new BorderLayout());
                                front_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side7, BorderLayout.SOUTH);

                                flip_pan7.setLayout(new BorderLayout());
                                flip_pan7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan7, BorderLayout.SOUTH);

                                flip_pan7.add(flip_to_back7);
                                flip_pan7.add(flip_to_front7);
                                flip_pan7.add(next_card7);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(back_side7);
                                frame.add(flip_pan7);



                                flip_to_back7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side7.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side7.setLayout(new BorderLayout());
                                    back_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side7, BorderLayout.SOUTH);
                                    frame.add(back_side7);
                                    frame.add(flip_pan7);




                                    flip_pan7.setVisible(true);
                                    back_side7.setVisible(true);
                                    front_side7.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());

                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(flip_pan7);


                            }
                                        });



                            }
                                 });



                                 next_card7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back8 = new JButton("flip that to the back!!");
                                final JButton flip_to_front8 = new JButton("flip to the front!!");
                                final JButton next_card8 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side8 = new JPanel();
                                final JPanel back_side8 = new JPanel();
                                final JPanel flip_pan8 = new JPanel();
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());



                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side8.setLayout(new BorderLayout());
                                front_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side8, BorderLayout.SOUTH);

                                flip_pan8.setLayout(new BorderLayout());
                                flip_pan8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan8, BorderLayout.SOUTH);

                                flip_pan8.add(flip_to_back8);
                                flip_pan8.add(flip_to_front8);
                                flip_pan8.add(next_card8);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(back_side8);
                                frame.add(flip_pan8);



                                flip_to_back8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                    textpane.setText(ques.get_answer_string());
                                    
                                    back_side8.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side8.setLayout(new BorderLayout());
                                    back_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side8, BorderLayout.SOUTH);
                                    frame.add(back_side8);
                                    frame.add(flip_pan8);




                                    flip_pan8.setVisible(true);
                                    back_side8.setVisible(true);
                                    front_side8.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());

                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(flip_pan8);


                            }
                                        });



                            }
                                 });






                            }
                                });


                            }
                                });


                            }
                                });





                            }
                                });





                            }
                                });






                            }
                                });





                            }
                                });






                            }


                         });



                            }


                         });

                         nine.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input6 = new JPanel(new SpringLayout());
                                final JPanel question_input7 = new JPanel(new SpringLayout());
                                final JPanel question_input8 = new JPanel(new SpringLayout());
                                final JPanel question_input9 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_9 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField Ques6_op6 = new JTextField( 10 );
                                final JTextField Ans6 = new JTextField( 10 );
                                final JTextField Ques7_op7 = new JTextField( 10 );
                                final JTextField Ans7 = new JTextField( 10 );
                                final JTextField Ques8_op8 = new JTextField( 10 );
                                final JTextField Ans8 = new JTextField( 10 );
                                final JTextField Ques9_op9 = new JTextField( 10 );
                                final JTextField Ans9 = new JTextField( 10 );
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);
                                final JLabel q6 = new JLabel("Q6: ", JLabel.TRAILING);
                                final JLabel a6 = new JLabel("A6: ", JLabel.TRAILING);
                                final JLabel q7 = new JLabel("Q7: ", JLabel.TRAILING);
                                final JLabel a7 = new JLabel("A7: ", JLabel.TRAILING);
                                final JLabel q8 = new JLabel("Q8: ", JLabel.TRAILING);
                                final JLabel a8 = new JLabel("A8: ", JLabel.TRAILING);
                                final JLabel q9 = new JLabel("Q9: ", JLabel.TRAILING);
                                final JLabel a9 = new JLabel("A9: ", JLabel.TRAILING);


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 6 and answer 6 set
                                question_input6.add(q6);
                                q6.setLabelFor(Ques6_op6);
                                question_input6.add(Ques6_op6);

                                question_input6.add(a6);
                                a6.setLabelFor(Ans6);
                                question_input6.add(Ans6);

                                question_input6.setLayout(new BorderLayout());
                                question_input6.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 7 and answer 7 set
                                question_input7.add(q7);
                                q7.setLabelFor(Ques7_op7);
                                question_input7.add(Ques7_op7);

                                question_input7.add(a7);
                                a7.setLabelFor(Ans7);
                                question_input7.add(Ans7);

                                question_input7.setLayout(new BorderLayout());
                                question_input7.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 8 and answer 8
                                question_input8.add(q8);
                                q8.setLabelFor(Ques8_op8);
                                question_input8.add(Ques8_op8);

                                question_input8.add(a8);
                                a8.setLabelFor(Ans8);
                                question_input8.add(Ans8);

                                question_input8.setLayout(new BorderLayout());
                                question_input8.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 9 and answer 9
                                question_input9.add(q9);
                                q9.setLabelFor(Ques9_op9);
                                question_input9.add(Ques9_op9);

                                question_input9.add(a9);
                                a9.setLabelFor(Ans9);
                                question_input9.add(Ans9);

                                question_input9.setLayout(new BorderLayout());
                                question_input9.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_9);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(question_input6, BorderLayout.SOUTH);
                                frame.add(question_input7, BorderLayout.SOUTH);
                                frame.add(question_input8, BorderLayout.SOUTH);
                                frame.add(question_input9, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);


                                back_9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                question_input9.setVisible(false);
                                back_panel.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });


                         flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                question_input9.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card, fuckface!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();

                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);




                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());



                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);



                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);




                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());

                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());



                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());

                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());



                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());

                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());



                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());

                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });



                                 next_card5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back6 = new JButton("flip that to the back!!");
                                final JButton flip_to_front6 = new JButton("flip that to the front!!");
                                final JButton next_card6 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side6 = new JPanel();
                                final JPanel back_side6 = new JPanel();
                                final JPanel flip_pan6 = new JPanel();
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());



                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side6.setLayout(new BorderLayout());
                                front_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side6, BorderLayout.SOUTH);

                                flip_pan6.setLayout(new BorderLayout());
                                flip_pan6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan6, BorderLayout.SOUTH);

                                flip_pan6.add(flip_to_back6);
                                flip_pan6.add(flip_to_front6);
                                flip_pan6.add(next_card6);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(back_side6);
                                frame.add(flip_pan6);



                                flip_to_back6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side6.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side6.setLayout(new BorderLayout());
                                    back_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side6, BorderLayout.SOUTH);
                                    frame.add(back_side6);
                                    frame.add(flip_pan6);




                                    flip_pan6.setVisible(true);
                                    back_side6.setVisible(true);
                                    front_side6.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());

                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(flip_pan6);


                            }
                                        });



                            }
                                 });



                                 next_card6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back7 = new JButton("flip that to the back!!");
                                final JButton flip_to_front7 = new JButton("flip to the front!!");
                                final JButton next_card7 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side7 = new JPanel();
                                final JPanel back_side7 = new JPanel();
                                final JPanel flip_pan7 = new JPanel();
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());



                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side7.setLayout(new BorderLayout());
                                front_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side7, BorderLayout.SOUTH);

                                flip_pan7.setLayout(new BorderLayout());
                                flip_pan7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan7, BorderLayout.SOUTH);

                                flip_pan7.add(flip_to_back7);
                                flip_pan7.add(flip_to_front7);
                                flip_pan7.add(next_card7);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(back_side7);
                                frame.add(flip_pan7);



                                flip_to_back7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side7.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side7.setLayout(new BorderLayout());
                                    back_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side7, BorderLayout.SOUTH);
                                    frame.add(back_side7);
                                    frame.add(flip_pan7);




                                    flip_pan7.setVisible(true);
                                    back_side7.setVisible(true);
                                    front_side7.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());

                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(flip_pan7);


                            }
                                        });



                            }
                                 });



                                 next_card7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back8 = new JButton("flip that to the back!!");
                                final JButton flip_to_front8 = new JButton("flip to the front!!");
                                final JButton next_card8 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side8 = new JPanel();
                                final JPanel back_side8 = new JPanel();
                                final JPanel flip_pan8 = new JPanel();
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());



                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side8.setLayout(new BorderLayout());
                                front_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side8, BorderLayout.SOUTH);

                                flip_pan8.setLayout(new BorderLayout());
                                flip_pan8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan8, BorderLayout.SOUTH);

                                flip_pan8.add(flip_to_back8);
                                flip_pan8.add(flip_to_front8);
                                flip_pan8.add(next_card8);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(back_side8);
                                frame.add(flip_pan8);



                                flip_to_back8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side8.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side8.setLayout(new BorderLayout());
                                    back_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side8, BorderLayout.SOUTH);
                                    frame.add(back_side8);
                                    frame.add(flip_pan8);




                                    flip_pan8.setVisible(true);
                                    back_side8.setVisible(true);
                                    front_side8.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());

                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(flip_pan8);


                            }
                                        });



                            }
                                 });



                                 next_card8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back9 = new JButton("flip that to the back!!");
                                final JButton flip_to_front9 = new JButton("flip to the front!!");
                                final JButton next_card9 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side9 = new JPanel();
                                final JPanel back_side9 = new JPanel();
                                final JPanel flip_pan9 = new JPanel();
                                Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                textpane.setText(ques.get_question_text());



                                front_side9.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side9.setLayout(new BorderLayout());
                                front_side9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side9, BorderLayout.SOUTH);

                                flip_pan9.setLayout(new BorderLayout());
                                flip_pan9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan9, BorderLayout.SOUTH);

                                flip_pan9.add(flip_to_back9);
                                flip_pan9.add(flip_to_front9);
                                flip_pan9.add(next_card9);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(false);
                                front_side8.setVisible(false);
                                back_side8.setVisible(false);
                                flip_pan9.setVisible(true);
                                front_side9.setVisible(true);
                                back_side9.setVisible(false);
                                frame.add(front_side9);
                                frame.add(back_side9);
                                frame.add(flip_pan9);



                                flip_to_back9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side9.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side9.setLayout(new BorderLayout());
                                    back_side9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side9, BorderLayout.SOUTH);
                                    frame.add(back_side9);
                                    frame.add(flip_pan9);




                                    flip_pan9.setVisible(true);
                                    back_side9.setVisible(true);
                                    front_side9.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                textpane.setText(ques.get_question_text());

                                front_side9.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan9.setVisible(true);
                                front_side9.setVisible(true);
                                back_side9.setVisible(false);
                                frame.add(front_side9);
                                frame.add(flip_pan9);


                            }
                                        });



                            }
                                 });






                            }
                                });


                            }
                                });


                                


                            }
                                });


                            }
                                });





                            }
                                });





                            }
                                });






                            }
                                });





                            }
                                });






                            }


                         });




                            }


                         });

                         ten.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent c)
                      {


                                number_question_title.setVisible(false);
                                number_question.setVisible(false);
                                frame.setSize(600, 500);

                                final JPanel question_input_title = new JPanel();
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input6 = new JPanel(new SpringLayout());
                                final JPanel question_input7 = new JPanel(new SpringLayout());
                                final JPanel question_input8 = new JPanel(new SpringLayout());
                                final JPanel question_input9 = new JPanel(new SpringLayout());
                                final JPanel question_input10 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
                                final JPanel back_panel = new JPanel();
                                final JButton flash = new JButton("Create as flashcards");
                                final JButton back_10 = new JButton("Take me back!!");
                                final JLabel mc_input_title = new JLabel("Question and Answer Input");
                                final JTextField Ques1_op1 = new JTextField( 10 );
                                final JTextField Ans1 = new JTextField( 10 );
                                final JTextField Ques2_op2 = new JTextField( 10 );
                                final JTextField Ans2 = new JTextField( 10 );
                                final JTextField Ques3_op3 = new JTextField( 10 );
                                final JTextField Ans3 = new JTextField( 10 );
                                final JTextField Ques4_op4 = new JTextField( 10 );
                                final JTextField Ans4 = new JTextField( 10 );
                                final JTextField Ques5_op5 = new JTextField( 10 );
                                final JTextField Ans5 = new JTextField( 10 );
                                final JTextField Ques6_op6 = new JTextField( 10 );
                                final JTextField Ans6 = new JTextField( 10 );
                                final JTextField Ques7_op7 = new JTextField( 10 );
                                final JTextField Ans7 = new JTextField( 10 );
                                final JTextField Ques8_op8 = new JTextField( 10 );
                                final JTextField Ans8 = new JTextField( 10 );
                                final JTextField Ques9_op9 = new JTextField( 10 );
                                final JTextField Ans9 = new JTextField( 10 );
                                final JTextField Ques10_op10 = new JTextField( 10 );
                                final JTextField Ans10 = new JTextField( 10 );
                                final JLabel q1 = new JLabel("Q1: ", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1: ", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2: ", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2: ", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3: ", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3: ", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4: ", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4: ", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5: ", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5: ", JLabel.TRAILING);
                                final JLabel q6 = new JLabel("Q6: ", JLabel.TRAILING);
                                final JLabel a6 = new JLabel("A6: ", JLabel.TRAILING);
                                final JLabel q7 = new JLabel("Q7: ", JLabel.TRAILING);
                                final JLabel a7 = new JLabel("A7: ", JLabel.TRAILING);
                                final JLabel q8 = new JLabel("Q8: ", JLabel.TRAILING);
                                final JLabel a8 = new JLabel("A8: ", JLabel.TRAILING);
                                final JLabel q9 = new JLabel("Q9: ", JLabel.TRAILING);
                                final JLabel a9 = new JLabel("A9: ", JLabel.TRAILING);
                                final JLabel q10 = new JLabel("Q10: ", JLabel.TRAILING);
                                final JLabel a10 = new JLabel("A10: ", JLabel.TRAILING);


                                //question 1 and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input.add(Ques1_op1);

                                question_input.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input.add(Ans1);

                                //question_input.setLayout(new BorderLayout());

                                question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 3 and answer 3 set
                                question_input3.add(q3);
                                q3.setLabelFor(Ques3_op3);
                                question_input3.add(Ques3_op3);

                                question_input3.add(a3);
                                a3.setLabelFor(Ans3);
                                question_input3.add(Ans3);

                                question_input3.setLayout(new BorderLayout());
                                question_input3.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question 4 and answer 4 set
                                question_input4.add(q4);
                                q4.setLabelFor(Ques4_op4);
                                question_input4.add(Ques4_op4);

                                question_input4.add(a4);
                                a4.setLabelFor(Ans4);
                                question_input4.add(Ans4);

                                question_input4.setLayout(new BorderLayout());
                                question_input4.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 5 and answer 5 set
                                question_input5.add(q5);
                                q5.setLabelFor(Ques5_op5);
                                question_input5.add(Ques5_op5);

                                question_input5.add(a5);
                                a5.setLabelFor(Ans5);
                                question_input5.add(Ans5);

                                question_input5.setLayout(new BorderLayout());
                                question_input5.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 6 and answer 6 set
                                question_input6.add(q6);
                                q6.setLabelFor(Ques6_op6);
                                question_input6.add(Ques6_op6);

                                question_input6.add(a6);
                                a6.setLabelFor(Ans6);
                                question_input6.add(Ans6);

                                question_input6.setLayout(new BorderLayout());
                                question_input6.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 7 and answer 7 set
                                question_input7.add(q7);
                                q7.setLabelFor(Ques7_op7);
                                question_input7.add(Ques7_op7);

                                question_input7.add(a7);
                                a7.setLabelFor(Ans7);
                                question_input7.add(Ans7);

                                question_input7.setLayout(new BorderLayout());
                                question_input7.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 8 and answer 8
                                question_input8.add(q8);
                                q8.setLabelFor(Ques8_op8);
                                question_input8.add(Ques8_op8);

                                question_input8.add(a8);
                                a8.setLabelFor(Ans8);
                                question_input8.add(Ans8);

                                question_input8.setLayout(new BorderLayout());
                                question_input8.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 9 and answer 9
                                question_input9.add(q9);
                                q9.setLabelFor(Ques9_op9);
                                question_input9.add(Ques9_op9);

                                question_input9.add(a9);
                                a9.setLabelFor(Ans9);
                                question_input9.add(Ans9);

                                question_input9.setLayout(new BorderLayout());
                                question_input9.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question 10 and answer 10
                                question_input10.add(q10);
                                q10.setLabelFor(Ques10_op10);
                                question_input10.add(Ques10_op10);

                                question_input10.add(a10);
                                a10.setLabelFor(Ans10);
                                question_input10.add(Ans10);

                                question_input10.setLayout(new BorderLayout());
                                question_input10.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //back button
                                back_panel.add(back_10);
                                //submit button
                                back_panel.add(submit);
                                //flashcard button
                                back_panel.add(flash);



                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input3, BorderLayout.SOUTH);
                                frame.add(question_input4, BorderLayout.SOUTH);
                                frame.add(question_input5, BorderLayout.SOUTH);
                                frame.add(question_input6, BorderLayout.SOUTH);
                                frame.add(question_input7, BorderLayout.SOUTH);
                                frame.add(question_input8, BorderLayout.SOUTH);
                                frame.add(question_input9, BorderLayout.SOUTH);
                                frame.add(question_input10, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input.setVisible(true);


                                back_10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                question_input9.setVisible(false);
                                question_input10.setVisible(false);
                                back_panel.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



                            }


                         });

                            flash.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                frame.setSize(700, 150);
                                question_input_title.setVisible(false);
                                question_input.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                question_input6.setVisible(false);
                                question_input7.setVisible(false);
                                question_input8.setVisible(false);
                                question_input9.setVisible(false);
                                question_input10.setVisible(false);
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that to the back!!");
                                final JButton flip_to_front = new JButton("flip that to the front!!");
                                final JButton next_card = new JButton("Next Card, fuckface!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();

                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                //textarea.setText(Ques1_op1.getText());
                                //front_side.add(textarea);
                                front_side.setLayout(new BorderLayout());
                                front_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side, BorderLayout.SOUTH);
                                frame.add(front_side);

                                flip_pan.add(flip_to_back);
                                flip_pan.add(flip_to_front);
                                flip_pan.add(next_card);
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);




                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side.setLayout(new BorderLayout());
                                    back_side.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side, BorderLayout.SOUTH);
                                    frame.add(back_side);
                                    frame.add(flip_pan);

                                    flip_pan.setVisible(true);
                                    back_side.setVisible(true);
                                    front_side.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques1_op1.getText(), Ans1.getText());

                                textpane.setText(ques.get_question_text());

                                front_side.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan.setVisible(true);
                                front_side.setVisible(true);
                                back_side.setVisible(false);
                                frame.add(front_side);
                                frame.add(flip_pan);


                            }
                                        });



                            }
                                 });



                                 next_card.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back2 = new JButton("flip that to the back!!");
                                final JButton flip_to_front2 = new JButton("flip that to the front!!");
                                final JButton next_card2 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side2 = new JPanel();
                                final JPanel back_side2 = new JPanel();
                                final JPanel flip_pan2 = new JPanel();
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());



                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side2.setLayout(new BorderLayout());
                                front_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side2, BorderLayout.SOUTH);

                                flip_pan2.setLayout(new BorderLayout());
                                flip_pan2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan2, BorderLayout.SOUTH);

                                flip_pan2.add(flip_to_back2);
                                flip_pan2.add(flip_to_front2);
                                flip_pan2.add(next_card2);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(back_side2);
                                frame.add(flip_pan2);



                                flip_to_back2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side2.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side2.setLayout(new BorderLayout());
                                    back_side2.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side2, BorderLayout.SOUTH);
                                    frame.add(back_side2);
                                    frame.add(flip_pan2);




                                    flip_pan2.setVisible(true);
                                    back_side2.setVisible(true);
                                    front_side2.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques2_op2.getText(), Ans2.getText());

                                textpane.setText(ques.get_question_text());

                                front_side2.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan2.setVisible(true);
                                front_side2.setVisible(true);
                                back_side2.setVisible(false);
                                frame.add(front_side2);
                                frame.add(flip_pan2);


                            }
                                        });



                            }
                                 });


                                 next_card2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back3 = new JButton("flip that to the back!!");
                                final JButton flip_to_front3 = new JButton("flip that to the front!!");
                                final JButton next_card3 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side3 = new JPanel();
                                final JPanel back_side3 = new JPanel();
                                final JPanel flip_pan3 = new JPanel();
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());



                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side3.setLayout(new BorderLayout());
                                front_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side3, BorderLayout.SOUTH);

                                flip_pan3.setLayout(new BorderLayout());
                                flip_pan3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan3, BorderLayout.SOUTH);

                                flip_pan3.add(flip_to_back3);
                                flip_pan3.add(flip_to_front3);
                                flip_pan3.add(next_card3);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(back_side3);
                                frame.add(flip_pan3);



                                flip_to_back3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side3.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side3.setLayout(new BorderLayout());
                                    back_side3.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side3, BorderLayout.SOUTH);
                                    frame.add(back_side3);
                                    frame.add(flip_pan3);




                                    flip_pan3.setVisible(true);
                                    back_side3.setVisible(true);
                                    front_side3.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques3_op3.getText(), Ans3.getText());

                                textpane.setText(ques.get_question_text());

                                front_side3.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan3.setVisible(true);
                                front_side3.setVisible(true);
                                back_side3.setVisible(false);
                                frame.add(front_side3);
                                frame.add(flip_pan3);


                            }
                                        });



                            }
                                 });



                                 next_card3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back4 = new JButton("flip that to the back!!");
                                final JButton flip_to_front4 = new JButton("flip that to the front!!");
                                final JButton next_card4 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side4 = new JPanel();
                                final JPanel back_side4 = new JPanel();
                                final JPanel flip_pan4 = new JPanel();
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());



                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side4.setLayout(new BorderLayout());
                                front_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side4, BorderLayout.SOUTH);

                                flip_pan4.setLayout(new BorderLayout());
                                flip_pan4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan4, BorderLayout.SOUTH);

                                flip_pan4.add(flip_to_back4);
                                flip_pan4.add(flip_to_front4);
                                flip_pan4.add(next_card4);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(back_side4);
                                frame.add(flip_pan4);



                                flip_to_back4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side4.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side4.setLayout(new BorderLayout());
                                    back_side4.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side4, BorderLayout.SOUTH);
                                    frame.add(back_side4);
                                    frame.add(flip_pan4);




                                    flip_pan4.setVisible(true);
                                    back_side4.setVisible(true);
                                    front_side4.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques4_op4.getText(), Ans4.getText());

                                textpane.setText(ques.get_question_text());

                                front_side4.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan4.setVisible(true);
                                front_side4.setVisible(true);
                                back_side4.setVisible(false);
                                frame.add(front_side4);
                                frame.add(flip_pan4);


                            }
                                        });



                            }
                                 });


                                 next_card4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back5 = new JButton("flip that to the back!!");
                                final JButton flip_to_front5 = new JButton("flip that to the front!!");
                                final JButton next_card5 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side5 = new JPanel();
                                final JPanel back_side5 = new JPanel();
                                final JPanel flip_pan5 = new JPanel();
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());



                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side5.setLayout(new BorderLayout());
                                front_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side5, BorderLayout.SOUTH);

                                flip_pan5.setLayout(new BorderLayout());
                                flip_pan5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan5, BorderLayout.SOUTH);

                                flip_pan5.add(flip_to_back5);
                                flip_pan5.add(flip_to_front5);
                                flip_pan5.add(next_card5);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(back_side5);
                                frame.add(flip_pan5);



                                flip_to_back5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side5.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side5.setLayout(new BorderLayout());
                                    back_side5.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side5, BorderLayout.SOUTH);
                                    frame.add(back_side5);
                                    frame.add(flip_pan5);




                                    flip_pan5.setVisible(true);
                                    back_side5.setVisible(true);
                                    front_side5.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques5_op5.getText(), Ans5.getText());

                                textpane.setText(ques.get_question_text());

                                front_side5.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan5.setVisible(true);
                                front_side5.setVisible(true);
                                back_side5.setVisible(false);
                                frame.add(front_side5);
                                frame.add(flip_pan5);


                            }
                                        });



                            }
                                 });



                                 next_card5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back6 = new JButton("flip that to the back!!");
                                final JButton flip_to_front6 = new JButton("flip that to the front!!");
                                final JButton next_card6 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side6 = new JPanel();
                                final JPanel back_side6 = new JPanel();
                                final JPanel flip_pan6 = new JPanel();
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());



                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side6.setLayout(new BorderLayout());
                                front_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side6, BorderLayout.SOUTH);

                                flip_pan6.setLayout(new BorderLayout());
                                flip_pan6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan6, BorderLayout.SOUTH);

                                flip_pan6.add(flip_to_back6);
                                flip_pan6.add(flip_to_front6);
                                flip_pan6.add(next_card6);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(back_side6);
                                frame.add(flip_pan6);



                                flip_to_back6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side6.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side6.setLayout(new BorderLayout());
                                    back_side6.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side6, BorderLayout.SOUTH);
                                    frame.add(back_side6);
                                    frame.add(flip_pan6);




                                    flip_pan6.setVisible(true);
                                    back_side6.setVisible(true);
                                    front_side6.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques6_op6.getText(), Ans6.getText());

                                textpane.setText(ques.get_question_text());

                                front_side6.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan6.setVisible(true);
                                front_side6.setVisible(true);
                                back_side6.setVisible(false);
                                frame.add(front_side6);
                                frame.add(flip_pan6);


                            }
                                        });



                            }
                                 });



                                 next_card6.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back7 = new JButton("flip that to the back!!");
                                final JButton flip_to_front7 = new JButton("flip to the front!!");
                                final JButton next_card7 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side7 = new JPanel();
                                final JPanel back_side7 = new JPanel();
                                final JPanel flip_pan7 = new JPanel();
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());



                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side7.setLayout(new BorderLayout());
                                front_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side7, BorderLayout.SOUTH);

                                flip_pan7.setLayout(new BorderLayout());
                                flip_pan7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan7, BorderLayout.SOUTH);

                                flip_pan7.add(flip_to_back7);
                                flip_pan7.add(flip_to_front7);
                                flip_pan7.add(next_card7);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(back_side7);
                                frame.add(flip_pan7);



                                flip_to_back7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side7.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side7.setLayout(new BorderLayout());
                                    back_side7.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side7, BorderLayout.SOUTH);
                                    frame.add(back_side7);
                                    frame.add(flip_pan7);




                                    flip_pan7.setVisible(true);
                                    back_side7.setVisible(true);
                                    front_side7.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques7_op7.getText(), Ans7.getText());

                                textpane.setText(ques.get_question_text());

                                front_side7.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan7.setVisible(true);
                                front_side7.setVisible(true);
                                back_side7.setVisible(false);
                                frame.add(front_side7);
                                frame.add(flip_pan7);


                            }
                                        });



                            }
                                 });



                                 next_card7.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back8 = new JButton("flip that to the back!!");
                                final JButton flip_to_front8 = new JButton("flip to the front!!");
                                final JButton next_card8 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side8 = new JPanel();
                                final JPanel back_side8 = new JPanel();
                                final JPanel flip_pan8 = new JPanel();
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());



                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side8.setLayout(new BorderLayout());
                                front_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side8, BorderLayout.SOUTH);

                                flip_pan8.setLayout(new BorderLayout());
                                flip_pan8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan8, BorderLayout.SOUTH);

                                flip_pan8.add(flip_to_back8);
                                flip_pan8.add(flip_to_front8);
                                flip_pan8.add(next_card8);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(back_side8);
                                frame.add(flip_pan8);



                                flip_to_back8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side8.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side8.setLayout(new BorderLayout());
                                    back_side8.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side8, BorderLayout.SOUTH);
                                    frame.add(back_side8);
                                    frame.add(flip_pan8);




                                    flip_pan8.setVisible(true);
                                    back_side8.setVisible(true);
                                    front_side8.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques8_op8.getText(), Ans8.getText());

                                textpane.setText(ques.get_question_text());

                                front_side8.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan8.setVisible(true);
                                front_side8.setVisible(true);
                                back_side8.setVisible(false);
                                frame.add(front_side8);
                                frame.add(flip_pan8);


                            }
                                        });



                            }
                                 });



                                 next_card8.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back9 = new JButton("flip that to the back!!");
                                final JButton flip_to_front9 = new JButton("flip to the front!!");
                                final JButton next_card9 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side9 = new JPanel();
                                final JPanel back_side9 = new JPanel();
                                final JPanel flip_pan9 = new JPanel();
                                Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                textpane.setText(ques.get_question_text());



                                front_side9.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side9.setLayout(new BorderLayout());
                                front_side9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side9, BorderLayout.SOUTH);

                                flip_pan9.setLayout(new BorderLayout());
                                flip_pan9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan9, BorderLayout.SOUTH);

                                flip_pan9.add(flip_to_back9);
                                flip_pan9.add(flip_to_front9);
                                flip_pan9.add(next_card9);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(false);
                                front_side8.setVisible(false);
                                back_side8.setVisible(false);
                                flip_pan9.setVisible(true);
                                front_side9.setVisible(true);
                                back_side9.setVisible(false);
                                frame.add(front_side9);
                                frame.add(back_side9);
                                frame.add(flip_pan9);



                                flip_to_back9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side9.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side9.setLayout(new BorderLayout());
                                    back_side9.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side9, BorderLayout.SOUTH);
                                    frame.add(back_side9);
                                    frame.add(flip_pan9);




                                    flip_pan9.setVisible(true);
                                    back_side9.setVisible(true);
                                    front_side9.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques9_op9.getText(), Ans9.getText());

                                textpane.setText(ques.get_question_text());

                                front_side9.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan9.setVisible(true);
                                front_side9.setVisible(true);
                                back_side9.setVisible(false);
                                frame.add(front_side9);
                                frame.add(flip_pan9);


                            }
                                        });



                            }
                                 });



                                 next_card9.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent bc)
                      {

                                final JButton flip_to_back10 = new JButton("flip that to the back!!");
                                final JButton flip_to_front10 = new JButton("flip to the front!!");
                                final JButton next_card10 = new JButton("Next Card, fuckface!!");
                                final JPanel front_side10 = new JPanel();
                                final JPanel back_side10 = new JPanel();
                                final JPanel flip_pan10 = new JPanel();
                                Question ques = new Question(Ques10_op10.getText(), Ans10.getText());

                                textpane.setText(ques.get_question_text());



                                front_side10.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));

                                front_side10.setLayout(new BorderLayout());
                                front_side10.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(front_side10, BorderLayout.SOUTH);

                                flip_pan10.setLayout(new BorderLayout());
                                flip_pan10.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan10, BorderLayout.SOUTH);

                                flip_pan10.add(flip_to_back10);
                                flip_pan10.add(flip_to_front10);
                                flip_pan10.add(next_card10);

                                flip_pan.setVisible(false);
                                front_side.setVisible(false);
                                back_side.setVisible(false);
                                flip_pan2.setVisible(false);
                                front_side2.setVisible(false);
                                back_side2.setVisible(false);
                                flip_pan3.setVisible(false);
                                front_side3.setVisible(false);
                                back_side3.setVisible(false);
                                flip_pan4.setVisible(false);
                                front_side4.setVisible(false);
                                back_side4.setVisible(false);
                                flip_pan5.setVisible(false);
                                front_side5.setVisible(false);
                                back_side5.setVisible(false);
                                flip_pan6.setVisible(false);
                                front_side6.setVisible(false);
                                back_side6.setVisible(false);
                                flip_pan7.setVisible(false);
                                front_side7.setVisible(false);
                                back_side7.setVisible(false);
                                flip_pan8.setVisible(false);
                                front_side8.setVisible(false);
                                back_side8.setVisible(false);
                                flip_pan9.setVisible(false);
                                front_side9.setVisible(false);
                                back_side9.setVisible(false);
                                flip_pan10.setVisible(true);
                                front_side10.setVisible(true);
                                back_side10.setVisible(false);
                                frame.add(front_side10);
                                frame.add(back_side10);
                                frame.add(flip_pan10);



                                flip_to_back10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                    Question ques = new Question(Ques10_op10.getText(), Ans10.getText());

                                    textpane.setText(ques.get_answer_string());

                                    back_side10.add(textpane);
                                    textpane.setFont(new Font("Arial", Font.BOLD, 22));



                                    back_side10.setLayout(new BorderLayout());
                                    back_side10.setLayout(new FlowLayout(FlowLayout.CENTER));
                                    frame.add(back_side10, BorderLayout.SOUTH);
                                    frame.add(back_side10);
                                    frame.add(flip_pan10);




                                    flip_pan10.setVisible(true);
                                    back_side10.setVisible(true);
                                    front_side10.setVisible(false);
                                    frame.setSize(700, 150);

                                        flip_to_front10.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event)
                      {
                                Question ques = new Question(Ques10_op10.getText(), Ans10.getText());

                                textpane.setText(ques.get_question_text());

                                front_side10.add(textpane);
                                textpane.setFont(new Font("Arial", Font.BOLD, 22));
                                flip_pan10.setVisible(true);
                                front_side10.setVisible(true);
                                back_side10.setVisible(false);
                                frame.add(front_side10);
                                frame.add(flip_pan10);


                            }
                                        });



                            }
                                 });






                            }
                                });


                            }
                                });


                            }
                                });





                            }
                                });


                            }
                                });





                            }
                                });





                            }
                                });






                            }
                                });





                            }
                                });






                            }


                         });


                            }


                         });



    }

            public static void Back_button(){

            Quiz_Type qt = new Quiz_Type();
            qt.Quiz_Type();

        }

            



}
