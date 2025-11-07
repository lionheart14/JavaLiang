package excercises.chapter_10;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        this("");
    }

    public MyStringBuilder2(char[] chars) {
        s = new String(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s2) {
        char[] c = s.toCharArray();
        char[] s2c = s2.getS().toCharArray();
        char[] result = new char[c.length + s2.length()];

        for(int i = 0; i < offset; i++) {
            if(i < offset) result[i] = c[i];
        }

        int cnt = 0;
        for(int i = offset; i < offset + s2.length(); i++) {
            result[i] = s2c[cnt];
            cnt++;
        }

        int cnt2 = offset;
        for(int i = offset + s2.length(); i < result.length; i++) {
            result[i] = c[cnt2];
            cnt2++;
        }

        return new MyStringBuilder2(new String(result));
    }

    public MyStringBuilder2 reverse() {
        char[] c = s.toCharArray();
        char[] result = new char[s.length()];
        int cnt = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            result[i] = c[cnt];
            cnt++;
        }

        return new MyStringBuilder2(new String(result));
    }

    public MyStringBuilder2 substring(int begin) {
        char[] result = new char[s.length() - begin];
        char[] c = s.toCharArray();

        for(int i = 0; i < result.length; i++) {
            result[i] = c[begin];
            begin++;
        }

        return new MyStringBuilder2(new String(result));
    }

    public MyStringBuilder2 toUpperCase() {
        char[] result = new char[s.length()];
        char[] c = s.toCharArray();

        for(int i = 0; i < result.length; i++) {
            char characterToCheck = c[i];
            if(Character.isAlphabetic(characterToCheck)) {
                result[i] = Character.toUpperCase(characterToCheck);
            } else {
                result[i] = c[i];
            }
        }

        return new MyStringBuilder2(new String(result));
    }

    public int length() {
        return s.length();
    }

    public String getS() {
        return new String(s);
    }
}
