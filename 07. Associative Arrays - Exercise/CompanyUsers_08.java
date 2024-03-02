import java.util.*;

public class CompanyUsers_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> listOfEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] data = input.split(" -> ");

            List<String> currentCompanyEmployees = listOfEmployees.get(data[0]);
            boolean containsId = currentCompanyEmployees != null && currentCompanyEmployees.contains(data[1]);

            if (!containsId) {
                listOfEmployees.putIfAbsent(data[0], new ArrayList<>());
                listOfEmployees.get(data[0]).add(data[1]);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : listOfEmployees.entrySet()) {
            System.out.printf("%s\n", entry.getKey());
            entry.getValue().forEach(id -> System.out.printf("-- %s\n", id));
        }
    }
}
