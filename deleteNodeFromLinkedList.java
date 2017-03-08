import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    private ListNode head = null;
    public Solution(ListNode head) {
        this.head = head;
    }
    public void deleteNode(ListNode node) {
        ListNode nodeNext = node.next;
        node.val = nodeNext.val;
        node.next = nodeNext.next;
        nodeNext.next = null;
        nodeNext = null;
    }
}









