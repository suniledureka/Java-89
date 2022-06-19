class Employee 
{
	int empno;
	String name;
	float sal;

	Employee(){
        System.out.println("******");
        empno = 101;
		name = "Sanjay";
		sal = 2500f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
}

class ConstructorTest
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
