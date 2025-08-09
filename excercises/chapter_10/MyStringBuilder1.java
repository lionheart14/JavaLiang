package excercises.chapter_10;

import java.util.List;

public class MyStringBuilder1 {
    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s2) {
        return new MyStringBuilder1(s + s2.toString());
    }

    public MyStringBuilder1 append(int i) {
        return new MyStringBuilder1(s + i);
    }

    public int length() {
        return s.length();
    }

    public char charAt(int index) {
        char[] c = s.toCharArray();
        return c[index];
    }

    public MyStringBuilder1 toLowerCase() {
        char[] c = s.toCharArray();
        char[] result = new char[c.length];
        for(int i = 0; i < c.length; i++) {
            if(Character.isAlphabetic(c[i])) {
                result[i] = Character.toUpperCase(c[i]);
            } else {
                result[i] = c[i];
            }
        }
        return new MyStringBuilder1(result.toString());
    }

    // public MyStringBuilder1 substring(int begin, int end) {

    // }

    @Override
    public String toString() {
        return super.toString();
    }
}
