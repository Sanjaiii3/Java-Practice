import java . util.*;
public class zerosandones {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     int zc;
     int oc;
     int max=0;
           int right=0;
          int left=0;
     
        for(int i=0;i<n;i++){
           zc=0;
           oc=0;

            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    zc++;
                }
                else{
                    oc++;
                }
            
            if(zc==oc&&j-i+1>max){
                max=j-i+1;
                left=i;
                right=j;
            }
        }

        }
        if(max==0){
        System.out.println("no such subarray found");
        }
        else{
            System.out.println(left+" to "+right);
        }
    }
}
