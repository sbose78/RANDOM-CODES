
/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;
public class Bird
{

    private double H[];
    private double W[];
    private String d[];
   
    private int y,n;
    private int countBirds;
    
    private double min_nH;
    private double min_nW;
    private double max_nW;
    private double max_nH;
    
    double yBH[];
    double yBW[];
    double nBW[];
    double nBH[];
    
    
    private int testCases;
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;
    
   
   
    public void initialise()throws IOException
    {
        y=Integer.parseInt(br.readLine());
        
        System.out.println("y="+y);
        W=new double[y];
        H=new double[y];
        d=new String[y];
    }    
    public void getData(double a[],double b[])throws IOException
    {   countBirds=0;
        String str=new String("BIRD");
       
        for(int i=0;i<y;i++)
        {
            strtok=new StringTokenizer(br.readLine());
            a[i]=Double.parseDouble(strtok.nextToken());
            b[i]=Double.parseDouble(strtok.nextToken()); 
            d[i]=strtok.nextToken();
                
            if(d[i].equals(str)) countBirds++;
        }
        System.out.println("COUNT:"+countBirds);
    }    
    public void sort(double a[],double dim[],String s)
    {
        double arr[]=new double[a.length];
        
        int j=0;
        for(int i=0;i< d.length; i++)
        {
            if(d[i].equals(s)) arr[j++]=dim[i];
        }
        
        for(int i=0;i<arr.length - 1 ;i++){
            for(j=0;j<arr.length -1-i; j++){
                if( arr[j]> arr[j+1])
                {
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=arr[j];
                }
            }
        }       
        a=arr;                 
    }     
    public String[] solve()throws IOException
    {
        initialise();  
        getData(H,W);
        
        
        yBH=new double[countBirds];
        yBW=new double[countBirds];
        nBW=new double[y-countBirds];
        nBH=new double[y-countBirds];
    
        sort(yBH,H,"BIRD");
        sort(yBW,W,"BIRD");
        
        sort(nBH,H,"NOT");
        sort(nBW,W,"NOT");   
                
        n=Integer.parseInt(br.readLine());
        
        System.out.println("N"+n);
        
       int count=1;
       
       String r[]=new String[n] ;
       int i=0;
       while(i<n)
       {
            r[i++]=calculate();
       }
        return r;
    }
    
    public String calculate()throws IOException
    {
             int hflag=0;
             int wflag=0;
                
             min_nH=nBH[0];
             max_nH=nBH[nBH.length-1];
             
             min_nW=nBW[0];
             max_nW=nBW[nBW.length-1];
                 
             strtok=new StringTokenizer(br.readLine());
             
             int h=Integer.parseInt(strtok.nextToken());
             int w=Integer.parseInt(strtok.nextToken());
             
             System.out.println(h+"  "+w);
             
             if(countBirds!=0){
                
                if(h>=yBH[0] && h<=yBH[countBirds-1]) hflag=1;
                //else if(min_nH==max_nH) hflag=2;
                else if( (h> min_nH &&  h<yBH[0]) || (h<max_nH &&  h>yBH[yBH.length-1]))hflag=2;
                else if(  h<= min_nH || h>= max_nH) hflag=0;
             
             
                if(w>=yBW[0] && w<=yBW[yBW.length-1]) wflag=1;
               // else if(min_nW==max_nW) wflag=2;
                else if( (w>min_nW &&  w<yBW[0]) || (w< max_nW &&  w>yBW[yBW.length-1]) ) wflag=2;
                else if(  w<= min_nW || w>= max_nW) wflag=0;
            }
            else hflag=wflag=2;
             
             
             if( hflag==1 && wflag==1) fout.println("BIRD");
             if( hflag == 2 || wflag==2) fout.println("UNKNOWN");
             if(hflag == 0 || wflag==0) fout.println("NOT BIRD");
             
             return "UNKNOWN!!!";
      }
      
      public void controlRoom()throws IOException
    {
       fin=new FileReader("A-large-practice-BIRDS.IN");
       fout=new PrintWriter("RESULT-BIRDS.TXT");
       br=new BufferedReader(fin);
       
      testCases=Integer.parseInt(br.readLine());    // line 1
     // System.out.println(testCases);
      
        
     int cases=1;
     do{
            String result[]=solve();
            printOutput(result,cases);
            cases++;
              
     }while(cases<=testCases);
        
       fin.close();
        
       fout.flush();
       fout.close();
                
    }
     public void printOutput(String r[],int c)throws IOException
     {     
           fout.println("Case #"+c+": ");
           
           for(int i=0;i<r.length;i++)
           {
                fout.println(r[i]);
            }
           
     }
}   