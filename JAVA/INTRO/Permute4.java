
/**
 * Write a description of class Permute4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permute4
{
    // instance variables - replace the example below with your own
    private String str;

    public Permute4(String str)
    {
        this.str=str;
    }

    public void print()
    {
        int i,j,k,l;
        String s=new String();
     //   int count=0;

        for(i=0;i<4;i++){
                char c= str.charAt(i);
               for(j=0;j<4;j++){
                   
                   if(j!=i){
                    char d=str.charAt(j);
                    
                    for(k=0;k<4;k++){
                        
                        if(k!=j && k!=i){
                            char e=str.charAt(k);
                            
                            for( l=0; l<4;l++){
                                
                                if(l!=i && l!=j && l!=k){
                                    char f=str.charAt(l); //  count++;
                                    s=Character.toString(c)+Character.toString(d)+ Character.toString(e)+ Character.toString(f);
                                    System.out.println(s);
                                    s=new String();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

