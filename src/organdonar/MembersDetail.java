
package organdonar;


import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class MembersDetail extends JFrame implements ActionListener {
    
    JTable t1;
    JButton b1;
    String x[]={"Name","Gender","Age","Blood Group","Parent's Name","Full Address","State","Email","Phone Number"};
    String y[][]=new String[50][10];
    int i=0, j=0;
    MembersDetail(){
        super("Member Details");
        setSize(1200,650);
        setLocation(200,200);
        
        try{
            Conn c1=new Conn();
            String s1="select *from signup";
            ResultSet rs=c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("gender");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("blood_group");
                y[i][j++]=rs.getString("parents_name");
                y[i][j++]=rs.getString("full_address");
                y[i][j++]=rs.getString("state");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("phone_number");
                i++;
                j=0;
            }
            t1=new JTable(y,x);  
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane sp=new JScrollPane(t1);
        add(sp);
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        try{
            t1.print();
        }
        catch(Exception e){}
    } 
    public static void main(String[] args)
    {
        new MembersDetail().setVisible(true);
    }
    
}


