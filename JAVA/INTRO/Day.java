
/**
 * Write a description of class Day here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Day
{
    // instance variables - replace the example below with your own
    private int d;
    private int m;
    private int y;
    
    public Day(int d,int m,int y)
    {
        // initialise instance variables
        this.d=d;
        this.m=m;
        this.y=y;
    }

    public String toDay()
    {
        // put your code here
        String days[]={"SUNDAY","MONDAY","TEUSDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        int totalDays= (y-1)*365 + (int)( (y-1)/4 ) ;
        
        
        
        for(int i=0;i<m-1;i++)
        {
            if(i==1)
            {
                if(y%4==0 )totalDays+=29;
                else totalDays+=28;
            }
            else  totalDays+=monthDays[i];
            
        }
    /*    
        int j=1;
        for(int i=0;j<y; j= 400*i)
        {   
            if(j%400 ==0) totalDays-=1;
        }
        
        */
        
          
        totalDays+=d;
        
     //   totalDays-=3;
        return (days[ (totalDays-1)%7] );      
                    
    }
}
