package rikkei.academy;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        long star = System.currentTimeMillis();
        int n = 1000;
        int count = 0;
        int N = 2;
        while (count < n){
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(N); i++) {
                if (N % i ==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println("OptimizedThread: "+ N);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("OptimizedThread time: " +(end - star));
    }
}
