/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  
/**
 *
 * @author nazal
 */
public class GUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    JPanel myPanel;
    JButton myButton;
    
    public GUI(){
        this.setTitle("GUI");
        this.setSize(300,300);
        this.setLocation(600,300);
        
        myButton = new JButton("Start");
        myButton.setBounds(100,90,100,30);
        
        myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.add(myButton);
        this.add(myPanel);
        
        this.setVisible(true);
        
        myButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(null, "started", "Response", 1);
            }
        });
    }
    public static void main(String[] args) {
        new GUI();
    }
    
}
