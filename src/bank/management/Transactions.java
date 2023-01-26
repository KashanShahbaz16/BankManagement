
package bank.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener {
    
     JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
     String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 700);
        add(image);
        
        JLabel text = new JLabel("Please Select your Transaction");
        text.setBounds(225, 200, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,309,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,309,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,347,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(355,347,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton("Change PIN");
        pinchange.setBounds(170,385,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,385,150,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355,420,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,780);
        setLocation(100,0);
        setUndecorated(true);
        setVisible(true);
}
    
        public void actionPerformed(ActionEvent ae){
             if(ae.getSource()== exit) {
              System.exit(0);
          } else if(ae.getSource()== deposit){
              setVisible(false);
              new  Deposit(pinnumber).setVisible(true);
          }else if(ae.getSource() == fastcash){
              setVisible(false);
              new FastCash(pinnumber).setVisible(true);
          }else if(ae.getSource() == pinchange){
              setVisible(false);
              new PinChange(pinnumber).setVisible(true);
          }else if(ae.getSource() == balanceenquiry){
              setVisible(false);         
              new BalanceEnquiry(pinnumber).setVisible(true);
          }else if(ae.getSource() == ministatement){        
              new MiniStatement(pinnumber).setVisible(true);
        }  
        }    
    
public static void main(String[] args){
    
    new Transactions("");
}
}