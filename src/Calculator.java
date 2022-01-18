class Calculator {
    double num1 = getDouble();
    double num2 = getDouble();
    char operation = getOperation();
    double result = calculation(num1,num2,operation);

    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        try{
            String enteredValue = Main.scanner.nextLine();
            num = Double.parseDouble(enteredValue);
        }
        catch (NumberFormatException e) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию математическую операцию (+,-,*,/):");
        char operation;
        try{
            String enteredValue = Main.scanner.nextLine();
            operation = enteredValue.charAt(0);
        }
        catch (NumberFormatException e) {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getOperation();
        }
        return operation;
    }

    public static double calculation(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                Addition addition = new Addition();
                result = addition.apply(num1,num2);
                break;
            case '-':
                Subtraction subtraction = new Subtraction();
                result = subtraction.apply(num1,num2);
                break;
            case '/':
                Division division = new Division();
                result = division.apply(num1,num2);
                break;
            case '*':
                Multiplication multiplication = new Multiplication();
                result = multiplication.apply(num1,num2);
                break;
            default:
                System.out.println("Операция введена неверно. Повторите ввод.");
                result = calculation(num1, num2, getOperation());
        }
        return result;
    }

    public double getResult() {
        return result;
    }
}
