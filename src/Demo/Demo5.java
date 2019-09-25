package Demo;

public class Demo5 {
    Integer i;
    int x;
    public Demo5(int y) {
        x = i+y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Demo5 (new Integer(4));
    }
}