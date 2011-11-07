
/**
 * Write a description of class test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class test1
{
   public static void main(String args[])throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.flush();
       System.out.println("ENTER 3 NOS.: ");
       
       String s=br.readLine();
       
       int arr[]=new int[13];
       
       int j=0;
       char c[]= s.toCharArray();
       int flag=0;
       int start=0;
       int end=0;
       
       for(int i=0; i<s.length(); i++)
       {
           if(Character.isDigit( s.charAt(i) )  )
           {   
               if(flag==0){start=i; flag=1;}
               end=i;
            }     
            else if(Character.isDigit( s.charAt(i-1) ) && Character.isWhitespace( s.charAt(i) )  )
            {
                     String num=new String(c,start, end-start +1);
                     arr[j++]=Integer.parseInt(num);
                     flag=0;
                
            }
             if(flag==1 && i== s.length()-1){
                     String num=new String(c,start, end-start +1);
                     arr[j++]=Integer.parseInt(num);
                     flag=0;
                    }
        }
      System.out.println(arr[0]+"  "+arr[1]+"  "+arr[2]);
    }
}
