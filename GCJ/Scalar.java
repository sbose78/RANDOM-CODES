import java.io.*;
import java.util.*;

public class Scalar

{
    // instance variables - replace the example below with your own
    private double arr1[];
    private double arr2[];
    private double products[];
    
    private int size;
    private int testCases;
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;
    
   
   
    public void Initialise()
    {
        
        arr1=new double[size];
        arr2=new double[size];
        products=new double[size];
       //sums=new double[size];
       
    }
    
    public void controlRoom()throws IOException
    {
       fin=new FileReader("A-large-practice.IN");
       fout=new PrintWriter("RESULT.TXT");
       br=new BufferedReader(fin);
       
      testCases=Integer.parseInt(br.readLine());    // line 1
     // System.out.println(testCases);
      
      
        
        int cases=1;
        do{
            size=Integer.parseInt(br.readLine());       // AT LINE 2
           // System.out.println(size);
            Initialise();
            
            getData(arr1);
            getData(arr2);
            sort(arr1);
            sort(arr2);
            
            int result=makeMatrix();
                                    //fout.println("CASE #"+cases+":"+result+"\n");
                      
              printOutput(result,cases);
              
              cases++;
              
        }while(cases<=testCases);
        
        fin.close();
        
        fout.flush();
        fout.close();
        
        
       
              
    }
    public void sort(double arr[])
    {

        for(int i=1;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1])
                {
                    double temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public int makeMatrix()
    {
        int sum=0;
        for(int i=0,j=size-1 ; i<size && j>=0 ; i++ , j--)
        {
            products[i]= arr1[i] * arr2[j] ;
            sum+=products[i];
        }
        
        
        return sum;
    }
    public void print(){
        for(int i =0; i<size; i++){
                   System.out.print(arr1[i]+" \t");
        }System.out.println();
        
        
         for(int i =0; i<size; i++){
                   System.out.print(arr2[i]+" \t");
        }System.out.println();
    
    }
    
    public void getData(double arr[])throws IOException{
        
        String s=br.readLine();  
        strtok=new StringTokenizer(s);
        
        
        for( int i=0;i<size ; i++){
            arr[i]=Integer.parseInt(strtok.nextToken());
        }
    }
    
          
    public void printOutput(int r,int c)throws IOException
     {     
           fout.println("Case #"+c+": "+r);
           System.out.println("CASE #"+c+": "+r);
           
        }
    }
