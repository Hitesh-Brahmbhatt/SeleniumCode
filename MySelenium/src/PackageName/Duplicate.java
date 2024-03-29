package PackageName;

import java.util.HashMap;

public class Duplicate{

	public static void main(String[] args){
		characterCount("Google");
    }
	
    static void characterCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        char[] strArray = inputString.toCharArray();
 
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        System.out.println(charCountMap);
    }  
}
