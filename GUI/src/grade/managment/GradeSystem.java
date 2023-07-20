/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grade.managment;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nazal
 */
public class GradeSystem extends javax.swing.JFrame {

    private int length = 10;
    static int pos=0;
    private String[] students = new String[length];
    private int[] mark1 = new int[length];
    private int[] mark2 = new int[length];
    /**
     * Creates new form GradeSystem
     */
    public GradeSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addStudent_btn = new javax.swing.JButton();
        addMarks_btn = new javax.swing.JButton();
        displayNames_btn = new javax.swing.JButton();
        grades_btn = new javax.swing.JButton();
        studentAvg_btn = new javax.swing.JButton();
        classAvg_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStudent_btn.setText("Add Student");
        addStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent_btnActionPerformed(evt);
            }
        });

        addMarks_btn.setText("Add marks");
        addMarks_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMarks_btnActionPerformed(evt);
            }
        });

        displayNames_btn.setText("Display Names");
        displayNames_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNames_btnActionPerformed(evt);
            }
        });

        grades_btn.setText("Grades");

        studentAvg_btn.setText("Student Avg");

        classAvg_btn.setText("Class Avg");

        clear_btn.setText("Clear");

        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addStudent_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayNames_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grades_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentAvg_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classAvg_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMarks_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(addStudent_btn)
                        .addGap(18, 18, 18)
                        .addComponent(addMarks_btn)
                        .addGap(18, 18, 18)
                        .addComponent(displayNames_btn)
                        .addGap(18, 18, 18)
                        .addComponent(grades_btn)
                        .addGap(18, 18, 18)
                        .addComponent(studentAvg_btn)
                        .addGap(18, 18, 18)
                        .addComponent(classAvg_btn)
                        .addGap(44, 44, 44)
                        .addComponent(clear_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent_btnActionPerformed
        // TODO add your handling code here:
        Scanner sc = new Scanner(System.in);
        students[pos] = JOptionPane.showInputDialog(null, "Enter your name:", "Input Dialog", JOptionPane.PLAIN_MESSAGE);
        pos++;
        
    }//GEN-LAST:event_addStudent_btnActionPerformed

    private void displayNames_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNames_btnActionPerformed
        // TODO add your handling code here:
    String studentDetails = "";
    for (int i = 0; i < pos; i++) {
        studentDetails += "Student Name: " + students[i] +
                         "\tMark 1: " + mark1[i] +
                         "\tMark 2: " + mark2[i] +
                         "\n";
    }
    display.setText(studentDetails);
    }//GEN-LAST:event_displayNames_btnActionPerformed

    private void addMarks_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMarks_btnActionPerformed
        // TODO add your handling code here:
        boolean isPresent = false;
        String name = JOptionPane.showInputDialog(null,"Enter the name of the student","student name",JOptionPane.PLAIN_MESSAGE);
        name = name.toLowerCase();
        for(int i=0;i<pos;i++){
            if(students[i].equals(name.toLowerCase())){
                isPresent = true;
                mark1[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in subject 1 ","Subject 1",JOptionPane.PLAIN_MESSAGE));
                mark2[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter marks in subject 2 ","Subject 2",JOptionPane.PLAIN_MESSAGE));
            }
        }
        if(!isPresent){
            JOptionPane.showMessageDialog(rootPane, "Name not found");
        }
    }//GEN-LAST:event_addMarks_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GradeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMarks_btn;
    private javax.swing.JButton addStudent_btn;
    private javax.swing.JButton classAvg_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTextPane display;
    private javax.swing.JButton displayNames_btn;
    private javax.swing.JButton grades_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton studentAvg_btn;
    // End of variables declaration//GEN-END:variables
}
