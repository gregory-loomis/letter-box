
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Dictionary {
    private final String filename = "dict.txt";
    private HashSet<String> dictionary = new HashSet<>();

    public Dictionary(){
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String word;
            while ((word = br.readLine()) != null) {
                dictionary.add(word.trim().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Error reading dictionary: " + e.getMessage());
        }
    }

    public boolean find(String word){
        return dictionary.contains(word.toLowerCase());
    }

}
