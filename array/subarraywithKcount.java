import java.util.*;
public class subarraywithKcount {
  public static void main(String[]args){
    int arr[]={2,3,2,3,};
    int k=2;
    int count=0;
    for(int i=0;i<arr.length;i++){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int j=i;j<arr.length;j++){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(map.get(arr[j])>=k){
               count++;
            }
        }
    }
    System.out.println(count);
  }  
}
//input [2,3,2,3] k=2 op=3