/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.*;

public class Project02StartingFiles {

    public static void main(String[] args) {
        String playerClass;
        Character ch1 = new Knight(0, 10);
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose your character!");
        System.out.println("{k} Knight || {h} Healer || {t} Thief || {w} Wizard");
        playerClass = input.next();
        if (playerClass.equals("k")) {
            ch1 = new Knight(0, 10);
        } else if (playerClass.equals("h")) {
            ch1 = new Healer(0, 10);
        } else if (playerClass.equals("t")) {
            ch1 = new Thief(0, 10);
        } else if (playerClass.equals("w")) {
            ch1 = new Wizard(0, 10);
        } else {
            System.out.println("Invalid selection, please try again.");
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("{?} Status Report || {n}{s}{e}{w} Move 1 Space North, South, East, or West || {q} Quit");
            String choice = scanner.next().toLowerCase();
            scanner.nextLine();
            int randomAction = (int) (Math.random() * 2);
            if (choice.equals("?")) {
                System.out.println(ch1.toString());
            } else if (choice.equals("n") || choice.equals("s") || choice.equals("e") || choice.equals("w")) {
                switch (randomAction) {
                    case 0:
                        int benign = (int) (Math.random() * 4);
                        String sceneDescription = "";
                        switch (benign) {
                            case 0:
                                sceneDescription = "Nothing here…";
                                break;
                            case 1:
                                sceneDescription = "Nice trees around here…";
                                break;
                            case 2:
                                sceneDescription = "Interesting cottage there…";
                                break;
                            case 3:
                                sceneDescription = "Potty break…";
                                break;
                        }
                        ch1.increaseScore(1);
                        System.out.println("Player's score increased by 1.");
                        System.out.println(sceneDescription);
                        break;
                    case 1:
                        int enemy = (int) (Math.random() * 3);
                        String enemyType = "";
                        switch (enemy) {
                            case 0:
                                enemyType = "zombie";
                                break;
                            case 1:
                                enemyType = "bandit";
                                break;
                            case 2:
                                enemyType = "lobbyist";
                                break;
                        }
                        System.out.println("You are being attacked by a " + enemyType + "!");
                        System.out.println("Choose an action:");
                        System.out.println("1. Use special move");
                        System.out.println("2. Run");

                        int action = scanner.nextInt();
                        scanner.nextLine();

                        switch (action) {
                            case 2:
                                int chance = (int) (Math.random() * 2);
                                if (chance == 1) {
                                    System.out.println("You successfully ran away!");
                                    ch1.increaseScore(1);
                                } else if (chance == 2) {
                                    System.out.println("You did not run away in time");
                                    ch1.decreaseHealth(1);
                                }
                                break;
                            case 1:
                                System.out.println(ch1.useSpecialMove());
                                System.out.println("You defeated the " + enemyType + "!");
                                System.out.println("Increase score by 2 points!");
                                ch1.increaseScore(2);
                                break;
                            default:
                                System.out.println("Invalid selection");
                                break;

                        }
                }

            } else if (choice.equals("q")) {
                System.out.println("*******************");
                System.out.println("*******************");
                System.out.println("The game has come to an end! Your final stats:");
                System.out.println(ch1.toString());
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
