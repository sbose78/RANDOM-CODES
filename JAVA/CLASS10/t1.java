public class t1
{

    public void change(Integer a)
    {
            a=a+12;
        }
        
        public void check()
        {      for(int i=0;i<12;i++)
               {   goto outer:
                   
                   System.out.println("IM HERE at I");
                        for(int j=0;j<12;j++){
                            System.out.println("IM HERE AT J");
                            for(int k=0;k<12;k++)
                             {
                                    if(k==5) continue outer;
                                }
                            }
                        }
         }
}