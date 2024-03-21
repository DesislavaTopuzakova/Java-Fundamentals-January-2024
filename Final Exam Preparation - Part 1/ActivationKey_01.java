package ExamPrep;

import java.util.Scanner;

public class ActivationKey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine(); //ключ за активация
        String command = scanner.nextLine(); //команди, които трябва да изпълня върху activationKey

        while (!command.equals("Generate")) {

            String [] commandParts = command.split(">>>");
            String commandName = commandParts[0]; //"Contains", "Flip", "Slice"

            switch(commandName) {
                case "Contains":
                    //command = "Contains>>>def".split(">>>")-> ["Contains", "def"]
                    String subString = commandParts[1];
                    //проверка дали в activationKey се съдържа subString
                    if (activationKey.contains(subString)) {
                        //subString се съдържа в activationKey
                        System.out.printf("%s contains %s%n", activationKey, subString);
                    } else {
                        //subString НЕ се съдържа в activationKey
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    //command = "Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}".split(">>>") -> ["Flip", "Upper/Lower", "{startIndex}", "{endIndex}"]
                    String type = commandParts[1]; //"Upper", "Lower"
                    int startIndexForReplace = Integer.parseInt(commandParts[2]);
                    int endIndexForReplace = Integer.parseInt(commandParts[3]);
                    //1. взимаме текста между [startIndex, endIndex)
                    String textForReplace = activationKey.substring(startIndexForReplace, endIndexForReplace);
                    String newText = "";
                    //2. променяме го спрямо type
                    if (type.equals("Upper")) {
                        newText = textForReplace.toUpperCase();
                    } else if (type.equals("Lower")) {
                        newText = textForReplace.toLowerCase();
                    }
                    //3. вмъкваме го на мястото на предишния
                    activationKey = activationKey.replace(textForReplace, newText);
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    //command = "Slice>>>2>>>5".split(">>>")-> ["Slice","2", "5"]
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    //изтривам всички символи от startIndex до endIndex (не е вкл.) на activationKey

                    //начин 1
                    /*StringBuilder sb = new StringBuilder(activationKey);
                    sb.delete(startIndex, endIndex);
                    activationKey = sb.toString();*/

                    //начин 2
                    /*String firstPart = activationKey.substring(0, startIndex);
                    String secondPart = activationKey.substring(endIndex);
                    activationKey = firstPart + secondPart;*/

                    //начин 3
                    String textForRemove = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(textForRemove, "");

                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);


    }
}
