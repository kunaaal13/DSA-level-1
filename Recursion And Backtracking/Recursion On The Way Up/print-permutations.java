//https://nados.io/question/print-permutations

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String ans) {
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            printPermutations(left+right, ans+ch);
        }
    }

}
