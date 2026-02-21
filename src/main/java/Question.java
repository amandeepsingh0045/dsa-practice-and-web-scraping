import java.util.HashMap;
import java.util.Map;

public class Question {



    public static  void main (String [] args) {
                String s = "amanaplanacanalpanauma";

                String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

                int left = 0;
                int right =  cleaned.length()-1;

                System.out.println(cleaned.charAt(left)+":" +"                       "+ cleaned.charAt(right) + ":");

                while (left<right) {
                    if (cleaned.charAt(left) != cleaned.charAt(right)) {
                        System.out.println("not a palindrome");
                        break;
                    }
                    left++;
                }}}
