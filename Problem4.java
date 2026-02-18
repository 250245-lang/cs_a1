class MathTool{
    public static long factorialRecursive(int n){
        if(n<=1)return 1;
        return factorialRecursive(n-1)*n;
    }

    public static long factorialIterative(int n){
        long factorial = 1;
        while (n>1){
            factorial*=n;
            n--;
        }
        return factorial;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        long temp;
        StopWatch stopWatch1 = new StopWatch();
        for (int i = 0; i < 1000000; i++) {
            temp = MathTool.factorialRecursive(20);
        }
        stopWatch1.stop();

        StopWatch stopWatch2 = new StopWatch();
        for (int i = 0; i < 1000000; i++) {
            temp = MathTool.factorialIterative(20);
        }
        stopWatch2.stop();
        System.out.printf("Time elapsed when using recursive method: %d%nTime elapsed when using iterative method: %d", stopWatch1.getElapsedTime(), stopWatch2.getElapsedTime());
    }
}
