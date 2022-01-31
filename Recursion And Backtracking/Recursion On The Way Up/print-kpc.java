//https://nados.io/question/print-kpc

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printKPC(str,"");
    }

    static String [] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String ans) {
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        String rest = str.substring(1);

        String code_ch = codes[ch-'0'];
        for (int i = 0; i < code_ch.length(); i++) {
            char c = code_ch.charAt(i);
            printKPC(rest, ans+c);
        }
    }

}
