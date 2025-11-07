package excercises.chapter_01;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.population();
    }

    /**
     * 1.1 
     */
    private void display01() {
        System.out.println("Welcome to Java \nLearning Java Now \nProgramming is fun");
    }

    /**
     * 1.2
     */
    private void display02() {
        for(int i = 0; i < 5; i++) {
            System.out.println("I love Java");
        }
    }

    /**
     * 1.3 
     */
    private void display03() {
        System.out.println("    J\nJ  aaa   v     vaaa\nJ  J aa    v v    a a\nJ    aaaa   v     aaaa\n");
    }

    /**
     * 1.4
     */
    private void table() {
        int a = 1;
        System.out.println("a    a^2    a^3    a^4");
        for(int n = 0; n < 4; n++) {
            for(int i = 1; i <= 4; i++) {
                double x = Math.pow(a, i);
                System.out.print(x + "    ");
            }
            a++;
            System.out.println();
        }
    }

    /**
     * 1.11
     */
    private void population() {
        double currentPopulation = 312032486.0;
        double secondsInYear = 365 * 24 * 60 * 60;

        double birthInterval = secondsInYear / 7;
        double deathInterval = secondsInYear / 13;
        double immigrantInterval = secondsInYear / 45;

        for(int i = 0; i < 5; i++) {
            double newPopulation = currentPopulation + birthInterval - deathInterval + immigrantInterval;
            currentPopulation = newPopulation;
            System.out.println(newPopulation);
        }
    }
}
