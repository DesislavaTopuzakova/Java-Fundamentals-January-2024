import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userAndPoints = new LinkedHashMap<>();
        Map<String, Integer> languageCount = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {

            if (input.contains("banned")) {
                //Katy-banned
                String username = input.split("-")[0];
                userAndPoints.remove(username);
            } else {
                //Peter-Java-84
                String username = input.split("-")[0];
                String language = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);

                if (!userAndPoints.containsKey(username)) {
                    userAndPoints.put(username, points);
                } else {
                    int existingPoints = userAndPoints.get(username);
                    if (points > existingPoints) {
                        userAndPoints.put(username, points);
                    }
                }

                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    int existingCount = languageCount.get(language);
                    languageCount.put(language, existingCount + 1);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        userAndPoints.entrySet().forEach(entry -> System.out.printf("%s | %d\n", entry.getKey(), entry.getValue()));
        System.out.println("Submissions:");
        languageCount.entrySet().forEach(entry -> System.out.printf("%s - %d\n", entry.getKey(), entry.getValue()));
    }
}
