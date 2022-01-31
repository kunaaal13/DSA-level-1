//https://nados.io/question/get-maze-paths

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

        ArrayList<String> hrest = new ArrayList<>();
        ArrayList<String> vrest = new ArrayList<>();
        if(sc<dc){
            hrest =  getMazePaths(sr, sc+1, dr, dc);;
        }
        if(sr<dr){
            vrest = getMazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String s : hrest)
            paths.add("h"+s);

        for (String s : vrest)
            paths.add("v"+s);

        return paths;
    }

}
