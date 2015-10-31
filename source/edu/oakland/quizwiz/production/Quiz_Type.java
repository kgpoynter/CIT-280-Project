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

public class Quiz_Type extends JFrame{

    


        static void Quiz_Type(){


            
                final JFrame frame = new JFrame();


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

                quiz_type_title.setVisible(true);
                quiz_type.setVisible(true);

                frame.setVisible(true);
                frame.setSize(700, 150);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                

                MC.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent a)
                      {


                        quiz_type_title.setVisible(false);
                        quiz_type.setVisible(false);
                        MC_click();
                        frame.setVisible(false);
                  }
                });

                SA.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent a)
                      {


                        quiz_type_title.setVisible(false);
                        quiz_type.setVisible(false);
                        SA_click();
                        frame.setVisible(false);
                  }
                });




        }
    


                        static void MC_click(){

                            MC mc = new MC();
                            mc.MC();



                            }


                        static void SA_click(){

                            SA sa = new SA();
                            sa.SA();



                            }

}
