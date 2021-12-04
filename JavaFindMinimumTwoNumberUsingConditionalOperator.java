public class JavaFindMinimumTwoNumberUsingConditionalOperator {

	public static void main(String args[]) {

		int n1, n2;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		n1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		n2 = sc.nextInt();
    
		int result = (n1 < n2) ? n1 : n2;

		System.out.println(result + " is a minimum value");
	}
}
