public class Printf {

	public static void main(String[] args) {

		String name = "Bharat Kumar";
		byte age = 21;
		short dob = 2003;
		int price = 209761;
		long mobileNumber = 9977886689855L;
		float marks = 99.99f;
		double bankBalance = 23448599.984;
		char section = 'A';
		boolean isStudent = true;
		
		System.out.printf("%s", name);
		System.out.printf("%b", age);
		System.out.printf("%s", dob);
		System.out.printf("%d", price);
		System.out.printf("%d", mobileNumber);
		System.out.printf("%f", marks);
		System.out.printf("%f", bankBalance);
		System.out.printf("%c", section);
		System.out.printf("%b", isStudent);
		
		System.out.println();
		
		System.out.printf("%s", name);
		System.out.printf("  %b", age);
		System.out.printf("  %s", dob);
		System.out.printf("  %d", price);
		System.out.printf("  %d", mobileNumber);
		System.out.printf("  %f", marks);
		System.out.printf("  %f", bankBalance);
		System.out.printf("  %c", section);
		System.out.printf("  %b", isStudent);
		
		System.out.println();

		System.out.printf("%s", name);
		System.out.printf("\n%b", age);
		System.out.printf("\n%s", dob);
		System.out.printf("\n%d", price);
		System.out.printf("\n%d", mobileNumber);
		System.out.printf("\n%f", marks);
		System.out.printf("\n%f", bankBalance);
		System.out.printf("\n%c", section);
		System.out.printf("\n%b", isStudent);
	}
}