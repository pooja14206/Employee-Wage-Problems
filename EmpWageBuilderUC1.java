public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		final int Part_Time = 1;
		final int Full_Time = 2;
		final int Wage_Per_Hr = 20;
		final int Working_Days = 20;
		int Total_Wage = 0;
		int Working_Hr = 0;

		for (int day = 1; day <= Working_Days; day++)
		{
			int EmpCheck = (int) (Math.random() * 10) % 3;
			switch (EmpCheck) {

				case Full_Time:
					//System.out.println("Employee is present Full Time.");
					Working_Hr = 8;
					break;

				case Part_Time:
					//System.out.println("Employee is Present Part Time.");
					Working_Hr = 4;
					break;

				default:
			}

			int Daily_Employee_Wage = Wage_Per_Hr * Working_Hr;

			System.out.println("Day" + day + "Wage is: " + Daily_Employee_Wage);
			Total_Wage += Daily_Employee_Wage;
		}
		System.out.println("Total Wage of a month: " + Total_Wage);

	}
}
