import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Practice {
    public static void main(String[] args) {
        System.out.println("Cat".matches("[a-fA-F]at"));
//        every letter except the ones after the caret
        System.out.println("Gunnar".matches("[^V-Z ]unnar"));

//        matches any letter a-z
        System.out.println("regex".matches("\\wegex"));

//        matches an uppercase A-Z
        System.out.println("regex".matches("\\wegex"));

//        matches any non-digit character
        System.out.println("regex".matches("\\Degex"));

//        matches any digit 0-9
        System.out.println("8675309".matches("\\d675309"));

        String phoneNumber = "720-369.6363";
        //System.out.println(phoneNumber.matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}"));
        String regex = "(\\d{3}[-.\\s])(\\d{3}[-.\\s])(\\d{4})";

//        compile first
        Pattern phoneNumPat = Pattern.compile(regex);
        Matcher match = phoneNumPat.matcher(phoneNumber);

        if(match.matches()) {
            System.out.println(match.group(1)); //matches 1st parenthesis group of regex
            System.out.println(match.group(2)); //matches 2nd parenthesis group of regex
            System.out.println(match.group(3));  //matches 3rd parenthesis group of regex

        }


    }
}
