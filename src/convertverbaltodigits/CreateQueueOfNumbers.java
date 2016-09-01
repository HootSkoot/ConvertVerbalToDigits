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
    private MapOfWordsToDigits bigMap = new MapOfWordsToDigits();
    private ConvertStringRemoveGrammar convertGrammar = new ConvertStringRemoveGrammar();
    
    private LinkedList<Integer> queue = new LinkedList<>();
    
    public LinkedList<Integer> createQueue(String input){
        for (String word : convertGrammar.seperatedWords(input)) {
                if ( bigMap.createConversionMap().containsKey(word)) {
                    queue.add(bigMap.createConversionMap().get(word));
            }
        }
        return queue;
    }
}
