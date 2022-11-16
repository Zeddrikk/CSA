package fibbyBoy;

public class FibonacciRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //same test data as the lab doc
        Fibonacci f = new Fibonacci(50);
        System.out.println(f.getValue(1));
        System.out.println(f.getValue(2));
        System.out.println(f.getValue(3));
        System.out.println(f.getValue(4));
        System.out.println(f.getValue(5));
        System.out.println(f.getValue(6));
        System.out.println(f.getValue(11));
        System.out.println(f.getValue(16));
        System.out.println(f.getValue(21));
        System.out.println(f.getValue(31));
        System.out.println(f.getValue(41));
        System.out.println(f.getValue(46));
        System.out.println("set size to 1");
        f.setSize(1);
        System.out.println(f.getValue(1));
        System.out.println("set size to 2");
        f.setSize(2);
        System.out.println(f.getValue(1));
        System.out.println(f.getValue(2));
        System.out.println(f.getValue(11));
    }

}
