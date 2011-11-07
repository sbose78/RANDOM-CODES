
/**
 * Write a description of class Magician here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;
public class Magician
{
    // instance variables - replace the example below with your own
    private double black;
    private double white ;
    
    private int size;
    private int testCases;
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;
    
   
   
    public void initialise()
    {
       
    }
    
    public void controlRoom()throws IOException
    {
       
        fin=new FileReader("A-small-practice-MAGICIAN.IN");
       fout=new PrintWriter("RESULT-small-MAGICIAN.TXT");
       br=new BufferedReader(fin);
        
       initialise(); 
       
      testCases=Integer.parseInt(br.readLine());    // line 1
            
        int cases=1;
        do{
            String result=solve();
            printOutput(result,cases);
            cases++;
              
        }while(cases<=testCases);
        
        fin.close();
        
        fout.flush();
        fout.close();
                
    }
    /*
   public void print(){
        for(int i =0; i<size; i++){
                   System.out.print(arr1[i]+" \t");
        }System.out.println();
        
        
         for(int i =0; i<size; i++){
                   System.out.print(arr2[i]+" \t");
        }System.out.println();
    
    }*/
    
    public void getData()throws IOException{
        
        String s=br.readLine();  
        strtok=new StringTokenizer(s);
        
        white=Integer.parseInt(strtok.nextToken());
        black=Integer.parseInt(strtok.nextToken());        
    }
    
    public String calculate(){
            if(black != 0)
            {
                white=0;
                
                if(black %2 == 0) return "WHITE";
                else              return "BLACK";
            }
            return "WHITE";
     }
     
     public String solve()throws IOException{
         getData();
         return calculate();
     }
                   
          
    public void printOutput(String r,int c)throws IOException
     {     
           fout.println("Case #"+c+": "+r);
           System.out.println("CASE #"+c+": "+r);
           
        }
}


