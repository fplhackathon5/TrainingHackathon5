/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpolytraining;

/**
 *
 * @author nguyenchan
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bai3 {

    public static boolean compareString(String str1, String str2) {
        String checkStr1 = str1;
        String checkStr2 = str2;
        if (checkStr1.length() != checkStr2.length()) {
            return false;
        } else {
            ArrayList<String> string = new ArrayList<String>();
            for (int i = 0; i < str1.length(); i++) {
                string.add(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i)));
            }
            for (int i = 0; i < string.size() - 1; i++) {
                for (int j = i + 1; j < string.size(); j++) {
                    if ((string.get(i).charAt(0) == string.get(j).charAt(0) && string.get(i).charAt(1) != string.get(j).charAt(1))
                            || (string.get(i).charAt(0) != string.get(j).charAt(0) && string.get(i).charAt(1) == string.get(j).charAt(1))) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}
