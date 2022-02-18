package com.test.leetcode.sort;

public class HeapSort {

    int findKthLargest(int[] arr, int k){
        int heapSize = arr.length;
        buildMaxHeap(arr, heapSize);
        for (int i = arr.length - 1; i > arr.length - k + 1; i--){
            swap(arr, 0, i);
            --heapSize;
            heapify(arr, 0, heapSize);
        }
        return arr[0];
    }

    void buildMaxHeap(int[] arr, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            heapify(arr, i, heapSize);
        }
    }

    void heapify(int[] arr, int i, int heapSize) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < heapSize && arr[left] > largest) {
            largest = left;
        }

        if (left < heapSize && arr[right] > largest) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, heapSize);
        }
    }

    void swap(int[] a, int l, int r) {
        int tmp = a[l];
        a[l] = a[r];
        a[r] = tmp;
    }
}
