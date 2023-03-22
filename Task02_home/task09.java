

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

// 4*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4

// Напишите метод, который сжимает строку. Пример: вход aaaabbbcddaaa.
// результат - a4b3cd2a3
// .charAt(i)
// stroka = "Привет"

// stroka1 = new String

// stroka1 = "Привет"

// stroka == stroka1 ----> False

package Task02_home;
import java.io.File;
import java.io.FileWriter;

public class task09 {
    public static void main(String[] args) {
          
        String file_name = "D:\\Home_Java\\Task02_home\\1.txt";
        File file = new File(file_name);
        System.out.println(" Введите число от 1 до 20, определяющее количество чисел");
        int size = input.Int("Введите число ");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = input.Int("Введите число ");

        }
        try{
            FileWriter writer = new FileWriter(file,true);
            
        for (int i = 0; i < size; i++) {
            writer.write(array[i]+" ");
            System.out.print(" " + array[i]);
        }
        writer.close();
        System.out.println();
        boolean isSorted = false;
        int buf;
        
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                    
                }
                writer.write(array[i]+" ");
                writer.write("\n");
                

               
            }
            
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        writer.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
            }

    }
}

// System.out.println(Arrays.toString(mas));
