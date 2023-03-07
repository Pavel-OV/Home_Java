// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class task07 {
    public static void main(String[] args) {

        System.out.println("Реализовать простой калькулятор (+ - / *)");
        double a = input.Double("Введите число a");
        char math_znak = input.Str("Выберите действие (+ - / *)").charAt(0);
        double b = input.Double("Введите число b ");
        double ud_pv = 0;
        switch (math_znak) {
            case '*':
                ud_pv = a * b;
                break;
            case '/':
                ud_pv = a / b;
                break;
            case '+':
                ud_pv = a + b;
                break;
            case '-':
                ud_pv = a - b;
                break;
            default:
                System.out.printf("Ошибка! Введите арифметический знак(+ - / *)");
                return;
        }
        System.out.printf("Результат вычислений "); 
        System.out.printf(a+" "+math_znak+" "+b+" = "+ud_pv); 
    }

    private static char charAt(int i) {
        return 0;
    }
}
