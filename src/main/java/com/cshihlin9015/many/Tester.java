package com.cshihlin9015.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        list();
    }

    private static void list() {
        // List:順序、索引值、可重覆

        ArrayList arrayList = new ArrayList();

        // 可加入異質的型態
        arrayList.add(1);
        arrayList.add('c');
        arrayList.add("Willy");
        arrayList.add(true);
        System.out.println(arrayList); // 印出 [1, c, Willy, true]

        int a1 = (int) arrayList.get(0); // 要轉型，要注意有可能轉型失敗
        String s1 = (String) arrayList.get(2);

        //----------------------------------------------------------------------------
        ArrayList<Integer> arrayList2 = new ArrayList();

        // 不可加入異質的型態
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(3); // 可加入重覆的資料，可以一直 add 資料
        System.out.println(arrayList2); // 印出 [1, 2, 3, 4, 3]
        System.out.println(arrayList2.size()); // 顯示元素個數

        int a2 = arrayList2.get(0); //　不用轉型

        //----------------------------------------------------------------------------
        List<Integer> scores = Arrays.asList(95, 96, 88, 100, 75); // 型態要用 List
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 11;
        numbers[4] = 15;

        int[] scores = {95, 96, 88, 100, 75};
        System.out.println(scores); // 印出 array 位址


        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("------------------------------------------");

        for (int n : scores) {
            System.out.println(n);
        }
    }
}
