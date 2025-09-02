package day2;
public class Students {
String StdName ;
int RegNo;
String Branch;
double percentage;
	public static void main(String[] args) {
		Students S1= new Students();
		S1.StdName ="john";
		S1.RegNo=100;
		S1.Branch="EEE";
		S1.percentage=80.9;
	System.out.println("Student Name: "+S1.StdName);
	System.out.println("Student RegNo: "+S1.RegNo);
	System.out.println("Student Branch: "+S1.Branch);
	System.out.println("Student Percentage: "+S1.percentage);
	Students S2= new Students();
	 S2.StdName= "berry";
	 S2.RegNo=123;
	 S2.Branch="ECE";
	 S2.percentage=78.6;
	System.out.println("Student Name: "+S2.StdName);
	System.out.println("Student RegNo: "+S2.RegNo);
	System.out.println("Student Branch: "+S2.Branch);
	System.out.println("Student Percentage: "+S2.percentage);
	Students S3= new Students();
	 S3.StdName="Danny";
	 S3.RegNo=132;
	 S3.Branch="CSE";
	 S3.percentage=89.7;
	System.out.println("Student Name: "+S3.StdName);
	System.out.println("Student RegNo: "+S3.RegNo);
	System.out.println("Student Branch: "+S3.Branch);
	System.out.println("Student Percentage: "+S3.percentage);
	Students S4= new Students();
	 S4.StdName= "dia";
	 S4.RegNo=183;
	 S4.Branch="CSM";
	 S4.percentage=90.0;
  System.out.println("Student Name: "+S4.StdName);
  System.out.println("Student RegNo: "+S4.RegNo);
  System.out.println("Student Branch: "+S4.Branch);
  System.out.println("Student percentage: "+S4.percentage);

	}

}
