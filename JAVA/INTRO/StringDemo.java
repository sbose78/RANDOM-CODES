
/**
 * Write a description of class StringDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringDemo
{
    public static void main(String[] args)
    {
        //StringBuffer sb = new StringBuffer("java");
        
        StringBuffer sbw = new StringBuffer(200);
        int capacity = sbw.capacity();
        //System.out.println(capacity);
        String s = "computer";
        String s1 = "java";
        String s2 = "java";
        char c = s.charAt(3);
        int capa = s.compareTo(s1);
       // System.out.println(capa);
        
        String con = s.concat(s1);
         StringBuffer sb = new StringBuffer("Computermmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmlll");
         System.out.println(sb.length()+" "+sb.capacity()+" "+sb);
         sb.append("science").delete(5,9).insert(5,"java").reverse();
        // System.out.println(sb);
       s =   s.concat("science").toUpperCase().replace('u','j');
        // System.out.println(s);
//         System.out.println(s.endsWith("ro"));
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.lastIndexOf('a'));
//         System.out.println(s.replace('o','x'));
//         System.out.println(s.substring(2,4));
//         System.out.println(s.toLowerCase());
//         System.out.println(s.toUpperCase());
//         System.out.println(s1.trim());
    }
}
