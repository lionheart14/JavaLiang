package excercises.chapter_12;

import java.util.Scanner;

public class Hex2Dec {

    /**
     * Die main-Methode ist der Startpunkt des Programms.
     */
    public static void main(String[] args) {
        // Erstellt ein Scanner-Objekt, um Eingaben vom Benutzer zu lesen.
        Scanner input = new Scanner(System.in);

        // Fordert den Benutzer auf, eine Hexadezimalzahl einzugeben.
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        // Ruft die hexToDecimal-Methode auf, um die Eingabe umzuwandeln
        // und gibt das Ergebnis aus. Die Eingabe wird vorher in Großbuchstaben umgewandelt,
        // um sowohl 'a'-'f' als auch 'A'-'F' zu akzeptieren.
        System.out.println("The decimal value for hex number "
                + hex + " is " + hexToDecimal(hex.toUpperCase()));
        
        input.close(); // Schließt den Scanner, um Ressourcen freizugeben.
    }

    /**
     * Diese Methode wandelt einen String, der eine Hexadezimalzahl darstellt,
     * in eine Dezimalzahl (Integer) um.
     *
     * @param hex Der Hexadezimal-String, der umgewandelt werden soll.
     * @return Der berechnete Dezimalwert als int.
     */
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;

        try {
            Long.parseLong(hex);
        } catch (NumberFormatException e) {
            System.out.println("Hex number is not hex");
        }

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            // Das ist der Kern der Umwandlung:
            // Der bisherige Wert wird mit 16 multipliziert (die Basis des Hex-Systems)
            // und der Wert des aktuellen Zeichens wird addiert.
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        
        return decimalValue;
        }

    /**
     * Diese Hilfsmethode wandelt ein einzelnes Hexadezimal-Zeichen
     * in seinen entsprechenden Dezimalwert (0-15) um.
     *
     * @param ch Das Hexadezimal-Zeichen ('0'-'9' oder 'A'-'F').
     * @return Der Dezimalwert des Zeichens.
     */
    public static int hexCharToDecimal(char ch) {
        // Wenn das Zeichen ein Buchstabe von 'A' bis 'F' ist...
        if (ch >= 'A' && ch <= 'F') {
            // ...gib den Wert 10 + den Abstand von 'A' zurück.
            // z.B. für 'A': 10 + 'A' - 'A' = 10
            // z.B. für 'B': 10 + 'B' - 'A' = 11
            return 10 + ch - 'A';
        } else { // Andernfalls ist es eine Ziffer von '0' bis '9'.
            // Gib den numerischen Wert der Ziffer zurück.
            // z.B. für '0': '0' - '0' = 0
            // z.B. für '1': '1' - '0' = 1
            return ch - '0';
        }
    }
}
