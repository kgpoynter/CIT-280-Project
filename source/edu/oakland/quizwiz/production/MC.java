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

public class MC extends JFrame{

    static void MC(){


        final JFrame frame = new JFrame();
                        //frame.setSize(600, 500);

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
                        //final JTextField Ques_num_input = new JTextField( 10 );

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

                        frame.setSize(700, 150);
                        frame.setLocationRelativeTo(null);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setVisible(true);


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
                                final JPanel question_input_question = new JPanel(new GridLayout(0,1));
                                final JPanel question_input_question2 = new JPanel(new SpringLayout());
                                final JPanel question_input_question3 = new JPanel(new SpringLayout());
                                final JPanel question_input_question4 = new JPanel(new SpringLayout());
                                final JPanel question_input_question5 = new JPanel(new SpringLayout());
                                final JPanel question_input_answer = new JPanel(new SpringLayout());
                                final JPanel question_input_answer_2 = new JPanel(new SpringLayout());
                                final JPanel question_input_answer_3 = new JPanel(new SpringLayout());
                                final JPanel question_input_answer_4 = new JPanel(new SpringLayout());
                                final JPanel question_input_answer_5 = new JPanel(new SpringLayout());
                                final JPanel question_input_option = new JPanel(new SpringLayout());
                                final JPanel question_input_option2 = new JPanel(new SpringLayout());
                                final JPanel question_input_option3 = new JPanel(new SpringLayout());
                                final JPanel question_input_option4 = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JPanel question_input_answer2 = new JPanel(new SpringLayout());
                                final JPanel back_panel = new JPanel();
                                final JButton submit = new JButton("Submit this bitch!!");
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
                                final JLabel q1 = new JLabel("Q1", JLabel.TRAILING);
                                final JLabel a1 = new JLabel("A1", JLabel.TRAILING);
                                final JLabel q2 = new JLabel("Q2", JLabel.TRAILING);
                                final JLabel a2 = new JLabel("A2", JLabel.TRAILING);
                                final JLabel q3 = new JLabel("Q3", JLabel.TRAILING);
                                final JLabel a3 = new JLabel("A3", JLabel.TRAILING);
                                final JLabel q4 = new JLabel("Q4", JLabel.TRAILING);
                                final JLabel a4 = new JLabel("A4", JLabel.TRAILING);
                                final JLabel q5 = new JLabel("Q5", JLabel.TRAILING);
                                final JLabel a5 = new JLabel("A5", JLabel.TRAILING);
                                final JLabel op1 = new JLabel("a. ", JLabel.TRAILING);
                                final JLabel op1_2 = new JLabel("a. ", JLabel.TRAILING);
                                final JLabel op2 = new JLabel("Option 2");
                                final JLabel op3 = new JLabel("Option 3");
                                final JLabel op4 = new JLabel("Option 4");
                                final JTextField op_a = new JTextField(10);
                                final JTextField op_b = new JTextField(10);
                                final JTextField op_c = new JTextField(10);
                                final JTextField op_d = new JTextField(10);
                                final JTextField op_a_2 = new JTextField(10);

                                //question 1, options, and answer 1 set
                                //question_input.setLayout( new GridLayout( 0,2 ) );
                                question_input_question.add(q1);
                                q1.setLabelFor(Ques1_op1);
                                question_input_question.add(Ques1_op1);
                                question_input_question.add(op_a);
                                question_input_question.add(op_b);
                                question_input_question.add(op_c);
                                question_input_question.add(op_d);
                                question_input_question.setLayout(new BoxLayout(question_input_question, BoxLayout.PAGE_AXIS));
                                //question_input_question.setLayout(new BorderLayout());

                                //question_input_question.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question_input_option.add(op1);
                                //op1.setLabelFor(op_a);
                                //question_input_option.add(op_a);


                                //question_input_option.add(op2);
                                //op2.setLabelFor(op_b);
                                //question_input_option.add(op_b);

                                //question_input_option.setLayout(new FlowLayout(FlowLayout.CENTER));

                                //question_input_answer.add(a1);
                                //a1.setLabelFor(Ans1);
                                //question_input_answer.add(Ans1);

                                //question_input_answer.setLayout(new BorderLayout());
                                //question_input_answer.setLayout(new FlowLayout(FlowLayout.CENTER));


                                //question_input.setLocation(10,10);
                                //question_input.setSize(400,300);
                                //question_input.setLayout( new GridLayout( 4,1 ) );




                                //question 2 and answer 2 set
                                question_input2.add(q2);
                                q2.setLabelFor(Ques2_op2);
                                question_input2.add(Ques2_op2);

                                question_input_option2.add(op1_2);
                                op1_2.setLabelFor(op_a_2);
                                question_input_option2.add(op_a_2);


                                question_input_option2.setLayout(new BorderLayout());
                                question_input_option2.setLayout(new FlowLayout(FlowLayout.CENTER));

                                question_input_answer2.add(a2);
                                a2.setLabelFor(Ans2);
                                question_input_answer2.add(Ans2);

                                question_input2.setLayout(new BorderLayout());
                                question_input2.setLayout(new FlowLayout(FlowLayout.CENTER));

                                question_input_answer2.setLayout(new BorderLayout());
                                question_input_answer2.setLayout(new FlowLayout(FlowLayout.CENTER));






                                question_input_title.add(mc_input_title);
                               //uestion_input.add(Ques1_op1);
                               //uestion_input.add(Ques2_op2);


                                //question_input.setLayout(new BoxLayout(question_input, BoxLayout.PAGE_AXIS));
                                frame.add(question_input_title);
                                //question_input.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(question_input_question);
                                frame.add(question_input_option, BorderLayout.SOUTH);
                                frame.add(question_input_answer, BorderLayout.SOUTH);
                                frame.add(question_input2, BorderLayout.SOUTH);
                                frame.add(question_input_option2, BorderLayout.SOUTH);
                                frame.add(question_input_answer2, BorderLayout.SOUTH);
                                frame.add(back_panel, BorderLayout.SOUTH);


                                BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
                                frame.setLayout(boxLayout);

                                question_input_title.setVisible(true);
                                question_input_question.setVisible(true);
                                question_input_option.setVisible(true);
                                question_input_answer.setVisible(true);

                                back_panel.setVisible(true);




                                //back button
                                back_panel.add(back_5);
                                //submit button
                                back_panel.add(submit);


                                submit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {

                                question_input_title.setVisible(true);
                                question_input_question.setVisible(false);
                                question_input_option.setVisible(false);
                                question_input_answer.setVisible(false);
                                back_panel.setVisible(false);
                                question_input2.setVisible(true);
                                question_input_option2.setVisible(true);
                                question_input_answer2.setVisible(true);
                                final JPanel panel = new JPanel();
                                final JButton back_5_again = new JButton("Back");
                                panel.add(back_5_again);
                                frame.add(panel, BorderLayout.SOUTH);
                                panel.setVisible(true);


                                        back_5_again.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent f)
                              {

                                             question_input_title.setVisible(true);
                                             question_input_question.setVisible(true);
                                                question_input_option.setVisible(true);
                                                question_input_answer.setVisible(true);

                                                back_panel.setVisible(true);
                                                panel.setVisible(false);
                                            question_input2.setVisible(false);
                                            question_input_option2.setVisible(false);
                                            question_input_answer2.setVisible(false);
                                    }
                                        });







                            }


                                    });


                                back_5.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                question_input_title.setVisible(false);
                                question_input_question.setVisible(false);
                                question_input_option.setVisible(false);
                                question_input_answer.setVisible(false);
                                question_input2.setVisible(false);
                                question_input3.setVisible(false);
                                question_input4.setVisible(false);
                                question_input5.setVisible(false);
                                back_panel.setVisible(false);
                                question_input2.setVisible(false);
                                question_input_option2.setVisible(false);
                                question_input_answer2.setVisible(false);

                                frame.setSize(700, 150);

                                number_question_title.setVisible(true);
                                number_question.setVisible(true);



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
