package com.ArrayList_LinkedList;

import java.util.*;

class Solution4 {

    public String mostCommonWord(String paragraph, String[] banned) {

        String[] words = paragraph.split("[,?'.!;\\s]+");
        HashMap<String , Integer> mapWords = new HashMap<String , Integer>();
        HashMap<String , Integer> mapBannedWords = new HashMap<>();
        for(String s : banned)
        {
            String str = s.toLowerCase();
            mapBannedWords.put(str , 1);
        }
        for(String s : words)
        {
            String str = s.toLowerCase();
            if(mapWords.containsKey(str) != true)
            {
                mapWords.put(str , 0);
            }
            int freq = mapWords.get(str);
            mapWords.put(str , freq + 1);
        }
        String mostFreqWord = "";
        int maxFreq = 0;
        for(Map.Entry<String , Integer> pair : mapWords.entrySet())
        {
            if(mapBannedWords.containsKey(pair.getKey()) == true)
            {
                continue;
            }
            else
            {
                if(pair.getValue() >= maxFreq)
                {
                    mostFreqWord = pair.getKey();
                    maxFreq = pair.getValue();
                }
            }
        }
        return mostFreqWord;
    }

}

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println("This file contains the code for problem 4 i.e. Find Most Common Word");
    }
}
