package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void swapIndex(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr [index2] = temp;

    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 17, 23, 59};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter index you want to replace :");
        int a = in.nextInt();
        System.out.print(a + " This index should be replaced with which index ? Enter that :");
        int b = in.nextInt();
        
        swapIndex(arr, a, b);
        System.out.println(Arrays.toString(arr));
        
    }

}
