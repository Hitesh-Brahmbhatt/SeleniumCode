package PackageName;
 
public class SwapTwoStrings 
{  
    public static void main(String[] args) 
    {    
        String S1 ="Hitesh";
        String S2 ="Brahmbhatt";
        
        System.out.println("=======Before Swapping=======");
        System.out.println("First String "+S1+" Second String "+S2);
         
        S1= S1+S2;
        S2=S1.substring(0, S1.length()-S2.length());
        S1=S1.substring(S2.length());
         
        System.out.println("=======After Swapping=======");
        System.out.println("First String "+S1+" Second String "+S2);
     
    }    
}
