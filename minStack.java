/**
 * Created by zp007 on 11/13/16.
 */
public class MinStack {

    public class Element {
        int val;
        int min;
        Element next;
        public Element(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Element top = null;

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(top == null) {
            top = new Element(x, x);
        }
        else {
            Element element = new Element(x, Math.min(x, top.min));
            element.next = top;
            top = element;
        }
    }

    public void pop() {
        if(top == null) {
            return;
        }
        Element element = top.next;
        top = null;
        top = element;
    }

    public int top() {
        if(top == null) {
            return -1;
        }
        else {
            return top.val;
        }
    }

    public int getMin() {
        if(top == null) {
            return -1;
        }
        else {
            return top.min;
        }
    }
}
