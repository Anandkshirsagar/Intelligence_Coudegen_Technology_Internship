package Intelligence_Coudegen_Technology_Internship;

import java.util.Scanner;

public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
