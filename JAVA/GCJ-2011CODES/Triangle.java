
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;
public class Triangle
{

    public static int primes[];
    public static int num_primes;

    public static int nextPrime(int n,int limit)
    {   boolean flag=true;
        int num=n+1;
        for(int i=n+1;i<=limit;i++)
        {

            flag=true;
            
            //finding out if its a prime
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {   flag=false;
                    break;
                }
            }
            if(flag==true)
            {
                  return i;
            }
        }
        return -1;
    }
    public static boolean isPrime(int n)
    {
        boolean flag=true;
        if(n==2||n==3) return true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
           }
        }
        if(flag)
        {
            return true;
        }
        return false;
    }

    public static int countFacts(int n)
    {   int count=0;
        int final_count=1;
         int m=n;
         
         
        for(int i=2;i<=n/2  ;i++)
        {
            // GENERATING PRIME NUMBERS.
            count=0;
            if(isPrime(i) && n%i==0)
            {
                           
            //   System.out.println("FOUND PRIME FACT:"+i);
               
               // COUNTING LOGIC STARTS HERE.
                while(m%i==0)
                {
                    count++;
                    m/=i;
                   // System.out.println(i+"----"+count);
                }
                count++;
                final_count*=count;

                if(isPrime(m) && m!=1)
                {
                  //  System.out.println("FINAL PRIME FACTORIAL: "+m);
                    final_count*=2;
                           // System.out.println("NO OF FACTORS FOR N="+n+"is   "+final_count);
                    return final_count;
                }
                
            }
        }
      //  System.out.println("NO OF FACTORS FOR N="+n+"is   "+final_count);
        return count;
    }
    
    public static int getPrime(int index,int n)
    {
        if(index<num_primes)
        {
            return primes[index];
        }
        int last_prime=primes[num_primes-1];
        primes[num_primes++]=nextPrime(last_prime,n); 
        
        return primes[num_primes-1];       
    }
    
     public static int countFacts2(int n)
    {   int count=0;
        int final_count=1;
         int m=n;
         
         int i=0;
         
         int nextp=getPrime(i++,n);
         
         while(nextp<=n/2)
         {
            count=0;
            if(n%nextp==0)
            {
                while(m%nextp==0)
                {
                    count++;
                    m/=nextp;
                }
                count++;
                final_count*=count;

                if(isPrime(m) && m!=1)
                {
                  //  System.out.println("FINAL PRIME FACTORIAL: "+m);
                    final_count*=2;
                      System.out.println("NO OF FACTORS FOR N="+n+"is   "+final_count);
                    return final_count;
                }
                
            }
            nextp=getPrime(i++,n);
        }
        System.out.println("NO OF FACTORS FOR N="+n+"is   "+final_count);
        return count;
    }
    

    
   public static void main(String args[])throws IOException
   {
         Scanner scf=new Scanner(new File("ipeuler.txt"));
         FileOutputStream out=new FileOutputStream("opeuler.txt");
         PrintWriter fout=new PrintWriter(out);
         
       
       
      primes=new int[60000];
      primes[0]=2;primes[1]=3;num_primes=2;
      
       
       int n=2;
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE NUMBER: ");
        n=scf.nextInt();
        
        int t=3,i=2;
        

       // while(countFacts(t) <= n )
        do{
            i++;
            t+=(i);
            System.out.println("FOR... "+t);
        }while(countFacts2(t) < n )       ;
       
       System.out.println("SOLUTION:"+(t));
       fout.println(t);
       fout.close();
    }
}
