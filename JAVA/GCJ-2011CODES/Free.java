
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Free
{


    public static long gcd(long a, long b){
        long r=a%b;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("A-small-practice.in"));
             
             FileOutputStream out=new FileOutputStream("opfree.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());
             
      for(int tests=1;tests<=t;tests++)                
      {       
            // System.out.println("ENTER");
                          
             String newline=sc.nextLine();
             StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             
             long n,pd,pg;
             n=Long.parseLong(strtok.nextToken());
             pd=Long.parseLong(strtok.nextToken());
             pg=Long.parseLong(strtok.nextToken());
             long n1=0,n2=0;
            
             
             if((pd==0 && pg<100))
                   fout.println("Case 1ST PART #"+tests+": "+"Possible");                                      
            else if(pd!=0 && pg!=0)
            {     n1=100/gcd(100,pd);
                
                 if(n1<=n && pg<=pd)
                      fout.println("Case 2ND PART #"+tests+": "+"Possible");
                 else 
                    fout.println("Case2ND PART #"+tests+": "+"Broken");
              }
              else{
                     fout.println("Case 3RD PART #"+tests+": "+"Broken");
               }                                      
                  
         
   /*               
             if(pg!=0)
                n2=100/gcd(100,pg);
             
                if(pg==0 && pd!=0)
                    fout.println("Case #"+tests+": "+"Broken");
                else if(pg==0 && pd==0 && n1<=n)
                     fout.println("Case #"+tests+": "+"Possible");
                
             else if(n1<=n2  && n1<=n )
             {
                fout.println("Case #"+tests+": "+"Possible");
             }
             else{
                 fout.println("Case #"+tests+": "+"Broken");
              }
            
           
           
           
           
           float x=((float)pd/100)*n;
           if( (x - (int)x) == 0  ){
               if(pg<=pd)
                     fout.println("Case #"+tests+": "+"Possible");
                else
                     fout.println("Case #"+tests+": "+"Broken");
          }
          else
                                fout.println("Case #"+tests+": "+"Broken");         
           
        */
           
           
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    

