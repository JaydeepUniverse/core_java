package array;

class DeclareArray2{
    public static void main(String[] args) {
	int days_in_months[];
	days_in_months = new int[12];
	days_in_months[0] = 31;
	days_in_months[1] = 28;
	days_in_months[2] = 31;
	days_in_months[3] = 30;
	days_in_months[4] = 31;
	days_in_months[5] = 30;
	days_in_months[6] = 31;
	days_in_months[7] = 31;
	days_in_months[8] = 30;
	days_in_months[9] = 31;
	days_in_months[10] = 30;
	days_in_months[11] = 31;
	
	System.out.println("April has " + days_in_months[3] + " days.");
	
	// Define the array professionally
	int a[] = new int[2];
	a[0] = 1;
	a[1] = 2;
	System.out.println((a[0] + a[1]));
	
	// An improved version of first program of days in months
	// Array can be initialized along with declaration and no need to define the size of the array, it will take automatically
	int days_in_months2[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	System.out.println("December has " + days_in_months2[11] + " days.");
    }  
}