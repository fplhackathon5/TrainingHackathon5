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
public class FpolyTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Bài 1
        int[] b1 = {0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0};
        System.out.println(Bai1.maxLengthOfBits(b1));
        // Bài 2
        String str = "abc", word = "def";
        System.out.println(Bai2.countWord(str, word));
        // Bài 3
        String str1 = "mpitcnsluufoimpqgdmiingcftucoqlidicjrthotmscmhspcp";
        String str2 = "qtmxgrvpyyjsmqtukhqmmrkgjxygsupmhmgnvxlsxqwgqlwtgt";
        System.out.println(Bai3.compareString(str1, str2));
        // Bài 4
        long[] b4 = Bai4.buildHouse(6884);
        System.out.println(b4[0] + " " + b4[1]);
        // Bài 5
        int[] b5 = {229, 223, 888, 683, 233, 194, 109, 311, 163, 848, 548, 214, 544, 770, 732, 62, 933, 983, 271, 401, 736, 212, 78, 777, 937, 588, 749, 957, 776, 336};
        System.out.println(Bai5.division(b5));
        // Bài 6
        // Bài 7
        // Bài 8
        // Bài 9
        // Bài 10
    }

}
