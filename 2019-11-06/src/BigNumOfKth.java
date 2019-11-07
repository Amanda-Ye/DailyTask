import java.util.Arrays;

public class BigNumOfKth {
    public static int findKth1(int[] a, int n, int K) {
        Arrays.sort(a);
        return a[n - K];
    }
    public static int findKth(int[] a,int n,int K){
        return find(a,0,n - 1,K);
    }
    public static int find(int[] a,int low,int high ,int k){
        int part = partition(a,low,high);
        if(k == part - low + 1){
            return a[part];
        }else if(k > part - low + 1){
            return find(a,part + 1,high,k - (part - low + 1));
        }else{
            return find(a,low,part - 1,k);
        }
    }
    private static int partition(int[] a,int low,int high){
        int key = a[low];
        while(low < high){
            while(low < high && a[high] <= key){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] >= key){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a,5,3));
    }
}
