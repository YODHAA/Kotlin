package com.hsbc.java;

import com.hsbc.kotlin.MyCustomKotlinFileName;

public class first {

    public static void main(String[] args) {

        int sum= MyCustomKotlinFileName.add(3,4);
        System.out.println("Sum : "+sum);

        int vol=MyCustomKotlinFileName.volume(3,4);
        System.out.println("Volume in Java: "+vol);
    }

    public static int getArea(int a, int b){
        return a*b;
    }
}
