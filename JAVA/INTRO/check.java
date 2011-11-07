
/**
 * Write a description of class check here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class check
{
     public void check1()
     {

         char c='Y';
         c+=7;
         int d= (c-'A') % ( 'Z' - 'A');
         d= 'A' - 1 + d;
         System.out.println((char)d);
            
      }    
      
     
      public void check3(){
          int a=2,b=3,c=9;
          double d=5.0,e=6;
          double result=5*e%c; //3
          System.out.println(result);
        }
        public static void main(String args[]){
            System.out.println(1+2+"abc");
            System.out.println("abc"+1+2);
        }
        
          
}

