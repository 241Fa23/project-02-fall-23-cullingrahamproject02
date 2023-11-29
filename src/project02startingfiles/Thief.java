/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

public class Thief extends Character {

    public Thief(int score, int health) {
        super(score, health);
    }

    @Override
    public String getSpecialMove() {
        return "Sneak By";
    }

    @Override
    public String useSpecialMove() {
        return "The Thief Sneaks By!";
    }

    @Override
    public String toString() {
        return "Thief Status:" + "\nHealth: " + health + "\nScore: " + score
                + "\nThe Thief's special move is 'Sneak By'";
    }

}
