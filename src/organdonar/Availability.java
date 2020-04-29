
package organdonar;


import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class Availability extends JFrame implements ActionListener {
    
    JTable t1,t2;
    JPanel p1,p2;
    JLabel l1,l2,l11;
    
    JButton b1;
    String x1[]={"Donar Name","Organ Name","Disease","Date of Donate","willing to donate","Contact"};
    String y1[][]=new String[50][10];
    String x2[]={"Receiver Name","Organ Name","Disease","Date when you need","Reffered by Doctor","Contact"};
    String y2[][]=new String[50][10];
    int i=0, j=0;
    Availability(){
        super("Available Organ");
        setSize(1100,1000);
        setLocation(200,200);
        setLayout(new BorderLayout());
        
        
        p1=new JPanel();
        p1.setBackground(Color.white);
        p2=new JPanel();
        p2.setBackground(Color.white);
       
        add(p2,"East");
        add(p1,"West");
        
        
        try{
            Conn c1=new Conn();
            String s1="select *from donate_form";
            ResultSet rs=c1.s.executeQuery(s1);
            while(rs.next()){
                y1[i][j++]=rs.getString("DonarName");
                y1[i][j++]=rs.getString("OrganName");
                y1[i][j++]=rs.getString("Disease");
                y1[i][j++]=rs.getString("DateOfDonate");
                y1[i][j++]=rs.getString("WillingToDonate");
                y1[i][j++]=rs.getString("Contact");
                i++;
                j=0;
            }
            t1=new JTable(y1,x1); 
            
            
            
            String s2="select *from receive_form";
            ResultSet rss=c1.s.executeQuery(s2);
            while(rss.next()){
                y2[i][j++]=rss.getString("ReceiverName");
                y2[i][j++]=rss.getString("OrganName");
                y2[i][j++]=rss.getString("Disease");
                y2[i][j++]=rss.getString("DateWhenYouNeed");
                y2[i][j++]=rss.getString("RefDoctor");
                y2[i][j++]=rss.getString("Contact");
                i++;
                j=0;
            }
            t2=new JTable(y2,x2); 
            
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        l1=new JLabel("Donar Form                 and          Receiver Form");
        l1.setOpaque(true);
        l1.setBackground(Color.red);
        l1.setFont(new Font("Garamond",Font.CENTER_BASELINE,50));
        l1.setForeground(Color.white);
        add(l1,"North");
        
        
        
        l2=new JLabel("gjyfhtdgx");
        l2.setOpaque(true);
        l2.setBackground(Color.white);
       
        l2.setFont(new Font("Garamond",Font.CENTER_BASELINE,50));
        l2.setForeground(Color.white);
        add(l2,"Center");
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane sp1=new JScrollPane(t1);
        p1.add(sp1);
        JScrollPane sp2=new JScrollPane(t2);
        p2.add(sp2);
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        try{
            t1.print();
            t2.print();
        }
        catch(Exception e){}
    } 
    public static void main(String[] args)
    {
        new Availability().setVisible(true);
    }
    
}


