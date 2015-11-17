package edu.oakland.quizwiz.production;

import javax.swing.DefaultListModel;

/**
 *
 * @author Ikkitrix
 */
public class QuizSelect extends javax.swing.JPanel {

    public static DefaultListModel<String> model = Display.db.list_quizzes();
    /**
     * Creates new form QuizSelect
     */
   
    public QuizSelect() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 30));
        setPreferredSize(new java.awt.Dimension(770, 500));

        jList1.setBackground(new java.awt.Color(50, 50, 50));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setModel(model
        );
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(15);
        jList1.setFixedCellWidth(200);
        jList1.setVisibleRowCount(10);
        jScrollPane1.setViewportView(jList1);
        
        
        

        jButton1.setText("Start Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View Flashcards");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                    jButton2ActionPerformed(evt);
                
                
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quiz Select!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jButton2)
                        .addGap(84, 84, 84)
                        .addComponent(jButton1)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jScrollPane1.setVisible(true);
        jList1.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel1.setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Some sort of quiz taking display
        
        if(jList1.getModel().getSize() != 0){
            Display.quizView1.startQuiz(Display.db.get_quiz(jList1.getSelectedIndex()));       
            Display.quizSelect2.setVisible(false);
            Display.quizView1.setVisible(true);
            Display.jLayeredPane1.moveToBack(Display.quizSelect2);
            Display.jLayeredPane1.moveToFront(Display.quizView1);
        }
        else{
            Display.quizSelect2.setVisible(true);
            Display.quizView1.setVisible(false);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        if(jList1.getModel().getSize() != 0){
            Display.flashcard1.setQuiz(Display.db.get_quiz(jList1.getSelectedIndex()));
            Display.quizSelect2.setVisible(false);
            Display.flashcard1.setVisible(true);
            Display.jLayeredPane1.moveToBack(Display.quizSelect2);
            Display.jLayeredPane1.moveToFront(Display.flashcard1);
        }
        else {
            Display.quizSelect2.setVisible(true);
            Display.flashcard1.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
