public class Question01 {
    public static void main(String[] args) {
        for (int i = 100; i < 201; i++){
            if (i % 3 == 0 ^ i % 4 == 0)
                System.out.println("this number: "+ i);
        }
    }
}