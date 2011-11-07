import java.io.*;
/**
 * Write a description of class ATM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ATM
{
    // instance variables - replace the example below with your own
    private double balance;

    /**
     * Constructor for objects of class ATM
     */
    public ATM()
    {
        // initialise instance variables
        balance=500;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    
     public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
    public void withdraw() throws IOException
    {
        // put your code here
        double amt;
        System.out.println("ENTER AMOUNT TO BE WITHDRAWN:\t");
        amt=Double.parseDouble(br.readLine());
        
        if( amt > balance ){
                    System.out.println("SORRY, NOT ENOUGH BALANCE IN YOUR A/C :\t");
                    exitSystem();
        }       
        balance-=amt;
        
        System.out.println("THANK YOU FOR USING ACB ATM : ");
        balanceEnquiry();

        
    }
    
    public void deposit() throws IOException
    {
     
        double amt;

        System.out.println("ENTER AMOUNT TO BE DEPOSITED:\t");
        amt=Double.parseDouble(br.readLine());
        
        balance+=amt;
        
        System.out.println("THANK YOU FOR USING ACB ATM : ");
        balanceEnquiry();

    }
    
    public void balanceEnquiry()throws IOException
    {
        
        System.out.println("YOUR ACCOUNT BALANCE IS  "+ balance );   
        exitSystem();
    }
    
    public void exitSystem()throws IOException
    {
        
        
        System.out.println("\n\n THANK YOU FOR USING ACB ATM ");
        
        System.out.println("\n\n DO YOU WANT ANOTHER TRANSACTIONl ? " );
        
        String s=br.readLine();
        
        char c=s.charAt(0);
        c=Character.toLowerCase(c);
        
        
        if(c== 'y'){
           
            printMenu();
        }else System.out.println(" GOODBYE !!! ");
    }
   
    
    public void printMenu()throws IOException
    {
     
        int choice=0;
        
        do{
            System.out.println("1.WITHDRAW ");
            System.out.println("2.DEPOSIT ");
            System.out.println("3.BALANCE ENQUIRY ");
            System.out.println("4.exit\n\n");
            
            try{
                choice=Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException e)
            {
                System.err.println("INVALID INPUT . TRY AGAIN " );
                continue;
            }break;
            
        }while(choice > 0 && choice <5 );
        
        switch(choice)
        {
            case 1:
            withdraw();
            break;
            
            case 2:
            deposit();
            break;
            
            case 3:
            balanceEnquiry();
            break;
            
            case 4:
            exitSystem();
            break;
        }
            
        
    }
    
    public void validateAccessCode()throws IOException
    {
        System.out.println("                        Please enter your access code");
       
        System.out.print("                                    ");
        int accessCode = Integer.parseInt(br.readLine());
        if(accessCode == 5555)
        {
            System.out.println("\t\t\tCODE ACCEPTED");
            printMenu();
        }
        else
        {
            System.out.println(" Sorry,you have entered the wrong code!");     
        }
       
    }
    
    public static void main(String args[]) throws IOException
    {
       // ATM account=new ATM();
        //account.
        validateAccessCode();
    }   
}
