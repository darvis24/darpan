package seniorWing;

public class Student {
	int age;
	int rollnumber;
	public void method1()
	{System.out.println("Welcome to all");}
	public void method2()
	{System.out.println("Automation is very easy");}
	public static void main(String[] args) {
		Student abc=new Student();
		abc.age=55;
		abc.rollnumber=12;
		abc.method1();
		abc.method2();
		System.out.println(abc.age);
		System.out.println(abc.rollnumber);
		
	}
	

}
