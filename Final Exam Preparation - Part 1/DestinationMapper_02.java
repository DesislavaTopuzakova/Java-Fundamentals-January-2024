package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allDestinations = scanner.nextLine();
        //"=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i="

        String regex = "([=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1"; //текст на шаблона
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(allDestinations);
        //съвкупност от текстовете, които ми отговарят на шаблона -> валидни дестинации
        //matcher = ["=Hawai=", "/Cyprus/"]

        List<String> validDestinations = new ArrayList<>();
        while (matcher.find()) {
            //matcher.group -> "=Hawai="
            validDestinations.add(matcher.group("destination"));
        }
        System.out.println("Destinations: " + String.join(", ", validDestinations));

        int travelPoints = 0;
        for (String destination : validDestinations) {
            travelPoints += destination.length();
        }
        System.out.println("Travel Points: " + travelPoints);
    }
}
