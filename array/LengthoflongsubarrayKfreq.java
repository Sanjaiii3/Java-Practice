import java.util.*;
public class LengthoflongsubarrayKfreq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int max=0;
        int left=0;
        HashMap<Integer,Integer>map=new HashMap<>
        for(int i=0;i<arr.length;i++){
          map.put(arr[i],map.getOrDefault(arr[i],
          while(map.get(arr[i])>k){
            map.put(arr[left],map.get(arr[left])-
            left++;
          }
          max=Math.max(i-left+1,max);
        }
        System.out.print(max);
    }
}

