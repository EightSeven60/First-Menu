import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Save {
    //in proiect le aveam publice, de asta le-am lasat asa si aici
    public int state = 0;
    public String name;
    public int distance_travelled = 0;
    public char player_x = 10;
    public char player_y = 5;


    public static void run() throws FileNotFoundException {

        String keystroke = " ";
        int keystrokeInt = 0;
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {
            System.out.print("\n\n\n\n\nSAVE FILES\n\n");
            keystroke = " ";
            String[] saves = new String[9];
            File SaveNames = new File("saves/SaveNames.txt");
            if (SaveNames.exists() && SaveNames.length() > 0) {
                Scanner fileScanner = new Scanner(SaveNames);
                for (i = 0; i < 9 && SaveNames.canRead(); ++i) {
                    saves[i] = fileScanner.nextLine();
                }
            }
            else {
                for (i = 0; i < 9; ++i) {
                    saves[i] = i + ". Empty_Slot";
                }
            }
            for (i = 0; i < 9; ++i) {
                System.out.println(saves[i]);
            }
            System.out.println("\nPress 'B' to return.");
            do {
                keystroke = scanner.next();
            } while (!Objects.equals(keystroke, "1") &&
                    !Objects.equals(keystroke, "2") &&
                    !Objects.equals(keystroke, "3") &&
                    !Objects.equals(keystroke, "4") &&
                    !Objects.equals(keystroke, "5") &&
                    !Objects.equals(keystroke, "6") &&
                    !Objects.equals(keystroke, "7") &&
                    !Objects.equals(keystroke, "8") &&
                    !Objects.equals(keystroke, "9") &&
                    !Objects.equals(keystroke, "b") &&
                    !Objects.equals(keystroke, "B"));

            if (Objects.equals(keystroke, "1") ||
                    Objects.equals(keystroke, "2") ||
                    Objects.equals(keystroke, "3") ||
                    Objects.equals(keystroke, "4") ||
                    Objects.equals(keystroke, "5") ||
                    Objects.equals(keystroke, "6") ||
                    Objects.equals(keystroke, "7") ||
                    Objects.equals(keystroke, "8") ||
                    Objects.equals(keystroke, "9")) {
                keystrokeInt = Integer.parseInt(keystroke);
                //selectare save...
                //intrare in meniul de alegere operatie pe save...
                //et cetera
            }
        } while ((!Objects.equals(keystroke, "b") && (!Objects.equals(keystroke, "B"))));
    }
}