import java.util.Scanner;
public class beverages {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		int totalPeople = 0;
		int personNumber = 1;
		int coffeePeople = 0;
		int teaPeople = 0;
		int cokePeople = 0;
		int ojPeople = 0;
		int input = 1;
		
		while(input >= 1 && input <= 4) {
			
			System.out.println("Please input the favorite beverage of person #" + personNumber + ": Choose 1, 2, 3, or 4 from the above menu or -1 to exit the program");
			input = scan.nextInt();
			personNumber++;
			totalPeople++;
			if(input == 1) {
				coffeePeople++;
			} else if(input == 2) {
				teaPeople++;
			} else if(input == 3) {
				cokePeople++;
			} else if(input == 4) {
				ojPeople++;
			} else if(input == -1) {
				System.out.println("The total number of people surveyed is 5. The results are as follows: \n \nBeverage \tNumber of Votes \n *************************** \n Coffee \t" + coffeePeople + 
						+ "\nTea \t" + teaPeople + "\nCoke\t" + cokePeople + "\nOrange Juice\t" + ojPeople);
			}
			
			
		}
		
		
		
		
		
	}
	
	

}
