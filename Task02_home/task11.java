// // Дана строка (получение через обычный текстовый файл!!!)

// // "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// // "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// // Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// // Студент [фамилия] получил [оценка] по предмету [предмет].

// // Пример вывода:
// // Студент Иванов получил 5 по предмету Математика.
// // Студент Петрова получил 4 по предмету Информатика.
// // Студент Краснов получил 5 по предмету Физика.

// package Task02_home;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.IOException;
// import java.lang.reflect.Type;

// public class task11 {
//     /**
//      * @param args
//      */
//     public static void main(String[] args) {
       
      
//         try (FileReader reader = new FileReader("D:\\Home_Java\\Task02_home\\spisok.txt");
//          BufferedReader br = new BufferedReader(reader)) 
//                   {
//         // StringBuilder  str_array=new  StringBuilder();
//         //StringBuilder rows= new StringBuilder();
        
//         String line;
//         String str ="Студент [фамилия] получил [оценка] по предмету [предмет].";
//         StringBuilder strochka= new StringBuilder(str);
//         String stroka =str.replaceAll("[\":]", " ");
//         System.out.println(strochka);

//         // String [] str = new String[] {"Студент","фамилия", "получил", "оценка" ,"по предмету", 
//         // "предмет."};
//         System.out.println(str);
//         // for (String s : str) {
//         //         System.out.print(s+" ");
//         //      }
//         System.out.println();
      
//         // while ((line = br.readLine()) != null) {
            
//         //     System.out.println(strochka);
//         //      String lins=line.replaceAll("[\":]", " ");
           
           
//         //      System.out.print(lins);
//         //      String str_array=lins.split(",");
//         //     //  String[] str_array = lins.split(",");
//         //      System.out.print(str_array);
             
//         //      for (String s : str_array) {
//         //         switch (s) {
//         //                  case "фамилия" -> strochka.append()("Студент ");
// //                         case "оценка" -> new_string.append(" получил ");
// // //                         case "предмет" -> new_string.append(" по предмету ");
// // //                         default -> new_string.append(s);
// // //                     }
// //                 System.out.print(s);
//                         System.out.println();
//                         System.out.println();
//                      System.out.println(lins);
//              }
           
        
        
//             // for (String item : line) {
//             //     System.out.println(item);
//             // }
//             // for (int i=0; i<line.length();i++){
//             //     str.append(line.charAt(i));
               
//             // }
            
            
           
             
//             //str_array = line.split(":\",");
//         }
//         // System.out.println(str_array);
//         // StringBuilder str = new StringBuilder(str_array);
     
//         // System.out.println(str_array);
      
       
//     catch (IOException e) {
//         e.printStackTrace();
//     }
    
//     }
// }

// // try
// // (BufferedReader reader =new BufferedReader(new FileReader("spisok.txt")))

// // reader = new BufferedReader(new FileReader("spisok.txt"));
// // String line = reader.readLine();
// // while (line != null) {
// // String[] str_array = line.split("[\",:]");
// // for (String s : str_array) {
// // switch (s) {
// // case "фамилия" -> new_string.append("Студент ");
// // case "оценка" -> new_string.append(" получил ");
// // case "предмет" -> new_string.append(" по предмету ");
// // default -> new_string.append(s);
// // }
// // }
// // System.out.println(new_string);
// // new_string.setLength(0);
// // line = reader.readLine();
// // }
// // reader.close();
// // } catch (IOException e) {
// // e.printStackTrace();
// // }
// // }
// // }