import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    public int findBeginning(ListNode head) {
        ListNode fast = head.next.next, slow = head.next;
        while(fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast.val;
    }
}









