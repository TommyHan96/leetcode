package com.test.leetcode.sort;

import java.util.Random;

public class QuickSort {
    Random random = new Random();
    int findKthLargest(int[] arr, int k) {
        return quickSort(arr, 0, arr.length - 1, arr.length - k);
    }

    int quickSort(int[] arr, int l, int r, int index) {
        int q = randomPartition(arr, l, r);
        if (q == index) {
            return arr[q];
        } else {
            return q < index ? quickSort(arr, q + 1, r, index) : quickSort(arr, l, q - 1, index);
        }
    }

    int randomPartition(int[] arr, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;
        swap(arr, i, r);
        return partition(arr, l, r);
    }

    int partition(int[] arr, int l, int r) {
        int x = arr[r], i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= x) {
                swap(arr, j, ++i);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    public void swap(int[] arr, int v1, int v2) {
        int tmp = arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = tmp;
    }

}
