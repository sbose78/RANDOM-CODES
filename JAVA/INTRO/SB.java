
import java.awt.*;
import java.applet.*;
import javax.swing.*;

/**
 * Class SB - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class SB extends JApplet implements Runnable
{
    // instance variables - replace the example below with your own
    String msg="A SIMPLE BANNER YO";
    Thread t=null;
    int state;boolean stopFlag;
    

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
        setBackground(Color.cyan);
        setForeground(Color.red);
    
        // provide any initialisation necessary for your JApplet
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
        
        t=new Thread(this);
        stopFlag=false;
        t.start();
              
    }

    public void run()
    {
        char ch;
        for(;;){
               try{ 
                   repaint();
                   Thread.sleep(2500);
                   ch=msg.charAt(0);
                   msg=msg.substring(1,msg.length());
                   msg+=ch;
                   if(stopFlag) break;
                }
                catch(InterruptedException e){}
            }
        }
    
    

    
    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
        stopFlag=true;
        t=null;        
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        // simple text displayed on applet
/*        g.setColor(Color.white);
        g.fillRect(0, 0, 200, 100);
        g.setColor(Color.black);
        g.drawString("Sample Applet", 20, 20);
        g.setColor(Color.blue);
        g.drawString("created by BlueJ", 20, 40);
        */
       
       g.drawString(msg,50,30);
    }
    
    

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
