import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //създаваме масива
        String [] names = new String[10]; //[null, null, null, null, null, null, null, null, null, null]
        names[0] = "Desi";//["Desi", null, null, null, null, null, null, null, null, null]
        names[1] = "Ivan";//["Desi", "Ivan", null, null, null, null, null, null, null, null]
        names[2] = "Miroslav";//["Desi", "Ivan", "Miroslav", null, null, null, null, null, null, null]
        //валидни позиции: >= 0 и < дължина
        System.out.println(names[8]);
    }
}
