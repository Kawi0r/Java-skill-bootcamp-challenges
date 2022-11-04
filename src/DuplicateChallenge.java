import java.util.Arrays;
import java.util.Random;

public class DuplicateChallenge {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] array2 = new int[20];

        System.out.print("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            int num = creatingRandomNumber();
            array1[i] = num;
        }
        printingArray(array1);

        System.out.print("Array2: ");
        for (int i = 0; i < array1.length; i++) {
            int num = creatingRandomNumber();
            array2[i] = num;
        }
        printingArray(array2);

        // sorting our random arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        //creating new array to store, array after removing duplicates
        int[] newArr1 = removeDuplicates(array1);
        int[] newArr2 = removeDuplicates(array2);

        //sorting new arrays
        Arrays.sort(newArr1);
        Arrays.sort(newArr2);

        //printing new sorted arrays
        System.out.print("Array 1 without duplicates: ");
        printingArray(newArr1);
        System.out.print("Array 1 without duplicates: ");
        printingArray(newArr2);


        //checking for duplicates in 2 arrays
        System.out.print("Duplicates from two arrays: ");
        for (int k : newArr1) {
            for (int i : newArr2) {
                if (k == i) {
                    System.out.print(k + ", ");
                }
            }
        }
    }

    static public int creatingRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(20) +1;
    }

    static public void printingArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + ", ");
        }
        System.out.println("\n");
    }

    public static int[] removeDuplicates(int[] arr){
        int end = arr.length;
        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[end-1];
                    end--;
                    j--;
                }
            }
        }
        int[] whitelist = new int[end];
        System.arraycopy(arr, 0, whitelist, 0, end);
        return whitelist;
    }
}

// task: create two integer arrays and fill them up with random numbers, compare and print out only duplicates from both arrays
