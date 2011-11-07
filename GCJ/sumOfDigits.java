
import java.io.*;
import java.util.*;
public class sumOfDigits
{  
    
    private int a[];
    int in;
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    public static StringTokenizer strtok;
    
    public boolean isUnique(int n)
    {
        for(int i=0;i<in;i++) 
        {
            if(a[i]==n) return false;
        }
        return true;
    }
    
    public boolean isHappy(int n,int base)
    {
        a=new int[5000];
        in=0;
        boolean ans=sumOfDigits(n,base);
        return ans;
    }
       
          
   public boolean sumOfDigits(int n,int base)
   {       int sum=n;
           a[in++]=n;     
           do{     
                n=sum;
                sum=0;         
                while(n!=0)
                {                   
                    sum+=Math.pow(n%base,2);
                    n=n/base;
                }
                 //System.out.println("SUM="+sum);
                if(!isUnique(sum))return false;
                a[in++]=sum;
            }while( sum!=1);
            
            return true;
 }
 
    public int trulyHappy()throws IOException
    {
        String str=(br.readLine());
        int i;
        int flag=1;
        for( i=2;i>0;i++)
        {   flag=1;
            strtok=new StringTokenizer(str);    
            while(strtok.hasMoreTokens())
            {   int BASE=Integer.parseInt(strtok.nextToken());
              //   System.out.println("FOR "+i+","+BASE+":"+isHappy(i,BASE));
                if(!isHappy(i,BASE))
                {  
                    flag=0;
                    break;
                }
            }
            if(flag==1)   return i;
        }
        return i;
    }
 
 public void control()throws IOException
 {
     int tests=0;
     
     fin=new FileReader("A-large-happy.in");
     fout=new PrintWriter("RESULT-happy.TXT");
     br=new BufferedReader(fin);            
            
     int cases=Integer.parseInt(br.readLine());
     
     do
     {
        tests++;
        System.out.println("Case #"+tests+": "+trulyHappy());
        fout.println("Case #"+tests+": "+trulyHappy());
    }while(tests<cases);
    
    fout.flush();
    fout.close();
    fin.close();
    
 }
}   


    
     
     
            
     
    
   
 
