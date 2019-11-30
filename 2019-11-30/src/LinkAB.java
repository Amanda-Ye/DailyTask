import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class LinkAB {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode head = new ListNode(-1);
        ListNode last = head;
        ListNode cur1 = a;
        ListNode cur2 = b;
        int cy = 0;
        int sum = 0;
        int val1 = 0;
        int val2 = 0;
        while(cur1 != null || cur2 != null){
            val1 = cur1 == null ? 0 : cur1.val;
            val2 = cur2 == null ? 0 : cur2.val;
            sum = val1 + val2 + cy;
            cy = sum / 10;   //进位
            ListNode node = new ListNode(sum % 10);
            last.next = node;   //尾插
            last = node;
            if(cur1 != null){
                cur1 = cur1.next;
            }
            if(cur2 != null){
                cur2 = cur2.next;
            }
        }
        if(cy == 1){
            ListNode node = new ListNode(1);
            last.next = node;
            last = node;
        }
        return head.next;
    }
}
