package com.jamesidowu;

import java.util.HashMap;
import java.util.Map;

public class AlphabetToNumber {

    public  static char[] alphabetCharArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();



    public static void replaceLetterWithPosition(String text){
        Map<Character, Integer> alphabetMap = new HashMap<>();

        int counter = 1;

        for (Character letter : alphabetCharArray) {
            alphabetMap.put(letter, counter);
            counter++;
        }


        for (char c : text.toCharArray()){
            Character character = c;
            character = Character.toUpperCase(c);

            for (Character testLetter : alphabetMap.keySet()){


                if (character.equals(Character.toUpperCase(testLetter))){
//                    System.out.println(testLetter);

                    System.out.print(alphabetMap.get(testLetter)+ " ");
                }
            }
        }
    }
}
