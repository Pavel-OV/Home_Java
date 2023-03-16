package Task03_home;


import java.util.ArrayList;

import java.util.Random;

import Task02_home.input;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class task_15 {
    public static void main(String[] args) {
        int number = input.Int("Введите размер массива");
        ArrayList <Integer> rdm_array = new ArrayList<Integer>();
     
        Random rdm = new Random();
        for (int i=0; i<number; i++){
            rdm_array.add(rdm.nextInt(1,50));
        }
        System.out.println("Выводим случайный массив");
        System.out.println(rdm_array);
        System.out.print("Минимальное число в массиве ");
        System.out.println(getMin(rdm_array));
        System.out.print("Максимальное число в массиве ");
        System.out.println(getMax(rdm_array));
        System.out.print("Среднее арифметическое значение массива ");
        System.out.print(getArithmeticMean(rdm_array));
        
    }


    public static int getMax(ArrayList<Integer> rdm_array) {
        int max_array = 0;
        for (int i = 0; i < rdm_array.size(); i++) {
            Integer x = rdm_array.get(i);
            if (max_array < x) 
                max_array = x;
            }
        return max_array;
     }
     public static int getMin(ArrayList<Integer> rdm_array) {
        int min_array = rdm_array.get(0);
        for (int i = 0; i < rdm_array.size(); i++) {
            Integer x = rdm_array.get(i);
            if (min_array > x) 
            min_array = x;}
        return min_array;
                
        }
            public static double getArithmeticMean(ArrayList<Integer> rdm_array) {
                double arithmetic_mean =0;
                for (int i = 0; i < rdm_array.size(); i++) {
                    arithmetic_mean= arithmetic_mean +rdm_array.get(i);}
                   
                return  arithmetic_mean/rdm_array.size();
                        
         }
}



// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!", name);
// iScanner.close();
