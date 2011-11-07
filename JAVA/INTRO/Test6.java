
/**
 * Write a description of class Test6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test6
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test6
     */
    public Test6()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod()
    {
       String a="GET&https%3A%2F%2Fwww.google.com%2Faccounts%2FOAuthGetAccessToken&oauth_consumer_key%3Dsbose78.appspot.com%26oauth_nonce%3D1307849595%26oauth_signature_method%3DHMAC-SHA1%26oauth_timestamp%3D1307875991%26oauth_token%3D4%252FyI0ZZZwoL6h6uQMMWPE15Zu0ofO1%26oauth_verifier%3DUIRc4lqNUosF5nVxeXdfJz5f";
       String b="GET&https%3A%2F%2Fwww.google.com%2Faccounts%2FOAuthGetAccessToken&oauth_consumer_key%3Dsbose78.appspot.com%26oauth_nonce%3D1307849595%26oauth_signature_method%3DHMAC-SHA1%26oauth_timestamp%3D1307876004%26oauth_token%3D4%2FyI0ZZZwoL6h6uQMMWPE15Zu0ofO1%26oauth_verifier%3DUIRc4lqNUosF5nVxeXdfJz5f";
       
      return a.compareTo(b);
    }
}
