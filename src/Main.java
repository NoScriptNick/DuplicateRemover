import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        String s;
        String current;
        String newWord = "";

        System.out.println("Enter a word: ");
        s = scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            current = s.substring(i, i + 1);
            if (i == 0 || !s.substring(0, i).contains(current)) {
                newWord = newWord + current;
            }
        }
        System.out.println(newWord);
    }
}