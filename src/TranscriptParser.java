import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;

        String regex = """
                Student\\sNumber:\\s+(?<studentID>\\d{10}).* # Grabs Student Number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grabs Student Grade
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* # Grabs birthdate
                Gender:\\s+(?<gender>\\w).* # Grabs Student Gender
                State\\sID:\\s+(?<stateID>\\d{10}).*? # Grabs State ID
                Cumulative.*?\\sGPA\\s\\(Weighted\\)\\s+(?<weightedGPA>[\\d.]+)\\b.* # Grabs Weighted GPA
                Cumulative\\sGPA\\s\\(Unweighted\\)\\s+(?<unweightedGPA>[\\d.]+)\\b.* # Grabs Unweighted GPA
                """;
//        DOTALL allows regex engine to match on everything including new lines and carriage returns
        Pattern transPat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher match = transPat.matcher(transcript);

        if(match.matches()) {
            System.out.println(match.group("studentID"));
            System.out.println(match.group("grade"));
            System.out.println(match.group("birthMonth"));
            System.out.println(match.group("birthDay"));
            System.out.println(match.group("birthYear"));
            System.out.println(match.group("stateID"));
            System.out.println(match.group("weightedGPA"));
            System.out.println(match.group("unweightedGPA"));
        }

    }
}
