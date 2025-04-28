package excercises.chapter_04;

public class CheckPoint {
    public static void main(String[] args) {
        CheckPoint cp = new CheckPoint();
        cp.stringFormat();
        System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
    }

    /**
     * 4.2.5
     */
    public void randomInteger() {
        int randInt = 34 + (int) (Math.random() * (55 - 34));
        System.out.println(randInt);
    }

    /**
     * 4.4.5
     */
    public void stringFormat() {
        String s1 = " Welcome ";
        String s2 = " welcome ";

        boolean isEqual1 = s1.equals(s2);
        boolean isEqual2 = s1.toLowerCase().equals(s2);
        
        int x1 = s1.compareTo(s2);
        int x2 = s1.toLowerCase().compareTo(s2);

        boolean b1 = s1.startsWith("AAA");
        boolean b2 = s1.endsWith("AAA");

        int x3 = s1.length();
        char x4 = s1.charAt(0);

        String s3 = s1.concat(s2);
        String s4 = s1.substring(1);
        String s5 = s1.substring(1, 4);

        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        String s8 = s1.trim();

        int x5 = s1.indexOf('e');
        int x6 = s1.indexOf("abc");
    }
}
