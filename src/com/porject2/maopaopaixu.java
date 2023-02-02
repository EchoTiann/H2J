package com.porject2;

import java.util.Arrays;

public class maopaopaixu {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = (int)(Math.random()*100);
        a[1] = (int)(Math.random()*100);
        a[2] = (int)(Math.random()*100);
        a[3] = (int)(Math.random()*100);
        a[4] = (int)(Math.random()*100);

//        for (int j = 0; j < a.length-1; j++) {
//            for (int i = j+1; i < a.length; i++) {
//                if(a[i]<a[j]){
//                    int temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//            }
//        }
//        //把内容打印出来
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");
//
//        for (int k = 0; k < a.length; k++) {
//            for (int i = 0; i < a.length-k-1; i++) {
//                if(a[i]<a[i+1]){
//                    int temp = a[i];
//                    a[i] = a[i+1];
//                    a[i+1] = temp;
//                }
//            }
//        }
//        //把内容打印出来
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
    }
}
