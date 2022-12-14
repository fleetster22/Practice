public class GuessItSwitch {

    public static void main(String[] args) {
        String card = "ace";
        int handValue = 15;

        int cardValue = switch (card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (handValue < 11) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
            default -> Integer.parseInt(card);
        };
        System.out.printf("Current Hand Value: %d%n", handValue);
        handValue = handValue + cardValue;
        System.out.printf("Current Card Value: %d%n", cardValue);
        System.out.printf("Total Hand Value: %d%n", handValue);
    }
}
