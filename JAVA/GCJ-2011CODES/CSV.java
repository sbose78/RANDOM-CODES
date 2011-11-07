
/**
 * Write a description of class CSV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;
public class CSV
{
    public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("contact_in.txt"));
             
             FileOutputStream out=new FileOutputStream("contacts_csv_out.txt");
             PrintWriter fout=new PrintWriter(out);            

             
             String s="";
             int i=1;

           while(sc.hasNext())
           {   s=sc.next();
                fout.println(s+",");
           }
                
        fout.close();
        out.close();   
             
      
     }//main
}
