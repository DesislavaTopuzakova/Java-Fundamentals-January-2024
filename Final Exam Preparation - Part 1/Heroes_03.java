package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Heroes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 част: ПОДГОТОВКА ЗА ЗАПОЧВАНЕ ИГРАТА
        int n = Integer.parseInt(scanner.nextLine()); //брой на героите

        //име на героя -> hp
        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        //име на героя -> mp
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        for (int hero = 1; hero <= n; hero++) {
            //данни за героя -> име, hp, mp
            String heroData = scanner.nextLine(); //"{hero name} {HP} {MP}".split(" ") -> ["{heroName}", "{HP}", "{MP}"]
            String heroName = heroData.split("\\s+")[0];
            int hp = Integer.parseInt(heroData.split("\\s+")[1]);
            int mp = Integer.parseInt(heroData.split("\\s+")[2]);

            //съхраняваме HP -> проверка дали са <= 100
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }

            //съхраняваме MP -> проверка дали са <= 200
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }

        //heroesHP: всеки герой колко hp има
        //heroesMP: всеки герой колко mp има

        //2 част: започваме да правим магии
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split("\\s+-\\s+");
            String commandName = commandParts[0]; //"CastSpell", "TakeDamage", "Recharge", "Heal"
            String heroName = commandParts[1]; // име на героя
            switch (commandName) {
                case "CastSpell":
                    //правим магия
                    //command = "CastSpell – {hero name} – {MP needed} – {spell name}"
                    //commandParts = ["CastSpell", "{heroName}", "{MP needed}", "{spell name}"]
                    int mpNeeded = Integer.parseInt(commandParts[2]); // mp нужни за магията
                    String spellName = commandParts[3]; //име на магията
                    int currentMP = heroesMP.get(heroName); //текущи mp

                    //1. можем да направим магията -> currentMP >= mpNeeded
                    if (currentMP >= mpNeeded) {
                        //DO SOME SPELL
                        int mpLeft = currentMP - mpNeeded;// останалите точки след магията
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    //2. не можем да направим магията -> currentMP < mpNeeded
                    else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }

                    break;
                case "TakeDamage":
                    //нападение от attacker към hero name - губим HP
                    //command = "TakeDamage – {hero name} – {damage} – {attacker}"
                    //commandParts = ["TakeDamage", "{hero name}", "{damage}", "{attacker}"]
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    //ATAKA
                    int currentHP = heroesHP.get(heroName);
                    currentHP -= damage;

                    //1. ЖИВ след атаката
                    if (currentHP > 0) {
                        heroesHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
                    }
                    //2. УМРЯЛ след атаката -> currentHP <= 0
                    else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }

                    break;
                case "Recharge":
                    //command = "Recharge – {hero name} – {amount}"
                    //commandParts = ["Recharge", "{hero name}", "{amount}"]
                    int amount = Integer.parseInt(commandParts[2]);
                    int currentMPHero = heroesMP.get(heroName); //текущи MP
                    //увеличаваме MP
                    currentMPHero += amount;

                    //проверка дали не прескачаме максималната стойност за MP
                    if (currentMPHero > 200) {
                        currentMPHero = 200;
                    }

                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMPHero - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMPHero);

                    break;
                case "Heal":
                    //увеличаваме HP
                    //command = "Heal – {hero name} – {amount}"
                    //commandParts = ["Heal", "{hero name}", "{amount}"]
                    int amountHeal = Integer.parseInt(commandParts[2]); //с колко ще увеличаваме нашите HP
                    int currentHPHero = heroesHP.get(heroName); //текущи HP
                    //увеличаваме HP
                    currentHPHero += amountHeal;

                    //проверка дали не прескачаме максималната стойност за HP
                    if (currentHPHero > 100) {
                        currentHPHero = 100;
                    }

                    System.out.printf("%s healed for %d HP!%n", heroName, currentHPHero - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHPHero);
                    break;
            }

            command = scanner.nextLine();
        }

        //heroesHP: име на герой -> HP
        //heroesMP: име на герой -> MP

        heroesHP.entrySet().forEach(entry -> {
            //entry: key(hero name) -> value (hp)
            System.out.println(entry.getKey());
            System.out.println("  HP: " + entry.getValue());
            System.out.println("  MP: " + heroesMP.get(entry.getKey()));
        });
    }
}
