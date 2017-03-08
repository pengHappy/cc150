import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by zp007 on 9/16/16.
 */

public class Solution {
    public int stackSize = 100;
    public int[] buffer = new int[3 * stackSize];
    private int[] topNum = new int[]{0, 0, 0};
    public boolean push(int stackId, int val) {
        if(topNum[stackId] == stackSize) {
            return false;
        }
        int index = stackId * stackSize + topNum[stackId];
        topNum[stackId]++;
        buffer[index] = val;
        return true;
    }
    public boolean pop(int stackId) {
        if(topNum[stackId] == 0) {
            return false;
        }
        int index = stackId * stackSize + topNum[stackId] - 1;
        topNum[stackId]--;
        buffer[index] = 0;
        return true;
    }
    public boolean isEmpty(int stackId) {
        return topNum[stackId] == 0;
    }
}









