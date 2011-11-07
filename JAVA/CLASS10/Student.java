\/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class Student
{
    private String name;
    private int marks;
    private int roll;
        
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public void add()throws IOException
    {
        
       System.out.println("ENTER NAME:")    ;
       name=br.readLine();
       
       System.out.println("ENTER ROLL:")    ;
       roll=Integer.parseInt(br.readLine());
       
       System.out.println("ENTER MARKS:");
       marks=Integer.parseInt(br.readLine());
       
       FileWriter fout=new FileWriter("RECORDS.DAT",true);
       BufferedWriter bout=new BufferedWriter(fout);
       PrintWriter pout=new PrintWriter(bout); // to use println();
       
       DATABASE record=new DATABASE(name,roll,marks,true);
       record.addRecord(pout);
       
       pout.close();
       bout.close();
       fout.close();
    }
    
    public boolean del()throws IOException
    {
       FileWriter fout=new FileWriter("TEMP.DAT",false);
       BufferedWriter bout=new BufferedWriter(fout);
       PrintWriter pout=new PrintWriter(bout);
        
       FileReader fin=new FileReader("RECORDS.DAT");
       BufferedReader bin=new BufferedReader(fin);
       
       int r;
       System.out.println("ENTER ROLL NUMBER: ");
       r=Integer.parseInt(br.readLine());
       
       DATABASE record=new DATABASE("",0,0,false);
       int flag=0;
       while(record.readRecord(bin))
       {
           if(record.getRoll()==r && record.getActive()==true)
           {    flag=1;

               DATABASE changedRecord=new DATABASE(record.getName(),record.getRoll(),record.getMarks(),false);
               changedRecord.addRecord(pout);
               changedRecord.display();
               continue;
            }            
            record.addRecord(pout);
        }
        bin.close();
        fin.close();
        
        pout.close();
        bout.close();        
        fout.close();
        
        File oldFile = new File(".","RECORDS.DAT");
        File newFile = new File(".","TEMP.DAT");
        
        oldFile.delete();
        newFile.renameTo(oldFile);
        
        if(flag==0)return false;
        return true;
    }
    
    public boolean recall()throws IOException
    {
       FileWriter fout=new FileWriter("TEMP.DAT",false);
       BufferedWriter bout=new BufferedWriter(fout);
       PrintWriter pout=new PrintWriter(bout);
        
       FileReader fin=new FileReader("RECORDS.DAT");
       BufferedReader bin=new BufferedReader(fin);
       
       int r;
       System.out.println("ENTER ROLL NUMBER: ");
       r=Integer.parseInt(br.readLine());
       
       DATABASE record=new DATABASE("",0,0,false);
       int flag=0;
       while(record.readRecord(bin))
       {
           if(record.getRoll()==r && record.getActive()==false)
           {    flag=1;
               DATABASE changedRecord=new DATABASE(record.getName(),record.getRoll(),record.getMarks(),true);
                              
               changedRecord.addRecord(pout);
               changedRecord.display();
               continue;
            }
            
            record.addRecord(pout);
        }
        bin.close();
        fin.close();
        
        pout.close();
        bout.close();        
        fout.close();
        
        File oldFile = new File(".","RECORDS.DAT");
        File newFile = new File(".","TEMP.DAT");
        
        oldFile.delete();
        newFile.renameTo(oldFile);
        
        if(flag==0)return false;
        return true;
    }
    
    public boolean edit()throws IOException
    {
       FileWriter fout=new FileWriter("TEMP.DAT",false);
       BufferedWriter bout=new BufferedWriter(fout);
       PrintWriter pout=new PrintWriter(bout);
        
       FileReader fin=new FileReader("RECORDS.DAT");
       BufferedReader bin=new BufferedReader(fin);
       
       int r;
       System.out.println("ENTER ROLL NUMBER: ");
       r=Integer.parseInt(br.readLine());
       
       DATABASE record=new DATABASE("",0,0,false);
       int flag=0;
       while(record.readRecord(bin))
       {
           if(record.getRoll()==r && record.getActive()==true)
           {   
               flag=1;
               String n;
               int m;
               record.display();
               System.out.print("\n ENTER NEW NAME:");
               n=br.readLine();

            
               System.out.print("\n ENTER NEW MARKS:");
               m=Integer.parseInt(br.readLine());
               
               DATABASE changedRecord=new DATABASE(n,r,m,true);              
               changedRecord.addRecord(pout);
               changedRecord.display();
               continue;
            }
            
            record.addRecord(pout);
        }
        bin.close();
        fin.close();
        
        pout.close();
        bout.close();        
        fout.close();
        
        File oldFile = new File(".","RECORDS.DAT");
        File newFile = new File(".","TEMP.DAT");
        
          oldFile.delete();
        newFile.renameTo(oldFile);
        
        if(flag==0)return false;
        return true;
    }
    
    public boolean print()throws IOException
    {
        FileReader fin=new FileReader("RECORDS.DAT");
       BufferedReader bin=new BufferedReader(fin);
       
       int r;
       System.out.println("ENTER ROLL NUMBER: ");
       r=Integer.parseInt(br.readLine());
       
       DATABASE record=new DATABASE("",0,0,false);
       int flag=0;
       while(record.readRecord(bin))
       {
           if(record.getRoll()==r && record.getActive()==true)
           {   
               flag=1;
               record.display();
               break;
            }
            
        
        }
        bin.close();
        fin.close();
        

        if(flag==0)return false;
        return true;
    }
    
    
    
    public void pack()throws IOException
    {
           FileReader fin=new FileReader("RECORDS.dat");
           BufferedReader bin=new BufferedReader(fin); // to use readLine() func
           
           
           FileWriter fout=new FileWriter("TEMP.DAT");
           BufferedWriter bout=new BufferedWriter(fout);
           PrintWriter pout=new PrintWriter(bout);
           
           DATABASE record=new DATABASE("",0,0,false);
           
           while(record.readRecord(bin))
           {
               if(record.getActive()==true)  record.addRecord(pout);
            }
            
            bin.close();
            fin.close();
            pout.close();
            
            File oldFile=new File(".","RECORDS.DAT");
            File newFile=new File(".","TEMP.DAT");
            
            oldFile.delete();
            newFile.renameTo(oldFile);
        
    }
}
           
           
       
    
         

