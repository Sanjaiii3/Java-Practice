import java.util.*;
public class ascdes {
     public static void main(String [] args){
        int arr[]={25,36,96,58,74,14,35,15,75,95};
            int n=arr.length;
            ArrayList<Integer> list1=new ArrayList<>();
            for(int i=0;i<n;i+=2){
                list1.add(arr[i]);
            }
            Collections.sort(list1);
            Collections.reverse(list1);
            ArrayList<Integer> list2= new ArrayList<>();
            for(int i=1;i<n;i+=2){
                list2.add(arr[i]);
            }
            Collections.sort(list2);
            int ans[]=new int[n];
            int ind1=0;
            int ind2=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    ans[i]=list1.get(ind1++);
                }
                if(i%2!=0){
                    ans[i]=list2.get(ind2++);
                }
            }
            System.out.println(Arrays.toString(ans));
        } 
     }

/*Example:

Input:

10  

25 36 96 58 74 14 35 15 75 95

Output:

96 14 75 15 74 36 35 58 25 95



/* */