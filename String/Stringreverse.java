import java.util.*;
public class Stringreverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        String s=sc.nextLine();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                continue;
            }
            else{
                sb.append(Character.toUpperCase(s.charAt(i)));
                    count++;
                }
            if(count==k&& i>1){
                    sb.append("-");
                    count=0;
                }
            }
            sb.reverse();
            System.out.println(sb.toString());
        }
    }

