//https://nados.io/question/print-maze-paths-with-jumps

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        printMazePaths(1,1,n,m,"");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }

        //horizontal
        for (int i = 1; i <= dc-sc ; i++) {
            printMazePaths(sr, sc+i, dr, dc, ans+"h"+i);
        }

        //vertical
        for (int i = 1; i <= dr-sr ; i++) {
            printMazePaths(sr+i, sc, dr, dc, ans+"v"+i);
        }

        //diagonal
        for (int i = 1; i <= dr-sr && i <= dc-sc; i++) {
            printMazePaths(sr+i, sc+i, dr, dc, ans+"d"+i);
        }
    }

}
