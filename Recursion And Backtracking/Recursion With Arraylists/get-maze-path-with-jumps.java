//https://nados.io/question/get-maze-path-with-jumps

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println(getMazePaths(1,1,n,m));
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr==dr && sc == dc){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal moves
        for (int h = 1; h <= dc-sc; h++) {
            ArrayList<String> hpath = getMazePaths(sr, sc+h, dr, dc);
            for (String s : hpath){
                paths.add("h"+h+s);
            }
        }

        // vertical moves
        for (int v = 1; v <= dr-sr; v++) {
            ArrayList<String> vpath = getMazePaths(sr+v, sc, dr, dc);
            for (String s : vpath){
                paths.add("v"+v+s);
            }
        }

        // diagonal moves
        for (int d = 1; d <= dr-sr && d <= dc-sc; d++) {
            ArrayList<String> dpath = getMazePaths(sr+d, sc+d, dr, dc);
            for (String s : dpath){
                paths.add("d"+d+s);
            }
        }

        return paths;
    }

}
