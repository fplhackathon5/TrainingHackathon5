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
public class Bai4 {

    public static long[] buildHouse(long S) {
        double lenght = Math.sqrt(S);
        double longS = Math.sqrt(S);
        if (lenght == (long) longS) {
            return new long[]{(long) lenght, (long) lenght};
        } else {
            lenght = Math.floor(lenght);
        }
        double L = lenght, W = 0;
        while (true) {
            W = S / L;
            if (W == (long) W) {
                if (L > W) {
                    return new long[]{(long) L, (long) W};
                } else {
                    return new long[]{(long) W, (long) L};
                }
            } else {
                L--;
            }
        }
    }
}
