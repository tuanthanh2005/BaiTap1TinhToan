/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JPanel;



/**
 *
 * @author ADMIN
 */
public class TinhToanDonGian extends JFrame {
    private JLabel lb1 , lb2, lb3;
    private JTextField txtSo1 , txtSo2, txtSo3,txtkq;
     private JButton btCong, btTru, btNhan,btChia;
     
   
     
     
     public TinhToanDonGian(){
         setTitle("Tinh Toan Don Gian");
         taoGiaoDien();
         pack();
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout (new GridLayout(3,2,5,5));
        p1.add(lb1 = new JLabel("So1"));
        p1.add(txtSo1 = new JTextField());
        p1.add(lb2=new JLabel("So 2"));
        p1.add(txtSo2 = new JTextField());
        p1.add(lb3=new JLabel("Ket Qua"));
        p1.add(txtkq = new JTextField());
        JPanel p2 = new JPanel();
        p2.add(btCong= new JButton("Cong"));
         p2.add(btTru= new JButton("Tru"));
         p2.add(btNhan= new JButton("Nhan"));
         p2.add(btChia= new JButton("Chia"));
         
         
         setLayout (new BorderLayout());
         add(p1,BorderLayout.CENTER);
         add(p2,BorderLayout.SOUTH);
       
         
         btCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             double x = Double .parseDouble(txtSo1.getText());
             double y = Double .parseDouble(txtSo2.getText());
              double kq=x+y;
              txtkq.setText(String.valueOf(kq));
      
         
            }
         });
                 }
    public static void main(String[] args) {
        TinhToanDonGian frm = new TinhToanDonGian();
        frm.setVisible(true);
        
    }
}
         
         
                 

