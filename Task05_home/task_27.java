package Task05_home;

import java.util.LinkedList;
import java.util.Random;

public class task_27 {
    // На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И
    // вывести Доску. Пример вывода доски 8x8
    // 0x000000
    // 0000x000
    // 00x00000
    public static void main(String[] args) {
        int[][] chess_board = new int[8][8];
        int ferz = 0;
        while (ferz != 8) {
            LinkedList<Integer> rows = new LinkedList<Integer>();
            LinkedList<Integer> column = new LinkedList<Integer>();
            for (int i = 0; i < chess_board.length; i++) {
                for (int j = 0; j < chess_board.length; j++) {
                    chess_board[i][j] = 1;
                }
            }
            Random rnd = new Random();
            Integer row = rnd.nextInt(8);
            Integer col = rnd.nextInt(8);
            chess_board[row][col]=8;
            rows.add(row);
            column.add(col);
            ferz = 1;
            for (int g = 0; g < chess_board.length; g++) {
                for (int v = 0; v < chess_board.length; v++) {
                    if (checkString(rows, g) && checkString(column, v)
                            && checkDiagonale(rows, column, g, v)) {
                        chess_board[g][v] = 8;
                        rows.add(g);
                        column.add(v);
                        ferz++;
                    }

                }
            }
        }
        System.out.println();

        for (int gt = 0; gt < chess_board.length; gt++) {
            for (int vt = 0; vt < chess_board.length; vt++) {
                System.out.print(chess_board[gt][vt] + " ");
            }
            System.out.println();
        }

    }

    public static boolean checkString(LinkedList<Integer> lst, int num) {
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == num) {
                return false;
            }

        }
        return true;
    }

    public static boolean checkDiagonale(LinkedList<Integer> lst1,
            LinkedList<Integer> lst2, int num1, int num2) {
        for (int i = 0; i < lst1.size(); i++) {
            if (Math.abs(lst1.get(i) - num1) == Math.abs(lst2.get(i) - num2)) {
                return false;
            }
        }
        return true;
    }

    }
