public class Lab3 {
	public static void main(String[] args) {
		//quiz 1
		
		int base = 10;
		int height = 25;
		double areaOfTriangle = 0.5 * base * height;
		
		System.out.println(areaOfTriangle);
		
		//quiz 2
		
		System.out.printf("%-6s%-11s%-8s", "ID", "Username", "Password\n");
		System.out.printf("%-6d%-11s%-8s", 125, "bobby", "xxxxx");
		
		//Question 1
		
		System.out.println();
		
		double radius = 4.5;
		double pi = 3.1415;
		double areaOfCircle = radius * radius * pi;
		
		System.out.println("The area is " + areaOfCircle);
		
		//Question 2
		
		double length = 12.75;
		double volumeOfCircle = areaOfCircle * length;
		
		System.out.println("The volume is " + volumeOfCircle);
		
		//Question 3
		
		double celsiusValue = 43;
		double fahrenheitFormula = ((9.0 / 5) * celsiusValue + 32);
		
		System.out.println(celsiusValue + " Celsius is " + fahrenheitFormula + " Fahrenheit");
		
		//Question 4: 1 foot = 0.305 meter
		
		double feetValue = 1;
		feetValue = 2; //reassign to check if the formula works for other values
		double metersFormula = feetValue * 0.305;
		
		System.out.println(feetValue + " feet is " + metersFormula + " meters");
		
		//Question 5
		
		double poundValue = 1;
		poundValue = 2; //reassign to check if the formula works for other values
		double kilogramFormula = poundValue * 0.454;
		
		System.out.println(poundValue + " pounds is " + kilogramFormula + " kilograms.");
		
		//Question 6
		
		double weightInPounds = 145;
		double heightInInches = 67.5;
		
		double bmiFormula = ((weightInPounds) * 703)/(heightInInches * heightInInches);
		
		System.out.printf("%-6s%.2f", "BMI = ", bmiFormula);
		
		System.out.println();
		
		bmiFormula = ((weightInPounds) * 703)/(Math.pow(heightInInches, 2));
		System.out.printf("%-6s%.2f", "BMI = ", bmiFormula);


	
		//Question 7
		
		System.out.println();
		
		int num = 8560;
		double comparisonNum = 50;
		comparisonNum = 9000;
		boolean lessThanCheck = comparisonNum < num;
		
		System.out.println(lessThanCheck);
		
		//Question 8
		
		double velocity0 = 15;
		double velocity1 = 30;
		double time = 3;
		//output should be 5
		double accelerationFormula = ((velocity1 - velocity0) / time);
		
		System.out.println("Acceleration = " + accelerationFormula);
		
		//Question 9
		
		double amountOfWater = 50;
		double initialTemperature = 70;
		double finalTemperature = 90;
		
		double energyFormula = ((amountOfWater * (finalTemperature - 
		initialTemperature)) * 4184);
		
		System.out.println("Energy = " + energyFormula);
		
		//Question 10
		
		//testing exponents
		
		double numExponentTest = Math.pow(2, 4);
		System.out.println(numExponentTest);
		
		//actual answer
		
		int a = 1;
		int b = 2;
		double powAnswer = Math.pow(a, b);
		
		System.out.printf("%-6s%-6s%-9s", "a", "b", "pow(a, b)\n");
		
		System.out.printf("%-6d%-6d%-9.0f%-1s", a, b, powAnswer, "\n");
		
		a = 2;
		b = 3;
		powAnswer = Math.pow(a, b);
	
		System.out.printf("%-6d%-6d%-9.0f%-1s", a, b, powAnswer, "\n");
		
		a = 3;
		b = 4;
		powAnswer = Math.pow(a, b);
		System.out.printf("%-6d%-6d%-9.0f%-1s", a, b, powAnswer, "\n");
		
		a = 4;
		b = 5;
		powAnswer = Math.pow(a, b);
		System.out.printf("%-6d%-6d%-9.0f%-1s", a, b, powAnswer, "\n");
		
		a = 5;
		b = 6;
		powAnswer = Math.pow(a, b);
		System.out.printf("%-6d%-6d%-9.0f%-1s", a, b, powAnswer, "\n");
		
		//it works :))))))))))))))))))))))))
		
	}
}
