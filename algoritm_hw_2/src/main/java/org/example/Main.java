package org.example;

// Реализовать алгоритм пирамидальной сортировки (сортировка кучей)
public class Main {

    public static void Heapspot(int nums) {
        int[] array = new int[nums];

        // задаем рандомные значения массиву
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println(i + " Count " + array[i]);
        }

        System.out.println("-------");
        // цикл по сортировке значений массива
        for (int i = 0; i < array.length / 2; i++) {
//            System.out.println("i " + array[i]);
            for (int j = 0; j < array.length - i - 1; j++) {
//                System.out.println("j " + array[j]);
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array [j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            for (int j = array.length - i - 1; j > i; j--) {
//                System.out.println("new j " + array[j]);
                if (array[j - 1] > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        // выводим новые значения
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " New count " + array[i]);
        }
    }



    public static void main(String[] args) {
        Heapspot(10);
    }
}