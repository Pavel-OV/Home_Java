package Task04_home;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

import Task02_home.input;

// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

// Пример 2
// Ввод: 1
// Ввод: +
// Ввод: 2
// Вывод: 3
// Ввод:+
// Ввод:4
// Вывод 7
// Ввод:*
// Ввод:3
// Вывод 21
// Отмена
// Вывод 7
// Отмена
// Вывод 3
// Ввод:-
// Ввод:1
// Вывод 2

public class task_21 {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        
        Stack <Object> zhurnal_math =new Stack<>();
        System.out.println("Реализовать простой калькулятор (+ - / *)");
        double ud_pv=0;
        double a = input.Double("Введите число a");
        zhurnal_math.push(a);
        String math_znak=input.Str("Введите оператор (+, -, *, /): ");
        double b= input.Double("Введите число b ");
        zhurnal_math.push(b);
        if (Objects.equals(math_znak, "+")) {
            ud_pv = a + b;
        } else if (Objects.equals(math_znak, "-")) {
            ud_pv = a - b;
        } else if (Objects.equals(math_znak, "*")) {
            ud_pv = a * b;
        } else if (Objects.equals(math_znak, "/")) {
            ud_pv = a / b;
        } else
            System.out.printf("Неверный ввод !");

        System.out.println("ответ:" + ud_pv);

        zhurnal_math.push(ud_pv);
        System.out.println(zhurnal_math);
        while (true) {
            math_znak = input.Str("\n Введите оператор (+, -, *, /), " +
                    "\n Либо ведите \"otmena\" для " +
                    "удаление последнего результата(otmena) ");
            if (Objects.equals(math_znak, "otmena")) {
                System.out.println("удаленное значение: " + zhurnal_math.pop());
                ud_pv = (double) zhurnal_math.peek();
                System.out.println("Текущее значение: " + ud_pv);
            } else {
                b = input.Double("Введите число: ");
                if (Objects.equals(math_znak, "+")) {
                    ud_pv = ud_pv + b;
                } else if (Objects.equals(math_znak, "-")) {
                    ud_pv = ud_pv - b;
                } else if (Objects.equals(math_znak, "*")) {
                    ud_pv = ud_pv * b;
                } else if (Objects.equals(math_znak, "/")) {
                    ud_pv = ud_pv / b;
                } else
                    System.out.printf("Неверный ввод !");
                    zhurnal_math.push(ud_pv);
                System.out.println("ответ = " + ud_pv);
            }
        System.out.println(zhurnal_math);
        }
      
    }
}

    
 