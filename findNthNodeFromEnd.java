import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    public int findNthFromLast(ListNode head, int N) {
        ListNode first = head, second = head;
        for(int i = 1; i < N; i++) {
            first = first.next;
        }
        while(first != null && first.next != null) {
            second = second.next;
            first = first.next;
        }
        return second.val;
    }
}









