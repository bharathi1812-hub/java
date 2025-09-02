package day2;

public class Demo1 {

	public static void main(String[] args) {
		byte b=10;
		int i=99;
		double d=125.78;
		float f= 25;
		System.out.println("b= "+b);
		System.out.println("i= "+i);
		System.out.println("d= "+d);
		System.out.println("f= "+f);
		i=b;
		System.out.println("After widening Conversion: ");//low to high
		System.out.println("b= "+b);
		System.out.println("i= "+i);
		f=(float)d;
		System.out.println("After Narrowing Conversion: ");//high to low
		System.out.println("d= "+d);
		System.out.println("f= "+f);
			
	}
	

}
