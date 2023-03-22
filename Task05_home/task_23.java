package Task05_home;

import java.util.HashMap;
import java.util.Map;

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



// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
 public static void main(String[] args) {
  System.out.println("структуру телефонной книги с помощью HashMap");
  
    
  Map<Integer, String> map = new HashMap<>();
  map = pasport();
  
  for (Map.Entry<Integer,String> item: map.entrySet()){
    if(item.getValue().equals("Иванов"))
    System.out.println("Иванов "+item.getKey())  ;  
  }
  for (Map.Entry<Integer,String> item: map.entrySet()){
    //if(item.getKey()== 234561 )
    System.out.printf("Номер: %s Фамилия %s\n",item.getKey(),item.getValue());
  }


 }


  public static HashMap<Integer, String> pasport() {
  HashMap<Integer, String> pasport = new HashMap<>();
  pasport.put(123456, "Иванов");
  pasport.put(321456, "Васильев");
  pasport.put(234561, "Петрова");
  pasport.put(234432, "Иванов");
  pasport.put(654321,"Петрова");
  pasport.put(345678, "Иванов");  
  int number = 1;
  while(number !=0){
    number = input.Int("Введите номер паспорта");
    String surname = input.Str("Введите фамилию");
    pasport.put(number, surname);
  }
  return pasport;
}
}
