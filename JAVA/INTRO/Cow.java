
/**
 * Write a description of class Cow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Cow
{
    
    public static void main(String args[])throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("NO. OF SONS ??? " );
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][n];
        
        int num=1;
        for(int j=0;j<n;j++)
        {
            for(int i=j;i<n;i++)
            {
                arr[i][j]=num++;
            }
            for(int k=0;k<j;k++){
                arr[k][j]=num++;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    
        
    }
    
}
