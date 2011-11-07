
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Har
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("C-large.in"));
             
             FileOutputStream out=new FileOutputStream("ophar.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());
             
      for(int tests=1;tests<=t;tests++)                
      {       
            // System.out.println("ENTER");
            //   System.out.println("CASE:--- "+tests);           
             String newline=sc.nextLine();
             StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             
             int n=Integer.parseInt(strtok.nextToken());
             long l=Long.parseLong(strtok.nextToken());
             long h=Long.parseLong(strtok.nextToken());
             
             String notes=sc.nextLine();
             strtok=new StringTokenizer(notes,"\t ");
             long tiles[]=new long[n];
             
             for(int i=0; i<n;i++)
             {
                 tiles[i]=Long.parseLong(strtok.nextToken());
             }
             boolean flag=false;
             long i=l;int j;
             for( i=l;i<=h;i++)
             {
                 for( j=0;j<n;j++)
                 {
                    long div=tiles[j];
                    if(div<i)
                    {
                        if(i%div==0)
                        {   flag=true;

                        }
                        else 
                        {   flag=false;
                            break;  
                        }

                    }    
                    
                    else
                    {
                        if(div%i==0)
                        {   flag=true;

                        }
                        else{                            flag=false;
                            break;    

                        }
                    }
                }
                if(flag==true) break;
            }// i for
            
        
            fout.print("Case #"+tests+": ");

            
            if(flag==true)
            {
                fout.print(i);
            }
            else
                fout.print("NO");
           
                fout.println();
           
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    


