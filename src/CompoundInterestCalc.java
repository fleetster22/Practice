import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CompoundInterestCalc {

    public static double calculate(int principal, double interest, double years) {

        final byte MONTHS = 12;
        double intRate = interest / 100;
        double calcInt = intRate / MONTHS + 1;
        double time = (MONTHS * years);

        double intEarned = Math.pow(calcInt, time);

        return (principal * intEarned);

    }

    public static void main(String[] args) {
//        the part after the semicolon is how to display negative numbers
        DecimalFormat df = new DecimalFormat(",###.00;(-#)");
        DecimalFormat pf = new DecimalFormat("#,###%; (-#%)");

        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
        BigDecimal balance = BigDecimal.valueOf(CompoundInterestCalc.calculate(10000,  3.875, 7.5));
        Double negBalance = -1657.9;

        System.out.println(df.format(negBalance));
        System.out.println(moneyFormatter.format(balance));
        System.out.println(pf.format(.08));
    }

}
