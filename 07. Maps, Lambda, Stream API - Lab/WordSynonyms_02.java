package maps;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordsCount = Integer.parseInt(scanner.nextLine()); //брой на думи за обработка

        //дума (String) -> списък със синоними (List<String>)
        Map<String, List<String>> wordSynonimsMap = new LinkedHashMap<>();

        for (int count = 1; count <=  wordsCount; count++) {
                String word = scanner.nextLine();
                String synonym = scanner.nextLine();

                //1. думата да не сме я срещали
                wordSynonimsMap.putIfAbsent(word, new ArrayList<>());
                //думата я има
                wordSynonimsMap.get(word).add(synonym);
        }

        //запис / двойка / pair: key (String word) -> value (List<String> synonyms)
        for (Map.Entry<String, List<String>> pair : wordSynonimsMap.entrySet()) {
            //всеки един запис се съхранява pair
            //pair:  key (String)      value (List<String>)
            String word = pair.getKey();
            List<String> synonyms = pair.getValue();
            System.out.println(word + " - " + String.join(", ", synonyms));
        }


    }
}
