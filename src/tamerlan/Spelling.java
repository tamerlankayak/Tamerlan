package tamerlan;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

//here is I used regex, but for interview it is not recommended 

public class Spelling {
    public static void main(String[] args) {
     String input = "Füzuli";
     Matcher m = Pattern.compile("[^aeiouüöəı]?[aeiouüöıə](([^aeiouüıöə])(?![aeiouüöəı]))?", Pattern.CASE_INSENSITIVE).matcher(input);
     int s = 0;
     while (m.find()) {
     System.out.println(input.substring(s, m.end()).trim());
     s = m.end();
}
    }
}
