import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		float amount;
		
		while(true) {
			System.out.println("1. Open Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt)
			{
			 case 1:
				if(acc == null) {
					System.out.print("enter a/c number: ");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter a/c holder name: ");
					String name = sc.nextLine();
					
					System.out.print("enter initial deposit: ");
					amount = sc.nextFloat();
					
					//-- create ac Account instance
					acc = new Account(acno, name, amount);
					System.out.println("@@@-- WELCOME TO OUR BANK ---@@@");
				}else {
					System.out.println("###--- YOU HAVE ACCOUNT WITH US-- PLEASE CONTACT MANAGER ---###");
				}
				break;
			 case 2:
				if(acc != null) {
					System.out.print("enter amount to deposit: ");
					amount = sc.nextFloat();
					acc.deposit(amount);
				}
				else
					System.out.println("$$$--- OPEN AN ACCOUNT WITH US ---$$$");				 
				break;
			 case 3:
				if(acc != null) {
					System.out.print("enter amount to withdraw: ");
					amount = sc.nextFloat();
					acc.withdraw(amount);				
				}
				else
					System.out.println("$$$--- OPEN AN ACCOUNT WITH US ---$$$");				 
				break;
			 case 4:
				if(acc != null)
					acc.getDetails();
				else
					System.out.println("$$$--- OPEN AN ACCOUNT WITH US ---$$$");
				break;
			 case 5:
				System.out.println("###--- Application is Designed & Developed by ----###");
				System.out.println("###-------- team @ edureka --------###");
				System.exit(0); //terminate application
				break;
			 default:
				System.out.println("@@@--- INVALID OPTION - TRY AGAIN ---@@@"); 
				break;			
			}//switch
			System.out.println("=============================================================");
		}//while
	}

}
