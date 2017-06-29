package org.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Roguelike {

    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        while (keepPlaying) {
            System.out.println("Co chcesz zrobic?");
            System.out.println("1. Dodac postać");
            System.out.println("2. Wyswietlic szczegoly uzytkownika");
            System.out.println("3. Wyjść!");

            String decision = scanner.nextLine();

            if ("1".equalsIgnoreCase(decision)) {
                System.out.println("Podaj imie: ");
                String name = scanner.nextLine();
                System.out.println("Podaj pseudonim: ");
                String alias = scanner.nextLine();
                System.out.println("Podaj wiek: ");
                String age = scanner.nextLine();
                System.out.println("Podaj siłę (1-5): ");
                String strength = scanner.nextLine();
                System.out.println("Podaj zwinność (1-5): ");
                String dexterity = scanner.nextLine();
                System.out.println("Podaj wiedzę (1-5): ");
                String wisdom = scanner.nextLine();

                Integer ageInt = Integer.valueOf(age);
                Integer strengthInt = Integer.valueOf(strength);
                Integer dexterityInt = Integer.valueOf(dexterity);
                Integer wisdomInt = Integer.valueOf(wisdom);

                User user = new User(name, alias, ageInt, strengthInt, dexterityInt, wisdomInt);
                users.add(user);
            }

            if ("2".equalsIgnoreCase(decision)) {
                System.out.println("Podaj imię postaci która Cię interesuje: ");
                String name = scanner.nextLine();
                for (User user : users) {
                    if (user.getName().equalsIgnoreCase(name)) {
                        System.out.println(user.getName() + " " + user.getAlias() + ": ");
                        System.out.println("    - Age: " + user.getAge());
                        System.out.println("    - Strength: " + user.getStrenght());
                        System.out.println("    - Wisdom: " + user.getWisdom());
                        System.out.println("    - Dexterity: " + user.getDexterity());
                    }
                }
            }

            if("3".equalsIgnoreCase(decision)) {
                keepPlaying = false;
            }
        }
    }

}
