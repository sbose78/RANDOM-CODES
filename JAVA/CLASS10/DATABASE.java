
/**
 * Write a description of class DATABASE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class DATABASE
{
    // instance variables - replace the example below with your own
    private String name;
    private int roll;
    private int marks;
    private boolean active;

    public DATABASE(String name,int roll,int marks,boolean active)
    {
        this.name=name;
        this.roll=roll;
        this.marks=marks;
        this.active=active;
    }
    public String getName()
    {
        return name;
    }
    
    public int getRoll()
    {
            return roll;
    }
    
    public int getMarks()
    {
        return marks;
    }
    
    public void addRecord(PrintWriter pout)
    {
//        pout.println(name);
        pout.println(name);
        pout.println(roll);
        pout.println(marks); 
        pout.println(active);
    }
    
    public boolean getActive()
    {
        return active;
    }
    
    public boolean readRecord(BufferedReader infile)throws IOException
    {
        String f1,f2,f3,f4;
        
        f1=infile.readLine();
        if(f1==null)return false;
        
       
        f2=infile.readLine();
        if(f2==null)return false;
        
        
        f3=infile.readLine();
        if(f3==null)return false;
        
        f4=infile.readLine();
        
        name=new String(f1);
        roll=Integer.parseInt(f2);
        marks=Integer.parseInt(f3);
        active=Boolean.parseBoolean(f4);
        
        return true;
    }
    
    public void display()
    {
        System.out.println(" NAME:"+name+"\n ROLL:"+roll+"\n MARKS:"+marks+"\n ACTIVE:"+active+"\n\n");
    }
}        
