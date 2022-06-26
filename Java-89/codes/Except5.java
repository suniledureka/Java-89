class Except5 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int res = x / y;
		System.out.println(x + " / " + y + " = " + res);
	  }
	  catch(Exception ex){
		  System.out.println("exception occured");
		  System.out.println("message = " + ex.getMessage());
		  System.out.println("toString() = " + ex.toString());
		  System.out.println();
		  ex.printStackTrace(); //toString() + call stack
		  System.out.println();
		  System.out.println("Exception Type ---> " + ex.getClass().getName());
		  System.out.println();

		  if(ex instanceof ArithmeticException){
			  System.out.println("$$$--- dividing an integer by 0 ---$$$");
		  }
	  }

 	  System.out.println("----- DONE -----");
	}
}
