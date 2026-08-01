import java.util.*;
public class beautifulsubstring
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int count=0;
	 int n=s.length();
	 for(int i=0;i<n;i++){
	     for(int j=i+1;j<=n;j++){
	         String sub=s.substring(i,j);
	         if(beautiful(sub)){
	           count++;             
	         }
	     }
	 }
	 System.out.println(count);
	}
	 public static boolean beautiful(String sub){
	  
	    int freq[]=new int[26];
	    for(int i=0;i<sub.length();i++){
	        freq[sub.charAt(i)-'a']++;
	    }
	    if(freq['a'-'a']==freq['b'-'a']&&freq['c'-'a'] ==freq['a'-'a']   ){
	        return true;
	    
	           
	    }
	    return false;
	 
	}
}
