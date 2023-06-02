package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String args[]) {
        int[] array = { 1, 71, 54, 65, 2, -1, 24, 45, 98, 0};
        System.out.println("Array before Sorting" + Arrays.toString(array));
        asendingSort(array);
        System.out.println("Array after Sorting in Ascending Order: ");
        System.out.println(Arrays.toString(array));
    }

    private static void asendingSort(int[] array) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    }

