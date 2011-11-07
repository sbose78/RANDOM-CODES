import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
      URL yahoo;  
        
     for(int r1=1;r1<=200;r1++)
     {

        String roll="";
         if(r1>99) roll=""+r1;
         else if(r1<=10) roll="00"+r1;
         else roll="0"+r1;  
         
        //URL yahoo = new URL("http://cisce.examresults.net/fetchresult10.aspx?center1=&sno1=001");
        yahoo = new URL("http://cisce.examresults.net/fetchresult10.aspx");//?center1=2536&sno1="+roll);
        URLConnection yc = yahoo.openConnection();
        
        yc.setRequestProperty("center1","2536");
        yc.setRequestProperty("sno1","010");
        
       // System.out.println(yahoo.getContent());
        
       
        
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine="";
        
        String temp="";
        
        while ((temp = in.readLine()) != null) 
        {    inputLine+=temp;
//             System.out.println(inputLine);
        }
    //     System.out.println(inputLine);
         
         String s=new String(inputLine);
         
         System.out.println("LENGTH: "+ s.length()+".. hence not accepted");
         
         if(s.length()<5221) continue;;
         for(int i=0;i<s.length();i++)
         {
             String name=s.substring(i,i+11);
             if(name.equalsIgnoreCase("<b>Name</b>"))
             {  i+=11;
                System.out.println(name+".... found"); 
                              
                 i+=9;
                 while(s.charAt(i)!='<'){
                     System.out.print(s.charAt(i++));
                  }System.out.println();
                  
                  String a="/td></tr><tr><td><b>School</b></td><td>";
                  i+=a.length()+1;
                 
                  String school="";
                  while(s.charAt(i)!='<'){
                      school+=s.charAt(i++);
                    }
                    
                    System.out.println(school);
                  
                                
                break;
              }

          }
          
  }
 }
  
}