package com.github.vahundos.leetcode.solution.easy;

// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangingAnIPAddress defangingAnIPAddress = new DefangingAnIPAddress();

        System.out.println(defangingAnIPAddress.defangIPaddr("1.1.1.1")); // 1[.]1[.]1[.]1
        System.out.println(defangingAnIPAddress.defangIPaddr("255.100.50.0")); // 255[.]100[.]50[.]0
    }
}
