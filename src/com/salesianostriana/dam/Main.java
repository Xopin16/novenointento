package com.salesianostriana.dam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        int [] array = new int [3];
        array [0] =  123;
        array [1] = 456;
        array [2] = 789;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);


        int[] arr = new int[] {123, 456, 789};

        for (int a: arr) {
            System.out.println(a);
        }
    }
}
