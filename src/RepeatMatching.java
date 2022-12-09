import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatMatching {

    public static void main(String[] args) {
        String people = """
        Flintstone, Fred, 1/1/1970
        Rubble, Barney, 2/2/1969
        Flintstone, Wilma, 3/3/1973
        Rubble, Betty, 4/4/1975
        """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";
        Pattern pat =Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        for(int i = 1; i <= people.length(); i++) {
            if (mat.find()) {
                System.out.println(mat.group("lastName"));
                System.out.println(mat.group("firstName"));
                System.out.println(mat.group("dob"));
            }

        }
    }



    }

