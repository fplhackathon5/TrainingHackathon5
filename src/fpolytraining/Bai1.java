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

public class Bai1 {

    public static int maxLengthOfBits(int[] arr) {
//        int asw = 0;
//        
//        
//        
//        return asw;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int n = arr.length;
        m.put(0, -1);
        int d0 = 0;
        int d1 = 0;
        int res = 0; // chieu dai dai nhat
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                d1++;
            } else {
                d0++;
            }
            int x = d1 - d0;
            if (m.containsKey(x)) {
                res = Math.max(res, i - m.get(x));
            } else {
                m.put(x, i);
            }

        }
        return res;
    }
}
