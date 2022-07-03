interface Bank
{
	int n = 10;

	void deposit(float amt);
	void withdraw(float amt);

	default void gstCalculation(){
		System.out.println("GST Calculation Implementation");
	};
}