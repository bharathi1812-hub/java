package day1;

public class Student {
	String StdName="Scott";
	int RegNo=3309;
	String Branch= "CSM";
public static void main(String [] args) {
	Student s1= new Student(); //object creation
	System.out.println("Student Name: "+s1.StdName);
	System.out.println("Student regno: "+s1.RegNo);
	System.out.println("Student Branch: "+s1.Branch);
	Student s2= new Student();
	System.out.println(s2);
	System.out.println("Student Name: "+s2.StdName);
	System.out.println("Student regno: "+s2.RegNo);
	System.out.println("Student Branch: "+s2.Branch);
	Student s3= new Student();//address
	System.out.println(s3);
	System.out.println("Student Name: "+s3.StdName);
	System.out.println("Student regno: "+s3.RegNo);
	System.out.println("Student Branch: "+s3.Branch);
   }
}
