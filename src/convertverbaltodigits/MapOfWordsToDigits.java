/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertverbaltodigits;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Michael
 */
public class MapOfWordsToDigits {
    //array of verbal numbers
    private static final String[] NUMBERS = { "one", "two", "three", "four", 
                                            "five", "six", "seven", "eight", 
                                            "nine", "ten", "eleven", "twelve", 
                                            "thirteen", "fourteen", "fifteen", 
                                            "sixteen", "seventeen", "eighteen", 
                                            "nineteen", "twenty", "thirty", 
                                            "forty", "fifty", "sixty", "seventy", 
                                            "eighty", "ninety", "hundred", 
                                            "thousand", "million", "billion" };
    
    //array of numbers
    private static final Integer[] DIGITS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                                            12, 13, 14, 15, 16, 17, 18, 19, 20, 
                                            30, 40, 50, 60, 70, 80, 90, 100, 1000, 
                                            1000000, 1000000000};
    
    private HashMap< String, Integer> map = new HashMap<>();
    
    public HashMap<String, Integer> createConversionMap(){
        for (int i = 0; i < NUMBERS.length; i++) {
            //create map for string comparison
            map.put(NUMBERS[i], DIGITS[i]);
        }
        return map;
    }
}
