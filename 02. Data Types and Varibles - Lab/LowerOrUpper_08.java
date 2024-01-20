package DataTypes;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //на 0 позиция стои първата буква
        char symbol = scanner.nextLine().charAt(0);

        //проверка дали буквата е главна или малка

        //начин 1
        /*if (Character.isUpperCase(symbol)) {
            //главна буква
            System.out.println("upper-case");
        } else {
            //малка буква
            System.out.println("lower-case");
        }*/

        //начин 2

        int code = (int) symbol; //аски код на въведения символ
        if (code >= 97 && code <= 122) {
            //малка буква - код: [97; 122]
            System.out.println("lower-case");
        } else if (code >= 65 && code <= 90) {
            //голяма буква - код: [65; 90]
            System.out.println("upper-case");
        }
    }
}
