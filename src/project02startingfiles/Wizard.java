/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

public class Wizard extends Character {

    public Wizard(int score, int health) {
        super(score, health);
    }

    @Override
    public String getSpecialMove() {
        return "Cast a Spell";
    }

    @Override
    public String useSpecialMove() {
        return "The Wizard hurls a fireball!";
    }

    @Override
    public String toString() {
        return "Wizard Status:" + "\nHealth: " + health + "\nScore: " + score
                + "\nThe Wizards's special move is 'Cast a Spell'";
    }

}
