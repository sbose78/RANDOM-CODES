import java.io.*;
public class Mammal extends Animal
{
    private static int breasts;
    public Mammal(int l,String b,int breasts)
    {  
        super(l,b);
        this.breasts=breasts;
    }
       

    public  static void printCharacteristics1()
    {
        Mammal.printCharacteristics();
        System.out.println("NO. OF BREASTS = "+breasts);
    }
    public void print(){ System.out.println("Yo");}

}
    
