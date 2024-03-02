import java.util.*;

public class Forcebook_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String teamName = input.split(" \\| ")[0];
                String playerName = input.split(" \\| ")[1];

                // 1. Ако няма такъв отбор, създаваме нов с празен списък с играчи.
                if (!teams.containsKey(teamName)) {
                    teams.put(teamName, new ArrayList<>());
                }

                // 2. Проверяваме този играч дали фигурира в друг отбор.
                boolean isThisPlayerPartOfAnotherTeam = false;
                for (List<String> team : teams.values()) {
                    if (team.contains(playerName)) {
                        isThisPlayerPartOfAnotherTeam = true;
                        break;
                    }
                }

                // 3. Ако този играч не фигурира в друг отбор го прибавяме към този отбор.
                if (!isThisPlayerPartOfAnotherTeam) {
                    teams.get(teamName).add(playerName);
                }
            } else if (input.contains("->")) {

                String playerName = input.split(" -> ")[0];
                String teamName = input.split(" -> ")[1];

                //1. Премахваме играча от текущия отбор.
                for (List<String> team : teams.values()) {
                    team.remove(playerName);
                }

                //2. Проверяваме дали отбора, в който трябва да отиде играча съществува.
                if (teams.containsKey(teamName)) {
                    teams.get(teamName).add(playerName);
                } else {
                    teams.put(teamName, new ArrayList<>());
                    teams.get(teamName).add(playerName);
                }
                System.out.printf("%s joins the %s side!%n", playerName, teamName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> players = entry.getValue();

            if (players.size() > 0) {
                System.out.println("Side: " + teamName + ", Members: " + players.size());
                players.forEach(player -> System.out.println("! " + player));
            }
        }
    }
}
