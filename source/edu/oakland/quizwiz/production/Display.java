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

public class Display extends JFrame {

    public static void main(String s[]) {
    

    final Display_SA t = new Display_SA();
    final JPanel panel = new JPanel();
    final JPanel panel2 = new JPanel();
    final JFrame frame = new JFrame("Quiz-Wiz");
    panel.setLayout(new FlowLayout());
    panel2.setLayout(new FlowLayout());
    JLabel title = new JLabel("Welcome to the Quiz-Wiz!");


    JButton quiz = new JButton();
    quiz.setText("Create Quiz");


    panel.add(title);
    panel2.add(quiz);

    title.setFont(new Font("Serif", Font.BOLD, 32));

    
    panel2.setLayout(new BorderLayout());
    panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

    //panel2.setLayout(new BorderLayout());
    frame.add(panel2, BorderLayout.SOUTH);

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();



    frame.add(panel);
    frame.setSize(700, 150);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);




    quiz.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		
		
                final JPanel quiz_type_title = new JPanel();
                final JPanel quiz_type = new JPanel(new GridLayout(2,1));
                final JButton MC = new JButton("Multiple-Choice!!");
                final JButton SA = new JButton("Short Answer!!");
                final JLabel type_title = new JLabel("Choose the question type!!");
                JOptionPane optionPane = new JOptionPane();
                
                quiz_type_title.setLayout(new FlowLayout());
                //quiz_type.setLayout(new FlowLayout());

                quiz_type_title.add(type_title);
                quiz_type.add(MC);
                quiz_type.add(SA);
                

                type_title.setFont(new Font("Serif", Font.BOLD, 32));


                //quiz_type.setLayout(new BorderLayout());
                quiz_type.setLayout(new FlowLayout(FlowLayout.CENTER));

                frame.add(quiz_type_title);
                frame.add(quiz_type, BorderLayout.SOUTH);

              

                panel.setVisible(false);
                panel2.setVisible(false);



                MC.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent a)
                      {

                        
                        quiz_type_title.setVisible(false);
                        quiz_type.setVisible(false);
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


                         back_button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                quiz_type_title.setVisible(true);
                                quiz_type.setVisible(true);

                                

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
                                final JPanel question_input_question = new JPanel(new SpringLayout());
                                final JPanel question_input_answer = new JPanel(new SpringLayout());
                                final JPanel question_input_answer_2 = new JPanel(new SpringLayout());
                                final JPanel question_input_option = new JPanel(new SpringLayout());
                                final JPanel question_input_option2 = new JPanel(new SpringLayout());
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
                                //question_input_question.setLayout(new BorderLayout());

                                question_input_question.setLayout(new FlowLayout(FlowLayout.CENTER));

                                question_input_option.add(op1);
                                op1.setLabelFor(op_a);
                                question_input_option.add(op_a);
                                

                                question_input_option.add(op2);
                                op2.setLabelFor(op_b);
                                question_input_option.add(op_b);
                                
                                question_input_option.setLayout(new FlowLayout(FlowLayout.CENTER));

                                question_input_answer.add(a1);
                                a1.setLabelFor(Ans1);
                                question_input_answer.add(Ans1);

                                question_input_answer.setLayout(new BorderLayout());
                                question_input_answer.setLayout(new FlowLayout(FlowLayout.CENTER));

                                
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
                                frame.add(question_input_question, BorderLayout.SOUTH);
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
      });
            SA.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent a)
                      {
                      
                        //runSA();
                        quiz_type_title.setVisible(false);
                        quiz_type.setVisible(false);

                        quiz_type_title.setVisible(false);
                        quiz_type.setVisible(false);
                        //frame.setSize(700, 150);
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




                        back_button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {


                                quiz_type_title.setVisible(true);
                                quiz_type.setVisible(true);

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
                                final JPanel question_input = new JPanel(new SpringLayout());
                                final JPanel question_input2 = new JPanel(new SpringLayout());
                                final JPanel question_input3 = new JPanel(new SpringLayout());
                                final JPanel question_input4 = new JPanel(new SpringLayout());
                                final JPanel question_input5 = new JPanel(new SpringLayout());
                                final JButton submit = new JButton("Submit the bitch!!");
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
                                back_panel.setVisible(false);

                                //final JTextArea textarea = new JTextArea(20,20);
                                final JButton flip_to_back = new JButton("flip that shit to the back!!");
                                final JButton flip_to_front = new JButton("flip that shit to the front!!");
                                final JPanel front_side = new JPanel();
                                final JPanel flip_pan = new JPanel();
                                final JPanel back_side = new JPanel();
                                final JTextPane textpane = new JTextPane();
                                textpane.setText(Ques1_op1.getText());
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
                                flip_pan.setLayout(new BorderLayout());
                                flip_pan.setLayout(new FlowLayout(FlowLayout.CENTER));
                                frame.add(flip_pan, BorderLayout.SOUTH);
                                frame.add(flip_pan);


                                 flip_to_back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent b)
                      {
                                    
                                    
                                    textpane.setText(Ans1.getText());
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
                                textpane.setText(Ques1_op1.getText());
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




                            }


                         });




                  }
            });
                        

                



	}





});



    }
    public static void runSA()
{
    Display_SA t = new Display_SA();
    t.SA(1);
}


}

