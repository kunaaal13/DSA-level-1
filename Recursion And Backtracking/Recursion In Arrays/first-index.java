//https://nados.io/question/first-index

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        System.out.println(firstIndex(arr,0,x));
    }

    public static int firstIndex(int[] arr, int i, int x){
        if(i == arr.length)
            return -1;

        if(arr[i] == x)
            return i;
        else
            return firstIndex(arr,i+1,x);
    }

}
