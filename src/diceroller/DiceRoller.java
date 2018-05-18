/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author JohnL
 */

public class DiceRoller {
    private Random rand = new Random();
    public ArrayList<Roll> log;
    
    public Roll rollDie(String roll){
       Roll temp = new Roll();
       int diceIndex = roll.indexOf('d');
       
       for(int i=0; i < Integer.parseInt(roll.substring(0,diceIndex)); i ++){
           temp.rolls.add(rand.nextInt(Integer.parseInt(roll.substring(diceIndex+1)))+1);
       }
      
       log.add(temp);
    return temp;
    }
    
   

    public DiceRoller() {
        this.log = new ArrayList<>();
    }
    
}
