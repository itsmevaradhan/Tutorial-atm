import java.util.Scanner;

class Atm
{
	public static void main(String[]args)
	{
		int balance=2000,withdraw,deposit;
		Scanner sc =new Scanner(System.in);

	while(true)
	{
		System.out.println(" welcome to Varadhan ATM");
		System.out.println("press 1 to Withdraw");
		System.out.println("press 2 to deposit");
		System.out.println("Press 3 to Check balance");
		System.out.println("press 4 to exit");
		System.out.println("choose  the operation you want to perform");

	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.print("Enter money to be withdrawn.");
		withdraw = sc.nextInt();
		if(balance>=withdraw)
	{
		balance=balance-withdraw;
		System.out.println("please collect your money");
	}
else
	{
	System.out.println("Insufficient Balance");
	}
	System.out.print("");
	break;
	
	case 2:
	System.out.print("Enter money to be deposited");
	deposit=sc.nextInt();
	
	balance= balance+deposit;
	System.out.println("Your Money has been successfully deposited");
	System.out.println("");
	
	break;
	
	case 3:
		System.out.println("Balance"+balance);
		System.out.println("");
		break;
		
	case 4:
		System.exit(0);
		
			}
	
		}
	
	}
	
}