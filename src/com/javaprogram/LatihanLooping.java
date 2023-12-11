package com.javaprogram;

public class LatihanLooping {
    public static void main(String[]args){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j || (i+j) ==9) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
