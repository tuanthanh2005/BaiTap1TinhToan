/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author trant
 */
public class MayTinhCoBan extends JFrame {

    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JButton[] bt = new JButton[16];
    JTextField txtDisplay;
    private String[] str = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};

    public MayTinhCoBan() {
        setTitle("Máy Tính");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
     
        p1.add(txtDisplay = new JTextField());
        txtDisplay.setPreferredSize(new Dimension(200,30));
        JButton btReset;
        p1.add(btReset = new JButton("C"));
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,4,5,5));
        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton(str[i]);
            p2.add(bt[i]);
        }
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
//= Double.parseDouble(txtDisplay.getText());

        
        
        
    }
    public static void main(String[] args) {
        MayTinhCoBan frm = new MayTinhCoBan();
       // xuât rua
       frm.setVisible(true);
        
    }
//     private void phepToan() {
//        double num2 = Double.parseDouble(txtDisplay.getText());
//        double result = 0;
//        String tinhtoan;
//        
//        switch (tinhtoan) {
//            case "+":
//                result = bt + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    JOptionPane.showMessageDialog(this, "Cannot divide by zero");
//                    result = 0;
//                }
//                break;
//        }
//        
//        txtDisplay.setText(String.valueOf(result));
//    }
}
