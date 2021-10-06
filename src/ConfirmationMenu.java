import java.util.Scanner;

public class ConfirmationMenu {
    public static boolean run(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n" + text + "\n1. Yes\n2. No");
        if (scanner.nextInt() == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
