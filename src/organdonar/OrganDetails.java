
package organdonar;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;


class OrganDetails extends JFrame implements ActionListener{

    OrganDetails(){
        
        super("Organ Detail");
        setSize(1900,1000);
        
        //////////////////////////////////////////////////
        JMenuBar mb=new JMenuBar();
        
        JMenu a=new JMenu("Home");
        mb.add(a);
        JMenuItem m1=new JMenuItem("Home");
        a.add(m1);
        m1.addActionListener(this);
        
        JMenu x=new JMenu("Register");
        mb.add(x);
        JMenuItem m2=new JMenuItem("Sign up Form");
        x.add(m2);
        m2.addActionListener(this);
        
        JMenu c=new JMenu("Organ Detail");
        mb.add(c);
        JMenuItem m3=new JMenuItem("View Organ Detail");
        c.add(m3);
        m3.addActionListener(this);
        
        JMenu d=new JMenu("Contact-Us");
        mb.add(d);
        JMenuItem m4=new JMenuItem("Contact-Us");
        d.add(m4);
        m4.addActionListener(this);
        
        JMenu e=new JMenu("About-Us");
        mb.add(e);
        JMenuItem m5=new JMenuItem("About-Us");
        e.add(m5);
        m5.addActionListener(this);
      
        setJMenuBar(mb);
       
        //////////////////////////////////////////////////////
        
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
        
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(12,2,10,10));
        p1.setBackground(Color.white);
        ScrollPane sp=new ScrollPane();
        add(sp);
        sp.add(p1);
        
        Image ihhh=iheart.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d1=new JLabel(new ImageIcon(ihhh));
        
        Image ibb=ihand.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d2=new JLabel(new ImageIcon(ibb));
        
        Image ibnn=ibone.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d3=new JLabel(new ImageIcon(ibnn));
        
        Image ibmm=ibMarrow.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d4=new JLabel(new ImageIcon(ibmm));
        
        Image ifaa=iface.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d5=new JLabel(new ImageIcon(ifaa));
        
        Image icc=icornea.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d6=new JLabel(new ImageIcon(icc));
        
        Image ikk=ikidney.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d7=new JLabel(new ImageIcon(ikk));
        
        Image ill=iliver.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d8=new JLabel(new ImageIcon(ill));
        
        Image it2=itendon.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d9=new JLabel(new ImageIcon(it2));
        
        Image iss=iskin.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d10=new JLabel(new ImageIcon(iss));
        
        Image ittt=iintestines.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d11=new JLabel(new ImageIcon(ittt));
        
        Image ipp=iplatelet.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        JLabel d12=new JLabel(new ImageIcon(ipp));
        
        ////////////////////////////////////////////////////////////////////////////
        
        JTextArea a1=new JTextArea("\n\n\n                                                                                         HEART\n" +
"\n" +
"A heart transplant, or a cardiac transplant, is a surgical transplant procedure performed on patients \n" +
"with end-stage heart failure or severe coronary artery disease when other medical or surgical treatments \n" +
"have failed. As of 2018, the most common procedure is to take a functioning heart, with or without \n" +
"transplanting one or both lungs at the same time, from a recently deceased organ donor (brain death \n" +
"is the standard) and implanting it into the patient. The patient's own heart is either removed and replaced\n" +
"with the donor heart (orthotopic procedure) or, much less commonly, the recipient's diseased heart is \n" +
"left in place to support the donor heart (heterotopic, or \"piggyback\", transplant procedure).\n" +
"\n" +
"Approximately 3,500 heart transplants are performed every year in the world, more than half of which \n" +
"occur in the US.Post-operation survival periods average 15 years.Heart transplantation is not considered\n" +
"to be a cure for heart disease but a life-saving treatment intended to improve the quality of life for \n" +
"recipients.");
        a1.setEditable(false);
        a1.setPreferredSize(new Dimension(100, 425));
        a1.setFont(new Font("Arial",Font.PLAIN,16));
        
