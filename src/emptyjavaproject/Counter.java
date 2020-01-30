/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author forrest.cummings
 */
public class Counter {

    int sides;
    int diceRolledEachRoll;
    //creates an array that goes up to the max value from the dice rolled each roll

    int[] tracker;

    public Counter(int i, int sides) {

        setDiceRolledEachRoll(i);
        setSides(sides);
        setTracker();
    }

    public void setTracker() {

        this.tracker = new int[getSides() + 1 * getDiceRolledEachRoll()];
    }

    public void setDiceRolledEachRoll(int i) {
        this.diceRolledEachRoll = i;
    }

    public int getDiceRolledEachRoll() {
        return this.diceRolledEachRoll;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int i) {
        this.sides = i;
    }

    public void trackRoll(int numberRolled) {

        System.out.println("array length " + this.tracker.length + " sides" + this.sides + " dice per roll" + getDiceRolledEachRoll());
        this.tracker[numberRolled]++;
    }

    public void printResults() {
        double counter = 0;
        for (int i = 0; i < tracker.length; i++) {
            counter = counter + tracker[i];
        }
        for (int i = 0; i < tracker.length; i++) {
            System.out.println(i + " was rolled " + tracker[i] + " times. This is " + (tracker[i]/counter)*100.0+"% of the total number");
        }
    }
}
