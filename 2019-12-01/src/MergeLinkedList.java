import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class MergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode last = head;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                last.next = cur1;
                last = cur1;
                cur1 = cur1.next;
            }else{
                last.next = cur2;
                last = cur2;
                cur2 = cur2.next;
            }
        }
        while(cur1 != null){
            last.next = cur1;
            last = cur1;
            cur1 = cur1.next;
        }
        while(cur2 != null){
            last.next = cur2;
            last = cur2;
            cur2 = cur2.next;
        }
        return head.next;
    }
}
