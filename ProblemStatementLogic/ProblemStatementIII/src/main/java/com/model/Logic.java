package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Josue Chinchilla H Logical class in charge of operations
 */
public class Logic {

    //Constructor
    public Logic() {
    }

    //Returns list of permutions

    public List<String> permutation(String prefix, Input input) {
        List<String> permutations = new ArrayList<String>();
        String content = input.getPermute().toString();
        int size = content.length();
        if (content.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < size; i++) {
                Input temp = new Input(content.substring(i + 1, size) + content.substring(0, i));

                permutations.addAll(permutation(prefix + content.charAt(i), temp));

            }
        }
        return permutations;
    }

    //Sort Array list

    public void sort(List<String> array) {
        Collections.sort(array);
    }

    //Assign content of Arrays into lists

    public void assignArray(String[] list_permutation, List<String> permutation) {
        for (int i = 0; i < permutation.size(); i++) {
            list_permutation[i] = permutation.get(i);
        }
    }

    //Print Array

    public void printArray(String[] list_permutation) {
        for (int i = 0; i < list_permutation.length; i++) {
            System.out.println(list_permutation[i]);
        }
    }

    //Size of Arrays

    public int arraySize(String[] string) {
        return string.length;
    }

}