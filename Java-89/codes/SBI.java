class SBI implements Bank
{
	public void deposit(float amt){
		System.out.println("Rs."+amt+" Credited in SBI Account");
	}
	public void withdraw(float amt){
		System.out.println("Rs."+amt+" Debited from SBI Account");
	}
}
