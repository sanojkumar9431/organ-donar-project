
package organdonar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Receive_form extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,licon,lw1,lw2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2;
    
    public Receive_form() {
        
        super("Receive Form");
        setLocation(350,200);
        setSize(650,800);
        
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(14,2,10,10));
        
        p.setBackground(Color.WHITE);
        
        l1=new JLabel("Receiver Name");
        t1=new JTextField();
        p.add(l1);
        p.add(t1);
        
        l10=new JLabel("Organ Name");
        t10=new JTextField();
        p.add(l10);
        p.add(t10);
        
        l2=new JLabel("Have you any disease? if yes, please mention here");
        t2=new JTextField();
        p.add(l2);
        p.add(t2);
        
        l3=new JLabel("Date when you need");
        t3=new JTextField();
        p.add(l3);
        p.add(t3);
        
        l4=new JLabel("Reffered by Doctor (Name and contact)");
        t4=new JTextField();
        p.add(l4);
        p.add(t4);
        
        l5=new JLabel("Contact");
        t5=new JTextField();
        p.add(l5);
        p.add(t5);
      
        
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());
        
        add(p,"Center");
        
        ImageIcon ic1= new ImageIcon("C:\\Users\\SANOJ\\Desktop\\Electricity Project\\image\\loginuser.png");
        Image i3=ic1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon ic2=new ImageIcon(i3);
        licon=new JLabel(ic2);
        
        add(licon,"West");
        getContentPane().setBackground(Color.white);
        
        ImageIcon ic4= new ImageIcon("C:\\Users\\SANOJ\\Desktop\\Electricity Project\\image\\lw.png");
        Image i4=ic4.getImage().getScaledInstance(150, 25, Image.SCALE_DEFAULT);
        ImageIcon ic5=new ImageIcon(i4);
        lw1=new JLabel(ic5);
        
        ImageIcon ic6= new ImageIcon("C:\\Users\\SANOJ\\Desktop\\Electricity Project\\image\\lw.png");
        Image i6=ic6.getImage().getScaledInstance(25, 300, Image.SCALE_DEFAULT);
        ImageIcon ic7=new ImageIcon(i6);
        lw2=new JLabel(ic7);
        
        
        add(lw1,"North");
        getContentPane().setBackground(Color.white);
        
        add(lw2,"East");
        getContentPane().setBackground(Color.white);
        
        b1.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
        String a=t1.getText();
        String c=t2.getText();
        String d=t3.getText();
        String ee=t4.getText();
        String f=t5.getText();
        String k=t10.getText();
        
        String q2="insert into receive_form values('"+a+"','"+k+"','"+c+"','"+d+"','"+ee+"','"+f+"')";
      
        try{
            Conn c1=new Conn();
            c1.s.executeUpdate(q2);
            dispose();
            JOptionPane.showMessageDialog(null,"Recorded");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }   
           }
     });
        
        b2.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
           dispose();
               
           }
     });
        
    }
     public static void main(String[] args){
        new Receive_form().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
