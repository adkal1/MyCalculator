import java.util.Scanner;

public class Main {
    public static String res;
    public static int a;
    public static int b;
    public static int ans;
    public static String input;
    public static String[] lst;
    public static String arg;



    public static void main(String[] args) {

        calculator(input);
    }

    public static String calculator(String input) {

        Scanner scanner = new Scanner(System.in);
        Main.input = scanner.nextLine();



        if (Main.input.contains("1") ||
                Main.input.contains("2") ||
                Main.input.contains("3") ||
                Main.input.contains("4") ||
                Main.input.contains("5") ||
                Main.input.contains("6") ||
                Main.input.contains("7") ||
                Main.input.contains("8") ||
                Main.input.contains("9") ||
                Main.input.contains("10")) {
            ArabNums.getArabNums();
            ArabNums.arabicCalculate();
        } else {
            RomanNums.getRomanNumber();
            RomanNums.romanCalculate();
            RomanNums.toRomanNumber();
        }
        return res;
    }

}
