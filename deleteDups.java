import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    public void deleteDups(ListNode head) {
        if(head == null) {
            return;
        }
        ListNode prev = head, current = head.next;
        while(current != null) {
            ListNode p = head;
            while(p != current) {
                if(p.val == current.val) {
                    prev.next = current.next;
                    current = prev.next;
                    break;
                }
                p = p.next;
            }
            if(p == current) {
                prev = current;
                current = current.next;
            }
        }
    }
}









