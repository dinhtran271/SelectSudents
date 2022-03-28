import java.util.Scanner;

/* Determine who are above 15 years old to receive a vaccine
 * Enter number of students
 * Input student names and ages
 * Use arrays*/

public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int nums = scan.nextInt();
		String[] student = new String[nums];
		int[] age = new int[nums];
		Scanner scanName = new Scanner(System.in);
		for (int i=0; i<nums; i++) {
			System.out.println("Enter name " + (i+1));
			student[i] = scanName.nextLine();
			System.out.println("Enter age " + (i+1));
			age[i] = scan.nextInt();
		}
		for (int j=0; j<nums; j++) {
			if (age[j] > 15) {
				System.out.println(student[j] + " can receive a vaccine.");
				System.out.println(student[j] + " is " + age[j] + " years old.");
			}
		}
		scan.close();
		scanName.close();
		
	}

}
