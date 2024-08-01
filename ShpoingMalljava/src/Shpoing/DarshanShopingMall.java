package Shpoing;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DarshanShopingMall {
	public static void main(String[] args) {
		String id = null;
		String Productname = null;
		int Quantity = 0;
		double price = 0.0;
		double totalprice = 0.0;
		double overallprice = 0.0;
		double cgst, sgst, subtotal = 0.0, discount = 0.0;
		char choice = '\0';
		System.out.println("\t\t\t\t---------Invoice-------------");
		System.out.println("\t\t\t\t\t" + " " + "Metro Mart Darshan Shop");
		System.out.println("\t\t\t\t3/98 mecrobatganj new mumbai");
		System.out.println("\t\t\t\t" + " " + " opposite metro walk");
		System.out.println("GSTIN:34AMIG75k591" + "\t\t\t\t\t\t Contect:(+91)8956555919");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date date = new Date();
		Calendar calendar = Calendar.getInstance(); // Corrected the typo here

		String[] days = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("Date: " + formatter.format(date) + " " + days[calendar.get(Calendar.DAY_OF_WEEK) - 1]
				+ "\t\t\t\t\t (+91) 800454443");
		Scanner scan = new Scanner(System.in);
		System.out.println(" Eneter Custmer Name:");
		String custmername = scan.nextLine();
		List<Product> product = new ArrayList<Product>();
		do {
			System.out.println(" Enter The Product Details: ");
			System.out.print("Product ID: ");
			id = scan.nextLine();
			System.out.print("Product Name: ");
			Productname = scan.nextLine();
			System.out.print("Quntity: ");
			Quantity = scan.nextInt();
			System.out.print("Price: ");
			price = scan.nextDouble();
			totalprice = price * Quantity;
			overallprice = overallprice * totalprice;
			product.add(new Product(id, Productname, Quantity, price, totalprice));
			System.out.print("Want to More Items?(Y or N): ");
			choice = scan.next().charAt(0);
			scan.nextLine();

		} while (choice == 'y' || choice == 'Y');
		Product.displyfromart();
		for (Product p : product) {
			p.disply();
			System.out.println("\n\t\t\t\t\t\t\t\t Total Amount (RS.)" + overallprice);
			discount = overallprice * 2 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t Discount (RS.)" + discount);
			subtotal = overallprice - discount;
			System.out.println("\n\t\t\t\t\t\t\t\t subtotal" + subtotal);
			sgst = overallprice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t\t SGST(%)" + sgst);
			cgst = overallprice * 12 / 100;
			System.out.println("\n\t\t\t\t\t\t\t CGST(%)" + cgst);
			System.out.println("\n\t\t\t\t\t\t\t   Invoice Total" + (subtotal + cgst + sgst));
			System.out.println("\t\t\t\t------------Thank You For Shopping!!------------");
			System.out.println("\t\t\t\t\t       Vist Again       ");
			scan.close();

		}

	}
}