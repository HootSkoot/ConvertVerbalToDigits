/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertverbaltodigits;

import java.util.LinkedList;

/**
 *
 * @author Michael
 */
public class CreateQueueOfNumbers {
    //creating a queue that I will build a number from
    //initilize comparison map, only time this is needed
    private MapOfWordsToDigits bigMap = new MapOfWordsToDigits();
    //initilize grammar converter, only time this is needed
    private ConvertStringRemoveGrammar convertGrammar = new ConvertStringRemoveGrammar();
    
    private LinkedList<Integer> queue = new LinkedList<>();
    
    //creating linkedlists
    public LinkedList<Integer> createQueue(String input){
        //for each word in the converted array
        for (String word : convertGrammar.seperatedWords(input)) {
                if ( bigMap.createConversionMap().containsKey(word)) {
                    //if such word exists in map, then add number to queue
                    queue.add(bigMap.createConversionMap().get(word));
            }
        }
        return queue;
    }
}
