public class Main {
    public static void main(String[] args) {

       String question = "Question:\nVariables that are shared by every instance of a class are:\n";

        MCQuestion obj = new MCQuestion(question,"a. public variables\nb. private variables\nc. instance variables\nd. class variables");

        System.out.println(obj.toString());

         /*
        a. public variables
        b. private variables
        c. instance variables
        d. class variables
        */
    }
}