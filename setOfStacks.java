import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

/**
 * Created by coffee on 2017/3/8.
 */
public class SetOfStacks {
    public int capacity;
    private ArrayList<LinkedList<Integer>> stacks;
    public SetOfStacks(int capacity) {
        this.capacity = capacity;
        stacks = new ArrayList<>();
        stacks.add(new LinkedList<Integer>());
    }
    private LinkedList<Integer> getLastStack() {
        return stacks.get(stacks.size() - 1);
    }
    public void push(int val) {
        LinkedList<Integer> lastStack = getLastStack();
        if(lastStack.size() == capacity) {
            lastStack = new LinkedList<>();
            stacks.add(lastStack);
        }
        lastStack.push(val);
    }
    public int pop() {
        int ans = Integer.MIN_VALUE;
        try {
            LinkedList<Integer> lastStack = getLastStack();
            ans = lastStack.pop();
            if(lastStack.isEmpty()) {
                stacks.remove(stacks.size() - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans;
    }
    public int popAt(int index) {
        int ans = Integer.MIN_VALUE;
        try {
            LinkedList<Integer> stack = stacks.get(index);
            ans = stack.pop();
            for(int i = index + 1; i < stacks.size(); i++) {
                stacks.get(i - 1).push(stacks.get(i).poll());
            }
            if(getLastStack().isEmpty()) {
                stacks.remove(stacks.size() - 1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans;
    }
    public boolean isEmpty() {
        return stacks.size() == 1 && getLastStack().isEmpty();
    }
}
