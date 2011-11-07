 
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class info implements Serializable
{
    String uid,pass;
	info(String a1,String a2)
    {
    
		uid = a1;
		pass = a2;
    }
}
      
class Bookinfo implements Serializable
{
    String bkisno,title,autherna;
	Bookinfo(String a7,String a8,String a9)
    {
    
                                       bkisno =a7;
                                       title=a8;
                                       autherna=a9;
                                   
    }
}  

   class Stdinfo implements Serializable
{
    String name,id,addr;
	Stdinfo(String a3,String a4,String a5)
    {
    
                                      name=a3;
                                       id=a4;
                                       addr=a5;
                                      // ph.no=a6;
    }
}  

   class User 
{
                      JPanel p1,p3,p4,p5,p6,p7,p8,p9,p11,p12,p13,p14,p15;
	 JTextField t1,t3,t4,t5,t6,t7,t8;
 	 JPasswordField t2;
	 ArrayList a1 = new ArrayList();
	 String fileLocation="E:/a.txt";
         JFrame frame;
	 File f;
              
                      public static void main(String[] args) 
   {
         new User();
    }
	 
	public User() 
    {


         frame  = new JFrame("WELCOME TO LIBRARY MANAGEMENT_system");
         frame.setLayout(new FlowLayout()); 

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //setSize(100,100);
         frame.setLayout(new FlowLayout());
        
         
         JButton b1 = new JButton("Save arrayList");
         b1.addActionListener(new Action(this));
         
         JButton b2 = new JButton("Save File");
         b2.addActionListener(new FileSave(this));
         
 
         JButton b3=new JButton("Administrative");
         b3.addActionListener(new Admin(this));
         
         JButton b10=new JButton("CHECK");
         b10.addActionListener(new Match(this));

         JButton b4=new JButton("controller");
         b4.addActionListener(new Admin(this));
         
         JButton b5 = new JButton("ADD_student");
         b5.addActionListener(new Addstd(this));

         JButton b15=new JButton("SAVE STUDENT DATA");
         b15.addActionListener(new Savestud(this));
         
        /* JButton b6 = new JButton("REMOVE_student");
         b6.addActionListener(new FileSave(this));*/
        
         JButton b7 = new JButton("ADD_NEW_BOOK");
         b7.addActionListener(new Booksav(this));
 
         JButton b8 = new JButton("SEARCH_book");
         b8.addActionListener(new Matchbook(this));
         
         /*JButton b9 = new JButton("REMOVE_book");
         b9.addActionListener(new FileSave(this));*/
         
       

         JButton b11 = new JButton("REGARDING_student");
         b11.addActionListener(new Regstdu(this));

         JButton b12 = new JButton("REGARDING_book");
         b12.addActionListener(new Regsbook(this));

         JButton b13 = new JButton("LOg_in");
         b13.addActionListener(new Login(this));

         JButton b14 = new JButton("SEARCH_student");
         b14.addActionListener(new Matchstd(this));
         
       
         JLabel l1 = new JLabel("UID");
         t1 = new JTextField(20);
         
         
         JLabel l2 = new JLabel("PASS");
         t2 = new JPasswordField(20);
         t2.setEchoChar('*');

         JLabel l3=new JLabel("student_name");
          t3=new JTextField(20);
        
         JLabel l4=new JLabel("student_ID"); 
         t4=new JTextField(20); 

         JLabel l5=new JLabel("student_Address");
          t5=new JTextField(100);
          
         JLabel l6=new JLabel("Enter_Book_ISBN");        
         t6=new JTextField(20); 
         
         JLabel l7=new JLabel("BOOK_title");
          t7=new JTextField(40);
         
         
         JLabel l8=new JLabel("Author_name");
          t8=new JTextField(35);

         p1=new JPanel();
         p3=new JPanel();
         p4=new JPanel();
         p5=new JPanel();
         p6=new JPanel();
         p7=new JPanel();
         p8=new JPanel();
         p9=new JPanel();
         p11=new JPanel();
         p12=new JPanel();
         p13=new JPanel();
         p14=new JPanel();
         p15=new JPanel();




          p1.add(b3);
          p1.add(b4);
          frame.add(p1);

          p3.add(l1);
          p3.add(t1);
          p3.setVisible(false);
          frame.add(p3);

          p4.add(l2);
          p4.add(t2);
          p4.setVisible(false);
          frame.add(p4);
      

          p5.add(b1);
          p5.add(b2);
          p5.add(b10);
          
          p5.setVisible(false);
          frame.add(p5);

          p6.add(b11);
          p6.add(b12);
          p6.setVisible(false);
          frame.add(p6);

          p7.add(l3);
          p7.add(t3);
          p7.setVisible(false);
          frame.add(p7);

          p8.add(l4); 
          p8.add(t4); 
          p8.setVisible(false);
          frame.add(p8);

          p9.add(l5); 
          p9.add(t5); 
          p9.setVisible(false);
          frame.add(p9);

          p11.add(l6); 
          p11.add(t6); 
          p11.setVisible(false);
          frame.add(p11);

          p12.add(l8); 
          p12.add(t8); 
          p12.setVisible(false);
          frame.add(p12);

          p13.add(b13); 
          p13.setVisible(false);
          frame.add(p13);

         p14.add(b5);
         p14.add(b15); 
         p14.add(b14); 
         p14.setVisible(false);
         frame.add(p14);

          p15.add(b7);
          p15.add(b8);
          //p15.add(b9);
          p15.setVisible(false);
          frame.add(p15);

        // Pack();
         frame.setSize(300, 200);
         frame.setVisible(true);
         
        f = new File(fileLocation);
        frame.setSize(300, 200);
        frame.setVisible(true);
   }


}

