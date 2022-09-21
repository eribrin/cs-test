public class Lab4 {
	public static void main(String[] args) {
		//question 1
		int ounces = 264;
		int pounds = ounces / 16; //pounds = 16		
		int earlModulus = ounces % pounds; //remainder = 8		
		
		System.out.println("Earl the cat is " + pounds + " pounds and " + 
		earlModulus + " ounces."); //16 pounds and 8 ounces
		
		//question 2
		
		int caliToNY = 2580; //in minutes
		int hours = 2580 / 60; //in hours = 43		
		int remainingMins = caliToNY % 60; //0 remaining minutes
				
		System.out.println(hours + " hours and " + remainingMins + " minutes.");
		
		//question 3: days:hours:minutes:seconds
		
		int secondsInput = 313297;
		
		int days = secondsInput / ((60*60)*24);
		
		System.out.println(days + " days");
		
		secondsInput = secondsInput % ((60*60)*24); 
		
		int hoursQThree = secondsInput / (60*60);
		
		System.out.println(hoursQThree + " hours");
		
		secondsInput = secondsInput % (60*60);
		
		int minutesQThree = secondsInput / 60;
				
		System.out.println(minutesQThree + " minutes");
		
		secondsInput = secondsInput % 60;
		
		System.out.println(days+":"+hoursQThree+":"+minutesQThree+":"+secondsInput);
		
		
		//question 4:
	
		int input = 56;
		int divisionByTen = input / 10; //cut off the 6
		int tensPlace = divisionByTen % 10; //prints 5
		System.out.println("The tens place is " + tensPlace);
		
		//question 5
		
		int inputQFive = 345;
		
		int digitOne = inputQFive % 10; //gets the ones place
		
		int digitTwo = (inputQFive / 10) % 10; //cuts off the ones place and gets the tens place
		
		int digitThree = (inputQFive / 100) % 10; //cuts off the tens place and gets the hundredth place
		
		int solution = digitOne + digitTwo + digitThree;
		
		System.out.println("The digits of " + inputQFive + " added together is " + solution);
		
		//question 6: ex. $128.85
		
		double dollarsAndCents = 128.85;
		
		int dollars = (int) dollarsAndCents; 
		//removes the decimal by making it an integer
		
		double cents = dollarsAndCents * 100;
		//moves the decimals 2 points to the right
		cents%=100;
		//finds the last two digits
		int integerCents = (int)cents;
		//turns it into an integer
		
		System.out.println(dollars + " dollars and " + integerCents + " cent(s)");
		
		//question 7
		/*(a) is three seperate if statements, while (b) is all combined into one*/
		
		//question 8
		
		int numberInput = 394;
		
		int onesPlace = numberInput % 10; //find the ones place first
		System.out.println(onesPlace);
		
		int hundredthsPlace = numberInput / 100; //removes the last two digits
		
		System.out.println(hundredthsPlace);
		
		if (onesPlace == hundredthsPlace) {
			System.out.println("The number is a palindrome");
		} else if (onesPlace != hundredthsPlace) {
			System.out.println("The number is not a palindrome");
		}
		
		
		
		
	}
}