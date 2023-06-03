package SEM_4;

public class MainForStack {
    public static void main(String[] args) {
        GbStack test = new GbStack();
        test.push(5).push(7).push(5);
        System.out.println(test.size());
        test.pop();
        System.out.println(test.size());
        System.out.println(test.peek());
        System.out.println(test.empty());
        test.pop();
        test.pop();
        System.out.println(test.empty());
        test.pop();
    }
}
