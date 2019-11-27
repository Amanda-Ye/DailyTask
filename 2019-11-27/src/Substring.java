import java.util.*;

public class Substring {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] arr = new boolean[n];
        for(int i = 0;i < n;i++){
            if(s.contains(p[i])){
                arr[i] = true;
            }else{
                arr[i] = false;
            }
        }
        return arr;
    }
}