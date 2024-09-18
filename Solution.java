import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        ArrayList<ArrayList<Integer>> list = new
        ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<n;i++){
            int n1 = s1.nextInt();
            ArrayList<Integer> l2=new ArrayList<>();
            for(int j=0;j<n1;j++){
                l2.add(s1.nextInt());
            }
            list.add(i, l2);
        }

        int num = s1.nextInt();
        for(int k = 0;k<num;k++) {
            int m = s1.nextInt();
            int o = s1.nextInt();
            try{
                System.out.println(list.get(m-1).get(o-1));
            }
            catch(Exception e) {
                System.out.println("ERROR");
            }
        }
    } 
}