
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Candy
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("C-large.in"));
             
             FileOutputStream out=new FileOutputStream("opcandy3333333333.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());

             
             for(int tests=1;tests<=t;tests++)                
             {       
            // System.out.println("ENTER");
                          
            
                int n=Integer.parseInt(sc.nextLine());
             
                String newline=sc.nextLine();
                StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             
                long arr[]=new long[n];
                for(int i=0;i<n;i++)
                {
                    arr[i]=Integer.parseInt(strtok.nextToken());
                }
                
                long sum=arr[0];
                
                for(int i=1;i<n;i++)
                {
                     sum=sum^arr[i];
                }
             
                boolean pos=true;
                if(sum!=0)
                {   pos=false;                    
                }
                
                sum=0;
                int min=0;
                
                for(int i=0;i<n;i++)
                {
                    if(arr[i]<arr[min]) min=i;
                }
                
                for(int i=0;i<n;i++)
                {
                    if(i!=min)     sum+=arr[i];
                }
                
                if(!pos)
                {
                    fout.println("Case #"+tests+": "+"NO");
                }
                else
                {
                    fout.println("Case #"+tests+": "+sum);
                }
                  
            
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    


