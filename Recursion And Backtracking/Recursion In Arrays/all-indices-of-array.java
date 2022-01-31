//https://nados.io/question/all-indices-of-array

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int i, int count) {
        // write ur code here
        if(i == arr.length){
            return new int[count];
        }

        if(arr[i] == x){
            int ans[] = allIndices(arr,x,i+1,count+1);
            ans [count] = i;
            return ans;
        }
        else {
            int ans [] = allIndices(arr, x, i+1, count);
            return ans;
        }
    }

}
