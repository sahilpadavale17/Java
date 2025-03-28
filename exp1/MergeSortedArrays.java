import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of first array: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        
        System.out.print("Enter the size of second array: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        
        int[] mergedArray = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        
        while (i < size1) {
            mergedArray[k++] = array1[i++];
        }

        
        while (j < size2) {
            mergedArray[k++] = array2[j++];
        }

        
        System.out.println("\nMerged Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
