import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {

        int binaryInt = 0b1101;
        int hexInt = 0x1f;
        float myFloat = 22.22f;
        double myDouble = 3.2d;
        //double is more precise than float


        System.out.println(binaryInt);
        System.out.println(hexInt);
        //Review how OR works
        System.out.println(binaryInt | hexInt);
        //Review how AND works
        System.out.println(binaryInt & hexInt);


        float radius = 22.22f;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);
        System.out.println(Math.getExponent(radius));

        Random random = new Random();

        /*System.out.println("Random number");
        for(int i = 0; i < 10; i ++) {
            System.out.println(random.nextInt(100));
        }
        System.out.println("Secure Random Numbers:");

        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = secureRandom.generateSeed(31);

        for(int j = 0; j < 10; j++) {
        System.out.println(secureRandom.nextInt(100));
        }
        */

//        Extremely precise and memory hungry when you use string
        BigInteger num3 = new BigInteger("22");
        BigDecimal num4 = new BigDecimal("12.14");
        BigDecimal num5 = new BigDecimal("867.5");
        MathContext mc = new MathContext(6, RoundingMode.HALF_UP);
        System.out.println(num4.divide((num5), mc));
        System.out.println(num3 + " is a good number");



    }

}
