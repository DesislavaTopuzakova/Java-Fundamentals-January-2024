package ExamPrepartion;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни
        int [] targets = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray(); //мишени и техните стойности
        //targets = [24, 50, 36, 70]


        int countShotTargets = 0; //брой успешно уцелени мишени
        String input = scanner.nextLine(); //"End" или индекс под формата на текст "1"
        while (!input.equals("End")) {
            //input = "1"
            int shotIndex = Integer.parseInt(input); //целя мишената на дадения индекс

            //проверка дали съществува дадения индекс
            //валиден: [0; length - 1]
            if (shotIndex >= 0 && shotIndex <= targets.length - 1) {
                //можем да целим мишена
                //1. взимаме стойността, която има уцелената мишена
                int valueShotTarget = targets[shotIndex]; //стойността на уцелената мишена
                //2. променяме всички мишени
                for (int index = 0; index <= targets.length - 1; index++) {
                    int currentTarget = targets[index];//стойността на текущата мишена
                    //всички мишени -> currentTarget
                    //променяме: всички мишени без моята и всички мишени,които не са улучени (!= -1)
                    if (currentTarget != -1 && index != shotIndex) {
                        //мога да правя промяна
                        if (currentTarget > valueShotTarget) {
                            currentTarget -= valueShotTarget;
                        } else {
                            //currentTarget <= valueShotTarget
                            currentTarget += valueShotTarget;
                        }
                        //променената стойност на мишената
                        targets[index] = currentTarget; //слагаме променената стойност на мишената
                    }
                }
                //3. Целим
                targets[shotIndex] = -1;
                countShotTargets++;
            }

            input = scanner.nextLine();
        }

        //ОТПЕЧАТВАМЕ: "Shot targets: {count} -> {target1} {target2}… {targetn}"
        System.out.print("Shot targets: " + countShotTargets + " -> ");
        for (int target : targets) {
            System.out.print(target + " ");
        }
    }

}
