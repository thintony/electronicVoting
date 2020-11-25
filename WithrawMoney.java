import java.util.Scanner;

public class WithrawMoney {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 double currentBalance = 0.0;
	 int numDeposit = 0;
	 double loanAmount = 0.0;
	 double depositAmount = 0.0;
	
	 
	 
	
	 while(numDeposit <= 6) {
		 System.out.println("Enter depositAmount");
		   depositAmount = scanner.nextDouble();
		 
		    	if(depositAmount < 0 || depositAmount <= 1999.99)
			     System.out.println("You are not qualify for Loan");
		 
		    		else{
		    				
		    			currentBalance = currentBalance + depositAmount;
		    			
		    			numDeposit = numDeposit + 1;
			
		 }
		    	loanAmount =  currentBalance * 1.45;
	 }
	 System.out.printf("CurrentBalance:%.2f%n%nLoanAmount:%.2f",currentBalance, loanAmount);
	
	 }
}
