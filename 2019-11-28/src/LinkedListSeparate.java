import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class LinkedListSeparate {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null){
            return null;
        }
        ListNode small = new ListNode(-1);
        ListNode lastSmall = small;
        ListNode big = new ListNode(-1);
        ListNode lastBig = big;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.val < x){
                lastSmall.next = cur;
                lastSmall = cur;
            }else{
                lastBig.next = cur;
                lastBig = cur;
            }
            cur = cur.next;
        }
        if(small.next == null){
            return big.next;
        }
        if(big.next == null){
            return small.next;
        }
        lastBig.next = null;
        lastSmall.next = big.next;
        return small.next;
    }
}
