
/**
 * Write a description of class testBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class testBird
{
    int H[];
    int W[];
    String d[];
    int sizey;
    int sizen;
    
    int yH[];
    int yW[];
    
    int nH[];
    int nW[];
    
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    int countBirds;
    
    void getData()throws IOException{
        countBirds=0;
        System.out.println("ENTER NO.OF KNOWN SAMPLES: ");
        sizey=Integer.parseInt(br.readLine());
        H=new int[sizey];
        W=new int[sizey];
        d=new String[sizey];
        for(int i=0;i<sizey ; i++)
        {
                System.out.println("ENTER HEIGHT, WIDTH, COMMENT FOR SAMPLE #"+(i+1));
                H[i]=Integer.parseInt(br.readLine());
                W[i]=Integer.parseInt(br.readLine());
                d[i]=br.readLine();
                
                if(d[i].equals("BIRD")) countBirds++;
            }
            
        }
        
        void sort(int a[],int dim[],String s){
            
            int j=0;
            for(int i=0;i<dim.length;i++){
                    if(d[i].equals(s))
                    {
                        a[j++]=dim[i];
                    }
                }
                
             for(int i=0;i<a.length-1; i++){
                 for(j=0;j<a.length-1-i;j++){
                     if(a[j]>a[j+1])
                     {
                         int temp=a[j];
                         a[j]=a[j+1];
                         a[j+1]=temp;
                     }
                     
                 }
                }
                
            }
            
            
            void solve()throws IOException{
                getData();
                
                yH=new int[countBirds];
                yW=new int[countBirds];                
                
                nH=new int[sizey-countBirds];
                nW=new int[sizey-countBirds];
                
                sort(yH,H,"BIRD");
                sort(yW,W,"BIRD");
                
                sort(nH,H,"NOT");
                sort(nW,W,"NOT");
                
                int n;
               System.out.println("ENTER NO. OF SAMPLES TO BE CHECKED:");
               n=Integer.parseInt(br.readLine());
               
               
               for(int i=0;i<n;i++)
               {
                   int h,w;
                    System.out.println("ENTER HEIGHT,WEIGHT FOR SAMPLE #"+(i+1));
                    h=Integer.parseInt(br.readLine());
                    w=Integer.parseInt(br.readLine());   
                    
                    int hflag=0;
                    int wflag=0;
                   
                    if(countBirds !=0)
                    {
                        if(h > yH[0] && h<yH[yH.length-1]) hflag=1;
                        else if(  yH[0]<= nH[0] && h<nH[0]) hflag=2; 
                        else if( (h< yH[0] && h> nH[nH.length-1] ) || (h> yH[yH.length-1] && h< nH[0] )) hflag=2;
                    
                        
                        
                        else hflag=0;
                        
                        if(w > yW[0] && w<yW[yW.length-1]) wflag=1;
                        else if( (w< yW[0] && w> nH[nW.length-1] ) || (w> yW[yW.length-1] && w< nW[0] )) wflag=2;
                        else if( (  yW[0]<= nW[0]) && w<nW[0])  wflag=2;
                        else wflag=0;
                    }
                    else hflag=wflag=2;
                    
                    if( hflag==1 && wflag==1)
                    {
                        System.out.println("BIRD");
                    }
                    else if(hflag==2 || hflag==2) 
                    {
                        System.out.println("UNKNOWN");
                    }
                    else System.out.println("Not bird !!!");
                }
            }                
                               
               
        }