/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.quizwiz.production;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ikkitrix
 */
public class QuizCreate extends javax.swing.JPanel {
    
    Quiz quiz = new Quiz("default");
    /**
     * Creates new form QuizCreate
     */
    public QuizCreate() {
        initComponents();
    }
    
    public void newQuiz() {
        quiz = new Quiz("default");
        jTextField1.setText(null);
        jLabel4.setText("Question 1");
        questionCreate2.reinitialize();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        questionCreate2 = new edu.oakland.quizwiz.production.QuestionCreate();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setPreferredSize(new java.awt.Dimension(750, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quiz Create!");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quiz Title:");

        questionCreate2.setBackground(new java.awt.Color(30, 30, 30));

        jButton1.setText("Finalize Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Save to file:");

        jCheckBox1.setBackground(new java.awt.Color(30, 30, 30));

        jButton2.setText("Add Question");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Question 1");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Make sure to add your last question before finalizing!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(questionCreate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionCreate2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel3)
                        .addComponent(jCheckBox1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String q_text = questionCreate2.jTextField1.getText();
        if (questionCreate2.jComboBox1.getSelectedIndex() == 0) {
            String answer = questionCreate2.jTextField2.getText();
            Question q = new Question(q_text, answer);
            quiz.add_question(q);
        } else if (questionCreate2.jComboBox1.getSelectedIndex() == 1) {
            ArrayList<String> selections = new ArrayList<String>();
            int answer_index = 0;
            if (questionCreate2.jTextField2.getText() != null) {
                selections.add(questionCreate2.jTextField2.getText());
            }
            if (questionCreate2.jTextField3.getText() != null) {
                selections.add(questionCreate2.jTextField3.getText());
            }
            if (questionCreate2.jTextField4.getText() != null) {
                selections.add(questionCreate2.jTextField4.getText());
            }
            if (questionCreate2.jTextField5.getText() != null) {
                selections.add(questionCreate2.jTextField5.getText());
            }
            if (questionCreate2.jTextField6.getText() != null) {
                selections.add(questionCreate2.jTextField6.getText());
            }
            if (questionCreate2.jRadioButton1.isSelected()) {
                answer_index = 0;
            }
            if (questionCreate2.jRadioButton2.isSelected()) {
                answer_index = 1;
            }
            if (questionCreate2.jRadioButton3.isSelected()) {
                answer_index = 2;
            }
            if (questionCreate2.jRadioButton4.isSelected()) {
                answer_index = 3;
            }
            if (questionCreate2.jRadioButton5.isSelected()) {
                answer_index = 4;
            }
            Question q = new Question(q_text, selections, answer_index);
            quiz.add_question(q);
        } else if (questionCreate2.jComboBox1.getSelectedIndex() == 2) {
            boolean answer_boolean = false;
            if (questionCreate2.jRadioButton6.isSelected()) {
                answer_boolean = true;
            }
            Question q = new Question(q_text, answer_boolean);
            quiz.add_question(q);
        }
        String q_counter = "Question ";
        q_counter += Integer.toString(quiz.get_num_questions() + 1);
        jLabel4.setText(q_counter);
        questionCreate2.reinitialize();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String quiz_title = jTextField1.getText();
        quiz.set_title(quiz_title);
        if (jCheckBox1.isSelected()) {
            try {
                quiz.export_quiz();
            } catch (IOException ex) {
                Logger.getLogger(QuizCreate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Display.db.add_quiz(quiz);
        QuizSelect.model.addElement(quiz_title);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private edu.oakland.quizwiz.production.QuestionCreate questionCreate2;
    // End of variables declaration//GEN-END:variables
}
