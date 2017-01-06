package com.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by joschinc on 1/4/17.
 */
public class Logic {

    public List<String> permutation(String prefix, Input input) {
        List<String> permutations = new ArrayList<String>();
        String content = input.getWord();
        int size = content.length();
        if (size == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < size; i++) {
                Input temp = new Input(content.substring(i + 1, size) + content.substring(0, i));

                permutations.addAll(permutation(prefix + content.charAt(i), temp));

            }
        }
        return permutations;
    }


    public void sort(List<String> array) {
        Collections.sort(array);
    }


    public void assignArray(String[] list_permutation, List<String> permutation) {
        for (int i = 0; i < permutation.size(); i++) {
            list_permutation[i] = permutation.get(i);
        }
    }

    public void printArray(String[] list_permutation) {
        for (int i = 0; i < list_permutation.length; i++) {
            System.out.println(list_permutation[i]);
        }
    }

    public int arraySize(String[] string) {
        return string.length;
    }

}