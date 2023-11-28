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
        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");
        Scanner input = new Scanner(System.in);
        System.out.println("\nChoose your character!");
        System.out.println("{k} Knight || {h} Healer || {t} Thief || {w} Wizard");
        playerClass = input.next();
        if (playerClass == k) {
            Character ch1 = new Knight();
        } else if (playerClass == h) {
            Character ch1 = new Healer();
        } else if (playerClass == t) {
            Character ch1 = new Thief();
        } else if (playerClass == w) {
            Character ch1 = new Wizard();
        }
    }
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    boolean continuePlaying = true;
    while (continuePlaying

    
        ){
    System.out.println(
                "What would you like to do?");
        System.out.println(
                "(?)Status Report");
        System.out.println(
                "{n} {s} {e} {w} || {q}quit");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                int benign = (int) (Math.random() * 4); // Randomly select benign event
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
                score++;
                System.out.println("Player's score increased by 1.");
                System.out.println(sceneDescription);
                break;
            case 2:
                int enemy = (int) (Math.random() * 3); // Randomly select enemy
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
                scanner.nextLine(); // Consume newline
                if (action == 2) {
                    System.out.println("You successfully ran away!");
                    score++;
                } else {
                    System.out.println("You used your special move!");
                    // Code for special move logic goes here
                }
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
        System.out.println(
                "Current score: " + score);
        System.out.println(
                "Continue playing? (yes/no)");
        String playAgain = scanner.nextLine();

        if (!playAgain.equalsIgnoreCase(
                "yes")) {
            continuePlaying = false;
        }
        System.out.println("Game Over. Final score: " + score);
        scanner.close();
    }
}
