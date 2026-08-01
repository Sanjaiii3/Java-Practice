import java.util.*;
public class stringsum {
    

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);  
	   String s=sc.nextLine();
	   s+='a';
	   int num=0;
	   StringBuilder sb=new StringBuilder();
	   for(int i=0;i<s.length();i++){
	       char ch=s.charAt(i);
	      if(Character.isDigit(ch)){
	          sb.append(ch);
	      } 
	      else{
	          if(sb.length()!=0){
	              num+=Integer.parseInt(sb.toString()); 
	              sb.setLength(0);
	          }
	      }
	   }
	   System.out.println(num);
	    
	    
	}
}

