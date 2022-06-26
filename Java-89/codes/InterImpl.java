class InterImpl 
{
	public static void main(String[] args) 
	{
		Inter1 obj = new Inter1(){			
			public void display(){
				System.out.println("display method implementation");
			}
		};

		obj.display();
	}
}
