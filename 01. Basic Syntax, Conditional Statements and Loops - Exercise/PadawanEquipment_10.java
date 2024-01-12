import java.util.Scanner;

public class PadawanEquipment_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        //Calculate sabers
        double sumSabers = Math.ceil(studentsCount * 1.10) * saberPrice;
        //Calculate robes
        double sumRobes = studentsCount * robePrice;
        //Calculate belts
        double sumBelts = (studentsCount - (studentsCount / 6)) * beltPrice;

        // Total Sum
        double totalSum = sumSabers + sumRobes + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - budget));
        }
    }
}
