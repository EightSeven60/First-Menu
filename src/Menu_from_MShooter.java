import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class Menu_from_MShooter {
    public static void main(String[] args) throws IOException {
        String keystroke = " ";
        Scanner scanner = new Scanner(System.in);
        Settings settings = Settings.getInstance();

        while (!Objects.equals(keystroke, "b") && !Objects.equals(keystroke, "B")) {
            System.out.print("\n\n\n\n\nMAIN MENU\n\n1. Continue\n2. Game Saves\n3. New Game\n4. Settings\n\nPress 'B' to quit.\n");
            keystroke = scanner.next();
            if (Objects.equals(keystroke, "1")) {
                //load last saved save and start game
            } else if (Objects.equals(keystroke, "2")) {
                Save.run();
            } else if (Objects.equals(keystroke, "3")) {
                //asks for save name and starts the game
            } else if (Objects.equals(keystroke, "4")) {
                settings.run();
                settings = Settings.getInstance();
            }
        }
    }
}
