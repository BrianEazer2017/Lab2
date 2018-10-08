import java.util.Scanner;

public class Lab2AreaPerimeterVolumeApp {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
				input();
			}

	public static void input() {
			// TODO Auto-generated method stub
			// Variables are declared here for appropriate scope
			Double length = 0.0;
			Double width = 0.0;
			Double height = 0.0;
			Scanner sc = new Scanner(System.in);
					
			printer("Come along. Let's enter some room dimensions. Enter length:");
			if (sc.hasNextDouble()) {
			length = sc.nextDouble();
			}
			else {
				printer("bless your little heart");
				input();
				}
					
			printer("Enter width:");
			if (sc.hasNextDouble()) {
			width = sc.nextDouble();
			}
			else {
				printer("bless your little heart");
				input();
			}
					
			printer("Enter height:");
			if (sc.hasNextDouble()) {
			height = sc.nextDouble();
			}
			else {
				printer("bless your little heart");
				input();
			}
			printer("The perimeter is " + ((width*2) + (length*2)));
			printer("The area is " + (width*length));
			printer("The volume is " + (length * width * height));
			repeat();
			sc.close();
			}
	public static void repeat() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			printer("Would you like to keep playing this little game? Type yes or no.");
					
			String answer = sc.next();
			if ( answer.equals("yes")) {
				input();
			}
			else if ( answer.equals("no")) {
				printer("See ya.");
			}
			else {
				printer("you goofed but don't worry cause I'll keep asking you until you answer yes or no, sweetheart.");
				repeat();
			}
			sc.close();
		}
				

		private static void printer(String string) {
			// TODO Auto-generated method stub
			System.out.println(string);
		}
}


