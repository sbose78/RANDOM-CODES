import java.net.*;
import java.io.*;

public class URL3 {
    public static void main(String[] args) throws Exception {
      URL yahoo;  
        String charset="UTF-8";
        
        //URL yahoo = new URL("http://cisce.examresults.net/fetchresult10.aspx?center1=&sno1=001");
        
        yahoo = new URL("http://www.wbut.net/main/process1.asp");//?center1=2536&sno1="+roll);
        
                

  for(int ii=90;ii<100;ii++)
  {
        
        
        String param1="081090010"+ii;
        String param2="76";
        String param3="52";        
        
      //  String query = String.format("regno=%s&B1=%s",URLEncoder.encode(param1,charset),URLEncoder.encode(param2,charset));
        
         String query = String.format("text1=%s&s6.x=%s&s6.y=%s",URLEncoder.encode(param1,charset),URLEncoder.encode(param1,charset),URLEncoder.encode(param2,charset),URLEncoder.encode(param3,charset));

 //       String query = String.format("text1=%s",URLEncoder.encode(param1,charset));//,URLEncoder.encode(param2,charset));
        
        URLConnection yc = yahoo.openConnection();
        
        yc.setDoOutput(true); // Triggers POST.
        yc.setDoInput(true); // Triggers POST.
        
        //    yc.setRequestMethod("POST");

        yc.setRequestProperty("Content-Type","application/xhtml+xml");
     
        yc.setRequestProperty("Origin","http://www.wbut.net");
        yc.setRequestProperty("Referer","http://www.wbut.net/main/student.asp");
       yc.setRequestProperty("Cookie","ASPSESSIONIDCSQSTTBD=ENOPBNEDCCOCHABKJEINKIJE");
        yc.setRequestProperty("Content-Length","32");
          yc.setRequestProperty("Cache-Control","max-age=0");
           yc.setRequestProperty("Connection","Keep-alive");

      
      OutputStream output  = yc.getOutputStream();
     output.write(query.getBytes(charset));
        
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        
          String name="";
                 
        String temp=""; int i=1;
        while((temp = in.readLine()) != null)
        {
            if(i==8){
                System.out.println("line #"+i+"---"+temp.substring(430,temp.length()-1));

            }                i++;
        }
        
        System.out.println("****************-----------************************");
            in.close();
          output.close();
    
    }  
        
        
       
    }

  
}