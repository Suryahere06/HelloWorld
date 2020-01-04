
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int palin=121;
		String str=Integer.toString(palin);
		
		int len=str.length();
		int last=len-1;
		char []c = new char[len];
		for(int i=0;i<len;i++)
		{
			c[i]=str.charAt(last);
	
			last--;
			
			
		}
		String reversed = new String(c);
		System.out.println(palin);
		System.out.println(str);

		
		if (str.equals(reversed) )
			System.out.println("The number is a palindrome");
			else
				System.out.println("The number is not a palindrome");

	}
}
