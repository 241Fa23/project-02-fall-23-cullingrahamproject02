/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

public class Healer extends Character {

    public Healer(int score, int health) {
        super(score, health);
    }

    @Override
    public String getSpecialMove() {
        return "Use Sleeping Powder";
    }

    @Override
    public String useSpecialMove() {
        return "The Healer throws Sleeping Powder!";
    }

    @Override
    public String toString() {
        return "Healer Status:" + "\nHealth: " + health + "\nScore: " + score
                + "The Healer's special move is 'Use Sleeping Powder'" + "\nThanks for Playing!";
    }
}
