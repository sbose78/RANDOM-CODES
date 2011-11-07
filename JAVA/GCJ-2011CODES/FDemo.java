
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class FDemo
{
  public void fill()throws IOException
  {
      
                         
             FileOutputStream out=new FileOutputStream("rohit.txt");
             PrintWriter fout=new PrintWriter(out);
             
             for(int i=0;i<5;i++)
             {
                 fout.println(i+","+"rohit"+","+i*3);
             }
           fout.close();
           out.close();
         
    
     }             
     
     public void search(int r)throws IOException
     {
        
            Scanner sc=new Scanner(new File("rohit.txt"));
            
            String nextRecord="";
            do
            {   nextRecord=sc.nextLine();
                StringTokenizer str=new StringTokenizer(nextRecord,",");
                
                String id=str.nextToken();
                String name=str.nextToken();
                String roll=str.nextToken();
                
                if(r==Integer.parseInt(roll))
                {
                    System.out.println(nextRecord);
                    break;
                }
            }while(nextRecord!=null);
      }        
}//tests   
    




