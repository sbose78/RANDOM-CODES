
/**
 * Write a description of class MouseTrap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;
public class MouseTrap
{

    private int size;    
    private int testCases;
    int k;
    
    private int deck[];
    private int sorted[];
    private int solution[];
    
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    public static StringTokenizer strtok;
    
    public MouseTrap()
    {
    }
    
    public void initialise(){
        deck=new int[size];
        sorted=new int[size];
        solution=new int[size];
    }
    
    public void sort(int arr[])
    {
        for(int i=1;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public void fillSolution()
    {

        int start_index = (sorted[0] % size)-1;
        
        if(start_index <0) start_index = size-1;
        solution[ start_index ] = sorted[0];
        
        System.out.println("START INDEX: " + start_index);
        
        int i=1 ;  // counter for sorted array 
        int j=start_index; // counter to fill solution array
        int counter=0; 
        
        do{
            
            while(counter != sorted[i])
            {
              //  System.out.println("j = "+ j );
                j++;
                if(j >= size) j=0;
                if(solution[j]==0 )counter++;
            }
            counter=0;
          //  System.out.println("INSERTED "+ sorted[i] );
            solution[j]=sorted[i];
            i++;
        }while(i<size);
    }
    
    public void printSolution()
    {
        for(int i=0;i<size; i++ )
        {
            fout.print(solution[i]+" ");
        }fout.println();
     }
     public void getData()throws IOException
     {            
        
         
        // System.out.println("ENTER NO. OF CARDS: ");
             
       //  initialise();
         
//         System.out.println("ENTER data: ");
         
         strtok=new StringTokenizer(br.readLine());
         String s=new String();
         size= Integer.parseInt(strtok.nextToken());
         initialise();
                 
         for(int i=0;i<size;i++)
         {
           //  System.out.println("CARD #"+(i+1)+": ");
              s=strtok.nextToken();
              deck[i] = Integer.parseInt(s);
           //  System.out.println(deck[i]);
         }
         
     }   
     
     public void controlRoom()throws IOException
     {
       fin=new FileReader("C-large-practice.in");
       fout=new PrintWriter("RESULT_MT_LARGE.TXT");
       br=new BufferedReader(fin);
       
      testCases=Integer.parseInt(br.readLine());    // line 1
     // System.out.println(testCases);
      
       int cases=1;
       do{

           
           k=Integer.parseInt(br.readLine());       // AT LINE 2
           
            System.out.println(size);
           
            
            getData();
            sorted=deck;
            sort(sorted);
            fillSolution();
            
            fout.print("Case #"+cases+": ");
            printSolution();
        
            cases++;
              
        }while(cases <= testCases);
        
        fin.close();
        
        fout.flush();
        fout.close();
             
     }
               
}
