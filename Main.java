package org.example;

public class Main {

    public static void printarr( int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        //bubble sort
        int arr[] = {1, 2, 6, 4, 7, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        printarr(arr);
    }
}