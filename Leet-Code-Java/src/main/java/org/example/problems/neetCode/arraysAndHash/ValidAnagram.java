package org.example.problems.neetCode.arraysAndHash;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagramHashMap(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }else{
                hashMap.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(hashMap.containsKey(t.charAt(i))){
                if(hashMap.get(t.charAt(i)) == 1){
                    hashMap.remove(t.charAt(i));
                }else {
                    hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) - 1);
                }
            }else {
                return false;
            }
        }

        return true;


    }


    public boolean isAnagramSort(String s, String t) {
        if(s.length()!=t.length()) return false;
        return sortString(s).equals(sortString(t));
    }

    public String sortString(String str){
        char c[] = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static void main(String[] args) {

    }
}
