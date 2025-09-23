package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise12_12 {
    public static void main(String[] args) {
        Path srcCode = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\" + args[0]);

        try {
            List<String> code = Files.readAllLines(srcCode);
            
            for (int i = 0; i < code.size(); i++) {
                StringBuilder now = new StringBuilder(code.get(i));
                if(now.toString().trim().equals("{")) {
                    StringBuilder before = new StringBuilder(code.get(i - 1));
                    before.append(" {");
                    code.set(i - 1, before.toString());
                    code.remove(i);
                }
            }


            for (String string : code) {
                System.out.println(string);
            }            
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }
}
