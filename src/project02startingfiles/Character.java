/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

public abstract class Character {

    public int score;
    public int health;

    public Character(int score, int health) {
        this.score = score;
        this.health = health;
    }

    public abstract String getSpecialMove();

    public abstract String useSpecialMove();

}
