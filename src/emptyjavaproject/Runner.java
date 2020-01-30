/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Scanner;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        //instantiating objects
        Dice die = new Dice();
        Counter track = new Counter(die.getDiceRolledEachRoll(), die.getSides());
        Roller roller = new Roller();
//calls roll dice then asks for input as to not create infinite loop that keeps the program generating random numbers
        while (true) {
            System.out.println("When would you like to stop rolling");
            roller.rollDice(scanner.nextInt(), die, track);
        }
    }

}
