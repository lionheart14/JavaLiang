package excercises.chapter_12;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise12_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();
        System.out.print("Enter the gender: ");
        String gender = input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();
        
        try {
            String urlString = "http://liveexample.pearsoncmg.com/data/babynamesranking" + year + ".txt";
            URL url = new URL(urlString);

            // Wir erstellen eine leere Liste, um die Zeilen zu speichern
            List<String> allLines = new ArrayList<>();
            
            // Wir benutzen einen neuen Scanner, der direkt von der URL liest
            Scanner urlScanner = new Scanner(url.openStream());
            while(urlScanner.hasNextLine()){
                allLines.add(urlScanner.nextLine());
            }
            urlScanner.close();

            if(gender.equals("M")) {
                for(int i = 0; i < allLines.size(); i++) {
                    String[] lineContentSplit = allLines.get(i).split("\s+");

                    if(lineContentSplit[1].equals(name)) {
                        System.out.println(name + " is ranked #" + lineContentSplit[0] + " in year " + year);
                        return;
                    }
                }
            } else if (gender.equals("F")){
                for(int i = 0; i < allLines.size(); i++) {
                    String[] lineContentSplit = allLines.get(i).split("\s+");
                    if(lineContentSplit[3].equals(name)) {
                        System.out.println(name + " is ranked #" + lineContentSplit[0] + " in year " + year);
                        return;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading web url");
        }

        System.out.println("The name " + name + " is not ranked in year " + year);
    }
}
