
/**
 * Write a description of class FileDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class FileDemo
{
    public static void main(String args[])throws IOException
    {
            File f =new File("INP.in");

        PrintWriter fout=new PrintWriter(f);    
        
        fout.write("Shoubhik Bose\n");
        int i=89;
        fout.println(i);
        fout.flush();
        fout.close();
        
        FileReader fin=new FileReader(f);
        BufferedReader br=new BufferedReader(fin);
        String s=new String();
        s=br.readLine();
        int n=Integer.parseInt(br.readLine());
        

        fin.close();
        
        System.out.println(s+"\n "+n);
        
        
        
    }
}
