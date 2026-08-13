import java.util.*;
public class ValidIPddress {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char ch[]=s.toCharArray();
    StringBuilder sb=new StringBuilder();
    int count=0;
    for(int i=0;i<ch.length;i++){
        if(ch[i]!='.'){
            if(!Character.isDigit(ch[i])){
                System.out.print("false");
                return;
            }
            sb.append(ch[i]);
        }
        if(ch[i]=='.'||i==ch.length-1){
            if(sb.length()==0){
            System.out.print("false");
            return;
        }
    
        int val=Integer.parseInt(sb.toString());
        if(val>255){
            System.out.print("false");
            return;
        }
        if(sb.charAt(0)=='0'&&sb.length()>1){
            System.out.print("false");
            return;
        }
        count++;
        sb.setLength(0);
    }
}
    System.out.print(count==4?"true":"false");
}
}
