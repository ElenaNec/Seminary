package SEM_4;

public class GbStack {
//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().

        private int[] arr;
        private int top;
        private int capacity;

        public GbStack() {
            int value = 3;
            arr = new int[value];
            capacity = value;
            top = - 1;
        }
        private void addCapacity(){
            int[] copy = new int[arr.length + arr.length / 2];
            System.arraycopy(arr, 0, copy, 0, arr.length);
            arr = copy;
            capacity = arr.length;
        }
        public int size(){
            return top + 1;
        }
        public boolean empty(){
            return top == -1;
        }
        public int peek(){
            if(!empty()){
                return arr[top];
            } else {
                throw new RuntimeException("Stack is empty");
            }
        }
        public int pop(){
            if(!empty()){
                peek();
                return arr[top--];
            } else {
                throw new RuntimeException("Stack is empty");
            }
        }
        public GbStack push(int num){
            if (isFull()) addCapacity();
            arr[++top] = num;
//        same as 46:
//        top += 1;
//        arr[top] = num;
            return this;
        }
        private boolean isFull(){
            return size() == capacity;
        }
}
