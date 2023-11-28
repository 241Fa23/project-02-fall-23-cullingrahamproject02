/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

public class Knight extends Character {

    public Knight(int score, int health) {
        super(score, health);
    }

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public String useSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public String toString() {
        return "Knight Status:" + "\nHealth: " + health + "\nScore: " + score
                + "The Knight's special move is 'Slash with Sword'" + "\nThanks for Playing!";
    }
}
