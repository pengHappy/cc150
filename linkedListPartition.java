import java.util.*;

/**
 * Created by coffee on 2016/9/18.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyLess = new ListNode(-1), dummyMore = new ListNode(-1);
        dummyLess.next = head;
        ListNode hLess = dummyLess, tLess = head;
        ListNode tMore = dummyMore;
        while(tLess != null) {
            if(tLess.val < x) {
                hLess = tLess;
                tLess = tLess.next;
            }
            else {
                hLess.next = tLess.next;
                tLess.next = null;
                tMore.next = tLess;
                tMore = tLess;
                tLess = hLess.next;
            }
        }
        hLess.next = dummyMore.next;
        return dummyLess.next;
    }
}