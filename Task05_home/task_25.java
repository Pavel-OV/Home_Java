package Task05_home;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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
    List<String> nams =new LinkedList<>();
    System.out.println("Находим все имена в списке");
    nams=printnames(map);
    
    System.out.println(nams);
    System.out.println("Считаем сколько раз повторяются имена");
    Map <String,Integer> coutNams=new HashMap<>();
    coutNams=countnames(nams);
    System.out.println(coutNams.entrySet());
    System.out.println("Отсортируем список имён по убыванию");
    Map<String, Integer> sortedMap = sortedmap(coutNams);
    sortedMap.entrySet().forEach(System.out::println); 
  
  


}
public static HashMap< String, String> spisok() {
  HashMap<String, String> spisok = new HashMap<>();
spisok.put("Иванов", "Иван");
spisok.put("Белова", "Кристина");
spisok.put("Мусина", "Анна");
spisok.put("Петрова", "Светлана");
spisok.put("Крутова","Анна");
spisok.put("Юрин","Иван");
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
public static LinkedList<String> printnames(Map<String, String>map) {
  List<String> nams =new LinkedList<>();
  for (Entry<String, String> entry : map.entrySet()) {
    nams.add(entry.getValue());
    
  }
  return (LinkedList<String>) nams;
}
public static HashMap< String, Integer> countnames(List<String> nams) {
  Map <String,Integer> coutNams=new HashMap<>();
  for (String na : nams) {
    if (!coutNams.containsKey(na)) {
      coutNams.put(na, 1);
    } else coutNams.put(na, coutNams.get(na) + 1);}
    return (HashMap<String, Integer>) coutNams;
}
public static HashMap<String, Integer> sortnames(LinkedList<String> listValues) {
  HashMap<String, Integer> popValue = new HashMap<>();
  for (String name : listValues) {
      if (!popValue.containsKey(name)) {
          popValue.put(name, 1);
      } else popValue.put(name, popValue.get(name) + 1);
  }
  return popValue;
}
public static Map<String, Integer> sortedmap(Map<String, Integer> coutNams) {
  
Map<String, Integer> sortedMap = coutNams.entrySet().stream() 
  .sorted(Comparator.comparingInt(e -> -e.getValue())) 
  .collect(Collectors.toMap( 
  Map.Entry::getKey, 
  Map.Entry::getValue, 
  (a, b) -> { throw new AssertionError(); }, 
  LinkedHashMap::new 
  )); 
  return sortedMap;
  

}

// public void printMap( map){
//   for (Entry<String, String> entry : map.entrySet()) {
//   System.out.println(entry.getKey()+" "+entry.getValue());
// }

// }
// String s = "title";
// //input.Str("Введите строку1");  String k = "paper";//input.Str("Введите строку2");
//  System.out.println(is_isomorphe(s,k));
//    }   
//  public static boolean is_isomorphe (String st, String kt)
//  {  if (st.length()!=kt.length())
//   {return false;}
//     Map <Character, Character> isomor = new HashMap<>();
//     for (int i = 0; i < st.length(); i++) {  
//     if (!isomor.containsKey(st.charAt(i))){  isomor.putIfAbsent(st.charAt(i), kt.charAt(i));  }  else {  if (isomor.get(st.charAt(i)) != kt.charAt(i)){  return false;  }  }  }  Map <Character, Character> isomor_reverse = new HashMap<>();  for (int i = 0; i < kt.length(); i++) {  if (!isomor_reverse.containsKey(kt.charAt(i))){  isomor_reverse.putIfAbsent(kt.charA

}