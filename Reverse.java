import java.io.*;
import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        ArrayList<Integer> ans = reverse(al);
        System.out.println(ans);
    }
    static ArrayList<Integer> reverse (ArrayList<Integer> List){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=List.size() - 1;i>=0;i--){
            ans.add(List.get(i));
        }
        return ans;
    }
}