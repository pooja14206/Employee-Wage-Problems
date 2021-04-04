public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		final int Part_Time = 1;
		final int Full_Time = 2;
		final int Wage_Per_Hr = 20;
		final int Max_Working_Days = 20;
		final int Max_Working_Hrs = 100;
		int Total_Wage = 0;
		int Working_Hr = 0;

		System.out.println("Day \t WorkingHours \t DailyEmployeeWage \t TotalWorkingHours");
		for (int day = 1, Total_Working_Hrs = 0; day <= Max_Working_Days && Total_Working_Hrs < Max_Working_Hrs; day++, Total_Working_Hrs += Working_Hr)
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
					Working_Hr = 0;
			}

			int Daily_Employee_Wage = Wage_Per_Hr * Working_Hr;

			Total_Wage += Daily_Employee_Wage;
			System.out.println( day + "\t" + Working_Hr + "\t"  +Daily_Employee_Wage + "\t" + Total_Working_Hrs);
		}
		System.out.println("Total Wage of a month: " + Total_Wage);

	}
}
