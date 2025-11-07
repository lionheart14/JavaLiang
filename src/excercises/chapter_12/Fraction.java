package excercises.chapter_12;

import excercises.chapter_12.NullDenumeratorException;

public class Fraction {
    final int numerator;
    final int denumerator;

    public Fraction(int numerator, int denumerator) {
        try {
            if(denumerator == 0) {
                throw new NullDenumeratorException()
            }
        } catch (NullDenumeratorException e) {
            System.out.println("Denumerator can not be zero");
        } 
        
        this.numerator = numerator;
        this.denumerator = denumerator;
    }
}
