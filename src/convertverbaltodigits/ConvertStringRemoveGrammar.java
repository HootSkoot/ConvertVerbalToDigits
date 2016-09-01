/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertverbaltodigits;

/**
 *
 * @author Michael
 */
public class ConvertStringRemoveGrammar {
    
    public String[] seperatedWords( String input){
        //remove commas
        input = input.replaceAll(",", "");
        //remove hypens
        input = input.replaceAll("-", " ");
        //unify the case
        input = input.toLowerCase();
        //create an array of words
        String[] listOfWords = input.split(" ");
        return listOfWords;
    }
}
