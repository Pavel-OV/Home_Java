// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Task02_home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

public class task11 {
    /**
     * @param args
     */
    public static void main(String[] args) {  
        try{ 
        
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Home_Java\\Task02_home\\spisok.txt"));
          reader = new BufferedReader(new FileReader("D:\\Home_Java\\Task02_home\\spisok.txt") );
          String line = reader.readLine();
          StringBuilder rows= new StringBuilder();
          while (line != null) {
            String[] str_array = line.split("[\",:]");
            for (String s : str_array) {
            switch (s) {
            case "фамилия" -> rows.append("Студент ");
            case "оценка" -> rows.append(" получил ");
            case "предмет" -> rows.append(" по предмету ");
            default -> rows.append(s);
            }
            }
        System.out.println(rows);
        rows.setLength(0);
        line = reader.readLine();
          }
   
        reader.close();
            
       }
        catch (IOException e) {
            e.printStackTrace();
        }
     
    }
}