import java.util.*;

public class PlantDiscovery_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRatings = new LinkedHashMap<>();

        // 1. Откриваме нови растения
        int n = Integer.parseInt(scanner.nextLine());
        for (int plant = 1; plant <= n; plant++) {
            //Arnoldii<->4
            //Arnoldii<->1
            String[] plantInformation = scanner.nextLine().split("<->");
            String name = plantInformation[0];
            int rarity = Integer.parseInt(plantInformation[1]);
            plantRarity.put(name, rarity);
            plantRatings.put(name, new ArrayList<>());
        }

        // 2. Оценяваме откритите растения
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {

            String[] commandParts = command.split("[: -]+");
            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (plantRarity.containsKey(plantName)) {
                switch (commandName) {
                    case "Rate":
                        double rating = Double.parseDouble(commandParts[2]);
                        plantRatings.get(plantName).add(rating);
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(commandParts[2]);
                        plantRarity.put(plantName, newRarity);
                        break;
                    case "Reset":
                        plantRatings.get(plantName).clear();
                        break;
                }
            } else {
                System.out.println("error");
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> plantRarityInformation : plantRarity.entrySet()) {

            String plantName = plantRarityInformation.getKey();
            int rarity = plantRarityInformation.getValue();
            List<Double> ratings = plantRatings.get(plantName);
            //.mapToDouble(Double::doubleValue) -> преобразува Double -> double
            double averageRating;
            if (ratings.isEmpty()) {
                averageRating = 0.00;
            } else {
                averageRating = ratings.stream().mapToDouble(Double::doubleValue).sum() / ratings.size();
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", plantName, rarity, averageRating);
        }

    }
}
