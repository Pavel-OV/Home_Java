package Task03_home;

import java.util.ArrayList;
import java.util.Random;


/*(Дополнительное) Реализовать алгоритм сортировки слиянием

Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class task_13 {
    public static void main(String[] args) {
        // Scanner number = new Scanner(System.in);
        // System.out.println(number "Введите число");
        ArrayList <Integer> rdm_list = new ArrayList<Integer>();
        int number =15;

        Random rdm = new Random();
        for (int i=0; i < number; i++){
            rdm_list.add(rdm.nextInt(1,50));
        }
        System.out.println("Выводим случайный массив");
        System.out.println(rdm_list);
        System.out.println("Оставляем чётные числа");
        for(int i=rdm_list.size()-1; i>=0; i--)
        {      
            if (rdm_list.get(i)%2 !=0) rdm_list.remove(i);
        }        
        System.out.print(rdm_list);
    }

    
}
