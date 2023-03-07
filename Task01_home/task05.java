import java.util.Scanner;

// Вывести все простые числа от 1 до 1000
public class task05 {
    public static void main(String[] args) {
        System.out.println(" Вывести все простые числа от 1 до 1000");
        //Scanner number = new Scanner(null)
        int number =input.Int("Введите число ");
        System.out.println("Список простых чисел от 1 до 1000");
        //int number =100;
        for(int i=1; i<=number; i++){
            boolean prime_number =true;
            for (int j=2; j<i;j++){
                if (i%j == 0){
                    prime_number=false;
                    break;
                   }
            }
            if(prime_number){
                         System.out.print(i+" ");
            
            }
        }

    }
    
}
