
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        
        String word = "";
        while(!word.equals("quit")){
            System.out.println("Type a word to see if it is in the dictionary");            
            word = scan.nextLine();
            boolean found = dictionary.find(word);
            if(found){
                System.out.println(word + " was found in the dictionary");
            }else{
                System.out.println(word + " was NOT found in the dictionary");
            }
            
        }
        
        
        scan.close();
    }
}
