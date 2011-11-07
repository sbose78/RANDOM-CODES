
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Magicka
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("B-large.in"));
             
             FileOutputStream out=new FileOutputStream("op1.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());
             
      for(int tests=1;tests<=t;tests++)                
      {       
            // System.out.println("ENTER");
                          
             String newline=sc.nextLine();
             StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             

             
             int c=Integer.parseInt(strtok.nextToken());
             
             String Cs[]=new String[c];
             
             for(int i=0;i<c;i++){
                 Cs[i]=new String(strtok.nextToken());
            }
            
            int d=Integer.parseInt(strtok.nextToken());
            String Ds[]=new String[d];
             
             for(int i=0;i<d;i++){
                 Ds[i]=new String(strtok.nextToken());
            }
            
            int n=Integer.parseInt(strtok.nextToken());
            String sample;
            sample=strtok.nextToken();
            String newSample=""+sample.charAt(0);
            for(int i=1;i<sample.length();i++){                
                // testing for combine                
                int flag=0;
                
              if(newSample.length()!=0)
              {
                for(int j=0;j<c;j++){
                    
                    
                         String temp=""+Cs[j].charAt(0)+Cs[j].charAt(1);
                         String temprev=""+Cs[j].charAt(1)+Cs[j].charAt(0);

                       //  System.out.println("COMPARING WITH "+temp);             
                         String test=""+sample.charAt(i) + newSample.charAt( newSample.length()-1 );
                         
                         if(temp.equals(test))
                         {                          
                           //  System.out.println("COMBINATION FOUND : "+temp);
                             
                            // System.out.println("CONSTRUCTING: "+newSample.substring(0, newSample.length()-1)+" + "+Cs[j].charAt(2));
                             newSample=newSample.substring(0, newSample.length()-1)+ Cs[j].charAt(2);
                             
                             flag=100;
                             break;
                         }
                        else if( temprev.equals(test))
                        {
                               // System.out.println("COMBINATION FOUND : "+temprev);
                                newSample=newSample.substring(0, newSample.length()-1)+ Cs[j].charAt(2);
                                flag=100;
                                break;
                       } 
                   }
                                
                      if(flag==0) //proceed
                      {
                        for(int k=0;k<newSample.length();k++){
                            String temp2=""+newSample.charAt(k)+sample.charAt(i);
                           // System.out.println("checking conflict for :  "+temp2);
                       
                    // checking for conflicts
                            for( int j=0;j<d;j++){
                                String temp=""+Ds[j].charAt(0)+Ds[j].charAt(1);
                                String temp1=""+Ds[j].charAt(1)+Ds[j].charAt(0);
                            
                            //    System.out.println("COMPARING "+temp+" and " + temp2);
                                if(temp.equals(temp2)){
                                
                            //        System.out.println("THERES A CONFLICT FOR: "+temp2);                            
                                    newSample="";
                                    flag=500;
                                    j=d;k=newSample.length();
                                    break;
                                }
                                else if(temp1.equals(temp2))
                                {
                               //     System.out.println("THERES A CONFLICT FOR: "+temp2);                            
                                    newSample="";
                                    flag=500;
                                    j=d;k=newSample.length();
                                    break;
                                }
                            
                            }
                      } // end of k   
                    }//end of if(flg==0)
            
                }
                if(flag==0 ){
                        newSample+=sample.charAt(i);             
                }
                              //  System.out.println(newSample);
            }
          //  fout.println(newSample);
            fout.print("Case #"+tests+": [");
            for(int i=0;i<newSample.length();i++){
                fout.print(newSample.charAt(i));
                if(i!=newSample.length()-1){
                    fout.print(",   ");
                }
            }
            fout.print("]");
            fout.println();
            
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    


