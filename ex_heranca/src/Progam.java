import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Progam {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Commun, used, imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			Product prod = null;
			
			if(ch == 'c') {
				prod = new Product(name, price);
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateStr = sc.next();
				LocalDate manufactureDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				prod = new UsedProduct(name, price, manufactureDate);
			}else {
				System.out.print("Customs fee: ");
			    double customsFee = sc.nextDouble();
			    prod = new ImportedProduct(name, price, customsFee);
			}	
			list.add(prod);
	        }

		
		System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
		}
        
        sc.close();

	}

}
