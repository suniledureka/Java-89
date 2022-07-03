class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Sanjay";
		sal = 12500f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		//-- create an instance of Employee type
		Employee emp = new Employee();

		//-- access the state of object with reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- access the state of object with method
		emp.getDetails();

		//-- change the state of object with reference
		emp.empno = 101;
		emp.name = "Praveen";
		emp.sal = 7500f;

		emp.getDetails();

		//-- change the state of object with method
		emp.setDetails();
		emp.getDetails();
	}
}
