package com.app.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ShuffleService {

    public int[] generateShuffledArray(int number){
        int[] array = new int[number];

        // Populate the array - O(N)
        for(int index = 0; index < array.length; index++){
            array[index] = index + 1;
        }

        Random rand = new Random();

        // Randomize the array - O(N)
        for (int index = 0; index < array.length; index++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[index];
            array[index] = temp;
        }

        return array;
    }
}