        JTextArea a2=new JTextArea("\n\n\n                                                                                         HAND\n" +
"\n" +
"Hand transplantation is a surgical procedure to transplant a hand from one human to another. \n" +
"The \"donor\" hand usually comes from a brain-dead donor and is transplanted to a recipient who \n" +
"has lost one or both hands/arms. Most hand transplants to date have been performed on below \n" +
"elbow amputees, although above elbow transplants are gaining popularity. Hand transplants were \n" +
"the first of a new category of transplants where multiple organs are transplanted as a single functional \n" +
"unit, now termed \"Vascularized Composite Allotransplantation\" or VCA.\n" +
"\n" +
"The operation is quite extensive and typically lasts from 8 to 12 hours. By comparison, a typical heart \n" +
"transplant operation lasts 6 to 8 hours. Surgeons usually connect the bones first, followed by tendons,\n" +
"arteries, nerves, veins, and skin.The recipient of a hand transplant needs to take immunosuppressive \n" +
"drugs similar to other transplants such as kidneys or livers, as the body's natural immune system will try \n" +
"to reject, or destroy, the hand. These drugs cause the recipient to have a weaker immune system which \n" +
"may lead to an increased risk of infections and some cancers. There have been many advances in solid \n" +
"organ transplantation over the years that have made these medications quite tolerable.");
        a2.setEditable(false);
        a2.setPreferredSize(new Dimension(100, 425));
        a2.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a3=new JTextArea("\n\n\n                                                                                         BONE\n" +
"\n" +
"Bone grafting is a surgical procedure that replaces missing bone in order to repair bone fractures \n" +
"that are extremely complex, pose a significant health risk to the patient, or fail to heal properly. Some \n" +
"kind of small or acute fractures can be cured but the risk is greater for large fractures like compound \n" +
"fractures.\n" +
"Bone generally has the ability to regenerate completely but requires a very small fracture space or \n" +
"some sort of scaffold to do so. Bone grafts may be autologous (bone harvested from the patient’s \n" +
"own body, often from the iliac crest), allograft (cadaveric bone usually obtained from a bone bank), \n" +
"or synthetic (often made of hydroxyapatite or other naturally occurring and biocompatible substances) \n" +
"with similar mechanical properties to bone. Most bone grafts are expected to be reabsorbed and \n" +
"replaced as the natural bone heals over a few months’ time.\n" +
"The principles involved in successful bone grafts include osteoconduction (guiding the reparative \n" +
"growth of the natural bone), osteoinduction (encouraging undifferentiated cells to become active \n" +
"osteoblasts), and osteogenesis (living bone cells in the graft material contribute to bone remodeling). \n" +
"Osteogenesis only occurs with autograft tissue and allograft cellular bone matrices.");
        a3.setEditable(false);
        a3.setPreferredSize(new Dimension(100, 425));
        a3.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a4=new JTextArea("\n\n\n                                                                                         BONE-MARROW\n" +
"\n" +
"Bone Marrow Transplantation is a peer-reviewed medical journal covering transplantation of bone \n" +
"marrow in humans. It is published monthly by Nature Research. The scope of the journal includes \n" +
"stem cell biology, transplantation immunology, translational research, and clinical results of specific \n" +
"transplant protocols.");
        a4.setEditable(false);
        a4.setPreferredSize(new Dimension(100, 425));
        a4.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a5=new JTextArea("\n\n\n                                                                                         FACE\n" +
"\n" +
"A face transplant is a medical procedure to replace all or part of a person's face using tissue from a \n" +
"donor. The world's first partial face transplant on a living human was carried out in France in 2005. The \n" +
"world's first full face transplant was completed in Spain in 2010.Turkey,France, the United States and \n" +
"Spain (in order of total number of successful face transplants performed) are considered the leading \n" +
"countries in the research into the procedure.");
        a5.setEditable(false);
        a5.setPreferredSize(new Dimension(100, 425));
        a5.setFont(new Font("Arial",Font.PLAIN,16));
        
