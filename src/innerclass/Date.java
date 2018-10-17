package innerclass;

import innerclass.MemberInnerClass.Inner;

public class Date extends MemberInnerClass {
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
       MemberInnerClass a = new MemberInnerClass();
	a.outer();
	MemberInnerClass.Inner b = a.new Inner();
	b.inner();
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
    }

}