class Action implements ActionListener
{
	 User obj;
	
	 
	 Action(User x)
	 {
		 obj = x;
		 
	 }
	 public void actionPerformed(ActionEvent e) 
     {
		 try
		 {
			 FileInputStream fin=new FileInputStream(obj.f);
	 	     ObjectInputStream ois=new ObjectInputStream(fin);
	         obj.a1 =(ArrayList)ois.readObject();
		 }catch(Exception e1){System.out.print(e1);}
	
    obj.a1.add(new info(obj.t1.getText(),obj.t2.getText()));
	        obj.t1.setText("");
	        obj.t2.setText("");
                }
		
		 
     }


class FileSave implements ActionListener
{
	 User obj;
	 
	 FileSave(User x)
	 {
		 obj = x;
		 
	 }
	 public void actionPerformed(ActionEvent e) 
     {
		try
		{
		 FileOutputStream fout=new FileOutputStream(obj.f);
	     ObjectOutputStream oos=new ObjectOutputStream(fout);
	     oos.writeObject(obj.a1);
	     
	     fout.close();
	     oos.close();
		}catch(Exception e1){}
     }
}


 class Admin implements ActionListener
{
	 User obj;
	 
	 Admin(User x)
	 {
		 obj = x;
         }
	 
	 public void actionPerformed(ActionEvent e) 
     {
		         obj.p1.setVisible(false);
                         obj.p3.setVisible(true);
                         obj.p4.setVisible(true);
                         obj.p13.setVisible(true);
                         obj.p5.setVisible(true);
     }
}
class Match implements ActionListener
{
	 User obj;
	 
	 Match(User x)
	 {
		 obj = x;
     }
	 
	 public void actionPerformed(ActionEvent e) 
     {
		try
		{
	 		 FileInputStream fin=new FileInputStream(obj.f);
	 	     ObjectInputStream ois=new ObjectInputStream(fin);
             obj.a1 =(ArrayList)ois.readObject();
	     
             String s1 = obj.t1.getText();    
             String s2 = obj.t2.getText();
             
             int size=obj.a1.size();
             int f1=0;

             for(int i=0;i<size;i++)
             {
               info r=(info)obj.a1.get(i);
               if (r.uid.equals(s1)&& r.pass.equals(s2))
               {
            	                                          JOptionPane.showMessageDialog(null,"VALID","Welcome",JOptionPane.QUESTION_MESSAGE);
            	   f1 = 1;
               }
             }
             
             if(f1 == 0)
             {
            	 JOptionPane.showMessageDialog(null,"ALREADYEXIT","Welcome",JOptionPane.QUESTION_MESSAGE);
             }
             
             fin.close();
	         ois.close();
		}catch(Exception e1){}
     }
}
   class Login implements ActionListener
{
            User obj;
	 
	 Login(User x)
	 {
		 obj = x;
         }


                  public void actionPerformed(ActionEvent e) 
                 {

                          
            	    obj.p6.setVisible(true);
            	    obj.p3.setVisible(false);
            	    obj.p13.setVisible(false);
            	    obj.p5.setVisible(false);
            	    obj.p4.setVisible(false);
            	  }

}
 


     class Regstdu  implements ActionListener
{
	 User obj;
	 
	 Regstdu(User x)
	 {
		 obj = x;
         }
	 
	 public void actionPerformed(ActionEvent e) 
     {
                         obj.p7.setVisible(true);
                         obj.p8.setVisible(true);
                         obj.p9.setVisible(true);
                         obj.p14.setVisible(true);
                         obj.p6.setVisible(false);
     }
}
    


class Addstd implements ActionListener
{
	 User obj1;
	
	 
	 Addstd(User x)
	 {
		 obj1 = x;
		 
	 }
	 public void actionPerformed(ActionEvent e) 
     {
		 try
		 {
		 FileInputStream fin=new FileInputStream(obj1.f);
	         ObjectInputStream ois=new ObjectInputStream(fin);
	         obj1.a1 =(ArrayList)ois.readObject();
		 }catch(Exception e1){System.out.print(e1);}
		  
	    obj1.a1.add(new Stdinfo(obj1.t3.getText(),obj1.t4.getText(),obj1.t5.getText()));
	        obj1.t3.setText("");
	        obj1.t4.setText("");
		obj1.t5.setText("");
}
}

               
           

