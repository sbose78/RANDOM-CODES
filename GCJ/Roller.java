
/**
 * Write a description of class Roller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class Roller
{

/* rides = r , n= no of groups , k=accomodation */

    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    public static StringTokenizer strtok;
    
    public static void main(String args[])throws IOException
    {   int k,r,n,income,rides=1,sum,start,T;
         
        int i,cases=1;
         String temp;
         
         fin=new FileReader("C-small-attempt0.IN");
         fout=new PrintWriter("RESULT-today.TXT");
         br=new BufferedReader(fin);      
         
         T=Integer.parseInt(br.readLine());
        while(cases<=T)
        {	income=0;sum=0;
            i=0;            
            strtok=new StringTokenizer(br.readLine());
                        
            r=Integer.parseInt(strtok.nextToken());
            k=Integer.parseInt(strtok.nextToken());
            n=Integer.parseInt(strtok.nextToken());
            
            int arr[]=new int[n];

            strtok=new StringTokenizer(br.readLine());
            for(i=0;i<n;i++)
            {	arr[i]=Integer.parseInt(strtok.nextToken());
            }


             while(rides<=r)
             {          sum=0;
                        start=i;

                        for( ; (sum+arr[i])<=k  ;i++)
                        {   sum+=arr[i];
                            if(i>=n-1) i=-1;
                            //printf("\n        SUM=%d",sum);
                            if((i+1)==start){ i++; break;}
                        }
                        rides++;
                        income+=sum;
              }
              fout.println("Case #"+cases+": "+income);
              cases++;
       }
      fin.close();
      fout.flush();
      fout.close();
	//getch();
}
}



