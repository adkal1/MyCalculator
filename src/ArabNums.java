class ArabNums {

    public static void getArabNums() {

        Main.lst = Main.input.split(" ");
        Main.a = Integer.parseInt(Main.lst[0]);
        Main.arg = (Main.lst[1]);
        Main.b = Integer.parseInt(Main.lst[2]);


        for (int i = 0; i <= Main.lst.length; i++) {
            if (Main.input.length() > 7 || Main.input.length() < 4) {
                throw new NumberFormatException("Калькулятор должен выполнять операции с двумя числами");
            }
            if (i == ',' || i == '.') {
                throw new IllegalArgumentException("Калькулятор должен работать только с целыми числами");
            }
            if ((Main.a < 1 || Main.a > 10) || (Main.b < 1 || Main.b > 10)) {
                throw new IllegalArgumentException("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
            }
            if (!Main.arg.contains("+") && !Main.arg.contains("-") && !Main.arg.contains("*") && !Main.arg.contains("/")) {
                throw new NumberFormatException("Калькулятор должен выполнять операции сложения, вычитания, умножения и деления: a + b, a - b, a * b, a / b");
            }
        }
    }

    public static void arabicCalculate() {

        switch (Main.arg) {
            case "-" -> {
                Main.ans = Main.a - Main.b;
                Main.res = String.valueOf(Main.ans);
                System.out.println(Main.res);
             }
            case "+" -> {
                Main.ans = Main.a + Main.b;
                Main.res = String.valueOf(Main.ans);
                System.out.println(Main.res);
            }
            case "/" -> {
                Main.ans = Main.a / Main.b;
                Main.res = String.valueOf(Main.ans);
                System.out.println(Main.res);
            }
            case "*" -> {
                Main.ans = Main.a * Main.b;
                Main.res = String.valueOf(Main.ans);
                System.out.println(Main.res);

            }

        }
    }
}