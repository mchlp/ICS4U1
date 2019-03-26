package sorting;

import java.util.Arrays;

public class Sort {

    public void sort1(int[] list) {
        for (int end = list.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }

    public void sort2(int[] list) {
        for (int start = 0; start < list.length - 1; start++) {
            for (int i=start+1; i<list.length; i++) {
                if (list[start] > list[i]) {
                    int temp = list[i];
                    list[i] = list[start];
                    list[start] = temp;
                }
            }
        }
    }

    public int[] combine(int[] arr1, int[] arr2) {
        int arr1Point = 0;
        int arr2Point = 0;
        int sortedArr[] = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length + arr2.length; i++) {
            if (arr1Point == arr1.length) {
                sortedArr[i] = arr2[arr2Point];
                arr2Point++;
            } else if (arr2Point == arr2.length) {
                sortedArr[i] = arr1[arr1Point];
                arr1Point++;
            } else {
                if (arr1[arr1Point] < arr2[arr2Point]) {
                    sortedArr[i] = arr1[arr1Point];
                    arr1Point++;
                } else {
                    sortedArr[i] = arr2[arr2Point];
                    arr2Point++;
                }
            }
        }
        return sortedArr;
    }

    public int[] sort3(int[] list) {
        if (list.length > 1) {
            int[] arr1 = new int[list.length / 2];
            int[] arr2 = new int[list.length - (list.length / 2)];

            for (int i=0; i<list.length / 2; i++) {
                arr1[i] = list[i];
            }

            for (int i=0; i<list.length - (list.length / 2); i++) {
                arr2[i] = list[list.length / 2 + i];
            }

            return combine(sort3(arr1), sort3(arr2));
        }
        return list;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = {45, 5, 678, 789, -123, 54556, 12903912, -34344, 6, 4, 4, 12, 0, -23, 123, -34, -123, 43};
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        System.out.println(Arrays.toString(arr));
        sort.sort1(arr1);
        System.out.println(Arrays.toString(arr1));
        sort.sort2(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(sort.sort3(arr3)));
    }

}
