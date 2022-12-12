class RomanNums {
    public static void getRomanNumber() {

        String[] romanNames = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arabNames = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        Main.lst = Main.input.split(" ");

        String a = Main.lst[0];
        Main.arg = (Main.lst[1]);
        String b = Main.lst[2];

        for (int i = 0; i < arabNames.length; i++) {
            if (romanNames[i].equals(a)) {
                a = arabNames[i];
            }
            if (romanNames[i].equals(b)) {
                b = arabNames[i];
            }
        }

        Main.a = Integer.parseInt(a);
        Main.b = Integer.parseInt(b);

        int size = 0;
        for (char element : Main.input.toCharArray()) {
            if (element == ' ')
                size++;
        }

        if (size > 2 || Main.input.length() > 11 || Main.input.length() < 4) {
            throw new NumberFormatException("Калькулятор должен выполнять операции с двумя числам");
        }
        if (!Main.arg.contains("+") && !Main.arg.contains("-") && !Main.arg.contains("*") && !Main.arg.contains("/")) {
            throw new NumberFormatException("Калькулятор должен выполнять операции сложения, вычитания, умножения и деления: a + b, a - b, a * b, a / b");
        }
        if ((Main.a < Main.b) && (Main.input.contains("-") || Main.input.contains("/"))) {
            throw new NumberFormatException("Результатом работы калькулятора с римскими числами могут быть только положительные числа");
        }
    }

    public static void romanCalculate() {

        switch (Main.arg) {
            case "+" -> Main.ans = Main.a + Main.b;
            case "-" -> Main.ans = Main.a - Main.b;
            case "*" -> Main.ans = Main.a * Main.b;
            case "/" -> Main.ans = Main.a / Main.b;
        }
    }

    public static void toRomanNumber() {

        int units = Main.ans % 10;
        int tenths = (Main.ans % 100) / 10;
        int hundredths = (Main.ans % 1000) / 100;


        String lineToUnits = switch (units) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };


        String lineToTenths = switch (tenths) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };


        String lineToHundredths = "";
        if (hundredths == 1) {
            lineToHundredths = "C";
        }

        Main.res = lineToHundredths + lineToTenths + lineToUnits;
        System.out.println(Main.res);
    }
}