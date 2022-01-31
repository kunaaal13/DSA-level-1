//https://nados.io/question/display-array-in-reverse

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int n){
        if(n == arr.length)
            return;

        displayArr(arr,n+1);
        System.out.println(arr[n]);
    }

}
