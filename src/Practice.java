public class Practice {
    public static void main(String[] args) {

        //        Concatenate all the things

        String text1 = "she";
        String text2 = "runs!";
        String finalString = String.format("%s %s", text1, text2);
        System.out.println(finalString);

        String firstLetter = text1.substring(0, 1).toUpperCase();
        String firstWord = text1.substring(1);
        String secondWordLetter = text2.substring(0, 1).toUpperCase();
        String secondWord = text2.substring(1);

//        To save memory, pre-allocate the size if it is known
        int capacity = firstLetter.length() + firstWord.length();
        String finalFirstWord = new StringBuilder(capacity)
                .append(firstLetter)
                .append(firstWord)
                .toString();
        String finalSecondWord = secondWordLetter.concat(secondWord);
        String finalPhrase = finalFirstWord + " " + finalSecondWord;
        System.out.println(finalPhrase);


        String phoneNumber = "(720) 369-6363";

        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

    }
    public static String parseAreaCode(String phoneNumber) {
        int openParenth = phoneNumber.indexOf("(");
        int closeParenth = phoneNumber.indexOf(")");

        return phoneNumber.substring(openParenth + 1, closeParenth);
    }

    public static String parseExchange(String phoneNumber) {
        int numberSpace = phoneNumber.indexOf(" ");
        int numberDash = phoneNumber.indexOf("-");

        return phoneNumber.substring(numberSpace + 1, numberDash);
    }
    public static String parseLineNumber(String phoneNumber) {
        int numberLength = phoneNumber.length();
        int numberDash = phoneNumber.indexOf("-");
        return phoneNumber.substring(numberDash + 1, numberLength);
    }


}
