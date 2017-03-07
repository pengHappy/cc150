import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    public void deleteDups(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode prev = null, current = head;
        while(current != null) {
            if(hashSet.contains(current.val)) {
                prev.next = current.next;
            }
            else {
                hashSet.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }
}









