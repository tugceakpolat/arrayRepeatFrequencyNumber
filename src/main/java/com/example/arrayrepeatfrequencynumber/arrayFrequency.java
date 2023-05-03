package com.example.arrayrepeatfrequencynumber;

import java.util.Arrays;

public class arrayFrequency {
    public static void main(String[] args) {

        int [] array = {10,40,57,34,6,5};
        Arrays.sort(array);
        int count =0;

        for(int i = 0; i < array.length; i++ ){
            for(int k = 0; k < array.length; k++){
                if (array[i] == array [k]){
                    break;
                }
                count++;
            }
            if(count > 0){
                System.out.println("The number " + array[i] + " is written " + count);
            }
        }
    }
}
