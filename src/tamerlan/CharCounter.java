package tamerlan;


import java.util.LinkedHashMap;
import java.util.Map;


public class CharCounter {
    public static void main(String[] args) {
        charCount("Tamerlan");
    }
    
    public static void charCount(String str){
        str=str.replace("", "");
        Map freqCount=new LinkedHashMap<Character,Integer>();
        for(char ch:str.toCharArray()){
            if(freqCount.containsKey(ch)){
                freqCount.put(ch, (Integer) freqCount.get(ch)+1);
            }else{
                freqCount.put(ch, 1);
            }
        }
        System.out.println(freqCount);
    }
}
