
/**
 * Write a description of class Numbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numbers
{
    private double n;

    public Numbers(double n)
    {
        this.n=n;
    }

    public double power(double x, double n){
        for(double i=2;i<=n;i++){
            x=x*x;
        }return x;
    }
    
    public double calc()
    {
        double expression1= 3+ Math.sqrt(5);
        double expression2 = 3- Math.sqrt(5);
        
        double expression= (Math.pow(Math.pow(expression1,n/4),4) + Math.pow(  Math.pow(expression2,n/4),  4  ));
        return ((expression - (int)expression)*1000)%1000 ;
    }
}
