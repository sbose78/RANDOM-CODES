import java.net.*;
import java.io.*;

public class URL2 {
    public static void main(String[] args) throws Exception {
      URL yahoo;  
        String charset="UTF-8";
        
        //URL yahoo = new URL("http://cisce.examresults.net/fetchresult10.aspx?center1=&sno1=001");
        
        yahoo = new URL("http://www.wbut.net/main/process1.asp");//?center1=2536&sno1="+roll);
        
                
        String param1="9170125";
        String param2="Submit";
      //  String query = String.format("regno=%s&B1=%s",URLEncoder.encode(param1,charset),URLEncoder.encode(param2,charset));
        
         String query = String.format("text1=08109001115&s6.x=76&s6.y=11",URLEncoder.encode(param1,charset),URLEncoder.encode(param2,charset));

 //       String query = String.format("text1=%s",URLEncoder.encode(param1,charset));//,URLEncoder.encode(param2,charset));
        
        URLConnection yc = yahoo.openConnection();
        
        yc.setDoOutput(true); // Triggers POST.
        yc.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
     
        yc.setRequestProperty("Origin","http://cbseresults.nic.in");
        yc.setRequestProperty("Referer","http://www.wbut.net/main/student.asp");
        yc.setRequestProperty("Cookie","ASPSESSIONIDAQQTQRDD=HCOEFFLBBOBAOPDOGJDMPKIN");
        

        
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
            i++;
            if(i==100)break;
        }
        
       
    }
  
}