package com.pinc.design_pattern.strategy;

public class Sorter<T> {

    public void sort(T[] arr,Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[j],arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    private void swap(T[] arr, int i, int minPos) {
        T temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;

    }
}
