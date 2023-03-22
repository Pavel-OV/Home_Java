package Task02_home;
import java.io.File;
import java.io.FileWriter;

public class task12 {
    public static void main(String[] args) {
       
       
        // Integer n = 10;
        // String text = "TEST";
        // String file_name = "1.txt";
        // File file = new File(file_name);
        // try{
        // FileWriter writer = new FileWriter(file,false);
        // for (int i = 0; i < n; i++){
        // writer.write(text);
        // writer.write("\n");
        // }
        // writer.close();
        // System.out.println("Получилось!)");
        // }
        // catch (Exception e){
        // System.out.println("Что то пошло не так");
        // }
        // }
        // }
        String file_name = "D:\\Home_Java\\Task02_home\\math.txt";
        File file = new File(file_name);
        try{
        
        System.out.println("Реализовать простой калькулятор (+ - / *)");
        FileWriter writer = new FileWriter(file,true);
        int a = input.Int("Введите число a");
        String a2= Integer.toString(a);
        writer.write(a2);
        char math_znak = input.Str("Выберите действие (+ - / *)").charAt(0);
        writer.write(math_znak);
        int b = input.Int("Введите число b ");
        String b2= Integer.toString(b);
        writer.write(b2);
    
        int ud_pv = 0;
        switch (math_znak) {
            case '*':
                ud_pv = a * b;
                break;
            case '/':
                ud_pv = a / b;
                break;
            case '+':
                ud_pv = a + b;
                break;
            case '-':
                ud_pv = a - b;
                break;
            default:
                System.out.printf("Ошибка! Введите арифметический знак(+ - / *)");
                return;
        }
        System.out.printf("Результат вычислений ");
        System.out.printf(a+" "+math_znak+" "+b+" = "+ud_pv); 
        String ud= Integer.toString(ud_pv);
        writer.write("="+ud);

       
        writer.close();
    }
    catch (Exception e){
         System.out.println("Что то пошло не так");
    }

   
    }
}
    

