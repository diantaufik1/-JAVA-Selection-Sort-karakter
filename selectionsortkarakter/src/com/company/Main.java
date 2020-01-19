package com.company;

public class Main {

    public static void main(String[] args) {
        String[] array = {"b", "e", "c", "a", "k"};
        selectionSort(array);
        for(int i = 0; i < array.length; i++){
            System.out.print("\"" + array[i] + "\" ");
        }
    }
    static String[] selectionSort(String[] array)
    {
        for (int i = 1; i < array.length; i++) {
            // find the index of the ith smallest value
            int s = i-1;
            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[s]) < 0) {
                    s = j;
                }
            }
            // swap the ith smallest value into entry i-1
            String temp = array[i-1];
            array[i-1] = array[s];
            array[s] = temp;
        }
        return array;

    }
}
