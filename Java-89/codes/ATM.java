import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("which bank's card?[1.SBI | 2.ICICI] ");
		int bankType = sc.nextInt();

		Bank bank = null;

		switch(bankType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("INVALID CARD TYPE... TRY AGAIN");
				return;
		}

		System.out.println("======================================================");
		System.out.println("\t\t WELCOME TO "+ bank.getClass().getName().toUpperCase());
		System.out.println("======================================================");

		bank.deposit(1000);
		bank.withdraw(500);
		bank.gstCalculation();

		System.out.println("-------------------------------------------------------");

		System.out.println(bank.n);
		System.out.println(Bank.n);
		System.out.println(SBI.n);
		System.out.println(ICICI.n);

		//bank.n = 10; //error: cannot assign a value to final variable n
	}
}
