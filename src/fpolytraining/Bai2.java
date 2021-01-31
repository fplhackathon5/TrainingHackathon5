/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpolytraining;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nguyenchan
 */
public class Bai2 {

    static int countWord(String str, String word) {

        int count = str.length() / word.length();
        str = str.replaceAll("[^" + word + "]", "");
        Map<Character, Integer> left = new HashMap<>();
        Map<Character, Integer> right = new HashMap<>();
        for (char item : word.toCharArray()) {
            if (right.get(item) == null) {
                right.put(item, 1);
            } else {
                right.put(item, right.get(item) + 1);
            }
        }
        for (char item : str.toCharArray()) {
            if (left.get(item) == null) {
                left.put(item, 1);
            } else {
                left.put(item, left.get(item) + 1);
            }
        }
        for (char item : word.toCharArray()) {
            if (left.get(item) == null) {
                return 0;
            } else {
                int div = left.get(item) / right.get(item);
                if (count > div) {
                    count = div;
                }
                if (div == 0) {
                    return count;
                }
                if (count == 0) {
                    return count;
                }
            }
        }
        return count;
    }
}
