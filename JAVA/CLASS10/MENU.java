
/**
 * Write a description of class MENU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class MENU
{
    // instance variables - replace the example below with your own
    
    private static int choice;
       
    public static void printMenu()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        do{        System.out.print(" 1.ADD RECORD \n 2.EDIT RECORD \n 3.DELETE RECORD \n 4.RECALL DELETED RECORD \n 5.PRINT A RECORD \n 6.PACK DATABASE \n 7.EXIT\n\n");
                  choice=Integer.parseInt(br.readLine());
                  
        }while(choice<1 || choice>7);
        
        Student obj=new Student();
        
        switch(choice)
        {
             case 1:
             
             obj.add();
             printMenu();
             break;
             
             case 2:
             
             if(!obj.edit()) System.out.println("RECORD NOT FOUND");
             printMenu();
             break;
             
             case 3:
             
             if(!obj.del()) System.out.println("RECORD NOT FOUND");
             printMenu();
             break;
             
             case 4:
             
             if(!obj.recall()) System.out.println("RECORD NOT FOUND");
             printMenu();
             break;
             
             
             case 5:
                if(!obj.print()) System.out.println("RECORD NOT FOUND");
                printMenu();
                break;
                
             case 6:
             
             obj.pack();
             printMenu();
             break;
             
             case 7:
                return ;
          }
          
      }
	public static void main(String args[])throws IOException
	{ printMenu();}

     
}
