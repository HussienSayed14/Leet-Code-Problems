package org.example.problems.neetCode.arraysAndHash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAngram {

    public  String sortStringAscending(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        if(strs.length == 0) return output;
        if(strs.length == 1) {
            output.add(Arrays.asList(strs));
            return output;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String sortedStr = sortStringAscending(str);
            System.out.println("sortedStr: " + sortedStr);
            if(map.containsKey(sortedStr)) {
                System.out.println("String Found: "+ str + " sortedStr: " + sortedStr + " map: " + map);
                map.get(sortedStr).add(str);
            }else{
                System.out.println("String Not Found: "+ str + " sortedStr: " + sortedStr + " map: " + map);
                map.put(sortedStr, new ArrayList<>());
                map.get(sortedStr).add(str);
            }

        }
        output.addAll(map.values());
        System.out.println("output: " + output);
        return output;

    }

    public static void main(String[] args) {
        groupAngram groupAnagram = new groupAngram();
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> output = groupAnagram.groupAnagrams(input);


    }
}
