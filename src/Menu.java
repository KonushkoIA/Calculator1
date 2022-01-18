public class Menu {
    int num1 = getInt();
    double num2;

    public int getInt(){
        System.out.println("Введите номер желаемого дествия:");
        int num;
        try{
            String enteredValue = Main.scanner.nextLine();
            num = Integer.parseInt(enteredValue);
        }
          catch (NumberFormatException e) {
              System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
              num = getInt();
          }
        return num;
    }

    public void choice() {
        if (num1 == 1) {
           Calculator calculator = new Calculator();
            System.out.println("Результат операции: " + calculator.result);
            num2 = calculator.getResult();
        }
        else if (num1 == 2) {
            Story story = new Story();
            String s = story.toString();
            System.out.println(s);
            Main.flag = false;
        }
        else if (num1 == 3) {
            Main.scanner.close();
            Main.flag = false;
            System.out.println("Конец работы калькулятора");
        }

    }
}
