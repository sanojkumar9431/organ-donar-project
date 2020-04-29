
package organdonar;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.event.MenuListener;


class MembersHome extends JFrame implements ActionListener{
    
    MembersHome(){
        
        super("M_Home");
        setSize(1900,1000);
        
        
        /////////////////////////////////////////////////
       
        JPanel p1=new JPanel();
        p1.setBackground(Color.white);
       
        add(p1);
        JLabel lw1=new JLabel();
        lw1.setPreferredSize(new Dimension(2000,275));
        lw1.setBackground(Color.orange);
        lw1.setOpaque(true);
        p1.add(lw1);
        
        JLabel receive=new JLabel("Wana Receive any organ");
        receive.setFont(new Font("Garamond",Font.CENTER_BASELINE,70));
        receive.setForeground(Color.red);
        receive.setOpaque(true);
        receive.setBackground(Color.white);
        p1.add(receive);
        
        JButton b1=new JButton("Press it");
        b1.setVerticalTextPosition(SwingConstants.CENTER);
        b1.setHorizontalTextPosition(SwingConstants.CENTER);
        b1.setFont(new Font("Garamond",Font.BOLD,40));
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.red);
        p1.add(b1);
        
        b1.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
             new Receive_form().setVisible(true);
              
           }
     });
        
        JLabel donate=new JLabel("Wana Donate any organ");
        donate.setFont(new Font("Garamond",Font.CENTER_BASELINE,70));
        donate.setForeground(Color.red);
        donate.setOpaque(true);
        donate.setBackground(Color.white);
        p1.add(donate);
        
        JButton b2=new JButton("Press it");
        b2.setVerticalTextPosition(SwingConstants.CENTER);
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.setFont(new Font("Garamond",Font.BOLD,40));
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.red);
        p1.add(b2);
        
        b2.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
             new Donate_form().setVisible(true);
              
           }
     });
        
        JLabel availablity=new JLabel("Check the availability of organ");
        availablity.setFont(new Font("Garamond",Font.CENTER_BASELINE,70));
        availablity.setForeground(Color.red);
        availablity.setOpaque(true);
        availablity.setBackground(Color.white);
        p1.add(availablity);
       
        JButton b3=new JButton("Press it");
        b3.setVerticalTextPosition(SwingConstants.CENTER);
        b3.setHorizontalTextPosition(SwingConstants.CENTER);
        b3.setFont(new Font("Garamond",Font.BOLD,40));
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.red);
        p1.add(b3);
        
        b3.addActionListener(new ActionListener(){
         
           public void actionPerformed(ActionEvent e) {
               
             new Availability().setVisible(true);
              
           }
     });
        
        
        JLabel lw2=new JLabel();
        lw2.setPreferredSize(new Dimension(2000,275));
        lw2.setBackground(Color.orange);
        lw2.setOpaque(true);
        p1.add(lw2);
        
        
        //////////////////////////////////////////////////
        
        JMenuBar mb=new JMenuBar();
       
        
        JMenu f=new JMenu("M_Home");
        mb.add(f);
        JMenuItem m6=new JMenuItem("M_Home");
        f.add(m6);
        m6.addActionListener(this);
        
        JMenu a=new JMenu("Member");
        mb.add(a);
        JMenuItem m1=new JMenuItem("Member Details");
        a.add(m1);
        m1.addActionListener(this);
        
        JMenu c=new JMenu("Organ Detail");
        mb.add(c);
        JMenuItem m3=new JMenuItem("View Organ Detail");
        c.add(m3);
        m3.addActionListener(this);
        
        JMenu d=new JMenu("Availability");
        mb.add(d);
        JMenuItem m4=new JMenuItem("Availability");
        d.add(m4);
        m4.addActionListener(this);
        
        JMenu e=new JMenu("Editor");
        mb.add(e);
        JMenuItem m5=new JMenuItem("NotePad");
        e.add(m5);
        m5.addActionListener(this);
      
        setJMenuBar(mb);
        
        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        JPanel p3=new JPanel();
        p3.setLayout(new GridLayout(6,1,0,19));
        p3.setPreferredSize(new Dimension(200, 600));
        add(p3,"West");
        
        ImageIcon iheart=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\heart.jpeg");
        Image ih=iheart.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton heart=new JButton(new ImageIcon(ih));
        heart.setToolTipText("HEART");
        p3.add(heart);
        
        
        ImageIcon ihand=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\hand.jpeg");
        Image ihh=ihand.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton hand=new JButton(new ImageIcon(ihh));
        hand.setToolTipText("HAND");
        p3.add(hand);
        
       
        ImageIcon ibone=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\bone.jpeg");
        Image ibn=ibone.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton bone=new JButton(new ImageIcon(ibn));
        bone.setToolTipText("BONE");
        p3.add(bone);
        
        ImageIcon ibMarrow=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\boneMarrow.jpeg");
        Image ibm=ibMarrow.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton bMarrow=new JButton(new ImageIcon(ibm));
        bMarrow.setToolTipText("BONE MARROW");
        p3.add(bMarrow);
       
        ImageIcon iface=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\face.jpeg");
        Image ifa=iface.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton face=new JButton(new ImageIcon(ifa));
        face.setToolTipText("FACE");
        p3.add(face);
        
        ImageIcon icornea=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\cornea.jpeg");
        Image ic=icornea.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton cornea=new JButton(new ImageIcon(ic));
        cornea.setToolTipText("CORNEA");
        p3.add(cornea);
        
        /////////////////////////////////////////////////////////    
              
        JPanel p4=new JPanel();
        p4.setLayout(new GridLayout(6,1,0,19));
        p4.setPreferredSize(new Dimension(200, 600));
        add(p4,"East");
        
        ImageIcon ikidney=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\kidney.jpeg");
        Image ik=ikidney.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton kidney=new JButton(new ImageIcon(ik));
        kidney.setToolTipText("KIDNEY");
        p4.add(kidney);
        
        ImageIcon iliver=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\liver.jpeg");
        Image il=iliver.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton liver=new JButton(new ImageIcon(il));
        liver.setToolTipText("LIVER");
        p4.add(liver);
        
        ImageIcon itendon=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\tendon.jpeg");
        Image it=itendon.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton tendon=new JButton(new ImageIcon(it));
        tendon.setToolTipText("TENDON");
        p4.add(tendon);
        
        ImageIcon iskin=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\skin.jpeg");
        Image is=iskin.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton skin=new JButton(new ImageIcon(is));
        skin.setToolTipText("SKIN");
        p4.add(skin);
        
        ImageIcon iintestines=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\intestines.jpeg");
        Image itt=iintestines.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton intestines=new JButton(new ImageIcon(itt));
        intestines.setToolTipText("INTESTINES");
        p4.add(intestines);
        
        ImageIcon iplatelet=new ImageIcon("C:\\Users\\SANOJ\\Desktop\\organ donar\\platelet.jpeg");
        Image ip=iplatelet.getImage().getScaledInstance(195, 120, Image.SCALE_DEFAULT);
        JButton platelet=new JButton(new ImageIcon(ip));
        platelet.setToolTipText("PLATELET");
        p4.add(platelet);
               
        ///////////////////////////////////////////////////////////
        
        JPanel p2=new JPanel();
        p2.setPreferredSize(new Dimension(200, 15));
        p2.setLayout(new GridLayout(1,1));
        JLabel footer=new JLabel("See you again....");
        footer.setOpaque(true);
        footer.setBackground(Color.white);
        p2.add(footer);
        add(p2,"South");
        
        //////////////////////////////////////////////////////////////////////
        
        JPanel p5=new JPanel();
        p5.setLayout(new GridLayout(1,3));
        p5.setPreferredSize(new Dimension(200, 100));
        add(p5,"North");
        
        JLabel hleft=new JLabel();
        hleft.setOpaque(true);
        hleft.setBackground(Color.red);
        p5.add(hleft);
        
        JLabel header=new JLabel("     Organ Donar");
        header.setFont(new Font("Arial",Font.CENTER_BASELINE,70));
        header.setForeground(Color.red);
        header.setOpaque(true);
        header.setBackground(Color.white);
        p5.add(header);
        
        JLabel hright=new JLabel();
        hright.setOpaque(true);
        hright.setBackground(Color.red);
        
        p5.add(hright);
        
        //////////////////////////////////////////////////////
       
    }
    
       public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        
        if(msg.equals("NotePad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){}
        }
        else if(msg.equals("M_Home")){
           // new MembersHome().setVisible(true);
        } 
        else if(msg.equals("Availability")){
            new Availability().setVisible(true);
        } 
        
        else if(msg.equals("Member Details")){
            new MembersDetail().setVisible(true);
        }
        
        else if(msg.equals("View Organ Detail")){
            new OrganDetail().setVisible(true);
        }
        }   

    public static void main(String[] args) {
        
        new MembersHome().setVisible(true);
        
    }
  
}


