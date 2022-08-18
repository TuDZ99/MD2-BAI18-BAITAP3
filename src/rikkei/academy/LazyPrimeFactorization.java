package rikkei.academy;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        long star = System.currentTimeMillis();
        int n = 1000;
        int count = 0;
        int N = 2;
        while (count < n){
            boolean isPrime = true;
            for (int i = 2; i < N; i++) {
                if (N % i ==0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println("LazyThread: "+ N);
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("LazyThread time: " +(end - star));
    }
}
