package class_method_object;

public class Date {
    private int day;
    private String month;
    private int year;

    public void initialDetails(int d, String m, int y){
      day=d;
      month=m;
      year=y;
    }

    public void printDetails(){
      System.out.println("Day " + day);
      System.out.println("Month "+ month);
      System.out.println("Year "+ year);
    }

    public static void main(String[] args) {
       Date d1=new Date();
       d1. initialDetails(29, "August", 2018);
       d1.printDetails();
    }

}
