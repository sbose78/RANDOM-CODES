import java.io.*;
import java.util.*;

public class SMS
{
    
    private int cases;
    
   
    private double presses;
    private int index;
    
    private int max_letters;
    private int keys;
     private int size; // size= number of letters
    
    private int frequency[];
    private int keypad[];
    
    
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;
    
    public SMS()
    {
      
    }

    public void initialise()
    {   index=0;
        presses=0;
        frequency=new int[this.size=size];
        keypad=new int[this.max_letters=max_letters];
    }

    public void sort(int arr[])
    {

        for(int i=1;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    public void calculatePresses(){
        sort(frequency);
        for(int i=0; i<size; i++){
            if(keypad[index]< keys ){

                presses += ((double)frequency[i] * (index+1));
            }
            else {
                    index++;
                     presses += frequency[i] * (index+1);
             }  
             
                             keypad[index]++;
        }
    }
         
    public void getData()throws IOException{
        
        strtok=new StringTokenizer(br.readLine());
        for(int i=0;i<size ;i++){
            frequency[i]=Integer.parseInt(strtok.nextToken());
        }
        
    }
    
    public void controlRoom()throws IOException{
       fin=new FileReader("A-large-practice-SMS.in");
       fout=new PrintWriter("RESULT-SMS-LARGE.TXT");
       br=new BufferedReader(fin);
        
       cases=Integer.parseInt(br.readLine());
       
        //System.out.println("ENTER MAX LETTERS:");
        int count=0;
       
        do{
            
                     count++;
             strtok=new StringTokenizer(br.readLine());
            max_letters=Integer.parseInt(strtok.nextToken());  
         
//         System.out.println("ENTER no.of KEYS:");
              keys=Integer.parseInt(strtok.nextToken());  
         
    //     System.out.println("ENTER NO.OF LETTERS:");
               size=Integer.parseInt(strtok.nextToken());  
         
               initialise();
         
//         System.out.println("ENTER FREQUENCY OF LETTERS:");
                getData();
         
                calculatePresses();
                fout.println("Case #"+count+": " +(long)presses);
                
       
                
        }while( count<cases);
        
        fin.close();
        fout.flush();
        fout.close();
    }
}