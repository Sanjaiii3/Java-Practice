  import java.util.*;
  public class sum {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int sum=0;
       for(char ch:s.toCharArray()){
           if(Character.isDigit(ch)){
               int val=ch-'0';
               sum+=val;
           }
       }
       System.out.println(sum);
    }
}

