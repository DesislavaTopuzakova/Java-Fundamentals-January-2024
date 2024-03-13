import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // 1. Създавам регекс
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        // 2. Създавам шаблон
        Pattern pattern = Pattern.compile(regex);
        // 3. Създавам инструмент с помощта на който ще проверявам за съвпадения в прочетеният текст от конзолата
        Matcher matcher = pattern.matcher(text);

        List<String> validNumbers = new ArrayList<>();
        while (matcher.find()){
            validNumbers.add(matcher.group());
        }

        System.out.println(String.join(", ", validNumbers));
    }
}
