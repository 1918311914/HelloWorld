public class IsPrime {
    public static boolean IsPrime(int n){
        for(int i = 2; i * i <= n; i ++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        for(int i = 1; i < 100; i ++){
            if(IsPrime(i)){
                System.out.println((i));
            }
        }
    }
}
