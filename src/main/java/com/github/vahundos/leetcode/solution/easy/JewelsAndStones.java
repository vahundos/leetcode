package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;

        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                if (jewel == stones.charAt(j)) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();

        System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(jewelsAndStones.numJewelsInStones("z", "ZZ")); // 3
    }
}
