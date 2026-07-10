
public class function{
    // public static int factorial(int n){
    //   int result=1;
    //   while(n>0){
    //     result*=n;
    //     n--;
    //   }
    //   return result;
    // }
    // public static int binomial(int n , int r){
    //   int fact_n = factorial(n);
    //   int fact_r = factorial(r);
    //   int fact_nmr= factorial(n-r);
    //   int bincoeff= fact_n / (fact_r * fact_nmr);
    //   return bincoeff;

    public static boolean isPrime (int n){
      boolean isPrime = true;
      for (int i=2; i<=Math.sqrt(n); i++){
        if(n % i == 0){
         return false;
        }
      }
      return true;
    }
    public static void Primes(int n){
      for (int i=2; i<=n; i++){
        if (isPrime(i)){
          System.out.print(i+" ");
        }
      }
      System.out.println();
    }


    public static void main(String args[]){
      
        Primes(16);
    }
}
      


