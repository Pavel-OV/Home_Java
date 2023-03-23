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




 public static void main(String[] args) {
  System.out.println("структуру телефонной книги с помощью HashMap");
  
    
  Map< String, Integer> map = new HashMap<>();
  map = pasport();
  
  // for (Map.Entry< String, Integer> item: map.entrySet()){
  //   if(item.getValue().equals("Иванов"))
  //   System.out.println("Иванов "+item.getKey())  ;  
  // }
  for (Map.Entry< String, Integer> item: map.entrySet()){
    //if(item.getKey()== 234561 )
    System.out.printf("Фамилия: %s Номер телефона %s\n",item.getKey(),item.getValue());
  }


 }


  public static HashMap< String, Integer> pasport() {
  HashMap<String, Integer> pasport = new HashMap<>();
  pasport.put("Иванов", 123456);
  pasport.put("Васильев", 321456);
  pasport.put("Петрова", 234561);
 
  int number = 1;
  while(number !=0){
    number = input.Int("Введите фамилию");
    String surname = input.Str("Добавте номер телефона");
    pasport.put(surname, number);
  }
  return pasport;
}
}
