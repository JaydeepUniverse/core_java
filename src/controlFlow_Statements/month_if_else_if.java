package controlFlow_Statements;
import java.util.Scanner;

public class month_if_else_if {
    public static void main(String[] args) {
	int m;
	String month;
	String season;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter month number between 1 to 12");
	m = s1.nextInt();
	
	if (m == 1)
	    month = "January";
	else if (m == 2)
	    month = "February";
	else if (m == 3)
	    month = "March";
	else if (m == 4)
	    month = "April";
	else if (m == 5)
	    month = "May";
	else if (m == 6)
	    month = "June";
	else if (m == 7)
	    month = "July";
	else if (m == 8)
	    month = "August";
	else if (m == 9)
	    month = "September";
	else if (m == 10)
	    month = "October";
	else if (m == 11)
	    month = "November";
	else
	    month = "December";
	
	s1.close();
	
	if (month == "December" || month == "January" || month == "February")
	    season = "Winter";
	else if (month == "March" || month == "April" || month == "May")
	    season = "Spring";
	else if (month == "June" || month == "July" || month == "August")
	    season = "Summer";
	else
	    season = "Autumn";
	
	System.out.println(m + " = " + month + ". Its in " + season);
    }
}