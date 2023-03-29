package Task05_home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.element.Name;

import Task02_home.input;

public class task_23 {
//     Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568
 public static void main(String[] args) {
  System.out.println("Структура телефонной книги ");
  Map<String, ArrayList<Integer>> abonents = new HashMap<String, ArrayList<Integer>>();
  while (true) {
    System.out.println("1)Создание абонета \n2)Поиск абонета");
    Integer number = input.Int("Выберите номер команды");
    if(number==1){
      System.out.println("Создание и добавления абонета\nФамилия");
      Scanner nam = new Scanner(System.in, "cp866");
      String name = nam.nextLine();
      System.out.println("Номер абонента");
      Scanner num = new Scanner(System.in);
      int numbers = num.nextInt();
      abonents = addPhones(abonents, name, numbers);     
      System.out.println("Абонент записан!\n");
      continue;
       }
    if (number==2)
    System.out.println("Поиск фамилии");
    Scanner s_n = new Scanner(System.in,"cp866");
    String surname = s_n.nextLine();
    printAbonents(abonents,surname);
    break;
    
    }
  
 
}
public static  Map<String, ArrayList<Integer>> addPhones(Map<String, ArrayList<Integer>>abonents,String name, Integer numbers) {
  if(abonents.containsKey(name)){
    abonents.get(name).add(numbers);
  }else{
    abonents.put(name, getList(name, numbers));  

  }
    return abonents;
  }
  public static ArrayList<Integer> getList(String name, Integer number) {
    List<Integer> listphones = new ArrayList<>();
    listphones.add(number);
    return (ArrayList<Integer>) listphones;
}
  public static  void printAbonents(Map<String, ArrayList<Integer>>abonents,String name) {
     System.out.println("Абонент " + name + " имеет следующие номера: " + abonents.get(name));
    
  }

}
