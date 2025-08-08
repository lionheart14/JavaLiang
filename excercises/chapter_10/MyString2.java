package excercises.chapter_10;

public class MyString2 {
    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s2) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s2.charAt(i)) {
                continue;
            } else if(s.charAt(i) < s2.charAt(i)) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public MyString2 substring(int begin) {
        StringBuilder substring = new StringBuilder();
        for(int i = begin; i < s.length(); i++) {
            substring.append(s.charAt(i));
        }
        return new MyString2(substring.toString());
    }

    public MyString2 toUpperCase() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return new MyString2(sb.toString());
    }

    public char[] toChars() {
        char[] wtf = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            wtf[i] = s.charAt(i);
        }
        return wtf;
    }
}
