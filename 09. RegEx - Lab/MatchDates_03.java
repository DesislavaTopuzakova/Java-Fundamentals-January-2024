import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String wholeMatch = matcher.group(); //"13/Jul/1928"
            String day = matcher.group("day"); //"13"
            String month = matcher.group("month"); //"Jul"
            String year = matcher.group("year"); //"1928"
//            String day = matcher.group(1);
//            String month = matcher.group(3);
//            String year = matcher.group(4);
            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
        }
    }
}
