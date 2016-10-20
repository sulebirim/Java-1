/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//http://www.dreamincode.net/forums/topic/263430-math-random-non-repeating-numbers/
//https://www.daniweb.com/programming/software-development/threads/447515/random-numbers-without-duplicates
/**
 *
 * @author x15493322
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     
        //Will Store the numbers in array of size 5 = 5 numbers
        int[] secret = new int[5];
     
        
    //Generates 10 Random Numbers in the range 1-40
    for(int i = 0; i < secret.length; i++) {
      secret[i] = (int)Math.floor(1+ Math.random()*40);
    }//end for loop
    
    
    
    System.out.println("Numbers Generated: " + Arrays.toString(secret));
}
        
        
    }

   
