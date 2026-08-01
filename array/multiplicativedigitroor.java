package array;
public class multiplicativedigitroor {
    public static void main(String [] args){
        int n=123;
        while(n>9){
            int product=1;
            while(n>0){
                int mod=n%10;
                product*=mod;
                n/=10;
            }
            n=product;
        }
        System.out.println(n);
    }
}
