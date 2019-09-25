package Demo;

class recursion {
    int fact(int n) {
        int result;
        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;

    }
}
public class Demo2 {
    public static void main(String args[]) {
        recursion obj = new recursion() ;
        System.out.print(obj.fact(5));
    }
}

//ask this