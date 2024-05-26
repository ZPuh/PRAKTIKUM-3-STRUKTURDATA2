package Praktikum03;

public class StackArray {

    private int[] data;
    private int top;

    public StackArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top];
    }

    public void push(int element) {
        if (top == data.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        data[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(data[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
