package excercises.chapter_13;

public class Calculator {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        Rational r1 = new Rational(args[0].charAt(0), args[0].charAt(2));
        Rational r2 = new Rational(args[2].charAt(0), args[2].charAt(2));

        Rational result = new Rational();

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = r1.add(r2);
                break;
            case '-': // Korrigiert von '−' zu '-'
                result = r1.subtract(r2);
                break;
            case '*': // Korrigiert von '.' zu '*' (Annahme, dass '.' ein Tippfehler für Multiplikation war)
                result = r1.multiply(r2);
                break;
            case '/':
                result = r1.divide(r2);
                break; // Hinzugefügt für Konsistenz, obwohl es in diesem Fall nicht streng notwendig ist
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result.toString());
    }
}