        JTextArea a6=new JTextArea("\n\n\n                                                                                         CORNEA\n" +
"\n" +
"Corneal transplantation, also known as corneal grafting, is a surgical procedure where a damaged or \n" +
"diseased cornea is replaced by donated corneal tissue (the graft). When the entire cornea is replaced \n" +
"it is known as penetrating keratoplasty and when only part of the cornea is replaced it is known as\n" +
"lamellar keratoplasty. Keratoplasty simply means surgery to the cornea. The graft is taken from a \n" +
"recently dead individual with no known diseases or other factors that may affect the chance of survival \n" +
"of the donated tissue or the health of the recipient.\n" +
"The cornea is the transparent front part of the eye that covers the iris, pupil and anterior chamber. \n" +
"The surgical procedure is performed by ophthalmologists, physicians who specialize in eyes, and is \n" +
"often done on an outpatient basis. Donors can be of any age, as is shown in the case of Janis Babson,\n" +
"who donated her eyes at age 10. The corneal transplantation is performed when medicines, keratoconus\n" +
"conservative surgery and cross-linking cannot heal the cornea anymore.");
        a6.setEditable(false);
        a6.setPreferredSize(new Dimension(100, 425));
        a6.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a7=new JTextArea("\n\n\n                                                                                         KIDNEY\n" +
"\n" +
"Kidney transplantation or renal transplantation is the organ transplant of a kidney into a patient with \n" +
"end-stage renal disease. Kidney transplantation is typically classified as deceased-donor (formerly \n" +
"known as cadaveric) or living-donor transplantation depending on the source of the donor organ.\n" +
"Living-donor renal transplants are further characterized as genetically related (living-related) or \n" +
"non-related (living-unrelated) transplants, depending on whether a biological relationship exists \n" +
"between the donor and recipient.\n" +
"Exchanges and chains are a novel approach to expand the living donor pool. In February 2012, \n" +
"this novel approach to expand the living donor pool resulted in the largest chain in the world, involving \n" +
"60 participants organized by the National Kidney Registry.In 2014 the record for the largest chain was \n" +
"broken again by a swap involving 70 participants.");
        a7.setEditable(false);
        a7.setPreferredSize(new Dimension(100, 425));
        a7.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a8=new JTextArea("\n\n\n                                                                                         LIVER\n" +
"\n" +
"Liver transplantation or hepatic transplantation is the replacement of a diseased liver with the healthy \n" +
"liver from another person (allograft). Liver transplantation is a treatment option for end-stage liver disease\n" +
"and acute liver failure, although availability of donor organs is a major limitation. The most common \n" +
"technique is orthotopic transplantation, in which the native liver is removed and replaced by the donor \n" +
"organ in the same anatomic position as the original liver. The surgical procedure is complex, requiring \n" +
"careful harvest of the donor organ and meticulous implantation into the recipient. Liver transplantation is \n" +
"highly regulated, and only performed at designated transplant medical centers by highly trained transplant\n" +
"physicians and supporting medical team. The duration of the surgery ranges from 4 to 18 hours \n" +
"depending on outcome.[medical citation needed] Favorable outcomes require careful screening for \n" +
"eligible recipient, as well as a well-calibrated live or cadaveric donor match.");
        a8.setEditable(false);
        a8.setPreferredSize(new Dimension(100, 425));
        a8.setFont(new Font("Arial",Font.PLAIN,16));
        
