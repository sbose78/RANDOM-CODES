
/**
 * Write a description of class Magicka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.io.*;

public class Tile
{
  public static void main(String args[])throws Exception
  {
      
             Scanner sc=new Scanner(new File("A-large.in"));
             
             FileOutputStream out=new FileOutputStream("optiles.txt");
             PrintWriter fout=new PrintWriter(out);
             
             int t=Integer.parseInt(sc.nextLine());
             
      for(int tests=1;tests<=t;tests++)                
      {       
            // System.out.println("ENTER");
            //   System.out.println("CASE:--- "+tests);           
             String newline=sc.nextLine();
             StringTokenizer strtok=new StringTokenizer(newline,"\t ");
             
             int r=Integer.parseInt(strtok.nextToken());
             int c=Integer.parseInt(strtok.nextToken());
             
             char tiles[][]=new char[r][c];
             
             
             for(int i=0;i<r;i++) 
             {
                 char cs[]=new char[8];
                tiles[i]=(sc.nextLine()).toCharArray();
             }
             
            
             boolean flag=true;
             for(int i=0;i<r;i++)
             {
                   for(int  j=0;j<c;j++)
                   {
                       if(tiles[i][j]!='.' && tiles[i][j]!='\\' && tiles[i][j]!='/')
                       {
                           int pi=i+1;int pj=j+1;
                           if(pi==r || pj==c)
                           {
                               flag=false;
                            }
                            else
                            {
                                if(tiles[i][j]==tiles[i][j+1] && tiles[i][j]==tiles[i+1][j] && tiles[i][j]==tiles[i+1][j+1] && tiles[i][j]=='#')
                                {
                                     tiles[i][j]=tiles[i+1][j+1]='/';
                                     tiles[i][j+1]=tiles[i+1][j]='\\';
                                }
                                else{
                                    flag=false;
                                }
                            }
                        }
                        if(flag==false) {
                            i=r+2;
                            j=c+2;
                        }
                        
                    }
                }

                fout.println("Case #"+tests+": ");
                if(flag==true)
                {
                    for(int i=0;i<r;i++                   )
                    {
                        for(int j=0;j<c;j++)
                        {
                            fout.print(tiles[i][j]);
                        }
                        fout.println();
                    }
                }
                else
                {
                        fout.println("Impossible");
                 }
        }//tests   
        fout.close();
        out.close();
     }//main
 }//class

    


