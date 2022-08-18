package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization op = new OptimizedPrimeFactorization();
        Thread thread = new Thread(lazy);
        Thread thread1 = new Thread(op);
        thread.start();
        thread1.start();
    }
}
