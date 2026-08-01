import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split("\\+s");
        for(String word:arr){
            StringBuilder ss=new StringBuilder(word);
            sb.append(ss.reverse()).append(" ");
        }
        System.out.print(sb.toString().trim());
    }
}
