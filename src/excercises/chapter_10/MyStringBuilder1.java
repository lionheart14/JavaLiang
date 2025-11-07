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
                result[i] = Character.toLowerCase(c[i]);
            } else {
                result[i] = c[i];
            }
        }
        return new MyStringBuilder1(new String(result));
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] c = s.toCharArray();
        char[] result = new char[20];
        int cnt = 0;
        for(int i = begin; i < end; i++) {
            result[cnt] = c[i];
            cnt++;
        }
        return new MyStringBuilder1(new String(result));
    }

    @Override
    public String toString() {
        return s;
    }
}
