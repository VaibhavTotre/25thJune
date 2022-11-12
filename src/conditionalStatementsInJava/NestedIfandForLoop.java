package conditionalStatementsInJava;

public class NestedIfandForLoop {
public static void main(String[] args) {
	//wtp to check eligibility to donate the blood
	int age = 17;
	int weight = 49;
	if(age>17&& age<=55)
	{System.out.println("we can go for weight criteria");
	if (weight>49)
	{System.out.println("Eligible to donate the blood");
	}
	else
		{System.out.println("Not eligible to donate the blood due to weight criteria");}}
	else
	{System.out.println("Not eligible to donate the blood due to age criteria");
	}


System.out.println("End of the program");
}}

