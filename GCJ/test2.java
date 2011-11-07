import java.io.*;
public class test2
{
   public static void main(String args[])
   {  
       Car c1=new Car(12);
       Car c2=c1;
       
       //if(c1.equals(c2))
       
       if(c1==c2)
       System.out.println("YEAH");
       else System.out.println("NOPE!");
   }
}
class Car{
    private int model;
    public Car(int model)
    {
           this.model=model;
        }
        
        public int getModel(){ return model;}
      public boolean equals(Object obj)
      {
          if( obj instanceof Car && (((Car)obj).getModel()==this.getModel()) )return true;
          return false;
        }
    }