
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class DictCSV
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("brit.txt"));
             
             FileOutputStream out=new FileOutputStream("britcsv.txt");
             PrintWriter fout=new PrintWriter(out);
             

             
             StringBuilder arr=new StringBuilder();
             int i=1;

           while(i<79768)           
           {  i++;
               String word=sc.nextLine();
                if(word.length()<5) continue;
                 arr.append("\""+word+"\",");
           }
                
        fout.println(arr.toString());
        fout.close();
        out.close();   
             
      
     }//main
 }//class

    


