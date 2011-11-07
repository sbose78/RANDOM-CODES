import java.util.*;
import java.io.*;
public class Drainage
{

    int min_r;
    int min_c;
    
    int r2,r1,c1,c2,rows,cols,min;
    
    char c;
    
    char result[][];
    int arr[][];
    
    
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;
    
    
    void getData()throws IOException
    {
        System.out.println("ENTER NO. OF ROWS and COLS:");
        
        strtok=new StringTokenizer(br.readLine());
        
        rows=Integer.parseInt(strtok.nextToken());
        cols=Integer.parseInt(strtok.nextToken());
     
        arr=new int[rows][cols];
        result=new char[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            System.out.println("ENTER data FOR ROW "+(i+1)+": ");
            strtok=new StringTokenizer(br.readLine());
            for(int j=0;j<cols;j++){            
                arr[i][j]=Integer.parseInt(strtok.nextToken());
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){            
                result[i][j]='Z';
            }
        }
    }

    int findSmallest()
    {   
            
            int north=0,south=0,west=0 ,east=0;
            if(r2-1 <0 )north=-1;       
            if(c2-1 <0)west=-1;
            if(c2+1 >= cols)east=-1;
            if(r2+1 >= rows)south=-1;
            
            min=arr[r2][c2];
            
            if(north>=0 ){
                if(arr[r2-1][c2]<min){
                 min= arr[r2-1][c2];
                 min_r=r2-1;
                 min_c=c2;
                }
             }      
                        
            if( west>=0 ){
                if(arr[r2][c2-1]<min)
                {
                    min= arr[r2][c2-1];
                    min_r= r2;
                    min_c= c2 -1;
                }
            }
            
            
            
            if( east>=0 )
            {
                if(arr[r2][c2+1] < min)
                {
                    min= arr[r2][c2+1];
                    min_r= r2;
                    min_c= c2 +1;
                }
            }
            if( south>=0 )
            {
                if(arr[r2+1][c2]< min){
                    min= arr[r2+1][c2];
                    min_r= r2+1;
                    min_c= c2; 
                }
            }
            
            if( north!=-1)
            {
                  if(arr[r2-1][c2]==min)
                  {
                      min_r=r2-1;
                      min_c=c2;
                    }
                    return min;
            }
            if( west!=-1)
            {
                    if(arr[r2][c2-1] == min){
                        min_r= r2;
                        min_c= c2 -1;
                    } return min;
            }
            
            if( east!=-1){
                if(arr[r2][c2+1]==min)
                {
                    min_r=r2;
                    min_c=c2+1;
                } return min;
            }
             
           if( south!=-1){
               if(arr[r2+1][c2] == min){
                 min_r= r2+1;
                 min_c= c2; 
                } return min;
            }
            return min;
        }
        void replace(char n,char old) 
        {
         //   System.out.println("REPLACING!"+old+" by "+n);
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    if(result[i][j]==old)result[i][j]=n;
                }
            }
        }
    
        void solve()
        {
            
           for(r1=0 ; r1<rows ; r1++)
           {
               for(c1=0;c1<cols ; c1++){
                  c2=c1;
                  r2=r1;
                
                  if(result[r1][c1] != 'Z')continue; 
                result[r2][c2]=c;
                if(findSmallest()!=arr[r2][c2])
                {                  
                    // linkage exists
                    while(findSmallest()!=arr[r2][c2]) // till linkage exists
                    {
                        System.out.println("SMALLEST= "+arr[min_r][min_c]);
                        
                            if(result[min_r][min_c]=='Z')//unfilled
                            {                               
                                result[min_r][min_c]=c;
                                r2=min_r;
                                c2=min_c;
                            }
                            else  // new link found
                            {   result[r2][c2]=result[min_r][min_c];
                              //  replace(result[min_r][min_c],c);// replace c
                                c=result[min_r][min_c];
                                break;
                            }
                    }  // linkage broken
                }
                c++;
                // else result[r2][c2]=++c;
                
                    
            }
        }
    }
        
    
        void print(char a[][],int c)
        {
            fout.println("Case #"+c+": ");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<cols;j++)
                {
                    fout.print(a[i][j]+" ");
                }fout.println();
            }
        }
        
        void controlRoom()throws IOException
        {
            c='a';
            //br=new BufferedReader(new InputStreamReader(System.in));
            fin=new FileReader("A-small-happy.IN");
            fout=new PrintWriter("RESULT-happy-small.TXT");
            br=new BufferedReader(fin);            
            
            int cases=Integer.parseInt(br.readLine());
            
            int count=1;
            do{
                c='a'; 
                getData();
                solve();
                print(result,count);
                count++;
            }while(count<=cases);
            
            fin.close();
            fout.flush();
            fout.close();
        }
    }
   
