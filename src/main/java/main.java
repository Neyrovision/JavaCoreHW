import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 100;
        int intgr = 1000;
        long lng = 10000L;
        float flt = 10.11f;
        double dbl = 100.222;
        char chr = '\u2242';
        boolean boolValue = false;
        int[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"one", "two", "three", "four", "five"};
        String stringValue = "Строка String";
        StringBuilder stringBuilderValue = new StringBuilder("Строка StringBuilder");

        System.out.println("Введите 4 аргумента");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Результат method1 " + method1(a, b, c, d));
        System.out.println("Результат method2 " + method2(a, b));
        System.out.println("Результат method3 " + method3(a));
        System.out.println("Результат method4 " + method4(a));
        System.out.println("Введите свое имя:");
        String name = scanner.next();
        method5(name);
    }

    // Пункт 3 ДЗ
    static int method1(int a, int b, int c, int d) {
        return ( a * (b + (c / d)) );
    }

    // Пункт 4 ДЗ
    static boolean method2(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20) return true;
        else {
            return false;
        }
    }

    // Пункт 5 ДЗ
    static String method3(int a){
        if(a >= 0) return "Положительное число";
        else if(a < 0) return "Отрицательное число";
        return "ошибка";
    }

    // Пункт 6 ДЗ
    static boolean method4(int a){
        if(a >= 0) return false;
        else return true;
    }

    // Пункт 7 ДЗ
    static void method5(String name){
        System.out.printf("Привет, %s!/n", name);
    }


}
