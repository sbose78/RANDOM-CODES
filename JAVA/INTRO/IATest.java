
/*
 * Write a description of class IATest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.net.*;
public class IATest
{
    public static void main(String args[])throws UnknownHostException
    {
        InetAddress ia=InetAddress.getLocalHost();
        System.out.println(ia);
        
        ia=InetAddress.getByName("osborne.com");
        System.out.println(ia);
        
        InetAddress SW[]=InetAddress.getAllByName("www.yahoo.com");
        
        for(int i=0;i<SW.length;i++) System.out.println("yo "+i+"  "+SW[i]);
    }

}
