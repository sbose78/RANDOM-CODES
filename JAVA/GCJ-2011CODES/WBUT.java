
/**
 * Write a description of class WBUT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WBUT
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WBUT
     */
    public WBUT()
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
   
    
    public static void main(String args[])
    {
         URL yahoo;  
        String charset="UTF-8";

        yahoo = new URL("http://cbseresults.nic.in/class1211/cbse1211.asp");
        
		int start = Integer.parseInt(request.getParameter("start"));
		int end=Integer.parseInt(request.getParameter("end"));
        
           
        String param1="9170125";
        String param2="Submit";
        String query = String.format("regno=%s&B1=%s",URLEncoder.encode(param1,charset),URLEncoder.encode(param2,charset));
        
        
        URLConnection yc = yahoo.openConnection();
        
        yc.setDoOutput(true); // Triggers POST.
        yc.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
     
        yc.setRequestProperty("Origin","http://cbseresults.nic.in");
        yc.setRequestProperty("Referer","http://cbseresults.nic.in/class1211/cbse1211.htm");
        
        /*
         
        yc.setRequestProperty("Content-Length","23");

        */
        
       String full="";
       String omit="<td><font face='Arial' size=2> <b>";
       
      OutputStream output  = yc.getOutputStream();
     output.write(query.getBytes(charset));
        
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        
          String name="";
                 
        String temp=""; int i=1;
        while((temp = in.readLine()) != null)
        {
            System.out.println("line #"+i+"---"+temp);
          
        }
        
        
        
    }

}
