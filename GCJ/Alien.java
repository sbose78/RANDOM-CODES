

import java.io.*;
import java.util.*;
public class Alien
{


    private String words[];
    private String test[];
    
    int D; // NO OF WORDS
    int L;// NO OF LETTERS
    
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    public static StringTokenizer strtok;
  

    int cases;
    
    public void initialise()throws IOException
    {
       
         test=new String[L];
        
    }
    
    public void getWords()throws IOException
    {   
        for(int i=0;i<D; i++)     words[i]=br.readLine();               
    }
    
    public void getTestCase()throws IOException
    {
         initialise();
        String temp=br.readLine();
        char temp_test[]=new char[50];
        int k=0;
        
        for(int i=0;i<temp.length();i++)
        {
            
            if(temp.charAt(i)=='(')
            {   
                int j=0;
                
                while(temp.charAt(i+1)!=')')
                {   
                    temp_test[j++]=temp.charAt(++i);
                    
                }i++;
                String s=new String(temp_test,0,j);
                test[k++]=s;
            }
            
            else  test[k++]=Character.toString(temp.charAt(i));
            
        }
    }
       
            
    public int countWords()
    {
        int count=0;
        String tempW,tempT;
        for(int i=0;i<D; i++)
        {       tempW=words[i];
                            
                int flag=1;
                for(int k=0;k<L;k++)
                {   tempT=test[k];
                    if(!isFound(tempW.charAt(k),tempT))flag=0; // scannig each given word
                }
                if(flag==1) count++;
         }
         
         return count;
    }
    
    public boolean isFound(char actual,String undeci) //t = undeciphered
    {   String temp=new String();
        
        for(int i=0;i<undeci.length();i++)
        {  
            if(actual== undeci.charAt(i)) return true;
        }
        return false;
    }
    
    void print(int r,int c)
    {  
        fout.println("Case #"+c+": "+r);
        
    }
    
    int solve()throws IOException
    {
        
       
        getTestCase();
        return countWords();
    }
        
    void controlRoom()throws IOException
    {
         fin=new FileReader("A-large-practice -ALIEN.IN");
         fout=new PrintWriter("RESULT-LARGE-Aliens.TXT");
         br=new BufferedReader(fin);      
         
         strtok=new StringTokenizer(br.readLine());
         
         L=Integer.parseInt(strtok.nextToken());
         D=Integer.parseInt(strtok.nextToken());
         cases=Integer.parseInt(strtok.nextToken());
         
         words=new String[D];
         getWords();
         
         int count=1;
         do{

             print(solve(),count);
             count++;
            }while(count<=cases);
        
        fin.close();
        fout.flush();
        fout.close();
    }
        
}
