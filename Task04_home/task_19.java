package Task04_home;

import java.util.Deque;
import java.util.LinkedList;

import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// // dequeue() - возвращает первый элемент из очереди и удаляет его,
// // first() - возвращает первый элемент из очереди, не удаляя.
public class task_19 {
    public static void main(String[] args) {
        Deque<String> spisok = new LinkedList<>();
        System.out.println("Наш список, через который будем проверять методы:\n enqueue(), dequeue(),first()");
        spisok = addSpisok();
        printList(spisok);
        while (true) {
            System.out.println("Введиет номер операции:");
            System.out.println("1 - поместить элемент в конец очереди: enqueue() ");
            System.out.println("2 - вернуть первый элемент из очереди и удалить его: dequeue()");
            System.out.println("3 - вернуть первый элемент из очереди, не удаляя: first()");
            System.out.println("4 - Выход");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number == 1) {
                addEnqueue(spisok);
                printList(spisok);
                continue;
            }
            if (number == 2) {
                System.out.println("Первый элемент: " + dequeue(spisok) + " - удалён");
                printList(spisok);
                continue;
            }
            if (number == 3) {
                System.out.println("Первым элементом был: " + getFirst(spisok));
                continue;
            }
            if (number == 4)
                break;
            else {
                System.out.println("Для выхода из программы введите 4");
            }
        }
    }

    public static Deque<String> addSpisok() {
        Deque<String> spisok = new LinkedList<>();
        spisok.add("odin");
        spisok.add("dva");
        spisok.add("tri");
        spisok.add("chetyre");
        return spisok;
    }

    public static Deque<String> addEnqueue(Deque<String> spisok) {
        System.out.println("Введите элемент, который будем добавлять");
        Scanner nb = new Scanner(System.in);
        String elem = nb.nextLine();
        spisok.addLast(elem);
        return spisok;
    }

    public static void printList(Deque<String> spisok) {
        for (String didige : spisok) {
            System.out.printf(didige + " ");
        }
        System.out.println();

    }

    public static String dequeue(Deque<String> spisok) {
        String item = spisok.pollFirst();
        return item;
    }

    public static String getFirst(Deque<String> spisok) {
        return spisok.peekFirst();

    }
}