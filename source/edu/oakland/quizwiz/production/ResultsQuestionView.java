/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.oakland.quizwiz.production;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JRadioButton;

/**
 *
 * @author Ikkitrix
 */
public class ResultsQuestionView extends javax.swing.JPanel {

    private Question q;
    /**
     * Creates new form QuestionView
     */
    public ResultsQuestionView() {
        initComponents();
    }

    public void setQuestion(Question _q, int q_num) {
        q = _q;
        jTextArea2.setText(q.get_question_text());
        jLabel1.setText("Question " + Integer.toString(q_num + 1));
        buttonGroup1.clearSelection();
        jLabel10.setText("");
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel10.setVisible(false);
        jLabel9.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setForeground(new java.awt.Color(255,255,255));
        jLabel5.setForeground(new java.awt.Color(255,255,255));
        jLabel6.setForeground(new java.awt.Color(255,255,255));
        jLabel7.setForeground(new java.awt.Color(255,255,255));
        jLabel8.setForeground(new java.awt.Color(255,255,255));
        if (q.get_question_type().equals("MC")) {
            ArrayList<String> selections = q.get_selections();
            if (selections.size() > 0) {
                jLabel4.setText(selections.get(0));
                jLabel4.setVisible(true);
            }
            if (selections.size() > 1) {
                jLabel5.setText(selections.get(1));
                jLabel5.setVisible(true);
            }
            if (selections.size() > 2) {
                jLabel6.setText(selections.get(2));
                jLabel6.setVisible(true);
            }
            if (selections.size() > 3) {
                jLabel7.setText(selections.get(3));
                jLabel7.setVisible(true);
            }
            if (selections.size() > 4) {
                jLabel8.setText(selections.get(4));
                jLabel8.setVisible(true);
            }
            if (q.get_correctness()) {
                jLabel2.setText("Correct!");
                if (q.get_answer_index() == 0) {
                    jLabel4.setForeground(new java.awt.Color(153,255,153));
                } else if (q.get_answer_index() == 1) {
                    jLabel5.setForeground(new java.awt.Color(153,255,153));
                } else if (q.get_answer_index() == 2) {
                    jLabel6.setForeground(new java.awt.Color(153,255,153));
                } else if (q.get_answer_index() == 3) {
                    jLabel7.setForeground(new java.awt.Color(153,255,153));
                } else if (q.get_answer_index() == 4) {
                    jLabel8.setForeground(new java.awt.Color(153,255,153));
                }
            } else {
                jLabel2.setText("Incorrect - correct answer in yellow");
                if (q.get_answer_index() == 0) {
                    jLabel4.setForeground(new java.awt.Color(255,255,153));
                } else if (q.get_answer_index() == 1) {
                    jLabel5.setForeground(new java.awt.Color(255,255,153));
                } else if (q.get_answer_index() == 2) {
                    jLabel6.setForeground(new java.awt.Color(255,255,153));
                } else if (q.get_answer_index() == 3) {
                    jLabel7.setForeground(new java.awt.Color(255,255,153));
                } else if (q.get_answer_index() == 4) {
                    jLabel8.setForeground(new java.awt.Color(255,255,153));
                }
                if (q.get_user_input_index() == 0) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                } else if (q.get_user_input_index() == 1) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                } else if (q.get_user_input_index() == 2) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                } else if (q.get_user_input_index() == 3) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                } else if (q.get_user_input_index() == 4) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                }
            }
        } else if (q.get_question_type().equals("SA")) {
            jLabel10.setVisible(true);
            jLabel10.setText(q.get_answer_string());
            if (q.get_correctness()) {
                jLabel2.setText("Correct!");
                jLabel10.setForeground(new java.awt.Color(153,255,153));
            } else {
                jLabel2.setText("Incorrect - Correct Answer:");
                jLabel10.setForeground(new java.awt.Color(255,255,153));
                jLabel3.setVisible(true);
                jLabel9.setVisible(true);
                jLabel9.setText(q.get_user_input_str());
            }
        } else {
            jLabel4.setText("True");
            jLabel5.setText("False");
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            if (q.get_correctness()) {
                jLabel2.setText("Correct!");
                if (q.get_answer_boolean() == true) {
                    jLabel4.setForeground(new java.awt.Color(153,255,153));
                } else if (q.get_answer_boolean() == false) {
                    jLabel5.setForeground(new java.awt.Color(153,255,153));
                }
            } else {
                jLabel2.setText("Incorrect - correct answer in yellow");
                if (q.get_answer_boolean() == true) {
                    jLabel4.setForeground(new java.awt.Color(255,255,153));
                } else if (q.get_answer_boolean() == false) {
                    jLabel5.setForeground(new java.awt.Color(255,255,153));
                }
                if (q.get_user_input_boolean() == true) {
                    jLabel4.setForeground(new java.awt.Color(255,153,153));
                } else if (q.get_user_input_boolean() == false) {
                    jLabel5.setForeground(new java.awt.Color(255,153,153));
                }
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question 1");

        jScrollPane2.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(50, 50, 50));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correct Answer:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Answer:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
