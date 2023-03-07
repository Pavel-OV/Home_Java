// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69
public class task01 {
    public static void main(String[] args) {
        System.out.println("Посчитаем сумму и произведение чисел до ");
        int n =input.Int("Введите число ");
        System.out.println("Сумма чисел");
        int sumN=0;
        int proizvedenieN=1;
        for(int i=1; i<=n;i++){
            sumN=sumN+i;
            if(i!=n)
            System.out.print(i+ "+");
            else
            System.out.print(i+ "=");
        }
        System.out.println( sumN);
        System.out.println("Факториал чисел "+n);
        for(int j=1; j<=n;j++){
            proizvedenieN=proizvedenieN*j;
            if(j!=n)
            System.out.print(j+ "*");
            else
            System.out.print(j+ "=");
        }
        System.out.print(proizvedenieN);
    }
    
}
