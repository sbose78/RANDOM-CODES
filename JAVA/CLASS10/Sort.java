
/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Sort
{
    private int arr[],B[],A[];
    
    public Sort(int n)
    {
            arr=new int[n];
            B=new int[n];
            A=new int[n];
     }
     
    public void insertion()throws IOException
    {   
        getData();
        for(int i=1;i<arr.length;i++)
        {
            int c=arr[i];
            
            for(int j=i;j>0;j--)
            {
                if(c<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        printData();
    }
    
    public void printData(int a[]){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
    public void getData(int a[])throws IOException
    {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           for(int i=0;i<a.length;i++)
           {
               System.out.print("INDEX "+(i+1)+"  ");
               a[i]=Integer.parseInt(br.readLine());
           }
     }
        
     public void mergeSort()throws IOException
     {
          getData(A);
          
          for(int L= 1 ; (A.length/2)>= L ; L*=2 )
          { 
                L/=2;
                merge(A,B,L);
                
                printData(B);
                
                merge(B,A,L);
                
          }
          
          printData(B);
      }
      
      public void merge(int a[],int b[],int l)
      {
          int p1,p2;
          p1=0;
          p2=l;
          
          int i=0;
          
          while(p2<a.length)
          {
           
              while(i < (p2+l-1) )
              {         
                     printData(b) ;
                  if( a[p2]<a[p1])b[i++]=a[p2++];
                  else b[i++]=a[p1++];
              }
              p1+= l*2;
              p2=p1+l;
         }         
      }         
}          
            
              