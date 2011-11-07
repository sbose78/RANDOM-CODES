
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Bot
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("A-small-attempt0.in"));
             
             FileOutputStream out=new FileOutputStream("opbot.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());
             
      for(int tests=1;tests<=t;tests++)                
      {       
            // System.out.println("ENTER");
                          
             String newline=sc.nextLine();
             StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             
             int n=Integer.parseInt(strtok.nextToken());
             char sequence[]=new char[n];
             int bo[]=new int[n+1];
             int bb[]=new int[n+1];
             
             int to[]=new int[n+1];
             int tb[]=new int[n+1];
             int o=0,b=0;
             
//             bo[0]=bb[0]=0;
//             to[0]=tb[0]=0;
             for(int i=0;i<n;i++)
             {
                 sequence[i]=strtok.nextToken().charAt(0);
                 
                 if(sequence[i]=='O')
                 {
                     bo[o++]=Integer.parseInt(strtok.nextToken());
                  }
                  else
                  {
                      bb[b++]=Integer.parseInt(strtok.nextToken());
                  }
              }
              int time=0;
              o=b=0;
                
              char prev='Z';
              for(int i=0;i<n;i++)
              {
                    
                  if(sequence[i]=='O')
                  {    
                      if(o==0)
                      {
                          if(bo[0]>time)
                          {
                              time=bo[0];
                          }
                          else if(bo[0]>=time) time+=1;
                      /*    else{
                              time+=bo[0];
                              to[b++]=time;
                            }
                            */
                       }
                      else
                      {
                          int time_diff=Math.abs(bo[o]-bo[o-1]);
                          
                          //find last pressed button's time.
                          
                          int last=to[o-1];              
                    
                          // already reached , only button press remaining !
                          if( time - last >= time_diff )
                          {
                              time++;
                             
                          }
                          else
                          {
                              time+= time_diff - (time - last);
                              time++;
                             
                           }
                           if(prev=='O') time++;
                            to[o++]=time;
                      }prev='O';
                      System.out.println("FOUND O, TIME: "+time);
                  }//o
                               
                  else
                  {
             
                      if(b==0)
                      {
                        
                          if(bb[0]>time)
                          {
                              time=bb[0];
                          }
                          else if(bb[0]==time) time+=1;
                          else{
                              time+=bb[0];
                              tb[b++]=time;
                            }
                       }
                      else
                      {
                          int time_diff=Math.abs(bb[b]-bb[b-1]);
                          
                          //find last pressed button's time.
                          
                          int last=tb[b-1];              
                    
                          // already reached , only button press remaining !
                          if( time - last >= time_diff )
                          {
                              time++;
                            
                          }
                          
                          else
                          {
                              time+= time_diff - (time - last);
                              time++;
                              
                            }  
                            if(prev=='B') time++;
                            tb[b++]=time;
                        }                prev='B';
                        System.out.println("FOUND B, TIME: "+time);
                    }
                }
            
        
                        
                        
//              fout.println(newSample);
            fout.print("Case #"+tests+": "+time);
            fout.println();
            
            
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    


