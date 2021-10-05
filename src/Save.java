import java.util.Objects;
import java.util.Scanner;

public class Save {
    //in proiect le aveam publice, de asta le-am lasat asa si aici
    public int state = 0;
    public String name;
    public int distance_travelled = 0;
    public char player_x = 10;
    public char player_y = 5;


    public static void run() {

        String keystroke = " ";
        int keystrokeInt = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\n\n\n\n\nSAVE FILES\n\n");
            keystroke = " ";
            //in String-ul 'saves' citeam din filesystem numele fisierelor, le dau de la mine in cazul acesta
            String[] saves = new String[9];
            saves[0] = "1. my_save";
            saves[1] = "2. old_save";
            saves[2] = "3. friend_save";
            saves[3] = "4. backup_save";
            saves[4] = "5. Empty_Slot";
            saves[5] = "6. Empty_Slot";
            saves[6] = "7. Empty_Slot";
            saves[7] = "8. Empty_Slot";
            saves[8] = "9. Empty_Slot";
            for (int i = 0; i < 9; ++i) {
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