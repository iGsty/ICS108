
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word and a letter:");
        String word = input.nextLine();
        char letter = input.next().charAt(0);
        System.out.println(word);
        System.out.println(letter);

        System.out.println("number of occurrences is: "+ count(word, letter));
    }
    public static int count(String word, char letter){

        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }
}
