package Task05_home;

public class task_27 {
    //     На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000
public static void main(String[] args) {
    int rows =8;
    int column =8;
    for (int i=1; i<=rows;i++){
        for(int j=1; j<=column;j++){
            System.out.printf("0 ");

        }
        System.out.println();
    }
}
public static Integer getFerz( Integer rows, Integer column){
    for (int i=1; i<=rows;i++){
        for(int j=1; j<=column;j++){
           return System.out.println("x");}
        }
    

}
}
