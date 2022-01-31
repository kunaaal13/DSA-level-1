//https://nados.io/question/get-stair-paths

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        else if (n<0){
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path: path1) {
            paths.add(1+path);
        }

        for (String path: path2) {
            paths.add(2+path);
        }

        for (String path: path3)
            paths.add(3+path);

        return paths;
    }

}
