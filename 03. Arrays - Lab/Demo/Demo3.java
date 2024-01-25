import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. масивът е съвкупност от еднотипни елементи
        //2. масивът има постоянна дължина
        //3. дължина на масив = максималния брой елементи, които можем да съхраним
        //4. позиции / индекси -> 0 до последната (дължина на масива - 1)
        //5. задавате стойност в масив: array[0] = 56;
        //6. достъпвате стойност в масив: array[5]
        //7. foreach - обхожда масив, когато ни трябват елементите последователно, без значение от позицията
        //8. for - обхожда масив, когато ни трябват елементите и позициите им
        //9. Пълнене на масив

        //вариант 1 за запълване на масив(статичен с предварително зададени елементи)
        int [] dates = {4, 5, 6, 7};

        //вариант 2 за запълване на масив (празен масив и добавяме елементи)
        double[] prices = new double[10];
        prices[0] = 34.5;
        prices[1] = 23.5;

        //вариант 3 за запълване на масив (елементите се въвеждат на отделни редове)
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];

        for (int position = 0; position <= numbers.length - 1; position++) {
                numbers[position] = Integer.parseInt(scanner.nextLine());
        }

        //вариант 4 за запълване на масив (елементите са на един ред)
        String[] inputs = scanner.nextLine().split(" ");
        int [] integerNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double [] decimalNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        String names = "Desi Ivan Georgi Tanya";
        String [] namesArray = names.split(" "); //["Desi", "Ivan", "Georgi", "Tanya"]
        System.out.println(String.join(" ", namesArray)); //"Desi Ivan Georgi Tanya"

        //split (раздели): текст -> масив
        //join (обедини): масив -> текст

    }
}
