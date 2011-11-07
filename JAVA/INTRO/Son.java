
/**
 * Write a description of class Son here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Son extends Mammal
{
    // instance variables - replace the example below with your own
    private int age;
     Son(int l,String b,int breasts,int age)
    {
        // initialise instance variables
        super(l,b,breasts);
        this.age=age;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
     void printCharacteristics2()
    {
        Son.printCharacteristics1();
        System.out.println("AGE = "+age);
    }
}
