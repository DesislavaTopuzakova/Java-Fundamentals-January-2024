import java.util.Scanner;

public class ImitationGame_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder message = new StringBuilder(input);

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {

            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Move":
                    //"Ivan" -> Move|2
                    //"anIv"
                    int numberOfLettersToMove = Integer.parseInt(commandParts[1]);
                    String substringToMove = message.substring(0, numberOfLettersToMove);
                    message.delete(0, numberOfLettersToMove);
                    message.append(substringToMove);
                    break;
                case "Insert":
                    //"Ivan" -> Insert|2|B
                    //"IvBan"
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    message.insert(index, value);
                    break;
                case "ChangeAll":
                    //"Ivan" -> ChangeAll|an|Peter
                    //"IvPeter"
                    String textToReplace = commandParts[1];
                    String replacement = commandParts[2];
                    String currentMessage = message.toString();
                    String newMessage = currentMessage.replace(textToReplace, replacement);
                    message = new StringBuilder(newMessage);
                    break;
                // ТОЗИ КЕЙС НЕ Е ЧАСТ ОТ НАШАТА ЗАДАЧА! ТОВА Е ПРИМЕР ЗА ДОПЪЛНИТЕЛНА ОПЕРАЦИЯ С ТЕКСТОВЕ!
//                case "Delete":
//                    // "Ivan" -> Delete|2
//                    int numberOfLettersToDelete = Integer.parseInt(commandParts[1]);
//                    message.delete(0, numberOfLettersToDelete);
//                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);
    }
}
