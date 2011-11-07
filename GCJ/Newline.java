
/**
 * Write a description of class Newline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;

public class Newline
{
  public static void main(String args[])throws IOException{
      
      InputStreamReader ir=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(ir);
      
      String str=new String();
      String processed=new String();
      processed="<br>";
      System.out.println("ENTER A STRING");
      str=br.readLine();
      
      StringTokenizer strtok=new StringTokenizer(str," ");
      while(strtok.hasMoreTokens())
      {
           String s=strtok.nextToken();
           processed+=s;
           processed+="<br>";
        }
        
        System.out.println(processed);
           
     
    }
}