class Savestud implements ActionListener
{
	 User obj1;
	 
	 Savestud(User x)
	 {
		 obj1 = x;
		 
	 }
	 public void actionPerformed(ActionEvent e) 
     {
		try
		{
		 FileOutputStream fout=new FileOutputStream(obj1.f);
	     ObjectOutputStream oos=new ObjectOutputStream(fout);
	     oos.writeObject(obj1.a1);
	     
	     fout.close();
	     oos.close();
		}catch(Exception e1){}
     }
}

class Matchstd implements ActionListener
{
	 User obj1;
	 
	 Matchstd(User x)
	 {
		 obj1 = x;
     }
	 
	 public void actionPerformed(ActionEvent e) 
     {
		try
		{
	 		 FileInputStream fin=new FileInputStream(obj1.f);
	 	     ObjectInputStream ois=new ObjectInputStream(fin);
             obj1.a1 =(ArrayList)ois.readObject();
	     
             String s3 = obj1.t3.getText();    
             String s4 = obj1.t4.getText();
             String s5 = obj1.t5.getText();
             int size=obj1.a1.size();
             int f6=0;

             for(int i=0;i<size;i++)
             {
                 Stdinfo r2=(Stdinfo)obj1.a1.get(i);
          if (r2.name.equals(s3)&&r2.id.equals(s4)&&r2.addr.equals(s5))
               {
            	   JOptionPane.showMessageDialog(null,"FOUND","Welcome",JOptionPane.QUESTION_MESSAGE);
            	   f6 = 1;
               }
             }
             
             if(f6 == 0)
             {
            	 JOptionPane.showMessageDialog(null,"NOT FOUND","Welcome",JOptionPane.QUESTION_MESSAGE);
             }
             
             fin.close();
	         ois.close();
		}catch(Exception e1){}
     }
}





     class Regsbook  implements ActionListener
{
	 User obj;
	 
	 Regsbook(User x)
	 {
		 obj = x;
     }
	 
	 public void actionPerformed(ActionEvent e) 
     {
                         obj.p11.setVisible(true);
                         obj.p12.setVisible(true);
                         obj.p13.setVisible(true);
                         obj.p15.setVisible(true);
                         obj.p6.setVisible(false);
}
}
class Booksav implements ActionListener
{
	 User obj;
	
	 
	 Booksav(User x)
	 {
		 obj = x;
		 
	 }
	 public void actionPerformed(ActionEvent e) 
     {
		 try
		 {
			 FileInputStream fin=new FileInputStream(obj.f);
	 	     ObjectInputStream ois=new ObjectInputStream(fin);
	         obj.a1 =(ArrayList)ois.readObject();
		 }catch(Exception e1){System.out.print(e1);}
		int size=obj.a1.size();   
               int f4=0;

             for(int i=0;i<size;i++)
             {
              Bookinfo r2=(Bookinfo)obj.a1.get(i);
               if (r2.bkisno.equals(obj.t3.getText())&& r2.title.equals(obj.t4.getText()))
               {
            	   JOptionPane.showMessageDialog(null,"ALREADYEXIT","Welcome",JOptionPane.QUESTION_MESSAGE);
            	   f4= 1;
               }
             } 
              if(f4==0)
                {
		    obj.a1.add(new Bookinfo(obj.t6.getText(),obj.t7.getText(),obj.t8.getText()));
	                        obj.t6.setText("");
	                        obj.t7.setText("");
                            obj.t8.setText("");
                }
		
		 
     }
}

class Matchbook implements ActionListener
{
	 User obj;
	 
	 Matchbook(User x)
	 {
		 obj = x;
     }
	 
	 public void actionPerformed(ActionEvent e) 
     {
		try
		{
	 		 FileInputStream fin=new FileInputStream(obj.f);
	 	     ObjectInputStream ois=new ObjectInputStream(fin);
             obj.a1 =(ArrayList)ois.readObject();
	     
             String s1 = obj.t6.getText();    
             String s2 = obj.t7.getText();
             
             int size=obj.a1.size();
             int f5=0;

             for(int i=0;i<size;i++)
             {
                Bookinfo r2=( Bookinfo)obj.a1.get(i);
               if (r2.bkisno.equals(s1)&& r2.title.equals(s2))
               {
            	   JOptionPane.showMessageDialog(null,"ALREADYEXIT","Welcome",JOptionPane.QUESTION_MESSAGE);
            	   f5 = 1;
               }
             }
             
             if(f5 == 0)
             {
            	 JOptionPane.showMessageDialog(null,"ALREADYEXIT","Welcome",JOptionPane.QUESTION_MESSAGE);;
             }
             
             fin.close();
	         ois.close();
		}catch(Exception e1){}
     }
}


