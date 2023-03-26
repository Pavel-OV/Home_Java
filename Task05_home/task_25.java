package Task05_home;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Task02_home.input;

public class task_25 {
    // Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.
public static void main(String[] args) {
    System.out.println("Дан список сотрудников: ");
    
      
    Map< String, String> map = new HashMap<>();
    map = spisok();
    for (Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey()+" "+entry.getValue());
    }
    
    System.out.println("Отсортировать список по убыванию популярности имени");



}
public static HashMap< String, String> spisok() {
  HashMap<String, String> spisok = new HashMap<>();
spisok.put("Иванов", "Иван");
spisok.put("Белова", "Кристина");
spisok.put("Мусина", "Анна");
spisok.put("Петрова", "Светлана");
spisok.put("Крутова"," Анна");
spisok.put("Юрин","Иван ");
spisok.put("Лыков", "Петр");
spisok.put("Чернов" ,"Павел");
spisok.put("Мечников","Иван");
spisok.put("Владимирова", "Анна");
spisok.put("Лугова", "Марина");
spisok.put("Рыкова", "Мария");
spisok.put("Савина" ,"Мария");
spisok.put("Светлова","Марина");
spisok.put("Федорова", "Мария");
spisok.put("Чернышов" ,"Петр");
spisok.put("Петин", "Петр");
spisok.put("Ежов", "Иван");
 
  
  return spisok;
}
}