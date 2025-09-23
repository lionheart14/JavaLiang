package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) {
        Path eingabePfad = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\eingabe.txt");
        Path ausgabePfad = Paths.get(args[1]);

        try {
            String inhalt = Files.readString(eingabePfad);
            System.out.println(inhalt);

            String inhaltNeu = inhalt.replace(args[0], "");
            System.out.println(inhaltNeu);

            Files.writeString(ausgabePfad, inhaltNeu);
        } catch (IOException e) {
            System.out.println("Fehler bei Datei");
            e.printStackTrace();
        }
    }
}
