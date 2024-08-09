/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BstonMarathon {
    public static void main(String [] args){
      
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
            "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel",
            "Neda", "Aaron", "Kate"
        };

            int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
            393, 299, 343, 317, 265
        };
        int fastestIndex = 0;
        int secondFastestIndex = 0;

        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                secondFastestIndex = fastestIndex;
                fastestIndex = i;
            } else if (times[i] < times[secondFastestIndex] || secondFastestIndex == fastestIndex) {
                secondFastestIndex = i;
            }
        }
        System.out.println("Fastest Runner: " + names[fastestIndex] + " - " + times[fastestIndex] + " minutes");

        System.out.println("Second Fastest Runner: " + names[secondFastestIndex] + " - " + times[secondFastestIndex] + " minutes");
    }
}

   
    
    
            
