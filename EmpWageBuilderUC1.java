public class EmpWageBuilderUC1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		int Check = 1;
		double EmpCheck = Math.floor(Math.random() * 10) % 2;

		if (EmpCheck == Check)

			System.out.println("Enployee is present!");

		else

			System.out.println("Employee is Absent!");

	}
}
