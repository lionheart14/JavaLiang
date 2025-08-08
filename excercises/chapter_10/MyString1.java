package excercises.chapter_10;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public MyString1 toLowerCase() {
        char[] charsLowerCase = new char[this.length()];
        for(int i = 0; i < this.length(); i++) {
            char c = Character.toLowerCase(chars[i]);
            charsLowerCase[i] = c;
        }
        return new MyString1(charsLowerCase);
    }

    public MyString1 substring(int begin, int end) {
        char[] outputString = new char[end - begin];
        int indexCounter = 0;
        for(int i = begin; i < end; i++) {
            outputString[indexCounter] = chars[i];
            indexCounter++;
        }
        return new MyString1(outputString);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Character.toChars(i));
    }

    public boolean equals(MyString1 s) {
        if(s.length() != this.length()) return false;

        for(int i = 0; i < this.length(); i++) {
            if(this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public char charAt(int index) {
        for(int i = 0; i < this.length(); i++) {
            if(i == index) {
                return chars[i];
            }
        }
        throw new IllegalArgumentException("Index out of bound");
    }

    public int length() {
        int length = 0;
        for (char character : chars) {
            length++;
        }
        return length;
    }

    public char[] getChars() {
        return chars;
    }
}
