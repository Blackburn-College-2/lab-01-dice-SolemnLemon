/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

import java.util.Random;

/**
 *
 * @author forrest.cummings
 */
public class Dice {
    public Random random=new Random();
    
public int sides;

public Dice(int sides){
//takes in int sides and sets that to amount of sides for dice rolled
this.sides=sides;

}
public int roll(){
return random.nextInt(this.sides);
}

}

