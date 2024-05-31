package boi.com;

class Account{
	String name="Lalita";
	int account_no=12345;
	int balance=10000;
	public void display()
	{System.out.println("\nEmployee name:"+name+"\nEmp account number:"+account_no+"\navailable_bal:"+balance);
   }
}
	class FDAccount extends Account{
		int loan_amount=1000;
		public void displayloan() {
			int available_balance=balance-loan_amount;
			System.out.println("My loan amount is"+available_balance);
		}
	}
	public class Single_inheritance {
	public static void main(String[] args) {
		
  FDAccount emp1=new FDAccount();
  emp1.display();
  emp1.displayloan();
}
}
