import java.util.Scanner;

public class CharacterMultiplier_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String firstText = input.split("\\s+")[0];
        String secondText = input.split("\\s+")[1];

        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }

        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        } else {
            sum += getRemainingSymbolSum(firstText, secondText, minLength, maxLength);
        }

        System.out.println(sum);
    }

    private static int getRemainingSymbolSum(String firstText, String secondText, int minLength, int maxLength) {

        int remainingSum = 0;

        if (maxLength == firstText.length()) {
            for (int index = minLength; index < firstText.length(); index++) {
                remainingSum += firstText.charAt(index);
            }
        } else {
            for (int index = minLength; index < secondText.length(); index++) {
                remainingSum += secondText.charAt(index);
            }
        }
        return remainingSum;
    }
}