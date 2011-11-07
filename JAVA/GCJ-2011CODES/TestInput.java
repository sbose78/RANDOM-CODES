

import java.util.*;
import java.io.*;
public class TestInput
{
   public static void main(String args[])throws IOException
   {
       Scanner sc=new Scanner(new File("Welcome.java"));
      
      
        FileOutputStream out=new FileOutputStream("op.txt");
        PrintWriter pw=new PrintWriter(out);
        
        while(sc.hasNext())
        {
            String s=sc.nextLine();
            pw.println(s);
            
        }
        
        out.flush();
        pw.close(); 
        out.close();
       
    }
    
    
}
