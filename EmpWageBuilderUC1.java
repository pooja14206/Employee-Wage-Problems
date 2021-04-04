public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int Check = 1;
		final int Wage_Per_Hr = 20;
		int Working_Hr = 0;
		double EmpCheck = Math.floor(Math.random() * 10) % 2;

		if (EmpCheck == Check)
		{

			System.out.println("Enployee is present!");
			Working_Hr = 8;
		}
		else

			System.out.println("Employee is Absent!");

		int Daily_Employee_Wage = Wage_Per_Hr * Working_Hr;

		System.out.println("Daily EmployeeWage is " + Daily_Employee_Wage);



	}
}
