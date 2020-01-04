
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prime=37;
		int i=2;
		for( i=2;i<prime;i++) {
			
			if(prime%i == 0)
				{System.out.println("The number is not prime");
				break;
				}
		}
			
		if (i==prime) System.out.println("The number is prime");
		
	}

}
