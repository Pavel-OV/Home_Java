package Task06_home;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
public class task_29 {
   public static void main(String[] args) {
      Laptop notebooks1=new Laptop("Asus", "Windows", "16", "500", "18", "China");
      Laptop notebooks2=new Laptop("Huawei", "Lunex", "32", "1024", "24", "China");
      Laptop notebooks3=new Laptop("HP", "Windows", "64", "500", "17", "Japan");
      Laptop notebooks4=new Laptop("Toshiba", "Lunex", "32", "250", "16", "Japan");
      Laptop notebooks5=new Laptop("Lenovo", "Windows", "16", "350", "18", "China");
      Laptop notebooks6=new Laptop("Asus", "Dos", "16", "250", "15", "China");
      Set<Laptop> notebooks = new HashSet<>(List.of(notebooks1, notebooks2,
            notebooks3, notebooks4, notebooks5, notebooks6));
            System.out.println("Здравствуйте, хотите подобрать ноутбук?");

   

      Map<String, String> filter = filteringParametr() ;
      filtering(filter, notebooks);

   }
   public static String scanner() {
      Scanner scanner = new Scanner(System.in);
      String scan = scanner.nextLine();
      return scan;
   }

   public static Map<String, String> filteringParametr() {
      Map<String, String> choiceParametr = new HashMap<>();
      while (true) {
         System.out.println(" Если да/продолжем - нажмите 'y', если нет - нажмите 'n'");
         String client = scanner();
         if (client.equals("n")) {
            break;
         } else {

            System.out.println(
                  "Введите цифру, соответствующую необходимому параметру: \n 1 - Брэнд \n 2 - Операционная система \n 3 - Оперативная память \n 4 - Постоянная память\n 5 - Диаганаль\n 6 - Страна производства");
            String key = scanner();
            System.out.println("Введите значения для выбранного параметра: ");
            String value = scanner();

            choiceParametr.put(key, value);
         }
      }
      System.out.println(choiceParametr);
      return choiceParametr;

   }

   public static void filtering(Map<String, String> parameter, Set<Laptop> notebooks) {

      Set<Laptop> temp = new HashSet<>(notebooks);
      for (Laptop notebook : notebooks) {

         for (Object pair : parameter.keySet()) {

            if (pair.equals("1") && !notebook.getBrend().equals(parameter.get(pair))) {
               temp.remove(notebook);
            }
            for (Object pair1 : parameter.keySet()) {

               if (pair1.equals("2") && !notebook.getOperating_system().equals(parameter.get(pair1))) {
                  temp.remove(notebook);

               }
               for (Object pair2 : parameter.keySet()) {

                  if (pair2.equals("3") && !notebook.getRam().equals(parameter.get(pair2))) {
                     temp.remove(notebook);

                  }
                  for (Object pair3 : parameter.keySet()) {

                     if (pair3.equals("4") && !notebook.getHdd().equals(parameter.get(pair3))) {
                        temp.remove(notebook);

                     }
                     for (Object pair4 : parameter.keySet()) {

                        if (pair4.equals("5") && !notebook.getDiagonal().equals(parameter.get(pair4))) {
                           temp.remove(notebook);

                        }
                        for (Object pair5 : parameter.keySet()) {

                           if (pair5.equals("6") && !notebook.getCountry().equals(parameter.get(pair5))) {
                              temp.remove(notebook);
                           }
                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("По введенным параметрам ничего не найдено!");
      } else {
         System.out.println("Вот что мы можем предложить: \n" + temp.toString());
      }

   }
   }