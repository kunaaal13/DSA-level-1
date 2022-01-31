//https://nados.io/question/print-subsequence

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printSS(str,"");
    }

    public static void printSS(String unp, String pro) {
        if (unp.isEmpty()){
            System.out.println(pro);
            return;
        }

        char ch = unp.charAt(0);
        printSS(unp.substring(1),pro+ch);
        printSS(unp.substring(1),pro);
    }

}
