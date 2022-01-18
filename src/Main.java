import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        System.out.println("Калькулятор запущен");
        System.out.println("1. Произвести вычисление");
        System.out.println("2. Просмотреть историю операций");
        System.out.println("3. Выключить калькулятор");
        while (flag){
        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                i = 0;
            }
            Menu menu = new Menu();
            menu.choice();
            Story.story[i] = menu.num2;
            }
        }
    }
}
