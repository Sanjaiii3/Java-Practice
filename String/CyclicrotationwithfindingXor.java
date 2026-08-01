public class CyclicrotationwithfindingXor {
	public static void main(String[] args) {
		String a="111";
		String b="111";
		String s=a+b;
		int count=0;
	   for(int i=0;i<s.length()-a.length();i++){
	       String sub=s.substring(i,a.length()+i);
	       if(a.contains(sub)){
	           count++;
	       }
	   }
	   System.out.println(count);
	}
}