        JTextArea a9=new JTextArea("\n\n\n                                                                                         TENDON\n" +
"\n" +
"A tendon transfer is a surgical process in which the insertion of a tendon is moved, but the origin remains \n" +
"in the same location. Tendon transfer involves redistribution of muscle power, not recreation. Tendons \n" +
"are transferred at the distal attachment from lesser to more important functions so that the overall function\n" +
"is improved. Tendon transfers provide a substitute which can be permanent or temporary, when muscle \n" +
"function is lost either due to nerve injuries or injuries to the muscle/tendon unit. Tendon transfers are also \n" +
"performed to correct the imbalanced muscle tone due to spasticity resulting from injuries to the central \n" +
"nervous system.");
        a9.setEditable(false);
        a9.setPreferredSize(new Dimension(100, 425));
        a9.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a10=new JTextArea("\n\n\n                                                                                         SKIN\n" +
"\n" +
"Skin grafting is a type of graft surgery involving the transplantation of skin. The transplanted tissue is \n" +
"called a skin graft.Skin grafting is often used to treat: Extensive wounding or trauma Burns\n" +
"Areas of extensive skin loss due to infection such as necrotizing fasciitis or purpura fulminans. \n" +
"Specific surgeries that may require skin grafts for healing to occur - most commonly removal of skin \n" +
"cancers Skin grafts are often employed after serious injuries when some of the body's skin is damaged. \n" +
"Surgical removal (excision or debridement) of the damaged skin is followed by skin grafting. The grafting \n" +
"serves two purposes: reduce the course of treatment needed (and time in the hospital), and improve the \n" +
"function and appearance of the area of the body which receives the skin graft.\n" +
"There are two types of skin grafts, the more common type is where a thin layer is removed from a healthy \n" +
"part of the body (the donor section) like peeling a potato, or a full thickness skin graft, which involves \n" +
"pinching and cutting skin away from the donor section. A full thickness skin graft is more risky, in terms \n" +
"of the body accepting the skin, yet it leaves only a scar line on the donor section, similar to a Cesarean \n" +
"section scar. For full thickness skin grafts, the donor section will often heal much more quickly than the \n" +
"injury and is less painful than a partial thickness skin graft.");
        a10.setEditable(false);
        a10.setPreferredSize(new Dimension(100, 425));
        a10.setFont(new Font("Arial",Font.PLAIN,16));
        
        JTextArea a11=new JTextArea("\n\n\n                                                                                         INTESTINE\n" +
"\n" +
"Intestine transplantation, intestinal transplantation, or small bowel transplantation is the surgical \n" +
"replacement of the small intestine for chronic and acute cases of intestinal failure. While intestinal \n" +
"failure can oftentimes be treated with alternative therapies such as parenteral nutrition (PN), \n" +
"complications such as PN-associated liver disease and short bowel syndrome may make transplantation\n" +
"the only viable option. The rarest type of organ transplantation performed, intestine transplantation is \n" +
"becoming increasingly prevalent as a therapeutic option due to improvements in immunosuppressive \n" +
"regiments, surgical technique, PN, and the clinical management of pre and post-transplant patients.");
        a11.setEditable(false);
        a11.setPreferredSize(new Dimension(100, 425));
        a11.setFont(new Font("Arial",Font.PLAIN,16));
        
        
        JTextArea a12=new JTextArea("\n\n\n                                                                                         PLATELETS\n" +
"\n" +
"Platelets are tiny blood cell fragments that help your body form clots to stop bleeding. If one of your \n" +
"blood vessels gets damaged, it sends out signals that are picked up by platelets. The platelets then \n" +
"rush to the site of damage and form a plug, or clot, to repair the damage.\n" +
"\n" +
"Low platelet level can have causes that aren't due to underlying disease. Examples include pregnancy,\n" +
" altitude or medication side effects.");
        a12.setEditable(false);
        a12.setPreferredSize(new Dimension(100, 425));
        a12.setFont(new Font("Arial",Font.PLAIN,16));
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        p1.add(d1);
        p1.add(a1);
        p1.add(d2);
        p1.add(a2);
        p1.add(d3);
        p1.add(a3);
        p1.add(d4);
        p1.add(a4);
        p1.add(d5);
        p1.add(a5);
        p1.add(d6);
        p1.add(a6);
        p1.add(d7);
        p1.add(a7);
        p1.add(d8);
        p1.add(a8);
        p1.add(d9);
        p1.add(a9);
        p1.add(d10);
        p1.add(a10);
        p1.add(d11);
        p1.add(a11);
        p1.add(d12);
        p1.add(a12);
        
      
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        
        if(msg.equals("About-Us")){
            new About_us().setVisible(true);
          
        }
        else if(msg.equals("Contact-Us")){
            new Contact_us().setVisible(true);
        } 
        else if(msg.equals("Sign up Form")){
            new SignupForm().setVisible(true);
        }
        else if(msg.equals("Home")){
            new Home().setVisible(true);
        }
        
        else if(msg.equals("View Organ Detail")){
            //new OrganDetails().setVisible(true);
        }
        }   
    
    public static void main(String[] args) {
        
        new OrganDetails().setVisible(true);
        
    }

   
    
}




