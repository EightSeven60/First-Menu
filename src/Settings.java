import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Settings {
    private int go_up;
    private int go_down;
    private int go_left;
    private int go_right;
    private int back;
    private int player_icon;
    private int empty_space;
    private int rock_far;
    private int rock_close;
    private int rock;
    private int font_color_default;
    private int font_color_rock;
    private int font_color_rock_close;
    private int font_color_rock_far;
    private static Settings settings = null;

    private Settings() {
        go_up = 119;
        go_down = 115;
        go_left = 97;
        go_right = 100;
        back = 'B';
        player_icon = 3;
        empty_space = ' ';
        rock_far = 176;
        rock_close = 177;
        rock = 178;
        font_color_default = 4;
        font_color_rock = 244;
        font_color_rock_close = 116;
        font_color_rock_far = 132;
    }

    @Override
    public String toString() {
        return go_up +
                " " + go_down +
                " " + go_left +
                " " + go_right +
                " " + back +
                " " + player_icon +
                " " + empty_space +
                " " + rock_far +
                " " + rock_close +
                " " + rock +
                " " + font_color_default +
                " " + font_color_rock +
                " " + font_color_rock_close +
                " " + font_color_rock_far;
    }

    public int run() throws IOException {
        String keystroke;
        char escape = 0;
        Scanner scanner = new Scanner(System.in);
        File settings = new File("settings.txt");

        if (settings.length() > 0) {
            Scanner fileScanner = new Scanner(settings);
            go_up = fileScanner.nextInt();
            go_down = fileScanner.nextInt();
            go_left = fileScanner.nextInt();
            go_right = fileScanner.nextInt();
            fileScanner.nextInt();
            player_icon = fileScanner.nextInt();
            empty_space = fileScanner.nextInt();
            rock_far = fileScanner.nextInt();
            rock_close = fileScanner.nextInt();
            rock = fileScanner.nextInt();
            font_color_default = fileScanner.nextInt();
            font_color_rock = fileScanner.nextInt();
            font_color_rock_close = fileScanner.nextInt();
            font_color_rock_far = fileScanner.nextInt();
        }

        while (escape == 0) {
            System.out.flush();
            System.out.print("\n\n\n\n\nOPTIONS - some have the representative characters but also their ASCII codes.\n\n" +
                    "0. go forward = any key that isn't assigned to some other action\n" +
                    "1. go_up = '" + (char)go_up + "'\n" +
                    "2. go_down = '" + (char) go_down + "'\n" +
                    "3. go_left = '" + (char)go_left + "'\n" +
                    "4. go_right = '" + (char)go_right + "'\n" +
                    "5. back = 'B' or 'b'\n" +
                    "6. player_icon = '" + (char)player_icon + "'\n" +
                    "7. empty_space = '" + (char)empty_space + "'\n" +
                    "8. rock_far = '" + (char)rock_far + "'\n" +
                    "9. rock_close = '" + (char)rock_close + "'\n" +
                    "q. rock = '" + (char)rock + "'\n");
            System.out.print("w. font_color_default = " + font_color_default + " ");
            //set default text color
            System.out.print("'" + (char)player_icon + "'\n");
            //set text color to default
            System.out.print("e. font_color_rock = " + font_color_rock + " ");
            //set text color to rock background color
            System.out.print("'" + (char)player_icon + "'\n");
            //set text color to rock_close background color
            System.out.print("r. font_color_rock_close = " + font_color_rock_close + " ");
            //etc
            System.out.print("'" + (char)player_icon + "'\n");
            //etc
            System.out.print("t. font_color_rock_far = " + font_color_rock_far + " ");
            //etc
            System.out.print("'" + (char)player_icon + "'\n");
            //etc
            System.out.print("\np. Load default settings\nPress 'B' to save and exit settings menu.\n");

            keystroke = scanner.next();
            switch (keystroke) {
                case "1" -> {
                    System.out.print("Press new key.\n1. go_up = ");
                    go_up = System.in.read();
                }
                case "2" -> {
                    System.out.print("Press new key.\n2. go_down = ");
                    go_down = Integer.parseInt(scanner.next());
                }
                case "3" -> {
                    System.out.print("Press new key.\n3. go_left = ");
                    go_left = Integer.parseInt(scanner.next());
                }
                case "4" -> {
                    System.out.print("Press new key.\n4. go right = ");
                    go_right = Integer.parseInt(scanner.next());
                }
                case "5" -> {
                    System.out.print("This keybind cannot be changed. Press any key to return.\n");
                    scanner.next();
                }
                case "6" -> {
                    System.out.print("Enter new ASCII code.\n6. player_icon = ");
                    player_icon = Integer.parseInt(scanner.next());
                }
                case "7" -> {
                    System.out.print("Enter new ASCII code.\n7. empty_space = ");
                    empty_space = Integer.parseInt(scanner.next());
                }
                case "8" -> {
                    System.out.print("Enter new ASCII code.\n8. rock_far = ");
                    rock_far = Integer.parseInt(scanner.next());
                }
                case "9" -> {
                    System.out.print("Enter new ASCII code.\n9. rock_close = ");
                    rock_close = Integer.parseInt(scanner.next());
                }
                case "q" -> {
                    System.out.print("Enter new ASCII code.\nq. rock = ");
                    rock = Integer.parseInt(scanner.next());
                }
                case "w" -> {
                    System.out.print("Enter new value.\nw. font_color_default = ");
                    font_color_default = Integer.parseInt(scanner.next());
                }
                case "e" -> {
                    System.out.print("Enter new value.\ne. font_color_rock = ");
                    font_color_rock = Integer.parseInt(scanner.next());
                }
                case "r" -> {
                    System.out.print("Enter new value.\nr. font_color_rock_close = ");
                    font_color_rock_close = Integer.parseInt(scanner.next());
                }
                case "t" -> {
                    System.out.print("Enter new value.\nt. font_color_rock_far = ");
                    font_color_rock_far = Integer.parseInt(scanner.next());
                }
                case "p" -> {
                    if (!ConfirmationMenu.run("Are you sure you want to load default settings?")) {
                        break;
                    }
                    go_up = 119;
                    go_down = 115;
                    go_left = 97;
                    go_right = 100;
                    back = 'B';
                    player_icon = 3;
                    empty_space = ' ';
                    rock_far = 176;
                    rock_close = 177;
                    rock = 178;
                    font_color_default = 4;
                    font_color_rock = 244;
                    font_color_rock_close = 116;
                    font_color_rock_far = 132;
                    System.out.print("Loaded defaults. Press any key to continue.\n");
                    System.in.read();
                }
                case "b", "B" -> escape = 1;
                default -> {
                }
            }
        }
        FileWriter fileWriter = new FileWriter("settings.txt");
        settings.createNewFile();
        fileWriter.write(this.toString());
        fileWriter.close();
        return 0;
    }
    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

}
