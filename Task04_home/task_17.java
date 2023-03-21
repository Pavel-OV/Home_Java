package Task04_home;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

import Task02_home.input;

public class task_17 {
    public static void main(String[] args) {
        LinkedList <Integer> spisok =new LinkedList<Integer>();
        // LinkedList <Integer> revers_spisok =getReversLiinkedList(spisok);
        
        Random rdm =new Random();
        System.out.println("Дан LinkedList с несколькими элементами");
        int size = input.Int("Введите число элементов");
        for (int i=0; i<size; i++){
            spisok.add(rdm.nextInt(0,50));
        }
        System.out.println("Исходный список: "+spisok);
        LinkedList <Integer> revers_spisok =getReversLiinkedList(spisok);
        
        // while (revers_spisok.hasNext()) {
        //     System.out.print(" "+revers_spisok.next());  
        // }
      
        System.out.println("Перевернутый список: " + revers_spisok);
    }
    



      public static LinkedList<Integer>  getReversLiinkedList(LinkedList<Integer>spisok) 
        {
            LinkedList <Integer> revers_spisok =new LinkedList<Integer>();
          for (int i=spisok.size()-1; i>=0; i--){
            revers_spisok.add(spisok.get(i));}
            return revers_spisok;
          } 
}       