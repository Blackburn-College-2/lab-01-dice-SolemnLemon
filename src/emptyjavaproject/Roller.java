/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author forrest.cummings
 */
public class Roller {

    public Random random = new Random();
    public Roller() {
        System.out.println("how many dice per roll");
        diceRolledEachRoll = scanner.nextInt();
        System.out.println("how many sides should each die have");
        sides = scanner.nextInt();

    }

    public void rollDice(int stopAt, Dice die, Counter c) {
        for (int i = 0; i < stopAt; i++) {
            c.trackRoll(rollN(die));
        }
        c.printResults();
    }
 
    public int diceRolledEachRoll;
    public int sides;
    Scanner scanner = new Scanner(System.in);

    public int rollN(Dice die) {
        int J = 0;
        //checks amount of dice meant to be rolled each time then calls a method that returns an int between 1-6 that many times
        for (int i = 0; i < this.diceRolledEachRoll; i++) {
            J += die.rollOne();
        }
        System.out.println("rolled a :" + J);
        return J;
    }



    public int getDiceRolledEachRoll() {
        return this.diceRolledEachRoll;
    }

    public int getSides() {
        return this.sides;
    }
}
