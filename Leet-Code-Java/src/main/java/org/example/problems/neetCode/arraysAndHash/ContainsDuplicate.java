package org.example.problems.neetCode.arraysAndHash;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Byte> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num, (byte) 1);
        }
            return false;
    }
    public static void main(String[] args) {

        ContainsDuplicate main = new ContainsDuplicate();

    }
}
