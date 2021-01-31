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
public class Bai5 {

    public static String division(int[] arr) {
        int length = arr.length;
        if (length == 1) {
            return arr[0] + "";
        } else if (length == 2) {
            return arr[0] + "/" + arr[1];
        } else {
            String result = arr[0] + "/(";
            for (int i = 1; i < length - 1; i++) {
                result += (arr[i] + "/");
            }
            return result += (arr[length - 1] + ")");
        }
    }
}
