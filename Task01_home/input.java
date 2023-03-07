import java.util.Scanner;

public class input {

    static Scanner input =new Scanner(System.in);
    public static int Int(String usersText){
        System.out.println(usersText);
        int value = input.nextInt();
        return value;
       }
    public static String Str(String usersText){
        System.out.println(usersText);
        String value = input.next();
        return value;
    }
    
    public static double Double(String usersText){
        System.out.println(usersText);
        double value = input.nextDouble();
        return value;
        }
    }
    
    
 // String users_string = input.Str("Введите строку");        System.out.println(cp866(users_string));    }    public static String cp866 (String users_string){        int counter = 1;        StringBuilder users_cp866 = new StringBuilder();        for (int i = 0; i < users_string.length()-1; i++) {            if (users_string.charAt(i)==users_string.charAt(i+1)){                counter++;            }            else {                if (counter==1){                    users_cp866.append(users_string.charAt(i));
