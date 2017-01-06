package com.service;

import com.model.Input;
import com.model.Logic;

import java.util.List;

/**
 * Created by joschinc on 1/4/17.
 */
public class ServicePrintPermutationImpl implements ServicePrintPermutation {
    public void printPermutation(Input input) {
        Logic logic = new Logic();
        String word = input.getWord();
        if(word.length()>0){
            List<String> permutations  = logic.permutation("Word : ",input);
            //Sort list
            logic.sort(permutations);

            String[] list_permutations  = new String[permutations .size()];
            //Assign content of array
            logic.assignArray(list_permutations, permutations);

            //Print list of permutations
            System.out.println("***List of Permutations***");
            logic.printArray(list_permutations);

            //Print number of permutations
            int array_size = logic.arraySize(list_permutations);
            System.out.println("Number of permutations: "+array_size);
        } else {
            System.out.println("Empty Word");
        }
    }
}
