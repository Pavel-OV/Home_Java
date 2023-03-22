package Task02_home;

public class task10 {
    // Напишите метод, который принимает на вход строку (String) и 
    //определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций
 public static void main(String[] args) {
    String pallidrom = input.Str("Введите слово из пяти букв");
    System.out.println("Проверяем является ли введённое слово палидромом");
    System.out.println(searchPallidrom(pallidrom));
    
    }
   
  public static boolean searchPallidrom(String pallidrom){
    if(pallidrom.length()!=5)
        return false;
   
    if((pallidrom.charAt(0)==pallidrom.charAt(4))&&(pallidrom.charAt(1)==pallidrom.charAt(3)))
        return true;
    else{
           return false;
        }
    }

}