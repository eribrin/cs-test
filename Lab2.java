public class Lab2 {
	public static void main(String[] args) {
		//Question 1: Write a program that displays your name two times, once per line
		
		System.out.println("Erin Jones \nErin Jones");
		
		//Question 2: Write a program that displays your name two times on the same line.
		
		System.out.println("Erin Jones " + "Erin Jones");
		
		//Question 3: Write a program that displays your name in a box.
		
		System.out.println("+---------------+" + "\n|" + "\t\t|" + "\n| Erin Jones \t|" + "\n|" + "\t\t|" + "\n+---------------+");
		
		//Question 4: Write a program that displays “Welcome to Java!” 3 times.
		
		System.out.println("Welcome to Java!" + "\nWelcome to Java!" + "\nWelcome to Java!");
		
		//Question 5: (Compute expressions) Write a program that displays the result of the equation below(Remember — Java follows PEMDAS).
		
		System.out.println("(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5) = ");
		
		System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
		
		//Question 6: Write a program that displays the result of.
		
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		
		//Question 7
		
		//Question 8
		
		//a 
		System.out.println(2+3);
		//b
		System.out.println("2"+3);
		//c
		System.out.println("2"+"3");
		//d
		System.out.println(1+2+3+"4"+5+6);
		//e
		System.out.println("2"+3+4);
		//f
		System.out.println("2"+(3+4));
		//g
		System.out.println('a'+1);
		//h
		System.out.println('a'+"1"+'P');
		
		//Question 9
		
		System.out.printf("%s%9s%18s", "Employee:", "ID:", "Hourly Rate:\n");
		System.out.printf("%s%15d%8.2f", "Sally", 12345, 24.50);
		System.out.printf("\n%s%16d%8.2f","John", 55555, 19.32);
		System.out.printf("\n%s%15d%8.2f", "Billy", 34109, 31.21);
		
		//Question 10
		
		System.out.println("\nRandom Facts");
		System.out.printf("%s%13s%13s", "Friend", "Fav Letter", "Fav Number");
		System.out.printf("\n%s%7s%13d", "Jas", "K", 8);
		System.out.printf("\n%s%6s%14d", "Gina", "G", 15);
		System.out.printf("\n%s%5s%14d", "Cathy", "B", 25);
		
	}
}
