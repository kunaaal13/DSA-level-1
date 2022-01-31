//https://nados.io/question/tower-of-hanoi

import java.io.*;
import java.util.*;

public class Main {

     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        toh(n,a,b,c);
    }

    public static void toh(int n, int a, int b, int c){
        if(n==0)
            return;
        //move n-1 disc from a to c using b
        toh(n-1,a,c,b);
        System.out.println(n+"["+ a + " -> "+b+"]");

        toh(n-1,c,b,a);

    }

}
