package day2;

public class Product {
	String PrName;
	int price;
	String quantity;
	double gst;
	double discount;
	public static void main(String[] args) {
	Product P1= new Product();
	 P1.PrName="oil";
	 P1.price=150;
	 P1.quantity="5L";
	 P1.gst=10;
	 P1.discount=13.5;
System.out.println("Product Name: "+P1.PrName);
System.out.println("Product price: "+P1.price);
System.out.println("Product quantity: "+P1.quantity);
System.out.println("Product gst: "+P1.gst);
System.out.println("Product discount: "+P1.discount);
 Product P2= new Product();
    P2.PrName="shampoo";
    P2.price=350;
    P2.quantity="500ml";
    P2.gst=5;
    P2.discount=120;
    System.out.println("Product Name: "+P2.PrName);
    System.out.println("Product price: "+P2.price);
    System.out.println("Product quantity: "+P2.quantity);
    System.out.println("Product gst: "+P2.gst);
    System.out.println("Product discount: "+P2.discount);
 Product P3= new Product();
   P3.PrName="Chocolates";
   P3.price=200;
   P3.quantity="1 packet";
   P3.gst=2;
   P3.discount=50;
   System.out.println("Product Name: "+P3.PrName);
   System.out.println("Product price: "+P3.price);
   System.out.println("Product quantity: "+P3.quantity);
   System.out.println("Product gst: "+P3.gst);
   System.out.println("Product discount: "+P3.discount);
 Product P4= new Product();
  P4.PrName="Chocolates";
  P4.price=200;
  P4.quantity="1 packet";
  P4.gst=2;
  P4.discount=50;
 System.out.println("Product Name: "+P4.PrName);
 System.out.println("Product price: "+P4.price);
 System.out.println("Product quantity: "+P4.quantity);
 System.out.println("Product gst: "+P4.gst);
 System.out.println("Product discount: "+P4.discount);
 Product P5 = new Product();
  P5.PrName="Chocolates";
  P5.price=200;
  P5.quantity="1 packet";
  P5.gst=2;
  P5.discount=50;
 System.out.println("Product Name: "+P5.PrName);
 System.out.println("Product price: "+P5.price);
 System.out.println("Product quantity: "+P5.quantity);
 System.out.println("Product gst: "+P5.gst);
 System.out.println("Product discount: "+P5.discount);
	}

}
