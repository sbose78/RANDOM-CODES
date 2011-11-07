
/**
 * Write a description of class Crazy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crazy
{
    
    
    public static FileReader fin;
    public static PrintWriter fout;
    public static BufferedReader br;
    
    public static StringTokenizer strtok;

    private String str[];
    private int arr[];
    private int pri[];
    private int N;

    public Crazy()
    {
       
    }
    public int maxp()
    {
        int max=0;
        for(int i=0;i<N;i++)
        {
            if(pri[i]>max) max=pri[i];
        }return max;
    }
        
    public void fillArray()
    {   
        br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER N :");
        N=Integer.parseInt(br.readLine());
        str=new String[N];
        arr=new int[N];
        pri=new int[N];
        
        for(int i=0;i<N;i++)
        {
                str[i]=br.readLine();
        }
        
        for(int i=0;i<N;i++)
        {       int j=N-1;
               while( arr[j]!=1) j--;
               arr[i]=j;
        }
         
        int oop=0;
        
        for(int i=0;i<N;i++)
        {
             if(arr[i]-1 != i)
             {      oop++;
                    pri[i]= Math.abs(arr[i]-1 -i);
             }else{
                 pri[i]=0;
             }
        }            
        
}
