
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="String";
		
		int len=str.length();
		int last=len-1;
		char []c = new char[len];
		for(int i=0;i<len;i++)
		{
			c[i]=str.charAt(last);
	
			last--;
			
			
	}
		String reversed = new String(c);
				
System.out.println(reversed);
}
}