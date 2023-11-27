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

}
