class Except4 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int res = x / y;
		System.out.println(x + " / " + y + " = " + res);
	  }
	  catch(ArithmeticException ex){
		  System.out.println("Cannot divide an integer by zero");
	  }
	  catch(ArrayIndexOutOfBoundsException ex){
		  System.out.println("Please provide 2 cmd args");
	  }
	  catch(NumberFormatException ex){
		  System.out.println("Please provide numbers as cmd args");
	  }
 	  System.out.println("----- DONE -----");
	}
}
